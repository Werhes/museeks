import SwiftUI

/// Full "Мои треки" page opened from the library home "Мои треки" card.
/// Mirrors Yandex Music: a top toggle between My Music and Downloaded,
/// a sound + ellipsis toolbar, a search bar and text-only shuffle/download
/// actions in the accent colour.
struct LibraryTracksPage: View {
    @EnvironmentObject private var environment: AppEnvironment
    @EnvironmentObject private var sessionStore: SessionStore
    @EnvironmentObject private var player: AudioPlayer
    @EnvironmentObject private var settings: AppSettings
    @EnvironmentObject private var networkMonitor: NetworkMonitor
    @EnvironmentObject private var offlineStore: OfflineTrackStore
    @Environment(\.dismiss) private var dismiss

    @StateObject private var tracks = TrackCollectionViewModel(source: .library)

    @State private var section: TracksSection = .myMusic
    @State private var searchText = ""
    @State private var isPreparingShuffle = false
    @State private var isDownloadingAll = false
    @State private var bulkDownloadCompleted = 0
    @State private var bulkDownloadTotal = 0
    @State private var pendingCellularDownload: LibraryDownloadRequest?
    @State private var sharingTrack: Track?
    @State private var detailDestination: TrackDetailDestination?

    private enum TracksSection: String, CaseIterable, Identifiable {
        case myMusic
        case downloaded

        var id: Self { self }

        var title: String {
            switch self {
            case .myMusic: L10n.text("Моя музыка")
            case .downloaded: L10n.text("Скачанное")
            }
        }
    }

    var body: some View {
        ScrollView {
            LazyVStack(alignment: .leading, spacing: 16) {
                searchField
                actionRow
                content
            }
            .padding(.horizontal, 16)
            .padding(.bottom, 120)
        }
        .background(ThemeBackground())
        .navigationTitle(sectionTitle)
        .navigationBarTitleDisplayMode(.inline)
        .navigationBarBackButtonHidden(true)
        .dynamicTypeSize(...DynamicTypeSize.large)
        .toolbar {
            ToolbarItem(placement: .topBarLeading) {
                Button {
                    dismiss()
                } label: {
                    Image(systemName: "chevron.left")
                        .font(.subheadline.weight(.semibold))
                }
                .accessibilityLabel(L10n.text("Назад"))
            }

            ToolbarItem(placement: .principal) {
                toggleHeader
            }
        }
        .trackShareSheet(track: $sharingTrack)
        .sheet(item: $detailDestination) { destination in
            TrackDestinationSheet(destination: destination)
        }
        .task(id: sessionStore.accessToken) {
            await loadTracks(force: false)
        }
        .refreshable { await loadTracks(force: true) }
        .alert(
            L10n.text("Скачать через мобильную сеть?"),
            isPresented: Binding(
                get: { pendingCellularDownload != nil },
                set: { if !$0 { pendingCellularDownload = nil } }
            )
        ) {
            Button(L10n.text("Скачать")) {
                let request = pendingCellularDownload
                pendingCellularDownload = nil
                switch request {
                case let .some(.track(track)):
                    performDownload(track)
                case .some(.all):
                    performDownloadAll()
                case .none:
                    break
                }
            }
            Button(L10n.text("Отмена"), role: .cancel) {
                pendingCellularDownload = nil
            }
        } message: {
            Text(
                L10n.text(
                    "Сейчас используется мобильная сеть. "
                        + "Загрузка может потребовать трафик."
                )
            )
        }
    }

    private var sectionTitle: String {
        switch section {
        case .myMusic:
            return L10n.text("Моя музыка")
        case .downloaded:
            return L10n.text("Скачанное")
        }
    }

    /// Accent used for text-only actions, matching Yandex's violet links.
    private var purpleAccent: Color {
        Color(red: 0.55, green: 0.30, blue: 0.95)
    }

    private var toggleHeader: some View {
        HStack(spacing: 8) {
            ForEach(TracksSection.allCases) { candidate in
                Button {
                    if section != candidate {
                        Haptics.selection()
                        withAnimation(
                            .easeInOut(duration: 0.18)
                        ) {
                            section = candidate
                        }
                    }
                } label: {
                    Text(candidate.title)
                        .font(.subheadline.weight(.semibold))
                        .lineLimit(1)
                        .frame(maxWidth: .infinity)
                        .frame(height: 36)
                        .background {
                            if section == candidate {
                                Capsule().fill(settings.theme.accent.opacity(0.16))
                            }
                        }
                        .foregroundStyle(
                            section == candidate
                                ? settings.theme.accent
                                : Color.primary.opacity(0.7)
                        )
                }
                .buttonStyle(.plain)
                .accessibilityAddTraits(
                    section == candidate ? .isSelected : []
                )
            }
        }
        .padding(4)
        .frame(maxWidth: 220)
        .background(
            Capsule(style: .continuous)
                .fill(.primary.opacity(0.06))
        )
    }

    private var searchField: some View {
        HStack(spacing: 10) {
            Image(systemName: "magnifyingglass")
                .foregroundStyle(.secondary)
            TextField(
                L10n.text("Поиск…"),
                text: $searchText
            )
            .textFieldStyle(.plain)
            .font(.subheadline)
        }
        .padding(.horizontal, 14)
        .frame(height: 44)
        .background(
            RoundedRectangle(
                cornerRadius: PremiumLayout.controlRadius,
                style: .continuous
            )
            .fill(.primary.opacity(0.06))
        )
    }

    @ViewBuilder
    private var actionRow: some View {
        if section == .myMusic {
            HStack {
                Button {
                    shuffleAllTracks()
                } label: {
                    HStack(spacing: 6) {
                        Image(systemName: "shuffle")
                            .font(.caption.weight(.bold))
                        Text(L10n.text("Перемешать всё"))
                            .font(.subheadline.weight(.semibold))
                    }
                    .foregroundStyle(purpleAccent)
                    .padding(.vertical, 10)
                }
                .buttonStyle(.plain)
                .disabled(
                    visibleTracks.isEmpty || isPreparingShuffle || isDownloadingAll
                )

                Spacer()

                if OfflineDownloadsFeature.showsControls {
                    Button {
                        requestDownloadAll()
                    } label: {
                        Text(downloadAllButtonTitle)
                            .font(.subheadline.weight(.semibold))
                            .foregroundStyle(purpleAccent)
                            .padding(.vertical, 10)
                    }
                    .buttonStyle(.plain)
                    .disabled(
                        visibleTracks.isEmpty
                            || isPreparingShuffle
                            || isDownloadingAll
                            || environment.isShareSessionActive
                    )
                }
            }
        }
    }

    @ViewBuilder
    private var content: some View {
        switch section {
        case .myMusic:
            myMusicContent
        case .downloaded:
            downloadedContent
        }
    }

    @ViewBuilder
    private var myMusicContent: some View {
        if tracks.isLoading && tracks.tracks.isEmpty {
            trackSkeleton
        } else if let error = tracks.errorMessage, tracks.tracks.isEmpty {
            VStack(spacing: 14) {
                EmptyStateView(
                    title: "Не удалось загрузить треки",
                    systemImage: "wifi.exclamationmark",
                    description: error
                )
                Button("Повторить") {
                    Task { await loadTracks(force: true) }
                }
                .buttonStyle(.borderedProminent)
            }
            .frame(minHeight: 260)
        } else if tracks.tracks.isEmpty {
            EmptyStateView(
                title: "Медиатека пуста",
                systemImage: "music.note",
                description: "Добавленные во VK треки появятся здесь."
            )
            .frame(height: 260)
        } else {
            headerWithCount
            trackList(filteredTracks)
        }
    }

    private var headerWithCount: some View {
        HStack(alignment: .firstTextBaseline) {
            Text(section == .myMusic ? L10n.text("Все") : sectionTitle)
                .font(.title2.weight(.bold))
            Text("\(totalCount)")
                .font(.subheadline.monospacedDigit())
                .foregroundStyle(.secondary)
        }
    }

    @ViewBuilder
    private var downloadedContent: some View {
        let records = offlineStore.availableRecords
        if records.isEmpty {
            EmptyStateView(
                title: "Нет скачанных треков",
                systemImage: "arrow.down.circle",
                description: "Скачайте треки, чтобы слушать их без интернета."
            )
            .frame(height: 260)
        } else {
            headerWithCount
            trackList(offlineStore.downloadedTracks)
        }
    }

    private func trackList(_ source: [Track]) -> some View {
        let displayed = searchText.isEmpty
            ? source
            : source.filter {
                $0.title.localizedCaseInsensitiveContains(searchText)
                    || $0.artist.localizedCaseInsensitiveContains(searchText)
            }
        return LazyVStack(spacing: 0) {
            ForEach(Array(displayed.enumerated()), id: \.element.id) {
                index, track in
                TrackRow(
                    track: track,
                    queue: displayed
                )
                .padding(.vertical, 6)
                .onAppear {
                    if section == .myMusic {
                        loadMoreIfNeeded(after: track)
                    }
                }
                if index < displayed.count - 1 {
                    Divider().padding(.leading, 62)
                }
            }
        }
    }

    private var visibleTracks: [Track] {
        section == .myMusic ? tracks.tracks : offlineStore.downloadedTracks
    }

    private var totalCount: Int {
        section == .myMusic ? tracks.totalCount : offlineStore.downloadedTrackCount
    }

    private var filteredTracks: [Track] {
        guard !searchText.isEmpty else { return visibleTracks }
        return visibleTracks.filter {
            $0.title.localizedCaseInsensitiveContains(searchText)
                || $0.artist.localizedCaseInsensitiveContains(searchText)
        }
    }

    private var downloadAllButtonTitle: String {
        guard isDownloadingAll, bulkDownloadTotal > 0 else {
            return L10n.text("Скачать всё")
        }
        return "\(bulkDownloadCompleted)/\(bulkDownloadTotal)"
    }

    private var trackSkeleton: some View {
        VStack(spacing: 14) {
            ForEach(0..<7, id: \.self) { _ in
                HStack(spacing: 12) {
                    RoundedRectangle(
                        cornerRadius: PremiumLayout.artworkRadius(for: 46),
                        style: .continuous
                    )
                        .fill(.primary.opacity(0.08))
                        .frame(width: 46, height: 46)
                    VStack(alignment: .leading, spacing: 8) {
                        RoundedRectangle(cornerRadius: 4)
                            .fill(.primary.opacity(0.09))
                            .frame(width: 190, height: 14)
                        RoundedRectangle(cornerRadius: 4)
                            .fill(.primary.opacity(0.06))
                            .frame(width: 120, height: 11)
                    }
                    Spacer()
                }
            }
        }
        .redacted(reason: .placeholder)
    }

    private func loadTracks(force: Bool) async {
        guard sessionStore.accessToken != nil else { return }
        tracks.configure(service: environment.musicService)
        await tracks.load(force: force) {
            try await environment.withAuthorizedToken { token in
                try await environment.musicService.library(
                    accessToken: token,
                    offset: 0,
                    count: 100
                )
            }
        }
    }

    private func loadMoreIfNeeded(after track: Track) {
        guard track.id == tracks.tracks.last?.id,
              sessionStore.accessToken != nil else {
            return
        }
        Task {
            await tracks.loadMore { offset in
                try await environment.withAuthorizedToken { token in
                    try await environment.musicService.library(
                        accessToken: token,
                        offset: offset,
                        count: 100
                    )
                }
            }
        }
    }

    private func shuffleAllTracks() {
        guard !isPreparingShuffle, !isDownloadingAll else { return }
        isPreparingShuffle = true
        Task {
            defer { isPreparingShuffle = false }
            do {
                let allTracks = try await fetchAllLibraryTracks()
                guard let first = allTracks.randomElement() else { return }
                if !player.shuffleEnabled {
                    player.toggleShuffle()
                }
                player.play(first, in: allTracks)
                Haptics.selection()
            } catch is CancellationError {
                return
            } catch {
                Haptics.error()
                player.errorMessage = L10n.format(
                    "Не удалось загрузить все треки: %@",
                    error.localizedDescription
                )
            }
        }
    }

    private func requestDownloadAll() {
        guard !isPreparingShuffle, !isDownloadingAll else { return }
        if networkMonitor.transport == .cellular {
            pendingCellularDownload = .all
        } else {
            performDownloadAll()
        }
    }

    private func performDownloadAll() {
        guard !isPreparingShuffle, !isDownloadingAll else { return }
        isDownloadingAll = true
        bulkDownloadCompleted = 0
        bulkDownloadTotal = 0
        Task {
            defer {
                isDownloadingAll = false
                bulkDownloadCompleted = 0
                bulkDownloadTotal = 0
            }
            do {
                let allTracks = try await fetchAllLibraryTracks()
                let missing = allTracks.filter { !offlineStore.contains($0) }
                bulkDownloadTotal = missing.count
                guard !missing.isEmpty else {
                    Haptics.success()
                    return
                }

                var failureCount = 0
                var firstError: Error?
                for track in missing {
                    try Task.checkCancellation()
                    do {
                        try await environment.downloadForOffline(track)
                    } catch is CancellationError {
                        throw CancellationError()
                    } catch {
                        failureCount += 1
                        firstError = firstError ?? error
                    }
                    bulkDownloadCompleted += 1
                }

                if failureCount == 0 {
                    Haptics.success()
                    DownloadNotifications.notifyDownloadComplete(
                        title: L10n.text("Все треки сохранены офлайн")
                    )
                } else {
                    Haptics.error()
                    player.errorMessage = L10n.format(
                        "Не удалось скачать %d треков: %@",
                        failureCount,
                        firstError?.localizedDescription ?? L10n.text("Ошибка загрузки")
                    )
                }
            } catch is CancellationError {
                return
            } catch {
                Haptics.error()
                player.errorMessage = L10n.format(
                    "Не удалось загрузить список треков: %@",
                    error.localizedDescription
                )
            }
        }
    }

    private func fetchAllLibraryTracks() async throws -> [Track] {
        var collected: [Track] = []
        var known = Set<String>()
        var offset = 0
        var pageCount = 0

        while pageCount < 100 {
            try Task.checkCancellation()
            let page = try await environment.withAuthorizedToken { token in
                try await environment.musicService.library(
                    accessToken: token,
                    offset: offset,
                    count: 100
                )
            }
            collected.append(contentsOf: page.items.filter {
                known.insert($0.id).inserted
            })
            pageCount += 1
            guard let next = page.nextOffset, next > offset else { break }
            offset = next
        }
        return collected
    }

    private func performDownload(_ track: Track) {
        Task {
            do {
                try await environment.downloadForOffline(track)
                Haptics.success()
                DownloadNotifications.notifyDownloadComplete(
                    title: "\(track.artist) — \(track.title)"
                )
            } catch is CancellationError {
                return
            } catch {
                Haptics.error()
                player.errorMessage = L10n.format(
                    "Не удалось сохранить трек офлайн: %@",
                    error.localizedDescription
                )
            }
        }
    }
}