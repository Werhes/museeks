import Foundation
import Security

struct KeychainStore: Sendable {
    enum Error: Swift.Error, LocalizedError {
        case status(OSStatus)
        case invalidData

        var errorDescription: String? {
            switch self {
            case let .status(code): "Ошибка Keychain: \(code)"
            case .invalidData: "Keychain содержит повреждённые данные."
            }
        }
    }

    private let service: String

    init(service: String = Bundle.main.bundleIdentifier ?? "com.werhes.museeks") {
        self.service = service
    }

    func save<Value: Encodable>(_ value: Value, account: String) throws {
        let data = try JSONEncoder().encode(value)
        let query = baseQuery(account: account)
        let attributes: [String: Any] = [
            kSecValueData as String: data,
            kSecAttrAccessible as String: kSecAttrAccessibleAfterFirstUnlockThisDeviceOnly
        ]

        let update = SecItemUpdate(query as CFDictionary, attributes as CFDictionary)
        if update == errSecSuccess { return }
        guard update == errSecItemNotFound else { throw Error.status(update) }

        var item = query
        attributes.forEach { item[$0.key] = $0.value }
        let add = SecItemAdd(item as CFDictionary, nil)
        guard add == errSecSuccess else { throw Error.status(add) }
    }

    func load<Value: Decodable>(_ type: Value.Type, account: String) throws -> Value? {
        var query = baseQuery(account: account)
        query[kSecReturnData as String] = true
        query[kSecMatchLimit as String] = kSecMatchLimitOne

        var result: CFTypeRef?
        let status = SecItemCopyMatching(query as CFDictionary, &result)
        if status == errSecItemNotFound { return nil }
        guard status == errSecSuccess else { throw Error.status(status) }
        guard let data = result as? Data else { throw Error.invalidData }
        return try JSONDecoder().decode(type, from: data)
    }

    func delete(account: String) throws {
        let status = SecItemDelete(baseQuery(account: account) as CFDictionary)
        guard status == errSecSuccess || status == errSecItemNotFound else {
            throw Error.status(status)
        }
    }

    private func baseQuery(account: String) -> [String: Any] {
        [
            kSecClass as String: kSecClassGenericPassword,
            kSecAttrService as String: service,
            kSecAttrAccount as String: account
        ]
    }
}

