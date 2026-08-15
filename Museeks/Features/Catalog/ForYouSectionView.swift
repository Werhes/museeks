import SwiftUI

/// Dedicated screen for a «Для вас» section (Открытия, Новинки, Плейлист дня
/// 1–5). These are algorithmically built VK collections that are conceptually
/// distinct from user playlists, so they get their own hero header instead of
/// the generic playlist detail layout.
struct ForYouSectionView: View {
    @EnvironmentObject private var environment: AppEnvironment
    @EnvironmentObject private var sessionStore: SessionStore
    @EnvironmentObject private var player: AudioPlayer
    @EnvironmentObject private var settings: AppSettings

    @StateObject private var model = ForYouSectionViewModel()

    let playlist: Playlist
    var accent: Color? = nil

    var body: some View {
        ScrollView {
            LazyVStack(alignment: .leading, spacing: 18) {
                heroHeader

                if model.isLoading && model.tracks.isEmpty {
                    skeleton
                } else if let error = model.errorMessage, model.tracks.isEmpty {
                    EmptyStateView(
                        title: "Не удалось загрузить",
                        systemImage: "wifi.exclamationmark",
                        description: error
                    )
                    .frame(height: 240)
                    .padding(.top, 30)
                } else if model.tracks.isEmpty {
                    EmptyStateView(
                        title: playlist.title,
                        systemImage: "music.note",
                        description: "Сейчас здесь нет доступных треков."
                    )
                    .frame(height: 240)
                    .padding(.top, 30)
                } else {
                    trackList
                }
            }
            .padding(.bottom, 120)
        }
        .background(ThemeBackground())
        .navigationTitle(playlist.title)
        .navigationBarTitleDisplayMode(.inline)
        .dynamicTypeSize(...DynamicTypeSize.large)
        .task { await load(force: false) }
        .refreshable { await load(force: true) }
    }

    /// Hero header: a large gradient cover, the section title and a play-all
    /// button. Completely distinct from the playlist detail header.
    private var heroHeader: some View {
        VStack(spacing: 16) {
            ZStack {
                LinearGradient(
                    colors: heroColors,
                    startPoint: .topLeading,
                    endPoint: .bottomTrailing
                )
                Image(systemName: heroSymbol)
                    .font(.system(size: 64, weight: .black))
                    .foregroundStyle(.white.opacity(0.92))
            }
            .frame(width: 190, height: 190)
            .clipShape(
                RoundedRectangle(
                    cornerRadius: PremiumLayout.artworkRadius(for: 190),
                    style: .continuous
                )
            )
            .shadow(color: .black.opacity(0.24), radius: 18, y: 9)

            VStack(spacing: 6) {
                Text(playlist.title)
                    .font(.system(size: 26, weight: .heavy, design: .rounded))
                    .multilineTextAlignment(.center)
                    .lineLimit(2)
                Text(
                    L10n.format(
                        "%@ • %@",
                        L10n.trackCount(playlist.count),
                        playlist.source.title
                    )
                )
                .font(.subheadline)
                .foregroundStyle(.secondary)
            }

            Button {
                playAll()
            } label: {
                Label(L10n.text("Слушать"), systemImage: "play.fill")
                    .font(.headline)
                    .frame(maxWidth: .infinity)
                    .padding(.vertical, 15)
                    .foregroundStyle(settings.theme.buttonForeground)
                    .background(
                        themeAccent,
                        in: RoundedRectangle(
                            cornerRadius: PremiumLayout.compactRadius,
                            style: .continuous
                        )
                    )
            }
            .buttonStyle(PremiumPressStyle())
            .disabled(model.tracks.isEmpty)
            .padding(.top, 2)
        }
        .padding(.horizontal, 20)
        .padding(.top, 12)
    }

    private var trackList: some View {
        LazyVStack(spacing: 0) {
            ForEach(Array(model.tracks.enumerated()), id: \.element.id) {
                index, track in
                TrackRow(track: track, queue: model.tracks)
                    .padding(.horizontal, 16)
                    .padding(.vertical, 6)
                    .onAppear {
                        guard track.id == model.tracks.last?.id else { return }
                        Task { await loadMore() }
                    }
                if index < model.tracks.count - 1 {
                    Divider().padding(.leading, 78)
                }
            }
        }
    }

    private var skeleton: some View {
        VStack(spacing: 14) {
            ForEach(0..<6, id: \.self) { _ in
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
                .padding(.horizontal, 16)
            }
        }
        .redacted(reason: .placeholder)
    }

    private var heroColors: [Color] {
        let base = accent ?? themeAccent
        return [base, base.opacity(0.55), base.opacity(0.28)]
    }

    private var heroSymbol: String {
        switch playlist.title {
        case let t where t.contains("Новинки"): return "sparkles"
        case let t where t.contains("Открытия"): return "safari.fill"
        case let t where t.contains("Плейлист дня"): return "calendar"
        case let t where t.contains("Для вас"): return "heart.fill"
        default: return "music.note"
        }
    }

    private var themeAccent: Color {
        settings.theme == .dark
            ? Color(red: 0.04, green: 0.50, blue: 1.0)
            : .black
    }

    private func playAll() {
        guard let first = model.tracks.first else { return }
        player.play(
            first,
            in: model.tracks,
            source: .playlist(title: playlist.title)
        )
    }

    private func load(force: Bool) async {
        guard sessionStore.accessToken != nil else { return }
        await model.load(force: force) {
            try await environment.withAuthorizedToken { token in
                try await environment.musicService.playlistTracks(
                    playlist,
                    accessToken: token,
                    offset: 0,
                    count: 100
                )
            }
        }
    }

    private func loadMore() async {
        guard sessionStore.accessToken != nil else { return }
        await model.loadMore { offset in
            try await environment.withAuthorizedToken { token in
                try await environment.musicService.playlistTracks(
                    playlist,
                    accessToken: token,
                    offset: offset,
                    count: 100
                )
            }
        }
    }
}

@MainActor
private final class ForYouSectionViewModel: ObservableObject {
    @Published private(set) var tracks: [Track] = []
    @Published private(set) var isLoading = false
    @Published private(set) var isLoadingMore = false
    @Published var errorMessage: String?
    private var nextOffset: Int?

    func load(
        force: Bool,
        operation: () async throws -> MusicPage<Track>
    ) async {
        guard !isLoading, force || tracks.isEmpty else { return }
        isLoading = true
        defer { isLoading = false }
        do {
            let page = try await operation()
            tracks = page.items
            nextOffset = page.nextOffset
            errorMessage = nil
        } catch is CancellationError {
            return
        } catch {
            errorMessage = error.localizedDescription
        }
    }

    func loadMore(
        operation: (Int) async throws -> MusicPage<Track>
    ) async {
        guard !isLoading, !isLoadingMore, let offset = nextOffset else {
            return
        }
        isLoadingMore = true
        defer { isLoadingMore = false }
        do {
            let page = try await operation(offset)
            guard let next = page.nextOffset, next > offset else {
                nextOffset = nil
                return
            }
            var known = Set(tracks.map(\.id))
            tracks.append(contentsOf: page.items.filter {
                known.insert($0.id).inserted
            })
            nextOffset = next
            errorMessage = nil
        } catch is CancellationError {
            return
        } catch {
            errorMessage = error.localizedDescription
        }
    }
}