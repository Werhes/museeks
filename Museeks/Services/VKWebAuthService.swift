import Foundation

struct WebAuthResult: Sendable {
    let session: VKSession
}

struct VKWebAuthService: Sendable {
    private let configuration: AppConfiguration

    init(configuration: AppConfiguration = .current) {
        self.configuration = configuration
    }

    func exchange(cookieHeader: String, webUserAgent: String) async throws -> WebAuthResult {
        let cookies = cookieHeader.trimmingCharacters(in: .whitespacesAndNewlines)
        guard !cookies.isEmpty else { throw APIError.unauthorized }

        let config = URLSessionConfiguration.ephemeral
        config.httpCookieStorage = nil
        config.httpShouldSetCookies = false
        config.urlCache = nil
        config.timeoutIntervalForRequest = 25
        let session = URLSession(configuration: config)

        var request = URLRequest(url: configuration.webTokenURL)
        request.httpMethod = "POST"
        request.httpBody = "version=1&app_id=\(configuration.webClientID)".data(using: .utf8)
        request.setValue("application/x-www-form-urlencoded; charset=utf-8", forHTTPHeaderField: "Content-Type")
        request.setValue("application/json", forHTTPHeaderField: "Accept")
        request.setValue("https://vk.ru", forHTTPHeaderField: "Origin")
        request.setValue("https://vk.ru/", forHTTPHeaderField: "Referer")
        request.setValue(cookies, forHTTPHeaderField: "Cookie")
        request.setValue(webUserAgent, forHTTPHeaderField: "User-Agent")

        let (data, response): (Data, URLResponse)
        do {
            (data, response) = try await session.data(for: request)
        } catch let error as URLError {
            if error.code == .timedOut { throw APIError.timedOut }
            if error.code == .notConnectedToInternet { throw APIError.offline }
            throw APIError.transport(error.localizedDescription)
        }
        guard let http = response as? HTTPURLResponse,
              (200..<300).contains(http.statusCode) else {
            throw APIError.unauthorized
        }

        let payload = try Self.parseTokenResponse(data)
        let mergedCookies = Self.mergeCookies(
            original: cookies,
            headers: http.allHeaderFields,
            url: configuration.webTokenURL
        )
        let expiresAt = payload.expires.flatMap { raw -> Date? in
            guard raw > 0 else { return nil }
            // VK may return either a lifetime or an absolute Unix timestamp.
            if raw > 100_000_000_000 {
                return Date(timeIntervalSince1970: raw / 1_000)
            }
            return raw > 1_000_000_000
                ? Date(timeIntervalSince1970: raw)
                : Date().addingTimeInterval(raw)
        }
        return WebAuthResult(
            session: VKSession(
                accessToken: payload.token,
                userID: payload.userID,
                expiresAt: expiresAt,
                cookieHeader: mergedCookies,
                webUserAgent: webUserAgent,
                apiUserAgent: configuration.apiUserAgent
            )
        )
    }

    func refresh(_ current: VKSession) async throws -> VKSession {
        let result = try await exchange(
            cookieHeader: current.cookieHeader,
            webUserAgent: current.webUserAgent
        )
        return current.refreshed(
            token: result.session.accessToken,
            userID: result.session.userID,
            expiresAt: result.session.expiresAt,
            cookies: result.session.cookieHeader
        )
    }

    private static func parseTokenResponse(_ data: Data) throws -> TokenPayload {
        guard let root = try JSONSerialization.jsonObject(with: data) as? [String: Any] else {
            throw APIError.invalidResponse
        }
        let object = (root["data"] as? [String: Any]) ?? root
        if let type = root["type"] as? String, type.lowercased().contains("error") {
            let message = (object["error_description"] as? String)
                ?? (object["error"] as? String)
                ?? "VK не подтвердил веб-сессию."
            throw APIError.server(code: 0, message: message)
        }
        guard let token = object["access_token"] as? String, token.count >= 16 else {
            throw APIError.unauthorized
        }
        let userID = Self.int(object["user_id"] ?? object["userId"])
        let expires = Self.double(object["expires_in"] ?? object["expires"])
        return TokenPayload(token: token, userID: userID, expires: expires)
    }

    private static func int(_ value: Any?) -> Int? {
        if let value = value as? Int { return value }
        if let value = value as? NSNumber { return value.intValue }
        if let value = value as? String { return Int(value) }
        return nil
    }

    private static func double(_ value: Any?) -> Double? {
        if let value = value as? Double { return value }
        if let value = value as? NSNumber { return value.doubleValue }
        if let value = value as? String { return Double(value) }
        return nil
    }

    private static func mergeCookies(
        original: String,
        headers: [AnyHashable: Any],
        url: URL
    ) -> String {
        var values = original.split(separator: ";").reduce(into: [String: String]()) { result, part in
            let pair = part.split(separator: "=", maxSplits: 1)
            guard pair.count == 2 else { return }
            result[String(pair[0]).trimmingCharacters(in: .whitespaces)] = String(pair[1])
        }
        let stringHeaders = headers.reduce(into: [String: String]()) { result, pair in
            guard let key = pair.key as? String else { return }
            result[key] = String(describing: pair.value)
        }
        HTTPCookie.cookies(withResponseHeaderFields: stringHeaders, for: url).forEach {
            values[$0.name] = $0.value
        }
        return values.sorted { $0.key < $1.key }.map { "\($0.key)=\($0.value)" }.joined(separator: "; ")
    }
}

private struct TokenPayload {
    let token: String
    let userID: Int?
    let expires: Double?
}
