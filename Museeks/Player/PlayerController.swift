import AVFoundation
import Combine
import Foundation
import MediaPlayer
import UIKit

enum RepeatMode: String, Codable, CaseIterable, Sendable {
    case off
    case all
    case one

    var systemImage: String {
        self == .one ? "repeat.1" : "repeat"
    }
}

@MainActor
final class PlayerController: ObservableObject {
    @Published private(set) var queue: [Track] = []
    @Published private(set) var currentIndex: Int?
    @Published private(set) var isPlaying = false
    @Published private(set) var isBuffering = false
    @Published private(set) var elapsed: TimeInterval = 0
    @Published private(set) var duration: TimeInterval = 0
    @Published var repeatMode: RepeatMode = .off { didSet { persistPreferences() } }
    @Published var shuffleEnabled = false { didSet { persistPreferences() } }
    @Published var isPlayerPresented = false
    @Published var errorMessage: String?
    @Published private(set) var queueTitle = "Очередь"
    @Published private(set) var sleepTimerEnd: Date?

    var streamResolver: (@MainActor (Track) async throws -> Track)?
    var onTrackStarted: (@MainActor (Track) -> Void)?
    var networkUserAgent: String?

    var currentTrack: Track? {
        guard let currentIndex, queue.indices.contains(currentIndex) else { return nil }
        return queue[currentIndex]
    }

    var progress: Double {
        guard duration > 0, elapsed.isFinite else { return 0 }
        return min(max(elapsed / duration, 0), 1)
    }

    private let player = AVPlayer()
    private var timeObserver: Any?
    private var notificationTokens: [NSObjectProtocol] = []
    private var loadTask: Task<Void, Never>?
    private var loadID = UUID()
    private var pendingResumeTime: TimeInterval?
    private var hasRetriedCurrentTrack = false
    private var lastPersistedSecond = -1
    private var artworkTask: Task<Void, Never>?
    private var sleepTask: Task<Void, Never>?
    private let defaults = UserDefaults.standard
    private let snapshotKey = "player.snapshot.v1"

    init() {
        repeatMode = RepeatMode(rawValue: defaults.string(forKey: "player.repeat") ?? "") ?? .off
        shuffleEnabled = defaults.bool(forKey: "player.shuffle")
        configureRemoteCommands()
        observePlayer()
        restoreSnapshot()
    }

    deinit {
        loadTask?.cancel()
        artworkTask?.cancel()
        sleepTask?.cancel()
        if let timeObserver { player.removeTimeObserver(timeObserver) }
        notificationTokens.forEach { NotificationCenter.default.removeObserver($0) }
    }

    func play(_ track: Track, in tracks: [Track], title: String = "Очередь") {
        var prepared = tracks.isEmpty ? [track] : tracks
        if !prepared.contains(where: { $0.id == track.id }) { prepared.insert(track, at: 0) }
        if shuffleEnabled {
            prepared = [track] + prepared.filter { $0.id != track.id }.shuffled()
        }
        queue = prepared
        currentIndex = queue.firstIndex(where: { $0.id == track.id }) ?? 0
        queueTitle = title
        pendingResumeTime = nil
        hasRetriedCurrentTrack = false
        loadCurrent(autoplay: true)
    }

    func playPause() {
        isPlaying ? pause() : resume()
    }

    func resume() {
        guard currentTrack != nil else { return }
        if player.currentItem == nil {
            loadCurrent(autoplay: true)
            return
        }
        do {
            try activateAudioSession()
            player.play()
            isPlaying = true
            updateNowPlaying()
        } catch {
            errorMessage = error.localizedDescription
        }
    }

    func pause() {
        player.pause()
        isPlaying = false
        updateNowPlaying()
        persistSnapshot()
    }

    func stop() {
        loadTask?.cancel()
        player.pause()
        player.replaceCurrentItem(with: nil)
        queue = []
        currentIndex = nil
        elapsed = 0
        duration = 0
        isPlaying = false
        isBuffering = false
        cancelSleepTimer()
        defaults.removeObject(forKey: snapshotKey)
        MPNowPlayingInfoCenter.default().nowPlayingInfo = nil
    }

    func seek(to seconds: TimeInterval) {
        guard seconds.isFinite else { return }
        let value = min(max(seconds, 0), max(duration, 0))
        elapsed = value
        player.seek(to: CMTime(seconds: value, preferredTimescale: 600), toleranceBefore: .zero, toleranceAfter: .zero)
        updateNowPlaying()
    }

    func seek(progress: Double) {
        seek(to: duration * min(max(progress, 0), 1))
    }

    func next() {
        guard let currentIndex, !queue.isEmpty else { return }
        if repeatMode == .one {
            seek(to: 0)
            resume()
            return
        }
        let candidate = currentIndex + 1
        if candidate < queue.count {
            self.currentIndex = candidate
        } else if repeatMode == .all {
            self.currentIndex = 0
        } else {
            pause()
            seek(to: 0)
            return
        }
        hasRetriedCurrentTrack = false
        loadCurrent(autoplay: true)
    }

    func previous() {
        if elapsed > 4 {
            seek(to: 0)
            return
        }
        guard let currentIndex, !queue.isEmpty else { return }
        if currentIndex > 0 {
            self.currentIndex = currentIndex - 1
        } else if repeatMode == .all {
            self.currentIndex = queue.count - 1
        } else {
            seek(to: 0)
            return
        }
        hasRetriedCurrentTrack = false
        loadCurrent(autoplay: true)
    }

    func jump(to index: Int) {
        guard queue.indices.contains(index) else { return }
        currentIndex = index
        hasRetriedCurrentTrack = false
        loadCurrent(autoplay: true)
    }

    func removeFromQueue(at offsets: IndexSet) {
        guard let currentIndex else { return }
        let removesCurrent = offsets.contains(currentIndex)
        for index in offsets.sorted(by: >) where queue.indices.contains(index) {
            queue.remove(at: index)
        }
        if queue.isEmpty { stop(); return }
        let removedBefore = offsets.filter { $0 < currentIndex }.count
        self.currentIndex = min(max(currentIndex - removedBefore, 0), queue.count - 1)
        if removesCurrent { loadCurrent(autoplay: true) }
        persistSnapshot()
    }

    func playNext(_ track: Track) {
        guard let currentIndex else {
            play(track, in: [track])
            return
        }
        queue.removeAll { $0.id == track.id }
        let insertion = min(currentIndex + 1, queue.count)
        queue.insert(track, at: insertion)
        persistSnapshot()
    }

    func addToQueue(_ track: Track) {
        guard !queue.contains(where: { $0.id == track.id }) else { return }
        queue.append(track)
        persistSnapshot()
    }

    func toggleShuffle() {
        guard let currentTrack else { shuffleEnabled.toggle(); return }
        shuffleEnabled.toggle()
        let remaining = queue.filter { $0.id != currentTrack.id }
        queue = [currentTrack] + (shuffleEnabled ? remaining.shuffled() : remaining)
        currentIndex = 0
        persistSnapshot()
    }

    func cycleRepeatMode() {
        switch repeatMode {
        case .off: repeatMode = .all
        case .all: repeatMode = .one
        case .one: repeatMode = .off
        }
        updateNowPlaying()
    }

    func scheduleSleepTimer(minutes: Int) {
        sleepTask?.cancel()
        let seconds = max(minutes, 1) * 60
        sleepTimerEnd = Date().addingTimeInterval(TimeInterval(seconds))
        sleepTask = Task { [weak self] in
            do {
                try await Task.sleep(nanoseconds: UInt64(seconds) * 1_000_000_000)
            } catch {
                return
            }
            guard let self else { return }
            self.pause()
            self.sleepTimerEnd = nil
        }
    }

    func cancelSleepTimer() {
        sleepTask?.cancel()
        sleepTask = nil
        sleepTimerEnd = nil
    }

    private func loadCurrent(autoplay: Bool) {
        guard let track = currentTrack else { return }
        loadTask?.cancel()
        loadID = UUID()
        let operationID = loadID
        isBuffering = true
        errorMessage = nil
        elapsed = 0
        duration = track.duration

        loadTask = Task { [weak self] in
            guard let self else { return }
            do {
                var playable = track
                if playable.streamURL == nil, let resolver = self.streamResolver {
                    playable = try await resolver(playable)
                }
                guard !Task.isCancelled, operationID == self.loadID else { return }
                guard let url = playable.streamURL else { throw APIError.noPlayableURL }
                if let index = self.currentIndex, self.queue.indices.contains(index) {
                    self.queue[index] = playable
                }
                try self.activateAudioSession()
                var assetOptions: [String: Any] = [:]
                if let userAgent = self.networkUserAgent, !userAgent.isEmpty {
                    assetOptions["AVURLAssetHTTPHeaderFieldsKey"] = ["User-Agent": userAgent]
                }
                let asset = AVURLAsset(url: url, options: assetOptions)
                let item = AVPlayerItem(asset: asset)
                item.preferredForwardBufferDuration = 8
                self.player.replaceCurrentItem(with: item)
                if let pending = self.pendingResumeTime {
                    self.pendingResumeTime = nil
                    self.seek(to: pending)
                }
                self.isBuffering = false
                self.onTrackStarted?(playable)
                self.updateNowPlaying(loadArtwork: true)
                self.persistSnapshot()
                if autoplay {
                    self.player.play()
                    self.isPlaying = true
                }
            } catch is CancellationError {
                return
            } catch {
                guard operationID == self.loadID else { return }
                self.isBuffering = false
                self.isPlaying = false
                self.errorMessage = error.localizedDescription
            }
        }
    }

    private func retryCurrentStream() {
        guard !hasRetriedCurrentTrack, let track = currentTrack, let resolver = streamResolver else {
            errorMessage = player.currentItem?.error?.localizedDescription ?? "Не удалось воспроизвести трек."
            return
        }
        hasRetriedCurrentTrack = true
        loadTask?.cancel()
        loadTask = Task { [weak self] in
            guard let self else { return }
            do {
                let refreshed = try await resolver(track)
                guard let index = self.currentIndex, self.queue.indices.contains(index) else { return }
                self.queue[index] = refreshed
                self.loadCurrent(autoplay: true)
            } catch {
                self.errorMessage = error.localizedDescription
            }
        }
    }

    private func activateAudioSession() throws {
        let audio = AVAudioSession.sharedInstance()
        try audio.setCategory(
            .playback,
            mode: .default,
            policy: .longFormAudio,
            options: [.allowAirPlay, .allowBluetoothA2DP]
        )
        try audio.setActive(true)
    }

    private func observePlayer() {
        timeObserver = player.addPeriodicTimeObserver(
            forInterval: CMTime(seconds: 0.5, preferredTimescale: 600),
            queue: .main
        ) { [weak self] time in
            Task { @MainActor in
                guard let self else { return }
                self.elapsed = max(time.seconds.isFinite ? time.seconds : 0, 0)
                if let seconds = self.player.currentItem?.duration.seconds, seconds.isFinite, seconds > 0 {
                    self.duration = seconds
                }
                self.isBuffering = self.player.timeControlStatus == .waitingToPlayAtSpecifiedRate
                self.isPlaying = self.player.timeControlStatus == .playing
                self.updateNowPlaying()
                let wholeSecond = Int(self.elapsed)
                if wholeSecond % 5 == 0, wholeSecond != self.lastPersistedSecond {
                    self.lastPersistedSecond = wholeSecond
                    self.persistSnapshot()
                }
            }
        }

        let center = NotificationCenter.default
        notificationTokens.append(center.addObserver(
            forName: .AVPlayerItemDidPlayToEndTime,
            object: nil,
            queue: .main
        ) { [weak self] note in
            Task { @MainActor in
                guard let self,
                      let item = note.object as? AVPlayerItem,
                      item === self.player.currentItem else { return }
                self.next()
            }
        })
        notificationTokens.append(center.addObserver(
            forName: .AVPlayerItemFailedToPlayToEndTime,
            object: nil,
            queue: .main
        ) { [weak self] note in
            Task { @MainActor in
                guard let self,
                      let item = note.object as? AVPlayerItem,
                      item === self.player.currentItem else { return }
                self.retryCurrentStream()
            }
        })
        notificationTokens.append(center.addObserver(
            forName: AVAudioSession.interruptionNotification,
            object: nil,
            queue: .main
        ) { [weak self] note in
            Task { @MainActor in self?.handleInterruption(note) }
        })
        notificationTokens.append(center.addObserver(
            forName: AVAudioSession.routeChangeNotification,
            object: nil,
            queue: .main
        ) { [weak self] note in
            Task { @MainActor in self?.handleRouteChange(note) }
        })
    }

    private func handleInterruption(_ notification: Notification) {
        guard let raw = notification.userInfo?[AVAudioSessionInterruptionTypeKey] as? UInt,
              let type = AVAudioSession.InterruptionType(rawValue: raw) else { return }
        if type == .began {
            pause()
        } else if let optionsRaw = notification.userInfo?[AVAudioSessionInterruptionOptionKey] as? UInt,
                  AVAudioSession.InterruptionOptions(rawValue: optionsRaw).contains(.shouldResume) {
            resume()
        }
    }

    private func handleRouteChange(_ notification: Notification) {
        guard let raw = notification.userInfo?[AVAudioSessionRouteChangeReasonKey] as? UInt,
              AVAudioSession.RouteChangeReason(rawValue: raw) == .oldDeviceUnavailable else { return }
        pause()
    }

    private func configureRemoteCommands() {
        let center = MPRemoteCommandCenter.shared()
        center.playCommand.addTarget { [weak self] _ in
            Task { @MainActor in self?.resume() }
            return .success
        }
        center.pauseCommand.addTarget { [weak self] _ in
            Task { @MainActor in self?.pause() }
            return .success
        }
        center.togglePlayPauseCommand.addTarget { [weak self] _ in
            Task { @MainActor in self?.playPause() }
            return .success
        }
        center.nextTrackCommand.addTarget { [weak self] _ in
            Task { @MainActor in self?.next() }
            return .success
        }
        center.previousTrackCommand.addTarget { [weak self] _ in
            Task { @MainActor in self?.previous() }
            return .success
        }
        center.changePlaybackPositionCommand.addTarget { [weak self] event in
            guard let event = event as? MPChangePlaybackPositionCommandEvent else { return .commandFailed }
            Task { @MainActor in self?.seek(to: event.positionTime) }
            return .success
        }
    }

    private func updateNowPlaying(loadArtwork: Bool = false) {
        guard let track = currentTrack else { return }
        var info = MPNowPlayingInfoCenter.default().nowPlayingInfo ?? [:]
        info[MPMediaItemPropertyTitle] = track.title
        info[MPMediaItemPropertyArtist] = track.artist
        info[MPMediaItemPropertyAlbumTitle] = track.albumTitle
        info[MPMediaItemPropertyPlaybackDuration] = duration
        info[MPNowPlayingInfoPropertyElapsedPlaybackTime] = elapsed
        info[MPNowPlayingInfoPropertyPlaybackRate] = isPlaying ? 1.0 : 0.0
        info[MPNowPlayingInfoPropertyPlaybackQueueCount] = queue.count
        info[MPNowPlayingInfoPropertyPlaybackQueueIndex] = currentIndex ?? 0
        MPNowPlayingInfoCenter.default().nowPlayingInfo = info

        guard loadArtwork, let url = track.artworkURL else { return }
        artworkTask?.cancel()
        artworkTask = Task { [weak self] in
            guard let self,
                  let (data, _) = try? await URLSession.shared.data(from: url),
                  let image = UIImage(data: data),
                  !Task.isCancelled else { return }
            var latest = MPNowPlayingInfoCenter.default().nowPlayingInfo ?? [:]
            latest[MPMediaItemPropertyArtwork] = MPMediaItemArtwork(boundsSize: image.size) { _ in image }
            MPNowPlayingInfoCenter.default().nowPlayingInfo = latest
        }
    }

    private func persistPreferences() {
        defaults.set(repeatMode.rawValue, forKey: "player.repeat")
        defaults.set(shuffleEnabled, forKey: "player.shuffle")
    }

    private func persistSnapshot() {
        guard let currentIndex, !queue.isEmpty else { return }
        let snapshot = PlaybackSnapshot(
            queue: queue.map(\.metadataOnly),
            currentIndex: currentIndex,
            elapsed: elapsed,
            title: queueTitle
        )
        if let data = try? JSONEncoder().encode(snapshot) { defaults.set(data, forKey: snapshotKey) }
    }

    private func restoreSnapshot() {
        guard let data = defaults.data(forKey: snapshotKey),
              let snapshot = try? JSONDecoder().decode(PlaybackSnapshot.self, from: data),
              snapshot.queue.indices.contains(snapshot.currentIndex) else { return }
        queue = snapshot.queue
        currentIndex = snapshot.currentIndex
        elapsed = snapshot.elapsed
        duration = snapshot.queue[snapshot.currentIndex].duration
        queueTitle = snapshot.title
        pendingResumeTime = snapshot.elapsed
    }
}

private struct PlaybackSnapshot: Codable {
    let queue: [Track]
    let currentIndex: Int
    let elapsed: TimeInterval
    let title: String
}
