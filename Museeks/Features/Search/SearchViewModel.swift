import Combine
import Foundation

@MainActor
final class SearchViewModel: ObservableObject {
    @Published var query = ""
    @Published private(set) var tracks: [Track] = []
    @Published private(set) var artists: [Artist] = []
    @Published private(set) var isLoading = false
    @Published var errorMessage: String?
    private var task: Task<Void, Never>?

    func queryChanged(environment: AppEnvironment) {
        task?.cancel()
        let cleaned = query.trimmingCharacters(in: .whitespacesAndNewlines)
        guard cleaned.count >= 2 else {
            tracks = []
            artists = []
            errorMessage = nil
            return
        }
        task = Task {
            try? await Task.sleep(for: .milliseconds(350))
            guard !Task.isCancelled else { return }
            await search(environment: environment)
        }
    }

    func search(environment: AppEnvironment) async {
        let cleaned = query.trimmingCharacters(in: .whitespacesAndNewlines)
        guard cleaned.count >= 2,
              let token = environment.sessionStore.session?.accessToken else { return }
        isLoading = true
        defer { isLoading = false }
        do {
            async let trackPage = environment.musicService.search(token: token, query: cleaned)
            async let foundArtists = try? environment.musicService.searchArtists(token: token, query: cleaned)
            let page = try await trackPage
            let artistValues = await foundArtists
            tracks = page.items
            artists = artistValues ?? []
            errorMessage = nil
        } catch is CancellationError {
            return
        } catch {
            errorMessage = error.localizedDescription
        }
    }
}
