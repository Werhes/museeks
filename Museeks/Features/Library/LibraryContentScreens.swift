import SwiftUI

// MARK: - Liked Albums screen

/// All liked albums reached from the library "More → Альбомы" card.
struct LikedAlbumsScreen: View {
    @EnvironmentObject private var likedAlbumsStore: LikedAlbumsStore

    var body: some View {
        Group {
            if likedAlbumsStore.albums.isEmpty {
                EmptyStateView(
                    title: "Альбомов пока нет",
                    systemImage: "square.stack",
                    description: "Понравившиеся альбомы появятся здесь."
                )
            } else {
                ScrollView {
                    LazyVGrid(
                        columns: [
                            GridItem(.flexible(), spacing: 14),
                            GridItem(.flexible(), spacing: 14)
                        ],
                        spacing: 18
                    ) {
                        ForEach(likedAlbumsStore.albums) { album in
                            NavigationLink {
                                AlbumDetailView(album: album)
                            } label: {
                                VStack(alignment: .leading, spacing: 8) {
                                    AsyncArtwork(
                                        url: album.artworkURL,
                                        size: 150
                                    )
                                    Text(
                                        Album.isUsableTitle(album.title)
                                            ? album.title
                                            : L10n.text("Альбом")
                                    )
                                        .font(.subheadline.weight(.semibold))
                                        .foregroundStyle(.primary)
                                        .lineLimit(1)
                                    Text(album.artistText)
                                        .font(.caption)
                                        .foregroundStyle(.secondary)
                                        .lineLimit(1)
                                }
                                .frame(maxWidth: .infinity, alignment: .leading)
                            }
                            .buttonStyle(PremiumPressStyle())
                        }
                    }
                    .padding(.horizontal, 16)
                    .padding(.vertical, 16)
                }
            }
        }
        .background(ThemeBackground())
        .navigationTitle(L10n.text("Альбомы"))
        .navigationBarTitleDisplayMode(.inline)
    }
}

// MARK: - Artists screen

/// Artists derived from the user's library tracks, reached from
/// "More → Артисты и кураторы".
struct ArtistsScreen: View {
    @EnvironmentObject private var settings: AppSettings

    let tracks: [Track]

    private struct ArtistGroup: Identifiable {
        let name: String
        var id: String { name }
    }

    private var artists: [ArtistGroup] {
        var seen = Set<String>()
        var result: [ArtistGroup] = []
        for track in tracks where !track.artist.isEmpty {
            let name = track.artist
            if seen.insert(name).inserted {
                result.append(ArtistGroup(name: name))
            }
        }
        return result.sorted { $0.name.localizedCaseInsensitiveCompare($1.name) == .orderedAscending }
    }

    var body: some View {
        Group {
            if artists.isEmpty {
                EmptyStateView(
                    title: "Артистов пока нет",
                    systemImage: "music.mic",
                    description: "Исполнители из вашей медиатеки появятся здесь."
                )
            } else {
                ScrollView {
                    LazyVGrid(
                        columns: [
                            GridItem(.flexible(), spacing: 14),
                            GridItem(.flexible(), spacing: 14)
                        ],
                        spacing: 18
                    ) {
                        ForEach(artists) { group in
                            NavigationLink {
                                ArtistView(artist: group.name)
                            } label: {
                                VStack(spacing: 8) {
                                    ZStack {
                                        RoundedRectangle(
                                            cornerRadius: 75,
                                            style: .continuous
                                        )
                                        .fill(
                                            LinearGradient(
                                                colors: [
                                                    settings.theme.accent.opacity(0.55),
                                                    settings.theme.secondaryAccent.opacity(0.5)
                                                ],
                                                startPoint: .topLeading,
                                                endPoint: .bottomTrailing
                                            )
                                        )
                                        Image(systemName: "music.mic")
                                            .font(.system(size: 30, weight: .semibold))
                                            .foregroundStyle(.white)
                                    }
                                    .frame(width: 92, height: 92)
                                    Text(group.name)
                                        .font(.subheadline.weight(.semibold))
                                        .foregroundStyle(.primary)
                                        .lineLimit(2)
                                        .multilineTextAlignment(.center)
                                }
                                .frame(maxWidth: .infinity)
                            }
                            .buttonStyle(PremiumPressStyle())
                        }
                    }
                    .padding(.horizontal, 16)
                    .padding(.vertical, 16)
                }
            }
        }
        .background(ThemeBackground())
        .navigationTitle(L10n.text("Артисты и кураторы"))
        .navigationBarTitleDisplayMode(.inline)
    }
}