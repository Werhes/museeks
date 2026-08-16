import SwiftUI

/// A single «Для вас» card (Открытия, Новинки, Плейлист дня 1–5), modelled
/// after the official VK client's recommendation playlist card
/// (see Music-M `Controls/RecommsPlaylist.xaml`): a rounded card with a cover
/// on top, a floating circular play button in the bottom-right corner of the
/// cover, and the section title + subtitle in their own padded area below —
/// never covered by the artwork. These are algorithmically built collections,
/// so they get a distinct branded card instead of the generic playlist row.
///
/// The card is a pure label view designed to sit inside a `NavigationLink`;
/// the whole card (including the decorative play glyph) opens the dedicated
/// «Для вас» section screen.
struct ForYouCard: View {
    let playlist: Playlist
    let accent: Color
    let size: CGFloat

    var body: some View {
        VStack(alignment: .leading, spacing: 10) {
            cover
                .frame(width: size, height: size)

            VStack(alignment: .leading, spacing: 3) {
                Text(playlist.title)
                    .font(.footnote.weight(.semibold))
                    .foregroundStyle(.primary)
                    .lineLimit(2)
                    .truncationMode(.tail)
                Text(
                    L10n.format(
                        "%@ • %@",
                        L10n.trackCount(playlist.count),
                        playlist.source.shortTitle
                    )
                )
                .font(.caption2)
                .foregroundStyle(.secondary)
                .lineLimit(1)
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
            .fill(Color(.secondarySystemBackground).opacity(0.55))
        )
        .overlay(
            RoundedRectangle(
                cornerRadius: PremiumLayout.compactRadius,
                style: .continuous
            )
            .strokeBorder(accent.opacity(0.25), lineWidth: 1)
        )
        .contentShape(Rectangle())
        .accessibilityElement(children: .combine)
        .accessibilityLabel(
            L10n.format(
                "%@ · %@ · %@",
                playlist.title,
                L10n.trackCount(playlist.count),
                L10n.text("Воспроизвести раздел")
            )
        )
        .accessibilityAddTraits(.isButton)
    }

    /// The cover with a floating circular play button in the bottom-right
    /// corner, mirroring `RecommsPlaylist`'s cover + play glyph. Purely
    /// decorative — navigation is handled by the surrounding `NavigationLink`.
    private var cover: some View {
        ZStack(alignment: .bottomTrailing) {
            PlaylistArtworkView(
                playlist: playlist,
                size: size,
                showsSource: false
            )

            Image(systemName: "play.fill")
                .font(.caption.weight(.bold))
                .foregroundStyle(accent)
                .frame(width: 32, height: 32)
                .background(.white, in: Circle())
                .shadow(color: .black.opacity(0.25), radius: 3, y: 1)
                .offset(x: size - 39, y: size - 39)
        }
    }
}