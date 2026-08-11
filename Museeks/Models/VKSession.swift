import Foundation

struct VKSession: Codable, Equatable, Sendable {
    let accessToken: String
    let userID: Int?
    let expiresAt: Date?
    let cookieHeader: String
    let webUserAgent: String
    let apiUserAgent: String

    var isExpired: Bool {
        guard let expiresAt else { return false }
        return expiresAt <= Date()
    }

    var shouldRefresh: Bool {
        guard let expiresAt else { return false }
        return expiresAt.timeIntervalSinceNow < 10 * 60
    }

    func refreshed(token: String, userID: Int?, expiresAt: Date?, cookies: String) -> VKSession {
        VKSession(
            accessToken: token,
            userID: userID ?? self.userID,
            expiresAt: expiresAt,
            cookieHeader: cookies,
            webUserAgent: webUserAgent,
            apiUserAgent: apiUserAgent
        )
    }
}

