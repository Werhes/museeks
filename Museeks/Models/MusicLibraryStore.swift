import Combine
import Foundation

@MainActor
final class MusicLibraryStore: ObservableObject {
    @Published private(set) var tracks: [Track] = []
    @Published private(set) var playlists: [Playlist] = []
    @Published private(set) var isLoading = false
    @Published var errorMessage: String?

    private var loadedToken: String?

    func refresh(environment: AppEnvironment, force: Bool = false) async {
        guard let session = environment.sessionStore.session else { return }
        if !force, loadedToken == session.accessToken, !tracks.isEmpty { return }
        isLoading = true
        defer { isLoading = false }
        do {
            async let allTracks = loadAllTracks(
                service: environment.musicService,
                token: session.accessToken
            )
            async let allPlaylists = loadAllPlaylists(
                service: environment.musicService,
                token: session.accessToken,
                ownerID: session.userID
            )
            let result = try await (allTracks, allPlaylists)
            tracks = result.0
            playlists = result.1
            loadedToken = session.accessToken
            errorMessage = nil
        } catch {
            errorMessage = error.localizedDescription
        }
    }

    func contains(_ track: Track) -> Bool {
        tracks.contains { $0.id == track.id }
    }

    func toggle(_ track: Track, environment: AppEnvironment) async {
        guard let token = environment.sessionStore.session?.accessToken else { return }
        let wasLiked = contains(track)
        if wasLiked { tracks.removeAll { $0.id == track.id } }
        else { tracks.insert(track, at: 0) }
        do {
            try await environment.musicService.setLiked(!wasLiked, token: token, track: track)
            errorMessage = nil
        } catch {
            if wasLiked { tracks.insert(track, at: 0) }
            else { tracks.removeAll { $0.id == track.id } }
            errorMessage = error.localizedDescription
        }
    }

    func reset() {
        tracks = []
        playlists = []
        loadedToken = nil
    }

    private func loadAllTracks(service: VKMusicService, token: String) async throws -> [Track] {
        var values: [Track] = []
        var offset = 0
        for _ in 0..<25 {
            let page = try await service.library(token: token, offset: offset)
            values.append(contentsOf: page.items)
            guard let next = page.nextOffset else { break }
            offset = next
        }
        return values
    }

    private func loadAllPlaylists(
        service: VKMusicService,
        token: String,
        ownerID: Int?
    ) async throws -> [Playlist] {
        var values: [Playlist] = []
        var offset = 0
        for _ in 0..<10 {
            let page = try await service.playlists(token: token, ownerID: ownerID, offset: offset)
            values.append(contentsOf: page.items)
            guard let next = page.nextOffset else { break }
            offset = next
        }
        return values
    }
}
