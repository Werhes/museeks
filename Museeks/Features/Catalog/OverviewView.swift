import SwiftUI

struct OverviewView: View {
    @EnvironmentObject private var environment: AppEnvironment
    @EnvironmentObject private var sessionStore: SessionStore
    @EnvironmentObject private var player: AudioPlayer
    @EnvironmentObject private var settings: AppSettings
    @EnvironmentObject private var overview: OverviewCatalogStore
    @Binding var mode: CatalogMode
    let catalogModeHeader: AnyView
    @State private var actionErrorMessage: String?
    @State private var sharingTrack: Track?
    @State private var detailDestination: TrackDetailDestination?
    @State private var selectedAlbum: Album?
    @State private var albumLookupTask: Task<Void, Never>?

    var body: some View {
        GeometryReader { proxy in
            let metrics = OverviewMetrics(containerWidth: proxy.size.width)
            ScrollView {
                LazyVStack(alignment: .leading, spacing: 24) {
                    catalogModeHeader

                    bannerStrip(metrics: metrics)

                    if overview.isRefreshing && overview.isEmpty {
                        overviewSkeleton(metrics: metrics)
                    } else if overview.isEmpty {
                        EmptyStateView(
                            title: "Обзор пока пуст",
                            systemImage: "square.grid.2x2",
                            description: overview.errorMessage
                                ?? "Не удалось загрузить подборки VK."
                        )
                        .padding(.top, 40)
                    } else {
                        if overview.shelves.isEmpty {
                            EmptyStateView(
                                title: "Обзор пока пуст",
                                systemImage: "square.grid.2x2",
                                description: "VK не вернул подборки."
                            )
                            .padding(.top, 40)
                        } else {
                            ForEach(overview.shelves) { shelf in
                                overviewShelf(shelf, metrics: metrics)
                            }
                        }
                        if let errorMessage = overview.errorMessage {
                            retryRow(errorMessage)
                        }
                    }
                }
                .padding(.horizontal, metrics.horizontalPadding)
                .padding(.top, 6)
            }
            .background(ThemeBackground())
            .navigationTitle("Обзор")
            .navigationBarTitleDisplayMode(.inline)
            .dynamicTypeSize(...DynamicTypeSize.large)
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
            .refreshable { await environment.refreshOverviewCatalog(force: true) }
            .task(id: sessionStore.resolvedOfflineAccountID) {
                await environment.refreshOverviewCatalog()
            }
            .alert(
                "Не удалось открыть альбом",
                isPresented: Binding(
                    get: { actionErrorMessage != nil },
                    set: { if !$0 { actionErrorMessage = nil } }
                )
            ) {
                Button("ОК", role: .cancel) {}
            } message: {
                Text(actionErrorMessage ?? "")
            }
        }
    }

    @ViewBuilder
    private func bannerStrip(metrics: OverviewMetrics) -> some View {
        if !overview.bannerURLs.isEmpty {
            ScrollView(.horizontal, showsIndicators: false) {
                LazyHStack(spacing: metrics.cardSpacing) {
                    ForEach(Array(overview.bannerURLs.enumerated()),
                            id: \.offset) { _, url in
                        CachedRemoteImage(url: url) { image in
                            image.resizable().scaledToFill()
                        } placeholder: {
                            Rectangle().fill(.primary.opacity(0.08))
                        }
                        .frame(width: metrics.containerWidth, height: 104)
                        .clipShape(
                            RoundedRectangle(cornerRadius: 16, style: .continuous)
                        )
                    }
                }
            }
            .padding(.horizontal, -metrics.horizontalPadding)
        }
    }

    @ViewBuilder
    private func overviewShelf(
        _ shelf: VKOverviewShelf,
        metrics: OverviewMetrics
    ) -> some View {
        switch shelf.kind {
        case .tracks:
            trackShelf(shelf, metrics: metrics)
        case .playlists:
            playlistShelf(shelf, metrics: metrics)
        }
    }

    private func trackShelf(
        _ shelf: VKOverviewShelf,
        metrics: OverviewMetrics
    ) -> some View {
        VStack(alignment: .leading, spacing: 11) {
            HomeSectionHeader(shelf.title)
            ScrollView(.horizontal, showsIndicators: false) {
                LazyHStack(alignment: .top, spacing: metrics.cardSpacing) {
                    ForEach(shelf.tracks.prefix(14)) { track in
                        homeTrackItem(
                            track,
                            queue: shelf.tracks,
                            artworkSize: metrics.trackWidth
                        )
                        .contextMenu {
                            trackContextMenu(track, queue: shelf.tracks)
                        }
                    }
                }
            }
        }
    }

    private func playlistShelf(
        _ shelf: VKOverviewShelf,
        metrics: OverviewMetrics
    ) -> some View {
        VStack(alignment: .leading, spacing: 11) {
            HomeSectionHeader(shelf.title)
            ScrollView(.horizontal, showsIndicators: false) {
                LazyHStack(alignment: .top, spacing: metrics.cardSpacing) {
                    ForEach(shelf.playlists.prefix(14)) { playlist in
                        NavigationLink {
                            PlaylistDetailView(playlist: playlist)
                        } label: {
                            VStack(alignment: .leading, spacing: 6) {
                                PlaylistArtworkView(
                                    playlist: playlist,
                                    size: metrics.playlistWidth
                                )
                                Text(playlist.title)
                                    .font(.footnote.weight(.semibold))
                                    .foregroundStyle(.primary)
                                    .lineLimit(2)
                                    .frame(
                                        height: 34,
                                        alignment: .topLeading
                                    )
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
                            .frame(
                                width: metrics.playlistWidth,
                                alignment: .topLeading
                            )
                        }
                        .buttonStyle(PremiumPressStyle())
                    }
                }
            }
        }
    }

    private func retryRow(_ message: String) -> some View {
        Button {
            Task { await environment.refreshOverviewCatalog(force: true) }
        } label: {
            HStack(spacing: 12) {
                Image(systemName: "arrow.clockwise")
                Text(message)
                    .font(.caption)
                    .lineLimit(2)
                Spacer()
            }
            .foregroundStyle(.secondary)
            .padding(14)
            .premiumCard(interactive: true)
        }
        .buttonStyle(PremiumPressStyle())
    }

    private func homeTrackItem(
        _ track: Track,
        queue: [Track],
        artworkSize: CGFloat
    ) -> some View {
        ZStack(alignment: .topLeading) {
            Button {
                openAlbum(for: track)
            } label: {
                homeTrackCard(track, artworkSize: artworkSize)
            }
            .buttonStyle(PremiumPressStyle())

            Button {
                Haptics.selection()
                player.play(track, in: queue)
            } label: {
                Group {
                    if player.currentTrack?.id == track.id {
                        PlaybackIndicatorView(
                            isPlaying: player.isPlaying,
                            color: settings.theme.buttonForeground
                        )
                    } else {
                        Image(systemName: "play.fill")
                    }
                }
                .font(.caption.weight(.bold))
                .foregroundStyle(settings.theme.buttonForeground)
                .frame(width: 32, height: 32)
                .background(settings.theme.accent, in: Circle())
            }
            .buttonStyle(PremiumPressStyle())
            .offset(x: artworkSize - 39, y: artworkSize - 39)
            .accessibilityLabel(L10n.text("Воспроизвести трек"))
        }
        .frame(width: artworkSize, alignment: .topLeading)
    }

    private func homeTrackCard(
        _ track: Track,
        artworkSize: CGFloat
    ) -> some View {
        VStack(alignment: .leading, spacing: 6) {
            HomeTrackArtwork(url: track.artworkURL, size: artworkSize)
            Text(track.title)
                .font(.footnote.weight(.semibold))
                .foregroundStyle(
                    player.currentTrack?.id == track.id
                        ? settings.theme.accent
                        : Color.primary
                )
                .lineLimit(2)
                .multilineTextAlignment(.leading)
                .fixedSize(horizontal: false, vertical: true)
            Text(track.artist)
                .font(.caption2)
                .foregroundStyle(.secondary)
                .lineLimit(1)
                .truncationMode(.tail)
        }
        .frame(width: artworkSize, alignment: .topLeading)
        .accessibilityElement(children: .combine)
    }

    private func openAlbum(for track: Track) {
        albumLookupTask?.cancel()
        albumLookupTask = nil
        guard let title = track.albumTitle,
              Album.isUsableTitle(title) else {
            return
        }
        let requestedTrackID = track.id
        albumLookupTask = Task {
            do {
                let page = try await environment.withAuthorizedToken { token in
                    try await environment.musicService.searchAlbums(
                        query: title,
                        accessToken: token,
                        offset: 0,
                        count: 20
                    )
                }
                let exact = page.items.first {
                    $0.title.localizedCaseInsensitiveCompare(title)
                        == .orderedSame
                        && ($0.artists.isEmpty
                            || $0.artistText.localizedCaseInsensitiveContains(
                                track.artist
                            ))
                }
                guard let album = exact else {
                    guard requestedTrackID == track.id else { return }
                    actionErrorMessage = L10n.format(
                        "Не удалось открыть альбом: %@",
                        title
                    )
                    return
                }
                guard requestedTrackID == track.id else { return }
                selectedAlbum = album
                actionErrorMessage = nil
            } catch is CancellationError {
                return
            } catch {
                guard requestedTrackID == track.id else { return }
                actionErrorMessage = L10n.format(
                    "Не удалось открыть альбом: %@",
                    error.localizedDescription
                )
            }
        }
    }

    @ViewBuilder
    private func trackContextMenu(
        _ track: Track,
        queue: [Track]
    ) -> some View {
        Button {
            player.playNext(track)
        } label: {
            Label("Играть следующим", systemImage: "text.badge.plus")
        }
        Button {
            player.play(track, in: queue)
            player.presentPlayer()
        } label: {
            Label("Открыть плеер", systemImage: "play.circle")
        }
        if TrackAlbumNavigation.canOpen(track) {
            Button {
                detailDestination = .album(track)
            } label: {
                Label("Открыть альбом", systemImage: "square.stack")
            }
        }
        Button {
            sharingTrack = track
        } label: {
            Label("Поделиться аудиофайлом", systemImage: "square.and.arrow.up")
        }
    }

    private func overviewSkeleton(metrics: OverviewMetrics) -> some View {
        VStack(alignment: .leading, spacing: 22) {
            ForEach(0..<3, id: \.self) { section in
                VStack(alignment: .leading, spacing: 11) {
                    RoundedRectangle(cornerRadius: 6)
                        .fill(.primary.opacity(0.11))
                        .frame(width: 132, height: 16)
                    ScrollView(.horizontal, showsIndicators: false) {
                        HStack(spacing: metrics.cardSpacing) {
                            ForEach(0..<3, id: \.self) { _ in
                                VStack(alignment: .leading, spacing: 6) {
                                    RoundedRectangle(
                                        cornerRadius: PremiumLayout.artworkRadius(
                                            for: metrics.trackWidth
                                        ),
                                        style: .continuous
                                    )
                                    .fill(.primary.opacity(0.09))
                                    .frame(
                                        width: metrics.trackWidth,
                                        height: metrics.trackWidth
                                    )
                                    RoundedRectangle(cornerRadius: 4)
                                        .fill(.primary.opacity(0.09))
                                        .frame(
                                            width: metrics.trackWidth * 0.82,
                                            height: 11
                                        )
                                    RoundedRectangle(cornerRadius: 4)
                                        .fill(.primary.opacity(0.06))
                                        .frame(
                                            width: metrics.trackWidth * 0.58,
                                            height: 9
                                        )
                                }
                            }
                        }
                    }
                }
            }
        }
        .redacted(reason: .placeholder)
        .accessibilityLabel("Загружаем подборки")
    }
}

private struct OverviewMetrics {
    let containerWidth: CGFloat

    var horizontalPadding: CGFloat {
        containerWidth <= 350 ? 14 : 16
    }

    var cardSpacing: CGFloat {
        containerWidth <= 350 ? 10 : 12
    }

    var trackWidth: CGFloat {
        min(max(containerWidth * 0.36, 114), 142)
    }

    var playlistWidth: CGFloat {
        min(max(containerWidth * 0.35, 112), 140)
    }
}