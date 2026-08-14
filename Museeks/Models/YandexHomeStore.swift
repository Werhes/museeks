import Foundation

/// Data holder for the Yandex home feed. Kept intentionally thin: the home
/// screen renders My Wave, "Настроили для вас" (landing), and new releases.
@MainActor
final class YandexHomeStore: ObservableObject {
    @Published private(set) var waveTracks: [Track] = []
    @Published private(set) var likedTracks: [Track] = []
    @Published private(set) var playlists: [Playlist] = []
    @Published private(set) var likedAlbums: [Album] = []
    @Published private(set) var landingBlocks: [YandexLandingBlock] = []
    @Published private(set) var newReleases: [Album] = []
    @Published private(set) var isLoading = false
    @Published var errorMessage: String?

    private var hasLoaded = false

    func shouldRefresh(force: Bool = false) -> Bool {
        force || !hasLoaded
    }

    func load(
        force: Bool = false,
        service: any MusicService,
        accessTokenProvider: (() async throws -> String)?
    ) async {
        guard shouldRefresh(force: force) else { return }
        isLoading = true
        defer { isLoading = false }

        guard let yandex = service as? YandexMusicService else { return }
        // Resolve the token once up front; YandexMusicService is Sendable so
        // passing the plain String into the parallel requests avoids any
        // non-Sendable closure captures.
        let token: String
        if let accessTokenProvider {
            guard let resolved = try? await accessTokenProvider() else {
                return
            }
            token = resolved
        } else {
            return
        }
        async let wave: [Track] = {
            (try? await yandex.waveTracks(accessToken: token)) ?? []
        }()
        async let liked: [Track] = {
            (try? await yandex.library(
                accessToken: token,
                offset: 0,
                count: 50
            ).items) ?? []
        }()
        async let playlistsResult: [Playlist] = {
            (try? await yandex.playlists(
                accessToken: token,
                offset: 0,
                count: 20
            ).items) ?? []
        }()
        async let likedAlbumsResult: [Album] = {
            (try? await yandex.likedAlbums(
                accessToken: token,
                offset: 0,
                count: 20
            ).items) ?? []
        }()
        async let landing: [YandexLandingBlock] = {
            (try? await yandex.landingBlocks(accessToken: token)) ?? []
        }()
        async let releases: [Album] = {
            (try? await yandex.newReleases(accessToken: token)) ?? []
        }()

        waveTracks = await wave
        likedTracks = await liked
        playlists = await playlistsResult
        likedAlbums = await likedAlbumsResult
        landingBlocks = await landing
        newReleases = await releases
        errorMessage = nil
        hasLoaded = true
    }
}