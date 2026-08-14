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

        guard let yandex = service as? YandexMusicService,
              let accessTokenProvider else {
            return
        }
        do {
            async let wave: [Track] = {
                (try? await yandex.waveTracks(
                    accessToken: accessTokenProvider()
                )) ?? []
            }()
            async let liked: [Track] = {
                (try? await yandex.library(
                    accessToken: accessTokenProvider(),
                    offset: 0,
                    count: 50
                ).items) ?? []
            }()
            async let playlists: [Playlist] = {
                (try? await yandex.playlists(
                    accessToken: accessTokenProvider(),
                    offset: 0,
                    count: 20
                ).items) ?? []
            }()
            async let likedAlbums: [Album] = {
                (try? await yandex.likedAlbums(
                    accessToken: accessTokenProvider(),
                    offset: 0,
                    count: 20
                ).items) ?? []
            }()
            async let landing: [YandexLandingBlock] = {
                (try? await yandex.landingBlocks(
                    accessToken: accessTokenProvider()
                )) ?? []
            }()
            async let releases: [Album] = {
                (try? await yandex.newReleases(
                    accessToken: accessTokenProvider()
                )) ?? []
            }()

            waveTracks = await wave
            likedTracks = await liked
            playlists = await playlists
            likedAlbums = await likedAlbums
            landingBlocks = await landing
            newReleases = await releases
            errorMessage = nil
            hasLoaded = true
        } catch {
            errorMessage = error.localizedDescription
        }
    }
}