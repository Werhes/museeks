import Combine
import Foundation

@MainActor
final class AppEnvironment: ObservableObject {
    let configuration: AppConfiguration
    let sessionStore: SessionStore
    let networkMonitor: NetworkMonitor
    let apiClient: VKAPIClient
    let musicService: VKMusicService
    let authService: VKWebAuthService
    let player: PlayerController
    let history: ListeningHistory
    let library: MusicLibraryStore

    @Published private(set) var isMaintainingSession = false
    @Published var sessionError: String?

    init(configuration: AppConfiguration = .current) {
        self.configuration = configuration
        let client = VKAPIClient(configuration: configuration)
        let sessionStore = SessionStore()
        let musicService = VKMusicService(client: client)
        let authService = VKWebAuthService(configuration: configuration)
        let player = PlayerController()
        let history = ListeningHistory()
        let library = MusicLibraryStore()

        self.apiClient = client
        self.sessionStore = sessionStore
        self.musicService = musicService
        self.authService = authService
        self.networkMonitor = NetworkMonitor()
        self.player = player
        self.history = history
        self.library = library
        player.networkUserAgent = sessionStore.session?.apiUserAgent

        player.streamResolver = { [weak sessionStore, weak player, musicService, authService] track in
            guard var session = sessionStore?.session else { throw APIError.unauthorized }
            if session.shouldRefresh || session.isExpired {
                session = try await authService.refresh(session)
                try sessionStore?.replaceSession(session)
            }
            await musicService.configure(userAgent: session.apiUserAgent)
            player?.networkUserAgent = session.apiUserAgent
            return try await musicService.refreshedTrack(token: session.accessToken, track: track)
        }
        player.onTrackStarted = { [weak history] track in history?.record(track) }
    }

    func completeAuthentication(_ result: WebAuthResult) async throws {
        await musicService.configure(userAgent: result.session.apiUserAgent)
        player.networkUserAgent = result.session.apiUserAgent
        let profile = try await musicService.profile(token: result.session.accessToken)
        try sessionStore.save(session: result.session, profile: profile)
        sessionError = nil
    }

    func maintainSession(force: Bool = false) async {
        guard !isMaintainingSession, let session = sessionStore.session else { return }
        isMaintainingSession = true
        defer { isMaintainingSession = false }
        do {
            var active = session
            if force || session.shouldRefresh || session.isExpired {
                active = try await authService.refresh(session)
                try sessionStore.replaceSession(active)
            }
            await musicService.configure(userAgent: active.apiUserAgent)
            player.networkUserAgent = active.apiUserAgent
            let profile = try await musicService.profile(token: active.accessToken)
            sessionStore.updateProfile(profile)
            sessionError = nil
        } catch {
            sessionError = error.localizedDescription
        }
    }

    func logout() {
        player.stop()
        library.reset()
        sessionStore.logout()
        sessionError = nil
    }
}
