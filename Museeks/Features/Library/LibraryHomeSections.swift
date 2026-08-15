import SwiftUI

// MARK: - Мои треки teaser card

/// Yandex-style "Мои треки" card: shows the first few tracks and a chevron
/// that opens the full library tracks page.
struct MyTracksTeaserCard: View {
    @EnvironmentObject private var player: AudioPlayer
    @EnvironmentObject private var settings: AppSettings

    let tracks: [Track]
    let totalCount: Int

    private var preview: [Track] { Array(tracks.prefix(3)) }

    var body: some View {
        VStack(alignment: .leading, spacing: 0) {
            NavigationLink {
                LibraryTracksPage()
            } label: {
                HStack {
                    Text(L10n.text("Мои треки"))
                        .font(.title2.weight(.bold))
                        .foregroundStyle(.primary)
                    Spacer()
                    Image(systemName: "chevron.right")
                        .font(.subheadline.weight(.semibold))
                        .foregroundStyle(.secondary)
                }
                .contentShape(Rectangle())
            }
            .buttonStyle(PremiumPressStyle())
            .padding(.horizontal, 16)
            .padding(.top, 14)
            .padding(.bottom, 6)

            if preview.isEmpty {
                EmptyStateView(
                    title: "Медиатека пуста",
                    systemImage: "music.note",
                    description: "Добавленные во VK треки появятся здесь."
                )
                .frame(height: 120)
                .padding(.horizontal, 16)
                .padding(.bottom, 14)
            } else {
                VStack(spacing: 0) {
                    ForEach(Array(preview.enumerated()), id: \.element.id) {
                        index, track in
                        Button {
                            Haptics.selection()
                            player.play(track, in: tracks)
                        } label: {
                            HStack(spacing: 12) {
                                AsyncArtwork(url: track.artworkURL, size: 44)
                                VStack(alignment: .leading, spacing: 3) {
                                    Text(track.title)
                                        .font(.subheadline.weight(.semibold))
                                        .foregroundStyle(.primary)
                                        .lineLimit(1)
                                    Text(track.artist)
                                        .font(.subheadline)
                                        .foregroundStyle(.secondary)
                                        .lineLimit(1)
                                }
                                Spacer()
                                Image(systemName: "play.fill")
                                    .font(.caption)
                                    .foregroundStyle(
                                        player.currentTrack?.id == track.id
                                            ? settings.theme.accent
                                            : Color.secondary
                                    )
                            }
                            .contentShape(Rectangle())
                        }
                        .buttonStyle(.plain)
                        .padding(.horizontal, 16)
                        .padding(.vertical, 8)
                        if index < preview.count - 1 {
                            Divider().padding(.leading, 72)
                        }
                    }
                }
                .padding(.bottom, 8)
            }
        }
        .premiumCard(interactive: true)
        .contentShape(Rectangle())
    }
}

// MARK: - Mix by My music

struct MixByMyMusicCard: View {
    let mix: MusicMix
    var tracks: [Track] = []

    var body: some View {
        NavigationLink {
            MixView(mix: mix)
        } label: {
            ZStack(alignment: .bottomLeading) {
                LinearGradient(
                    colors: [
                        Color(red: 0.04, green: 0.45, blue: 1),
                        Color(red: 0.48, green: 0.13, blue: 0.94),
                        Color(red: 0.93, green: 0.24, blue: 0.65)
                    ],
                    startPoint: .topLeading,
                    endPoint: .bottomTrailing
                )

                VStack(alignment: .leading, spacing: 7) {
                    Text(L10n.text("Мой микс"))
                        .font(.system(size: 24, weight: .black, design: .rounded))
                    Text(L10n.text("Персональная подборка на основе ваших треков"))
                        .font(.subheadline.weight(.medium))
                        .foregroundStyle(.white.opacity(0.85))
                        .lineLimit(2)
                    Spacer(minLength: 6)
                    HStack(spacing: 8) {
                        Image(systemName: "waveform")
                            .font(.headline)
                        Text(L10n.text("Слушать"))
                            .font(.subheadline.weight(.semibold))
                    }
                    .foregroundStyle(.white)
                }
                .padding(20)
            }
            .frame(height: 150)
            .foregroundStyle(.white)
            .clipShape(
                RoundedRectangle(
                    cornerRadius: PremiumLayout.cardRadius,
                    style: .continuous
                )
            )
            .overlay {
                RoundedRectangle(
                    cornerRadius: PremiumLayout.cardRadius,
                    style: .continuous
                )
                .stroke(.white.opacity(0.16), lineWidth: 0.8)
            }
            .shadow(color: .indigo.opacity(0.18), radius: 20, y: 10)
        }
        .buttonStyle(PremiumPressStyle())
    }
}

// MARK: - More grid (2 columns)

private struct MoreItem: Identifiable {
    let id: String
    let title: String
    let systemImage: String
    let tint: Color
}

struct LibraryMoreGrid: View {
    let downloadedCount: Int
    let libraryTracks: [Track]

    private var items: [MoreItem] {
        [
            MoreItem(
                id: "recent",
                title: L10n.text("Недавно слушали"),
                systemImage: "clock.arrow.circlepath",
                tint: Color(red: 0.85, green: 0.45, blue: 0.95)
            ),
            MoreItem(
                id: "playlists",
                title: L10n.text("Плейлисты"),
                systemImage: "rectangle.stack.fill",
                tint: Color(red: 0.20, green: 0.60, blue: 0.95)
            ),
            MoreItem(
                id: "podcasts",
                title: L10n.text("Подкасты"),
                systemImage: "mic.fill",
                tint: Color(red: 0.95, green: 0.55, blue: 0.15)
            ),
            MoreItem(
                id: "audiobooks",
                title: L10n.text("Аудиокниги"),
                systemImage: "book.fill",
                tint: Color(red: 0.85, green: 0.35, blue: 0.55)
            ),
            MoreItem(
                id: "albums",
                title: L10n.text("Альбомы"),
                systemImage: "square.stack.fill",
                tint: Color(red: 0.30, green: 0.70, blue: 0.55)
            ),
            MoreItem(
                id: "artists",
                title: L10n.text("Артисты и кураторы"),
                systemImage: "music.mic",
                tint: Color(red: 0.90, green: 0.40, blue: 0.35)
            ),
            MoreItem(
                id: "radio",
                title: L10n.text("Радио"),
                systemImage: "dot.radiowaves.left.and.right",
                tint: Color(red: 0.20, green: 0.55, blue: 0.95)
            ),
            MoreItem(
                id: "downloaded",
                title: L10n.text("Скачанное"),
                systemImage: "arrow.down.circle.fill",
                tint: Color(red: 0.30, green: 0.75, blue: 0.45)
            ),
            MoreItem(
                id: "kids",
                title: L10n.text("Детям"),
                systemImage: "figure.child.circle.fill",
                tint: Color(red: 0.95, green: 0.75, blue: 0.20)
            )
        ]
    }

    var body: some View {
        VStack(alignment: .leading, spacing: 12) {
            Text(L10n.text("Ещё"))
                .font(.title2.weight(.bold))

            LazyVGrid(
                columns: [
                    GridItem(.flexible(), spacing: 12),
                    GridItem(.flexible(), spacing: 12)
                ],
                spacing: 12
            ) {
                ForEach(items) { item in
                    moreCard(item)
                }
            }
        }
    }

    @ViewBuilder
    private func moreCard(_ item: MoreItem) -> some View {
        Group {
            switch item.id {
            case "recent":
                NavigationLink {
                    ListeningHistoryView()
                } label: {
                    moreLabel(item, count: nil)
                }
                .buttonStyle(PremiumPressStyle())
            case "playlists":
                NavigationLink {
                    PlaylistLibraryView()
                } label: {
                    moreLabel(item, count: nil)
                }
                .buttonStyle(PremiumPressStyle())
            case "albums":
                NavigationLink {
                    LikedAlbumsScreen()
                } label: {
                    moreLabel(item, count: nil)
                }
                .buttonStyle(PremiumPressStyle())
            case "artists":
                NavigationLink {
                    ArtistsScreen(tracks: libraryTracks)
                } label: {
                    moreLabel(item, count: nil)
                }
                .buttonStyle(PremiumPressStyle())
            case "downloaded":
                NavigationLink {
                    OfflineDownloadsView()
                } label: {
                    moreLabel(item, count: downloadedCount)
                }
                .buttonStyle(PremiumPressStyle())
            case "kids":
                NavigationLink {
                    KidsSectionScreen()
                } label: {
                    moreLabel(item, count: nil)
                }
                .buttonStyle(PremiumPressStyle())
            default:
                // Placeholder screen for sections without a VK data source.
                NavigationLink {
                    LibraryPlaceholderScreen(
                        title: item.title,
                        systemImage: item.systemImage,
                        tint: item.tint
                    )
                } label: {
                    moreLabel(item, count: nil)
                }
                .buttonStyle(PremiumPressStyle())
            }
        }
    }

    private func moreLabel(_ item: MoreItem, count: Int?) -> some View {
        HStack(spacing: 12) {
            ZStack {
                RoundedRectangle(
                    cornerRadius: 12,
                    style: .continuous
                )
                .fill(item.tint.opacity(0.22))
                .frame(width: 44, height: 44)
                Image(systemName: item.systemImage)
                    .font(.system(size: 18, weight: .semibold))
                    .foregroundStyle(item.tint)
            }

            VStack(alignment: .leading, spacing: 3) {
                Text(item.title)
                    .font(.subheadline.weight(.semibold))
                    .foregroundStyle(.primary)
                    .lineLimit(1)
                if let count {
                    Text(L10n.trackCount(count))
                        .font(.caption)
                        .foregroundStyle(.secondary)
                }
            }

            Spacer(minLength: 4)
        }
        .padding(.vertical, 12)
        .padding(.horizontal, 14)
        .frame(maxWidth: .infinity, alignment: .leading)
        .background(
            RoundedRectangle(
                cornerRadius: PremiumLayout.compactRadius,
                style: .continuous
            )
            .fill(.primary.opacity(0.06))
        )
        .contentShape(Rectangle())
    }
}

// MARK: - Kids section (VK catalog getSection)

struct KidsSectionScreen: View {
    @EnvironmentObject private var environment: AppEnvironment
    @EnvironmentObject private var sessionStore: SessionStore
    @EnvironmentObject private var player: AudioPlayer

    @State private var tracks: [Track] = []
    @State private var isLoading = true
    @State private var errorMessage: String?

    var body: some View {
        ScrollView {
            LazyVStack(alignment: .leading, spacing: 16) {
                hero

                if isLoading {
                    skeleton
                } else if tracks.isEmpty {
                    EmptyStateView(
                        title: "Детские подборки",
                        systemImage: "figure.child.circle",
                        description: errorMessage
                            ?? "Не удалось загрузить подборки для детей."
                    )
                    .frame(height: 240)
                } else {
                    HStack {
                        Text(L10n.text("Подборки для детей"))
                            .font(.title2.weight(.bold))
                        Spacer()
                        Text(L10n.trackCount(tracks.count))
                            .font(.caption)
                            .foregroundStyle(.secondary)
                    }

                    LazyVStack(spacing: 0) {
                        ForEach(Array(tracks.enumerated()), id: \.element.id) {
                            index, track in
                            TrackRow(track: track, queue: tracks)
                                .padding(.vertical, 6)
                            if index < tracks.count - 1 {
                                Divider().padding(.leading, 62)
                            }
                        }
                    }
                }
            }
            .padding(.horizontal, 16)
            .padding(.bottom, 120)
        }
        .background(ThemeBackground())
        .navigationTitle(L10n.text("Детям"))
        .navigationBarTitleDisplayMode(.inline)
        .refreshable { await load(force: true) }
        .task(id: sessionStore.accessToken) {
            await load(force: false)
        }
    }

    private var hero: some View {
        ZStack(alignment: .bottomLeading) {
            LinearGradient(
                colors: [
                    Color(red: 1.0, green: 0.72, blue: 0.25),
                    Color(red: 1.0, green: 0.45, blue: 0.50)
                ],
                startPoint: .topLeading,
                endPoint: .bottomTrailing
            )
            VStack(alignment: .leading, spacing: 7) {
                Text(L10n.text("Детям"))
                    .font(.system(size: 30, weight: .black, design: .rounded))
                Text(L10n.text("Подборки музыки для детей"))
                    .font(.subheadline.weight(.medium))
                    .foregroundStyle(.white.opacity(0.9))
            }
            .padding(20)
        }
        .foregroundStyle(.white)
        .frame(height: 150)
        .clipShape(
            RoundedRectangle(
                cornerRadius: PremiumLayout.cardRadius,
                style: .continuous
            )
        )
    }

    private var skeleton: some View {
        VStack(spacing: 14) {
            ForEach(0..<6, id: \.self) { _ in
                HStack(spacing: 12) {
                    RoundedRectangle(cornerRadius: 10)
                        .fill(.primary.opacity(0.08))
                        .frame(width: 46, height: 46)
                    VStack(alignment: .leading, spacing: 8) {
                        RoundedRectangle(cornerRadius: 4)
                            .fill(.primary.opacity(0.09))
                            .frame(width: 180, height: 13)
                        RoundedRectangle(cornerRadius: 4)
                            .fill(.primary.opacity(0.06))
                            .frame(width: 120, height: 10)
                    }
                    Spacer()
                }
            }
        }
        .redacted(reason: .placeholder)
    }

    private func load(force: Bool) async {
        guard sessionStore.accessToken != nil else { return }
        if !force && !tracks.isEmpty { return }
        isLoading = true
        defer { isLoading = false }
        do {
            // Use the catalog "kids" section via the shared snapshot,
            // falling back to a direct section fetch.
            let snapshot = try await environment.withAuthorizedToken { token in
                try await environment.musicService.catalogSnapshot(
                    accessToken: token
                )
            }
            let kidsSection = snapshot.sections.first {
                $0.searchableBlob.contains("дет")
                    || $0.searchableBlob.contains("kids")
                    || $0.searchableBlob.contains("child")
            }
            guard let kidsSection else {
                tracks = []
                errorMessage = L10n.text("Раздел «Детям» пока недоступен")
                return
            }
            tracks = try await environment.withAuthorizedToken { token in
                try await environment.musicService.mixTracks(
                    MusicMix(section: kidsSection),
                    accessToken: token
                )
            }
            errorMessage = nil
        } catch is CancellationError {
            return
        } catch {
            tracks = []
            errorMessage = error.localizedDescription
        }
    }
}

extension MusicMix {
    /// Convenience wrapper for a catalog section treated as a kids mix.
    init(section: CatalogSectionRef) {
        self.init(
            id: section.id,
            title: section.title,
            subtitle: "",
            artworkURL: nil,
            matchPercent: nil,
            isSocial: false,
            sectionTitle: section.title,
            curator: nil,
            entityID: nil,
            reference: section.url,
            promptEvents: nil,
            selection: VKMixSelection(),
            backgroundAnimationURL: nil,
            isTunable: false
        )
    }
}