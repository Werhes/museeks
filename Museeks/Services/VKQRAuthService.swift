import Foundation

/// Результат QR-логина: access-токен VK, пригодный для подключения сессии.
struct VKQRAuthResult: Sendable {
    let accessToken: String
    let apiUserAgent: String
    let webUserAgent: String
}

enum VKQRAuthError: LocalizedError {
    case invalidQRCode
    case rejected(String)
    case invalidResponse

    var errorDescription: String? {
        switch self {
        case .invalidQRCode:
            return L10n.text(
                "Не удалось распознать QR-код входа. Сканируйте код из меню VK «Вход по QR-коду»."
            )
        case let .rejected(message):
            return message.isEmpty
                ? L10n.text("VK не подтвердил вход по QR-коду.")
                : message
        case .invalidResponse:
            return L10n.text("VK вернул некорректный ответ при входе по QR-коду.")
        }
    }
}

/// Вход по QR-коду VK через протокол auth-code (тот же, что используют
/// официальные клиенты): сканированный QR содержит `uuid` сессии, а
/// `login.vk.ru/?act=connect_code_auth` обменивает его (с анонимным токеном)
/// на access-токен.
struct VKQRAuthService: Sendable {
    // Публичный идентификатор веб-клиента VK (id.vk.ru / login.vk.ru).
    private let webAppID = "7913379"
    // Куда VK вернёт пользователя после логина (base64 "https://vk.com").
    private let destination = "aHR0cHM6Ly92ay5jb20="

    // Мобильно-совместимый API user agent, как в VKWebAuthService.
    private let apiUserAgent =
        "KateMobileAndroid/56 lite-460 (Android 4.4.2; SDK 19; x86; "
        + "unknown Android SDK built for x86; ru)"
    private let webUserAgent =
        "Mozilla/5.0 (iPhone; CPU iPhone OS 17_0 like Mac OS X) "
        + "AppleWebKit/605.1.15 (KHTML, like Gecko) Mobile/15E148"

    /// Выполняет вход по содержимому сканированного QR-кода VK.
    func authenticate(scannedContent: String) async throws -> VKQRAuthResult {
        let uuid = try Self.uuid(from: scannedContent)
        let anonToken = try await anonymousToken()
        let accessToken = try await connect(token: anonToken, uuid: uuid)
        return VKQRAuthResult(
            accessToken: accessToken,
            apiUserAgent: apiUserAgent,
            webUserAgent: webUserAgent
        )
    }

    // MARK: - Анонимный токен

    /// Получает анонимный токен с `id.vk.ru/qr_auth` — он требуется для
    /// `connect_code_auth`. Токен вшит в HTML/JSON страницы.
    private func anonymousToken() async throws -> String {
        var components = URLComponents(string: "https://id.vk.ru/qr_auth")!
        components.queryItems = [
            URLQueryItem(name: "scheme", value: "vkcom_dark"),
            URLQueryItem(name: "app_id", value: webAppID),
            URLQueryItem(name: "origin", value: "https%3A%2F%2Fvk.ru")
        ]
        let session = URLSession(configuration: .ephemeral)
        var request = URLRequest(
            url: components.url!,
            cachePolicy: .reloadIgnoringLocalCacheData,
            timeoutInterval: 30
        )
        request.setValue(webUserAgent, forHTTPHeaderField: "User-Agent")
        let (data, response) = try await session.data(for: request)
        guard let http = response as? HTTPURLResponse,
              (200..<300).contains(http.statusCode) else {
            throw VKQRAuthError.invalidResponse
        }
        guard let html = String(data: data, encoding: .utf8),
              let token = Self.token(in: html) else {
            throw VKQRAuthError.invalidResponse
        }
        return token
    }

    // MARK: - Обмен кода на токен

    private func connect(token: String, uuid: String) async throws -> String {
        var request = URLRequest(
            url: URL(string: "https://login.vk.ru/?act=connect_code_auth")!,
            cachePolicy: .reloadIgnoringLocalCacheData,
            timeoutInterval: 30
        )
        request.httpMethod = "POST"
        request.setValue(
            "application/x-www-form-urlencoded; charset=utf-8",
            forHTTPHeaderField: "Content-Type"
        )
        request.setValue("application/json", forHTTPHeaderField: "Accept")
        request.setValue("https://id.vk.ru", forHTTPHeaderField: "Origin")
        request.setValue("https://id.vk.ru/", forHTTPHeaderField: "Referer")
        request.setValue(webUserAgent, forHTTPHeaderField: "User-Agent")

        let fields: [String: String] = [
            "token": token,
            "uuid": uuid,
            "version": "1",
            "app_id": webAppID,
            "flow_start_state": "",
            "is_external_carousel": "",
            "oauth_version": "",
            "sid": "",
            "oauth_force_hash": "0",
            "is_registration": "0",
            "oauth_response_type": "",
            "vkid_oauth_hash": "",
            "is_oauth_migrated_flow": "0",
            "oauth_state": "",
            "to": destination
        ]
        // Не передаём пустые значения — VK отклоняет лишние пустые поля.
        let body = fields
            .filter { !$0.value.isEmpty }
            .map { "\(Self.encode($0.key))=\(Self.encode($0.value))" }
            .joined(separator: "&")
        request.httpBody = body.data(using: .utf8)

        let session = URLSession(configuration: .ephemeral)
        let (data, response) = try await session.data(for: request)
        guard let http = response as? HTTPURLResponse,
              (200..<300).contains(http.statusCode) else {
            throw VKQRAuthError.invalidResponse
        }
        return try Self.accessToken(from: data)
    }

    // MARK: - Парсинг

    /// Достаёт `uuid` из содержимого QR-кода. VK кодирует его либо как
    /// параметр `uuid` в URL, либо как сам UUID/token.
    static func uuid(from content: String) throws -> String {
        let trimmed = content.trimmingCharacters(in: .whitespacesAndNewlines)
        guard !trimmed.isEmpty else { throw VKQRAuthError.invalidQRCode }

        if let url = URLComponents(string: trimmed),
           let uuid = url.queryItems?
            .first(where: { $0.name.lowercased() == "uuid" })?.value,
           !uuid.isEmpty {
            return uuid
        }
        // Некоторые клиенты кодируют QR целиком как uuid-подобный токен.
        if trimmed.count >= 16,
           trimmed.contains(".") || trimmed.contains("-") {
            return trimmed
        }
        throw VKQRAuthError.invalidQRCode
    }

    /// Ищет анонимный токен в HTML/JSON страницы `id.vk.ru/qr_auth`.
    private static func token(in html: String) -> String? {
        let patterns = [
            #"anonymous_token["']?\s*[:=]\s*["']([^"']+)"#,
            #"name="anonymous_token"\s+value="([^"]+)""#,
            #""anonymous_token"\s*:\s*"([^"]+)""#
        ]
        for pattern in patterns {
            guard let regex = try? NSRegularExpression(pattern: pattern) else {
                continue
            }
            let ns = html as NSString
            let range = NSRange(location: 0, length: ns.length)
            guard let match = regex.firstMatch(in: html, range: range),
                  match.numberOfRanges > 1 else {
                continue
            }
            let value = ns.substring(with: match.range(at: 1))
                .trimmingCharacters(in: .whitespacesAndNewlines)
            if value.count >= 16 {
                return value
            }
        }
        return nil
    }

    /// Извлекает access-токен из JSON-ответа `connect_code_auth`.
    static func accessToken(from data: Data) throws -> String {
        let object: [String: Any]
        do {
            object = (try JSONSerialization.jsonObject(with: data) as? [String: Any]) ?? [:]
        } catch {
            throw VKQRAuthError.invalidResponse
        }
        guard let dataObject = object["data"] as? [String: Any],
              let token = dataObject["access_token"] as? String,
              token.count >= 16 else {
            let message = (object["error_info"] as? String)
                ?? (object["error"] as? String)
                ?? ""
            throw VKQRAuthError.rejected(message)
        }
        return token.trimmingCharacters(in: .whitespacesAndNewlines)
    }

    private static func encode(_ value: String) -> String {
        var allowed = CharacterSet.alphanumerics
        allowed.insert(charactersIn: "-._~")
        return value.addingPercentEncoding(withAllowedCharacters: allowed) ?? value
    }
}