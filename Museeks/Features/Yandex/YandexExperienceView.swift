import SwiftUI

// MARK: - Yandex tab model

enum YandexTab: Int, CaseIterable, Identifiable {
    case home
    case collection
    case search
    case profile

    var id: Int { rawValue }

    var title: String {
        switch self {
        case .home: L10n.text("Главная")
        case .collection: L10n.text("Коллекция")
        case .search: L10n.text("Поиск")
        case .profile: L10n.text("Профиль")
        }
    }

    var image: String {
        switch self {
        case .home: "house.fill"
        case .collection: "heart.fill"
        case .search: "magnifyingglass"
        case .profile: "person.crop.circle"
        }
    }
}

// MARK: - Root container

/// Top-level container for Yandex mode. Presents the four Yandex tabs in a
/// custom dock (mirroring the app's VK dock) while keeping the shared
/// mini-player and full-screen player intact.
struct YandexMainView: View {
    @EnvironmentObject private var environment: AppEnvironment
    @EnvironmentObject private var player: AudioPlayer
    @EnvironmentObject private var settings: AppSettings
    @State private var selectedTab: YandexTab = .home
    let playerNamespace: Namespace.ID

    var body: some View {
        ZStack {
            tabContent(.home) {
                NavigationStack { YandexHomeView() }
            }
            tabContent(.collection) {
                NavigationStack { YandexCollectionView() }
            }
            tabContent(.search) {
                NavigationStack { YandexSearchView() }
            }
            tabContent(.profile) {
                NavigationStack { YandexProfileView() }
            }
        }
        .overlay(alignment: .bottom) {
            YandexTabDock(
                selection: $selectedTab,
                playerNamespace: playerNamespace
            )
        }
        .task(id: sessionID) {
            await environment.refreshYandexHome(force: true)
        }
    }

    private var sessionID: Int? {
        environment.sessionStore.resolvedOfflineAccountID
    }

    @ViewBuilder
    private func tabContent<Content: View>(
        _ tab: YandexTab,
        @ViewBuilder content: () -> Content
    ) -> some View {
        content()
            .opacity(selectedTab == tab ? 1 : 0)
            .allowsHitTesting(selectedTab == tab)
            .accessibilityHidden(selectedTab != tab)
            .zIndex(selectedTab == tab ? 1 : 0)
            .animation(
                .easeInOut(duration: 0.18),
                value: selectedTab
            )
    }
}

/// Reuses the shared adaptive glass dock with Yandex tabs.
private struct YandexTabDock: View {
    @EnvironmentObject private var player: AudioPlayer
    @EnvironmentObject private var settings: AppSettings
    @Binding var selection: YandexTab
    let playerNamespace: Namespace.ID

    var body: some View {
        AdaptiveGlassContainer(spacing: 10) {
            VStack(spacing: 12) {
                if player.currentTrack != nil {
                    MiniPlayerView(playerNamespace: playerNamespace)
                        .transition(
                            .move(edge: .bottom).combined(with: .opacity)
                        )
                }
                HStack(spacing: 10) {
                    ForEach(YandexTab.allCases) { tab in
                        tabButton(tab)
                    }
                }
                .padding(5)
                .adaptiveGlass(
                    in: Capsule(style: .continuous),
                    interactive: true,
                    tint: settings.theme.accent.opacity(0.06)
                )
                .shadow(color: .black.opacity(0.16), radius: 12, y: 6)
            }
        }
        .dynamicTypeSize(...DynamicTypeSize.large)
        .padding(.horizontal, 12)
        .padding(.top, 8)
        .padding(.bottom, 5)
        .animation(
            .spring(response: 0.34, dampingFraction: 0.86),
            value: player.currentTrack?.id
        )
    }

    private func tabButton(_ tab: YandexTab) -> some View {
        Button {
            Haptics.selection()
            withAnimation(
                .spring(response: 0.32, dampingFraction: 0.82)
            ) {
                selection = tab
            }
        } label: {
            VStack(spacing: 3) {
                Image(systemName: tab.image)
                    .font(.system(size: 20, weight: .semibold))
                    .scaleEffect(selection == tab ? 1.04 : 0.94)
                    .frame(width: 30, height: 26)
                    .background {
                        if selection == tab {
                            Circle().fill(settings.theme.accent.opacity(0.16))
                        }
                    }
                Text(tab.title)
                    .font(.caption2.weight(.semibold))
                    .lineLimit(1)
            }
            .foregroundStyle(
                selection == tab
                    ? settings.theme.accent
                    : Color.primary.opacity(0.72)
            )
            .frame(maxWidth: .infinity)
            .frame(height: 48)
            .contentShape(Capsule())
        }
        .buttonStyle(.plain)
        .accessibilityAddTraits(selection == tab ? .isSelected : [])
    }
}

// MARK: - Home

struct YandexHomeView: View {
    @EnvironmentObject private var environment: AppEnvironment
    @EnvironmentObject private var player: AudioPlayer
    @EnvironmentObject private var home: YandexHomeStore
    @State private var isWaveSettingsPresented = false
    @State private var selectedAlbum: Album?
    @State private var sharingTrack: Track?
    @State private var detailDestination: TrackDetailDestination?

    var body: some View {
        ScrollView {
            LazyVStack(alignment: .leading, spacing: 24) {
                YandexWaveHeroCard(
                    tracks: home.waveTracks,
                    onPlay: { playWave() },
                    onSettings: { isWaveSettingsPresented = true }
                )

                if !home.likedTracks.isEmpty {
                    yandexSectionHeader(
                        L10n.text("Мне нравится"),
                        trailing: L10n.text("История")
                    )
                    trackList(home.likedTracks)
                }

                ForEach(home.landingBlocks) { block in
                    landingSection(block)
                }

                if !home.newReleases.isEmpty {
                    yandexSectionHeader(L10n.text("Новые релизы"))
                    albumRail(home.newReleases)
                }

                if home.isLoading && home.waveTracks.isEmpty {
                    ProgressView()
                        .frame(maxWidth: .infinity)
                        .padding(.vertical, 40)
                }
            }
            .padding(.horizontal, 16)
            .padding(.vertical, 8)
        }
        .background(ThemeBackground())
        .navigationTitle(L10n.text("Главная"))
        .navigationBarTitleDisplayMode(.inline)
        .refreshable {
            await environment.refreshYandexHome(force: true)
        }
        .sheet(isPresented: $isWaveSettingsPresented) {
            YandexWaveSettingsView()
        }
        .trackShareSheet(track: $sharingTrack)
        .sheet(item: $detailDestination) { destination in
            TrackDestinationSheet(destination: destination)
        }
        .navigationDestination(
            isPresented: Binding(
                get: { selectedAlbum != nil },
                set: { if !$0 { selectedAlbum = nil } }
            )
        ) {
            if let selectedAlbum {
                AlbumDetailView(album: selectedAlbum)
            }
        }
        .dynamicTypeSize(...DynamicTypeSize.large)
    }

    private var accent: Color { environment.settings.theme.accent }

    private func yandexSectionHeader(
        _ title: String,
        trailing: String? = nil
    ) -> some View {
        HStack {
            Text(title)
                .font(.title3.bold())
            Spacer()
            if let trailing {
                Text(trailing)
                    .font(.subheadline)
                    .foregroundStyle(accent)
            }
        }
    }

    @ViewBuilder
    private func landingSection(_ block: YandexLandingBlock) -> some View {
        yandexSectionHeader(block.title)
        if !block.playlists.isEmpty {
            playlistRail(block.playlists)
        }
        if !block.albums.isEmpty {
            albumRail(block.albums)
        }
    }

    private func playlistRail(_ playlists: [Playlist]) -> some View {
        ScrollView(.horizontal, showsIndicators: false) {
            LazyHStack(spacing: 12) {
                ForEach(playlists) { playlist in
                    NavigationLink {
                        PlaylistDetailView(playlist: playlist)
                    } label: {
                        YandexRailTile(
                            title: playlist.title,
                            artwork: playlist.artworkURL,
                            subtitle: L10n.trackCount(playlist.count)
                        )
                    }
                    .buttonStyle(.plain)
                }
            }
        }
    }

    private func albumRail(_ albums: [Album]) -> some View {
        ScrollView(.horizontal, showsIndicators: false) {
            LazyHStack(spacing: 12) {
                ForEach(albums) { album in
                    Button {
                        selectedAlbum = album
                    } label: {
                        YandexRailTile(
                            title: album.title,
                            artwork: album.artworkURL,
                            subtitle: album.artistText
                        )
                    }
                    .buttonStyle(.plain)
                }
            }
        }
    }

    @ViewBuilder
    private func trackList(_ tracks: [Track]) -> some View {
        ForEach(Array(tracks.prefix(8))) { track in
            TrackRow(track: track, queue: tracks)
                .contextMenu {
                    YandexTrackContextMenu(
                        track: track,
                        service: environment.yandexService,
                        environment: environment,
                        onShare: { sharingTrack = track },
                        onDestination: { detailDestination = $0 }
                    )
                }
        }
    }

    private func playWave() {
        guard !home.waveTracks.isEmpty else { return }
        player.play(home.waveTracks[0], in: home.waveTracks)
    }
}

// MARK: - My Wave hero card

/// "Моя волна" hero: animated gradient with a play button, plus the
/// liquid-glass "Настроить" button.
struct YandexWaveHeroCard: View {
    let tracks: [Track]
    let onPlay: () -> Void
    let onSettings: () -> Void
    @State private var animate = false

    var body: some View {
        ZStack(alignment: .bottom) {
            RoundedRectangle(cornerRadius: PremiumLayout.cardRadius, style: .continuous)
                .fill(
                    LinearGradient(
                        colors: [
                            Color(red: 0.98, green: 0.55, blue: 0.06),
                            Color(red: 0.95, green: 0.2, blue: 0.55),
                            Color(red: 0.45, green: 0.25, blue: 0.75)
                        ],
                        startPoint: .topLeading,
                        endPoint: .bottomTrailing
                    )
                )
                .overlay {
                    RadialGradient(
                        colors: [.white.opacity(0.35), .clear],
                        center: animate ? .topLeading : .bottomTrailing,
                        startRadius: 0,
                        endRadius: 300
                    )
                    .blendMode(.plusLighter)
                }
                .aspectRatio(1.7, contentMode: .fit)
                .onAppear {
                    withAnimation(
                        .easeInOut(duration: 6).repeatForever(autoreverses: true)
                    ) {
                        animate = true
                    }
                }

            VStack(alignment: .leading, spacing: 10) {
                Text(L10n.text("Моя волна"))
                    .font(.system(size: 28, weight: .bold))
                    .foregroundStyle(.white)
                    .shadow(color: .black.opacity(0.25), radius: 8, y: 3)

                Text(L10n.trackCount(tracks.count))
                    .font(.subheadline)
                    .foregroundStyle(.white.opacity(0.85))
            }
            .frame(maxWidth: .infinity, alignment: .leading)
            .padding(18)
        }
        .overlay(alignment: .topTrailing) {
            Button(action: onPlay) {
                Image(systemName: "play.fill")
                    .font(.system(size: 20, weight: .bold))
                    .foregroundStyle(.white)
                    .frame(width: 52, height: 52)
                    .background(.white.opacity(0.22), in: Circle())
                    .overlay {
                        Circle().stroke(.white.opacity(0.35), lineWidth: 1)
                    }
            }
            .buttonStyle(.plain)
            .padding(14)
        }
        .overlay(alignment: .bottomTrailing) {
            Button(action: onSettings) {
                Label(
                    L10n.text("Настроить"),
                    systemImage: "slider.horizontal.3"
                )
                .font(.footnote.weight(.semibold))
                .foregroundStyle(.white)
                .padding(.horizontal, 14)
                .padding(.vertical, 8)
                .background(.white.opacity(0.18), in: Capsule())
                .overlay {
                    Capsule().stroke(.white.opacity(0.3), lineWidth: 1)
                }
                .background(.ultraThinMaterial, in: Capsule())
            }
            .buttonStyle(.plain)
            .padding(14)
        }
        .shadow(color: .black.opacity(0.2), radius: 16, y: 8)
    }
}

// MARK: - Rail tile

struct YandexRailTile: View {
    let title: String
    let artwork: URL?
    let subtitle: String

    var body: some View {
        VStack(alignment: .leading, spacing: 6) {
            CachedRemoteImage(
                url: artwork,
                maxPixelSize: 360
            ) { image in
                image.resizable().scaledToFill()
            } placeholder: {
                Color(uiColor: .secondarySystemBackground)
            }
            .frame(width: 120, height: 120)
            .clipShape(
                RoundedRectangle(cornerRadius: 16, style: .continuous)
            )
            Text(title)
                .font(.subheadline.weight(.semibold))
                .lineLimit(1)
                .foregroundStyle(.primary)
            Text(subtitle)
                .font(.caption)
                .foregroundStyle(.secondary)
                .lineLimit(1)
        }
        .frame(width: 120)
    }
}

// MARK: - Collection

struct YandexCollectionView: View {
    @EnvironmentObject private var environment: AppEnvironment
    @EnvironmentObject private var player: AudioPlayer
    @EnvironmentObject private var home: YandexHomeStore
    @State private var sharingTrack: Track?
    @State private var detailDestination: TrackDetailDestination?

    var body: some View {
        ScrollView {
            LazyVStack(alignment: .leading, spacing: 22) {
                collectionRow(
                    title: L10n.text("Мои плейлисты"),
                    icon: "music.note.list",
                    count: home.playlists.count
                ) {
                    ForEach(home.playlists) { playlist in
                        NavigationLink {
                            PlaylistDetailView(playlist: playlist)
                        } label: {
                            HStack(spacing: 12) {
                                PlaylistArtworkView(
                                    playlist: playlist,
                                    size: 48
                                )
                                Text(playlist.title)
                                    .font(.subheadline.weight(.semibold))
                                Spacer()
                                Text(L10n.trackCount(playlist.count))
                                    .font(.caption)
                                    .foregroundStyle(.secondary)
                            }
                        }
                        .buttonStyle(.plain)
                    }
                }

                collectionRow(
                    title: L10n.text("Любимые альбомы"),
                    icon: "rectangle.stack.fill",
                    count: home.likedAlbums.count
                ) {
                    ForEach(home.likedAlbums) { album in
                        NavigationLink {
                            AlbumDetailView(album: album)
                        } label: {
                            HStack(spacing: 12) {
                                AsyncArtwork(url: album.artworkURL, size: 48)
                                VStack(alignment: .leading, spacing: 2) {
                                    Text(album.title)
                                        .font(.subheadline.weight(.semibold))
                                        .foregroundStyle(.primary)
                                    Text(album.artistText)
                                        .font(.caption)
                                        .foregroundStyle(.secondary)
                                }
                                Spacer()
                            }
                        }
                        .buttonStyle(.plain)
                    }
                }

                collectionRow(
                    title: L10n.text("Мне нравится"),
                    icon: "heart.fill",
                    count: home.likedTracks.count
                ) {
                    ForEach(home.likedTracks) { track in
                        TrackRow(track: track, queue: home.likedTracks)
                            .contextMenu {
                                YandexTrackContextMenu(
                                    track: track,
                                    service: environment.yandexService,
                                    environment: environment,
                                    onShare: { sharingTrack = track },
                                    onDestination: { detailDestination = $0 }
                                )
                            }
                    }
                }
            }
            .padding(.horizontal, 16)
            .padding(.vertical, 8)
        }
        .background(ThemeBackground())
        .navigationTitle(L10n.text("Коллекция"))
        .navigationBarTitleDisplayMode(.inline)
        .refreshable {
            await environment.refreshYandexHome(force: true)
        }
        .trackShareSheet(track: $sharingTrack)
        .sheet(item: $detailDestination) { destination in
            TrackDestinationSheet(destination: destination)
        }
        .dynamicTypeSize(...DynamicTypeSize.large)
    }

    @ViewBuilder
    private func collectionRow<Content: View>(
        title: String,
        icon: String,
        count: Int,
        @ViewBuilder content: () -> Content
    ) -> some View {
        VStack(alignment: .leading, spacing: 10) {
            HStack(spacing: 8) {
                Image(systemName: icon)
                    .foregroundStyle(environment.settings.theme.accent)
                Text(title)
                    .font(.title3.bold())
                Spacer()
                Text(L10n.trackCount(count))
                    .font(.caption)
                    .foregroundStyle(.secondary)
            }
            content()
        }
    }
}

// MARK: - Search

struct YandexSearchView: View {
    @EnvironmentObject private var environment: AppEnvironment
    @State private var query = ""
    @State private var results: [Track] = []
    @State private var isSearching = false
    @State private var sharingTrack: Track?
    @State private var detailDestination: TrackDetailDestination?

    var body: some View {
        ScrollView {
            LazyVStack(alignment: .leading, spacing: 12) {
                if results.isEmpty {
                    emptyState
                } else {
                    ForEach(results) { track in
                        TrackRow(track: track, queue: results)
                            .contextMenu {
                                YandexTrackContextMenu(
                                    track: track,
                                    service: environment.yandexService,
                                    environment: environment,
                                    onShare: { sharingTrack = track },
                                    onDestination: { detailDestination = $0 }
                                )
                            }
                    }
                }
            }
            .padding(.horizontal, 16)
            .padding(.vertical, 8)
        }
        .background(ThemeBackground())
        .navigationTitle(L10n.text("Поиск"))
        .navigationBarTitleDisplayMode(.inline)
        .searchable(text: $query, prompt: L10n.text("Треки, альбомы, исполнители"))
        .onSubmit(of: .search) {
            Task { await search() }
        }
        .trackShareSheet(track: $sharingTrack)
        .sheet(item: $detailDestination) { destination in
            TrackDestinationSheet(destination: destination)
        }
        .dynamicTypeSize(...DynamicTypeSize.large)
    }

    @ViewBuilder
    private var emptyState: some View {
        if isSearching {
            ProgressView()
                .frame(maxWidth: .infinity)
                .padding(.vertical, 60)
        } else if query.isEmpty {
            VStack(spacing: 12) {
                Image(systemName: "magnifyingglass")
                    .font(.system(size: 42))
                    .foregroundStyle(.secondary)
                Text(L10n.text("Найдите музыку"))
                    .font(.headline)
                Text(L10n.text("Поиск по трекам Яндекс Музыки"))
                    .font(.subheadline)
                    .foregroundStyle(.secondary)
            }
            .frame(maxWidth: .infinity)
            .padding(.vertical, 60)
        } else {
            Text(L10n.text("Ничего не найдено"))
                .font(.subheadline)
                .foregroundStyle(.secondary)
                .frame(maxWidth: .infinity)
                .padding(.vertical, 40)
        }
    }

    private func search() async {
        guard !query.isEmpty,
              let yandex = environment.yandexService else { return }
        isSearching = true
        defer { isSearching = false }
        do {
            let page = try await environment.withYandexToken { token in
                try await yandex.search(
                    query: query,
                    accessToken: token,
                    offset: 0,
                    count: 30
                )
            }
            results = page.items
        } catch {}
    }
}

// MARK: - Profile

struct YandexProfileView: View {
    @EnvironmentObject private var environment: AppEnvironment
    @EnvironmentObject private var sessionStore: SessionStore

    var body: some View {
        List {
            Section {
                if let profile = sessionStore.profile {
                    HStack(spacing: 14) {
                        AsyncArtwork(url: profile.photoURL, size: 56)
                        VStack(alignment: .leading, spacing: 3) {
                            Text(profile.displayName)
                                .font(.headline)
                            Text(L10n.text("Яндекс Музыка"))
                                .font(.subheadline)
                                .foregroundStyle(.secondary)
                        }
                    }
                    .padding(.vertical, 6)
                } else {
                    Label(
                        L10n.text("Аккаунт Яндекс Музыки"),
                        systemImage: "person.crop.circle"
                    )
                }
            }

            Section(L10n.text("Токен Яндекс Музыки")) {
                NavigationLink {
                    YandexTokenSettingsView()
                } label: {
                    Label(
                        environment.settings.yandexToken.isEmpty
                            ? L10n.text("Добавить токен")
                            : L10n.text("Токен подключён"),
                        systemImage: environment.settings.yandexToken.isEmpty
                            ? "key"
                            : "checkmark.circle.fill"
                    )
                }
            }

            Section {
                NavigationLink {
                    YandexWaveSettingsView()
                } label: {
                    Label(
                        L10n.text("Настроить мою волну"),
                        systemImage: "slider.horizontal.3"
                    )
                }

                NavigationLink {
                    SettingsView()
                } label: {
                    Label(
                        L10n.text("Настройки"),
                        systemImage: "gearshape"
                    )
                }
            }

            Section {
                Button(role: .destructive) {
                    sessionStore.logout()
                } label: {
                    Label(
                        L10n.text("Выйти"),
                        systemImage: "rectangle.portrait.and.arrow.right"
                    )
                }
            }
        }
        .scrollContentBackground(.hidden)
        .background(ThemeBackground())
        .navigationTitle(L10n.text("Профиль"))
    }
}

// MARK: - Track context menu

struct YandexTrackContextMenu: View {
    let track: Track
    let service: YandexMusicService?
    let environment: AppEnvironment
    let onShare: () -> Void
    let onDestination: (TrackDetailDestination) -> Void
    @State private var isLiked = false
    @State private var isDisliked = false

    var body: some View {
        Button(action: toggleLike) {
            Label(
                isLiked ? L10n.text("Не нравится") : L10n.text("Нравится"),
                systemImage: isLiked ? "heart.fill" : "heart"
            )
        }

        Button(action: { onDestination(.album(track)) }) {
            Label(L10n.text("Трейлер"), systemImage: "play.rectangle")
        }

        Button(action: playWaveFromTrack) {
            Label(L10n.text("Моя волна по треку"), systemImage: "waveform")
        }

        Button(action: onShare) {
            Label(L10n.text("Скачать"), systemImage: "arrow.down.circle")
        }

        Button(action: toggleDislike) {
            Label(
                isDisliked ? L10n.text("Вернуть") : L10n.text("Не нравится"),
                systemImage: "hand.thumbsdown.fill"
            )
        }

        Button(action: { onDestination(.artists(track)) }) {
            Label(L10n.text("Добавить в плейлист"), systemImage: "text.badge.plus")
        }

        Button(action: onShare) {
            Label(L10n.text("Поделиться ссылкой"), systemImage: "square.and.arrow.up")
        }

        Button(action: { onDestination(.album(track)) }) {
            Label(L10n.text("Перейти к альбому"), systemImage: "square.stack")
        }

        Button(action: { onDestination(.artists(track)) }) {
            Label(trackArtistTitle, systemImage: "music.mic")
        }
    }

    private var trackArtistTitle: String {
        let artistCount = track.artist
            .split(separator: ",")
            .map { $0.trimmingCharacters(in: .whitespaces) }
            .filter { !$0.isEmpty }
            .count
        return artistCount >= 2
            ? L10n.text("Перейти к исполнителям")
            : L10n.text("Перейти к исполнителю")
    }

    private func toggleLike() {
        Task {
            guard let service else { return }
            do {
                _ = try await environment.withYandexToken { token in
                    if isLiked {
                        try await service.removeFromLibrary(
                            track,
                            accessToken: token
                        )
                    } else {
                        try await service.addToLibrary(
                            track,
                            accessToken: token
                        )
                    }
                }
                isLiked.toggle()
                if isLiked { isDisliked = false }
            } catch {}
        }
    }

    private func toggleDislike() {
        Task {
            guard let service else { return }
            do {
                _ = try await environment.withYandexToken { token in
                    try await service.dislikeTrack(track, accessToken: token)
                }
                isDisliked.toggle()
                if isDisliked { isLiked = false }
            } catch {}
        }
    }

    private func playWaveFromTrack() {
        Task {
            guard let service else { return }
            do {
                let tracks = try await environment.withYandexToken { token in
                    try await service.waveTracks(accessToken: token)
                }
                if !tracks.isEmpty {
                    environment.player.play(track, in: tracks)
                }
            } catch {}
        }
    }
}

// MARK: - My Wave settings

struct YandexWaveSettingsView: View {
    @EnvironmentObject private var environment: AppEnvironment
    @Environment(\.dismiss) private var dismiss
    @State private var settings = YandexWaveSettings()
    @State private var isLoading = true

    var body: some View {
        NavigationStack {
            ScrollView {
                LazyVStack(alignment: .leading, spacing: 20) {
                    if isLoading {
                        ProgressView()
                            .frame(maxWidth: .infinity)
                            .padding(.vertical, 60)
                    } else {
                        ForEach(YandexWaveCategory.allCases) { category in
                            waveCategorySection(category)
                        }
                    }
                }
                .padding(16)
            }
            .background(ThemeBackground())
            .navigationTitle(L10n.text("Настроить мою волну"))
            .navigationBarTitleDisplayMode(.inline)
            .toolbar {
                ToolbarItem(placement: .cancellationAction) {
                    Button(L10n.text("Выйти")) { dismiss() }
                }
                ToolbarItem(placement: .confirmationAction) {
                    Button(L10n.text("Применить")) { apply() }
                }
            }
            .task {
                await load()
            }
        }
    }

    private var accent: Color { environment.settings.theme.accent }

    private func waveCategorySection(_ category: YandexWaveCategory) -> some View {
        VStack(alignment: .leading, spacing: 10) {
            Text(category.title)
                .font(.headline)
            LazyVGrid(
                columns: [GridItem(.flexible()), GridItem(.flexible())],
                spacing: 10
            ) {
                ForEach(YandexWaveOptions.options(for: category)) { option in
                    waveOptionButton(category: category, option: option)
                }
            }
        }
    }

    @ViewBuilder
    private func waveOptionButton(
        category: YandexWaveCategory,
        option: YandexWaveOption
    ) -> some View {
        let isSelected = isSelected(category, option.id)
        Button {
            toggle(category, option.id)
        } label: {
            HStack(spacing: 10) {
                if let image = option.systemImage {
                    if category == .mood {
                        Image(systemName: image)
                            .font(.caption)
                            .foregroundStyle(option.color)
                            .frame(width: 16, height: 16)
                            .background(option.color.opacity(0.18), in: Circle())
                            .overlay {
                                Circle().stroke(
                                    option.color.opacity(0.4),
                                    lineWidth: 1
                                )
                            }
                    } else {
                        Image(systemName: image)
                            .font(.subheadline)
                            .foregroundStyle(option.color)
                    }
                }
                Text(option.title)
                    .font(.footnote.weight(.medium))
                    .lineLimit(2)
                Spacer(minLength: 4)
                if isSelected {
                    Image(systemName: "checkmark.circle.fill")
                        .font(.caption)
                        .foregroundStyle(accent)
                }
            }
            .padding(.horizontal, 12)
            .padding(.vertical, 12)
            .frame(maxWidth: .infinity, alignment: .leading)
            .background(
                isSelected
                    ? accent.opacity(0.14)
                    : Color(uiColor: .secondarySystemBackground).opacity(0.6),
                in: RoundedRectangle(cornerRadius: 14, style: .continuous)
            )
            .overlay {
                RoundedRectangle(cornerRadius: 14, style: .continuous)
                    .stroke(
                        isSelected
                            ? accent.opacity(0.4)
                            : Color.primary.opacity(0.06),
                        lineWidth: 1
                    )
            }
        }
        .buttonStyle(.plain)
    }

    private func isSelected(_ category: YandexWaveCategory, _ option: String) -> Bool {
        switch category {
        case .activity: settings.activity.contains(option)
        case .mood: settings.mood.contains(option)
        case .language: settings.language.contains(option)
        case .energy: settings.energy.contains(option)
        }
    }

    private func toggle(_ category: YandexWaveCategory, _ option: String) {
        settings = settings.toggling(category: category, option: option)
    }

    private func load() async {
        guard let yandex = environment.yandexService else {
            isLoading = false
            return
        }
        do {
            settings = try await environment.withYandexToken { token in
                try await yandex.waveSettings(accessToken: token)
            }
        } catch {}
        isLoading = false
    }

    private func apply() {
        Task {
            guard let yandex = environment.yandexService else { return }
            do {
                try await environment.withYandexToken { token in
                    try await yandex.setWaveSettings(settings, accessToken: token)
                }
                Haptics.success()
                dismiss()
            } catch {}
        }
    }
}

// MARK: - Yandex token settings

struct YandexTokenSettingsView: View {
    @EnvironmentObject private var environment: AppEnvironment
    @State private var token = ""
    @State private var statusMessage: String?

    var body: some View {
        Form {
            Section {
                TextField(
                    L10n.text("OAuth-токен Яндекс Музыки"),
                    text: $token
                )
                .textInputAutocapitalization(.never)
                .autocorrectionDisabled()
            } header: {
                Text(L10n.text("Токен Яндекс Музыки"))
            } footer: {
                Text(
                    L10n.text(
                        "Вставьте OAuth-токен аккаунта Яндекс Музыки. "
                        + "Токен хранится только на устройстве."
                    )
                )
            }

            Section {
                Button(L10n.text("Сохранить")) { save() }
                    .disabled(token.trimmingCharacters(in: .whitespacesAndNewlines).isEmpty)
            }
        }
        .scrollContentBackground(.hidden)
        .background(ThemeBackground())
        .navigationTitle(L10n.text("Токен Яндекс Музыки"))
        .onAppear {
            token = environment.settings.yandexToken
        }
        .alert(
            L10n.text("Токен сохранён"),
            isPresented: Binding(
                get: { statusMessage != nil },
                set: { if !$0 { statusMessage = nil } }
            )
        ) {
            Button("ОК", role: .cancel) {}
        } message: {
            Text(statusMessage ?? "")
        }
    }

    private func save() {
        let cleaned = token.trimmingCharacters(in: .whitespacesAndNewlines)
        environment.settings.yandexToken = cleaned
        statusMessage = L10n.text("Токен подключён")
    }
}