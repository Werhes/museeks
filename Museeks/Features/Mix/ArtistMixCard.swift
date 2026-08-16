import SwiftUI

/// A single «Микс по артисту» card, modelled after the official VK client
/// `ArtistMixButton` (see Music-M `Controls/ArtistMixButton.xaml`): a rounded
/// card with the artist cover on top, a floating circular play button in the
/// bottom-right corner of the cover, and the artist name + subtitle in their
/// own padded area below — never covered by the artwork. Tapping anywhere on
/// the card (or the play button) starts the artist's continuous mix.
struct ArtistMixCard: View {
    let artist: VKArtist
    let size: CGFloat
    let isPlaying: Bool
    let isLoading: Bool
    let onPlay: () -> Void

    var body: some View {
        VStack(alignment: .leading, spacing: 10) {
            cover
                .frame(width: size, height: size)

            VStack(alignment: .leading, spacing: 3) {
                Text(artist.name)
                    .font(.footnote.weight(.semibold))
                    .foregroundStyle(
                        isPlaying ? Color.accentColor : Color.primary
                    )
                    .lineLimit(1)
                    .truncationMode(.tail)
                Text(L10n.text("Микс по артисту"))
                    .font(.caption2)
                    .foregroundStyle(.secondary)
                    .lineLimit(1)
                    .truncationMode(.tail)
            }
            .frame(width: size, alignment: .leading)
        }
        .padding(8)
        .frame(width: size + 16, alignment: .topLeading)
        .background(
            RoundedRectangle(
                cornerRadius: PremiumLayout.compactRadius,
                style: .continuous
            )
            .fill(
                Color(.secondarySystemBackground).opacity(
                    isPlaying ? 0.9 : 0.55
                )
            )
        )
        .overlay(
            RoundedRectangle(
                cornerRadius: PremiumLayout.compactRadius,
                style: .continuous
            )
            .strokeBorder(
                isPlaying ? Color.accentColor.opacity(0.35) : .clear,
                lineWidth: 1
            )
        )
        .contentShape(Rectangle())
        .onTapGesture(perform: onPlay)
        .disabled(isLoading)
        .accessibilityElement(children: .combine)
        .accessibilityLabel(
            L10n.format(
                "%@ · %@",
                artist.name,
                L10n.text("Воспроизвести микс артиста")
            )
        )
        .accessibilityAddTraits(.isButton)
    }

    /// The artist cover with a floating circular play button in the
    /// bottom-right corner, mirroring `ArtistMixButton`'s cover + play glyph.
    private var cover: some View {
        ZStack(alignment: .bottomTrailing) {
            AsyncArtwork(url: artist.photoURL, size: size)

            Button(action: onPlay) {
                Group {
                    if isLoading {
                        ProgressView()
                            .tint(.black)
                    } else {
                        Image(systemName: "play.fill")
                    }
                }
                .font(.caption.weight(.bold))
                .foregroundStyle(.black)
                .frame(width: 32, height: 32)
                .background(.white, in: Circle())
                .shadow(color: .black.opacity(0.25), radius: 3, y: 1)
            }
            .buttonStyle(PremiumPressStyle())
            .offset(x: size - 39, y: size - 39)
            .disabled(isLoading)
        }
    }
}