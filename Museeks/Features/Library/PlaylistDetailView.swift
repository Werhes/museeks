import SwiftUI

struct PlaylistDetailView: View {
    let playlist: Playlist
    @EnvironmentObject private var environment: AppEnvironment
    @EnvironmentObject private var player: PlayerController
    @State private var tracks: [Track] = []
    @State private var isLoading = false
    @State private var errorMessage: String?

    var body: some View {
        ZStack {
            AppBackground()
            ScrollView {
                LazyVStack(spacing: 14) {
                    header
                    if isLoading && tracks.isEmpty {
                        ProgressView().padding(.top, 50)
                    } else {
                        ForEach(tracks) { track in
                            TrackRow(
                                track: track,
                                isCurrent: player.currentTrack?.id == track.id,
                                isPlaying: player.isPlaying
                            ) { player.play(track, in: tracks, title: playlist.title) }
                            .contextMenu {
                                Button { player.playNext(track) } label: {
                                    Label("Играть следующей", systemImage: "text.line.first.and.arrowtriangle.forward")
                                }
                                Button { player.addToQueue(track) } label: {
                                    Label("Добавить в очередь", systemImage: "text.badge.plus")
                                }
                            }
                        }
                    }
                }
                .padding(.horizontal, 16)
                .padding(.bottom, 30)
            }
        }
        .navigationTitle(playlist.title)
        .navigationBarTitleDisplayMode(.inline)
        .task { await load() }
        .refreshable { await load() }
        .alert("Не удалось открыть плейлист", isPresented: Binding(
            get: { errorMessage != nil },
            set: { if !$0 { errorMessage = nil } }
        )) { Button("ОК", role: .cancel) {} } message: { Text(errorMessage ?? "") }
    }

    private var header: some View {
        VStack(spacing: 14) {
            ArtworkView(url: playlist.artworkURL, size: 230, cornerRadius: 28)
                .shadow(color: .black.opacity(0.22), radius: 24, y: 12)
            VStack(spacing: 5) {
                Text(playlist.title).font(.title2.bold()).multilineTextAlignment(.center)
                if let subtitle = playlist.subtitle, !subtitle.isEmpty {
                    Text(subtitle).font(.subheadline).foregroundStyle(.secondary).lineLimit(3)
                }
            }
            Button {
                if let first = tracks.first { player.play(first, in: tracks, title: playlist.title) }
            } label: {
                Label("Воспроизвести", systemImage: "play.fill")
                    .font(.headline)
                    .foregroundStyle(.white)
                    .padding(.horizontal, 24)
                    .frame(height: 48)
                    .background(MuseeksPalette.accent, in: Capsule())
            }
            .buttonStyle(.plain)
            .disabled(tracks.isEmpty)
        }
        .frame(maxWidth: .infinity)
        .padding(.vertical, 20)
    }

    @MainActor
    private func load() async {
        guard let token = environment.sessionStore.session?.accessToken else { return }
        isLoading = true
        defer { isLoading = false }
        do {
            var loaded: [Track] = []
            var offset = 0
            for _ in 0..<25 {
                let page = try await environment.musicService.playlistTracks(
                    token: token,
                    playlist: playlist,
                    offset: offset
                )
                loaded.append(contentsOf: page.items)
                guard let next = page.nextOffset else { break }
                offset = next
            }
            tracks = loaded
            errorMessage = nil
        } catch {
            errorMessage = error.localizedDescription
        }
    }
}
