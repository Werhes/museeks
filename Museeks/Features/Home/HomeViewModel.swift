import Combine
import Foundation

@MainActor
final class HomeViewModel: ObservableObject {
    @Published private(set) var content = HomeContent()
    @Published private(set) var isLoading = false
    @Published var errorMessage: String?
    private var loadedToken: String?

    func load(environment: AppEnvironment, force: Bool = false) async {
        guard let session = environment.sessionStore.session else { return }
        if !force, loadedToken == session.accessToken, !content.recommendations.isEmpty { return }
        isLoading = true
        defer { isLoading = false }
        let value = await environment.musicService.home(
            token: session.accessToken,
            userID: session.userID
        )
        if value.recommendations.isEmpty && value.playlists.isEmpty && value.catalogSections.isEmpty {
            errorMessage = "Не удалось загрузить рекомендации VK. Потяните экран вниз, чтобы повторить."
        } else {
            content = value
            loadedToken = session.accessToken
            errorMessage = nil
        }
    }
}
