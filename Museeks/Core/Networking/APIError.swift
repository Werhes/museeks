import Foundation

enum APIError: LocalizedError, Equatable {
    case unauthorized
    case offline
    case timedOut
    case server(code: Int, message: String)
    case invalidResponse
    case noPlayableURL
    case transport(String)

    var errorDescription: String? {
        switch self {
        case .unauthorized: "Сессия VK истекла. Войдите снова."
        case .offline: "Нет подключения к интернету."
        case .timedOut: "VK не ответил вовремя."
        case let .server(_, message): message
        case .invalidResponse: "VK вернул неожиданный ответ."
        case .noPlayableURL: "Для этого трека нет доступного потока."
        case let .transport(message): message
        }
    }
}

