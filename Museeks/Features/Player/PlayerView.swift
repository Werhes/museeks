import AVKit
import SwiftUI

struct PlayerView: View {
    @Environment(\.dismiss) private var dismiss
    @EnvironmentObject private var environment: AppEnvironment
    @EnvironmentObject private var player: PlayerController
    @EnvironmentObject private var library: MusicLibraryStore
    @State private var showsQueue = false
    @State private var showsLyrics = false

    var body: some View {
        ZStack {
            playerBackground
            GeometryReader { proxy in
                let artSize = min(proxy.size.width - 52, 390)
                VStack(spacing: 0) {
                    topBar
                    Spacer(minLength: 12)
                    if let track = player.currentTrack {
                        ArtworkView(url: track.artworkURL, size: artSize, cornerRadius: 32)
                            .shadow(color: .black.opacity(0.35), radius: 30, y: 17)
                            .accessibilityLabel("Обложка \(track.title)")
                    }
                    Spacer(minLength: 22)
                    metadata
                    timeline
                    controls
                    bottomActions
                    Spacer(minLength: 12)
                }
                .padding(.horizontal, 24)
            }
        }
        .preferredColorScheme(.dark)
        .sheet(isPresented: $showsQueue) { QueueView() }
        .sheet(isPresented: $showsLyrics) { LyricsView() }
    }

    private var playerBackground: some View {
        ZStack {
            Color.black
            AsyncImage(url: player.currentTrack?.artworkURL) { image in
                image
                    .resizable()
                    .scaledToFill()
                    .blur(radius: 65)
                    .saturation(1.25)
                    .opacity(0.53)
            } placeholder: {
                LinearGradient(
                    colors: [MuseeksPalette.accent.opacity(0.55), MuseeksPalette.deep],
                    startPoint: .top,
                    endPoint: .bottom
                )
            }
            LinearGradient(
                colors: [.black.opacity(0.08), .black.opacity(0.62)],
                startPoint: .top,
                endPoint: .bottom
            )
        }
        .ignoresSafeArea()
    }

    private var topBar: some View {
        MuseeksGlassContainer(spacing: 12) {
            HStack {
                GlassIconButton(systemImage: "chevron.down", accessibilityLabel: "Закрыть") {
                    dismiss()
                }
                Spacer()
                VStack(spacing: 2) {
                    Text("СЕЙЧАС ИГРАЕТ")
                        .font(.caption2.bold())
                        .tracking(0.8)
                        .foregroundStyle(.secondary)
                    Text(player.queueTitle)
                        .font(.caption.weight(.semibold))
                        .lineLimit(1)
                }
                Spacer()
                GlassIconButton(systemImage: "list.bullet", accessibilityLabel: "Очередь") {
                    showsQueue = true
                }
            }
        }
        .padding(.top, 8)
    }

    private var metadata: some View {
        HStack(alignment: .center, spacing: 14) {
            VStack(alignment: .leading, spacing: 5) {
                Text(player.currentTrack?.title ?? "")
                    .font(.title2.bold())
                    .lineLimit(1)
                Text(player.currentTrack?.artist ?? "")
                    .font(.body)
                    .foregroundStyle(.white.opacity(0.7))
                    .lineLimit(1)
            }
            Spacer()
            if player.isBuffering { ProgressView().tint(.white) }
            if let track = player.currentTrack {
                Button {
                    Task { await library.toggle(track, environment: environment) }
                } label: {
                    Image(systemName: library.contains(track) ? "heart.fill" : "heart")
                        .font(.title2.weight(.semibold))
                        .foregroundStyle(library.contains(track) ? MuseeksPalette.pink : .white)
                        .frame(width: 42, height: 42)
                }
                .buttonStyle(.plain)
                .accessibilityLabel(
                    library.contains(track) ? "Убрать из моей музыки" : "Добавить в мою музыку"
                )
            }
        }
        .padding(.top, 4)
    }

    private var timeline: some View {
        VStack(spacing: 4) {
            Slider(
                value: Binding(
                    get: { min(player.elapsed, max(player.duration, 1)) },
                    set: { player.seek(to: $0) }
                ),
                in: 0...max(player.duration, 1)
            )
            .tint(.white)
            HStack {
                Text(player.elapsed.clockText)
                Spacer()
                Text("-\(max(player.duration - player.elapsed, 0).clockText)")
            }
            .font(.caption.monospacedDigit())
            .foregroundStyle(.white.opacity(0.66))
        }
        .padding(.top, 14)
    }

    private var controls: some View {
        HStack(spacing: 25) {
            Button { player.toggleShuffle() } label: {
                Image(systemName: "shuffle")
                    .foregroundStyle(player.shuffleEnabled ? MuseeksPalette.pink : .white.opacity(0.76))
                    .frame(width: 42, height: 52)
            }
            .buttonStyle(.plain)

            Button { player.previous() } label: {
                Image(systemName: "backward.end.fill")
                    .font(.system(size: 30, weight: .semibold))
                    .frame(width: 50, height: 58)
            }
            .buttonStyle(.plain)

            Button { player.playPause() } label: {
                ZStack {
                    Circle().fill(.white)
                    Image(systemName: player.isPlaying ? "pause.fill" : "play.fill")
                        .font(.system(size: 30, weight: .bold))
                        .foregroundStyle(.black)
                        .offset(x: player.isPlaying ? 0 : 2)
                }
                .frame(width: 72, height: 72)
                .shadow(color: .black.opacity(0.22), radius: 15, y: 8)
            }
            .buttonStyle(.plain)

            Button { player.next() } label: {
                Image(systemName: "forward.end.fill")
                    .font(.system(size: 30, weight: .semibold))
                    .frame(width: 50, height: 58)
            }
            .buttonStyle(.plain)

            Button { player.cycleRepeatMode() } label: {
                Image(systemName: player.repeatMode.systemImage)
                    .foregroundStyle(player.repeatMode == .off ? .white.opacity(0.76) : MuseeksPalette.pink)
                    .frame(width: 42, height: 52)
            }
            .buttonStyle(.plain)
        }
        .font(.title3.weight(.semibold))
        .padding(.top, 12)
    }

    private var bottomActions: some View {
        HStack(spacing: 14) {
            Button { showsLyrics = true } label: {
                Label("Текст", systemImage: "quote.bubble")
                    .font(.subheadline.weight(.semibold))
                    .frame(maxWidth: .infinity, minHeight: 46)
            }
            .buttonStyle(.plain)
            .museeksGlass(in: Capsule(), interactive: true)

            Menu {
                Button("15 минут") { player.scheduleSleepTimer(minutes: 15) }
                Button("30 минут") { player.scheduleSleepTimer(minutes: 30) }
                Button("60 минут") { player.scheduleSleepTimer(minutes: 60) }
                if player.sleepTimerEnd != nil {
                    Divider()
                    Button("Отменить таймер", role: .destructive) { player.cancelSleepTimer() }
                }
            } label: {
                Image(systemName: player.sleepTimerEnd == nil ? "timer" : "timer.circle.fill")
                    .font(.title3.weight(.semibold))
                    .frame(maxWidth: .infinity, minHeight: 46)
            }
            .buttonStyle(.plain)
            .museeksGlass(in: Capsule(), interactive: true)
            .accessibilityLabel("Таймер сна")

            AirPlayButton()
                .frame(maxWidth: .infinity, minHeight: 46)
                .museeksGlass(in: Capsule(), interactive: true)
                .accessibilityLabel("AirPlay")
        }
        .padding(.top, 15)
    }
}

private struct AirPlayButton: UIViewRepresentable {
    func makeUIView(context: Context) -> AVRoutePickerView {
        let view = AVRoutePickerView()
        view.prioritizesVideoDevices = false
        view.tintColor = .white
        view.activeTintColor = UIColor(MuseeksPalette.pink)
        return view
    }

    func updateUIView(_ uiView: AVRoutePickerView, context: Context) {}
}
