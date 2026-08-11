import Foundation

indirect enum JSONValue: Codable, Sendable {
    case object([String: JSONValue])
    case array([JSONValue])
    case string(String)
    case number(Double)
    case bool(Bool)
    case null

    init(from decoder: Decoder) throws {
        let box = try decoder.singleValueContainer()
        if box.decodeNil() { self = .null }
        else if let value = try? box.decode([String: JSONValue].self) { self = .object(value) }
        else if let value = try? box.decode([JSONValue].self) { self = .array(value) }
        else if let value = try? box.decode(Bool.self) { self = .bool(value) }
        else if let value = try? box.decode(Double.self) { self = .number(value) }
        else if let value = try? box.decode(String.self) { self = .string(value) }
        else { throw DecodingError.dataCorruptedError(in: box, debugDescription: "Unsupported JSON") }
    }

    func encode(to encoder: Encoder) throws {
        var box = encoder.singleValueContainer()
        switch self {
        case let .object(value): try box.encode(value)
        case let .array(value): try box.encode(value)
        case let .string(value): try box.encode(value)
        case let .number(value): try box.encode(value)
        case let .bool(value): try box.encode(value)
        case .null: try box.encodeNil()
        }
    }

    var object: [String: JSONValue]? {
        guard case let .object(value) = self else { return nil }
        return value
    }

    var array: [JSONValue]? {
        guard case let .array(value) = self else { return nil }
        return value
    }

    var string: String? {
        guard case let .string(value) = self else { return nil }
        return value
    }
}
