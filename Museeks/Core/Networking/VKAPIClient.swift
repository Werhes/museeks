import Foundation

actor VKAPIClient {
    private let configuration: AppConfiguration
    private let session: URLSession
    private var userAgent: String

    init(configuration: AppConfiguration = .current) {
        self.configuration = configuration
        userAgent = configuration.apiUserAgent

        let config = URLSessionConfiguration.ephemeral
        config.urlCache = nil
        config.requestCachePolicy = .reloadIgnoringLocalCacheData
        config.waitsForConnectivity = true
        config.timeoutIntervalForRequest = 25
        config.timeoutIntervalForResource = 45
        config.allowsCellularAccess = true
        config.allowsConstrainedNetworkAccess = true
        config.allowsExpensiveNetworkAccess = true
        session = URLSession(configuration: config)
    }

    func configure(userAgent: String?) {
        let value = userAgent?.trimmingCharacters(in: .whitespacesAndNewlines)
        self.userAgent = value?.isEmpty == false ? value! : configuration.apiUserAgent
    }

    func call<Response: Decodable & Sendable>(
        _ method: String,
        token: String,
        parameters: [String: String] = [:],
        as type: Response.Type = Response.self
    ) async throws -> Response {
        let data = try await perform(method, token: token, parameters: parameters)
        let envelope: VKEnvelope<Response>
        do {
            envelope = try JSONDecoder().decode(VKEnvelope<Response>.self, from: data)
        } catch {
            throw APIError.invalidResponse
        }
        if let error = envelope.error { throw error.apiError }
        guard let response = envelope.response else { throw APIError.invalidResponse }
        return response
    }

    func raw(
        _ method: String,
        token: String,
        parameters: [String: String] = [:]
    ) async throws -> JSONValue {
        try await call(method, token: token, parameters: parameters, as: JSONValue.self)
    }

    private func perform(
        _ method: String,
        token: String,
        parameters: [String: String]
    ) async throws -> Data {
        guard !token.isEmpty else { throw APIError.unauthorized }
        let url = configuration.apiBaseURL
            .appendingPathComponent("method")
            .appendingPathComponent(method)

        var fields = parameters
        fields["access_token"] = token
        fields["v"] = configuration.apiVersion
        let body = fields
            .sorted { $0.key < $1.key }
            .map { "\($0.key.formEncoded)=\($0.value.formEncoded)" }
            .joined(separator: "&")

        var request = URLRequest(url: url)
        request.httpMethod = "POST"
        request.httpBody = body.data(using: .utf8)
        request.setValue("application/x-www-form-urlencoded; charset=utf-8", forHTTPHeaderField: "Content-Type")
        request.setValue("application/json", forHTTPHeaderField: "Accept")
        request.setValue(userAgent, forHTTPHeaderField: "User-Agent")

        var lastError: Swift.Error?
        for attempt in 0..<3 {
            do {
                let (data, response) = try await session.data(for: request)
                guard let http = response as? HTTPURLResponse else {
                    throw APIError.invalidResponse
                }
                if (http.statusCode == 429 || http.statusCode >= 500), attempt < 2 {
                    try await Task.sleep(for: .milliseconds(450 * (attempt + 1)))
                    continue
                }
                guard (200..<300).contains(http.statusCode) else {
                    throw APIError.server(code: http.statusCode, message: "VK: HTTP \(http.statusCode)")
                }
                return data
            } catch is CancellationError {
                throw CancellationError()
            } catch let error as APIError {
                lastError = error
            } catch let error as URLError {
                switch error.code {
                case .notConnectedToInternet, .networkConnectionLost, .dataNotAllowed:
                    lastError = APIError.offline
                case .timedOut:
                    lastError = APIError.timedOut
                default:
                    lastError = APIError.transport(error.localizedDescription)
                }
            } catch {
                lastError = APIError.transport(error.localizedDescription)
            }
            if attempt < 2 { try await Task.sleep(for: .milliseconds(450 * (attempt + 1))) }
        }
        throw lastError ?? APIError.invalidResponse
    }
}

private struct VKEnvelope<Response: Decodable & Sendable>: Decodable, Sendable {
    let response: Response?
    let error: VKErrorPayload?
}

private struct VKErrorPayload: Decodable, Sendable {
    let errorCode: Int
    let errorMessage: String

    enum CodingKeys: String, CodingKey {
        case errorCode = "error_code"
        case errorMessage = "error_msg"
    }

    var apiError: APIError {
        if errorCode == 5 { return .unauthorized }
        return .server(code: errorCode, message: errorMessage)
    }
}

private extension String {
    var formEncoded: String {
        addingPercentEncoding(withAllowedCharacters: .formAllowed) ?? self
    }
}

private extension CharacterSet {
    static let formAllowed: CharacterSet = {
        var set = CharacterSet.alphanumerics
        set.insert(charactersIn: "-._~")
        return set
    }()
}

