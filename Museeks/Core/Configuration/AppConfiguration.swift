import Foundation

struct AppConfiguration: Sendable {
    let vkAPIBaseURL: URL
    let projectURL: URL
    let issuesURL: URL
    let apiVersion: String

    static let current: AppConfiguration = {
        let info = Bundle.main.infoDictionary ?? [:]

        func url(_ key: String, fallback: String) -> URL {
            let raw = info[key] as? String ?? fallback
            guard let value = URL(string: raw) else {
                preconditionFailure("Invalid URL for \(key)")
            }
            return value
        }

        return AppConfiguration(
            vkAPIBaseURL: url("VK_API_BASE_URL", fallback: "https://api.vk.ru"),
            projectURL: url(
                "PROJECT_URL",
                fallback: "https://github.com/Werhes/museeks"
            ),
            issuesURL: url(
                "ISSUES_URL",
                fallback: "https://github.com/Werhes/museeks/issues"
            ),
            apiVersion: "5.199"
        )
    }()
}
