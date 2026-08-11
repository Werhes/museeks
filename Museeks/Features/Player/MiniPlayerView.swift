import SwiftUI

struct MiniPlayerView: View {
    @EnvironmentObject private var player: PlayerController

    var body: some View {
        if let track = player.currentTrack {
            Button {
                player.isPlayerPresented = true
            } label: {
                VStack(spacing: 0) {
                    HStack(spacing: 11) {
                        ArtworkView(url: track.artworkURL, size: 45, cornerRadius: 11)
                        VStack(alignment: .leading, spacing: 2) {
                            Text(track.title)
                                .font(.subheadline.weight(.semibold))
                                .foregroundStyle(.primary)
                                .lineLimit(1)
                            Text(track.artist)
                                .font(.caption)
                                .foregroundStyle(.secondary)
                                .lineLimit(1)
                        }
                        Spacer(minLength: 4)
                        Button { player.playPause() } label: {
                            Image(systemName: player.isPlaying ? "pause.fill" : "play.fill")
                                .font(.title3.weight(.semibold))
                                .frame(width: 40, height: 40)
                        }
                        .buttonStyle(.plain)
                        .accessibilityLabel(player.isPlaying ? "Пауза" : "Воспроизвести")
                        Button { player.next() } label: {
                            Image(systemName: "forward.end.fill")
                                .font(.body.weight(.semibold))
                                .frame(width: 36, height: 40)
                        }
                        .buttonStyle(.plain)
                        .accessibilityLabel("Следующий трек")
                    }
                    .padding(.horizontal, 9)
                    .padding(.vertical, 7)
                    GeometryReader { proxy in
                        Capsule()
                            .fill(MuseeksPalette.accent)
                            .frame(width: proxy.size.width * player.progress, height: 2.5)
                    }
                    .frame(height: 2.5)
                }
                .contentShape(RoundedRectangle(cornerRadius: 18, style: .continuous))
            }
            .buttonStyle(.plain)
            .museeksGlass(
                in: RoundedRectangle(cornerRadius: 18, style: .continuous),
                interactive: true
            )
            .padding(.horizontal, 8)
            .accessibilityElement(children: .contain)
        }
    }
}

