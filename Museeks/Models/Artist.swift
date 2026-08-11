import Foundation

struct Artist: Decodable, Identifiable, Hashable, Sendable {
    let id: String
    let name: String
    let artworkURL: URL?

    enum CodingKeys: String, CodingKey {
        case id
        case name
        case photo
        case photo300 = "photo_300"
        case photo600 = "photo_600"
    }

    init(from decoder: Decoder) throws {
        let box = try decoder.container(keyedBy: CodingKeys.self)
        if let value = try? box.decode(String.self, forKey: .id) {
            id = value
        } else if let value = try? box.decode(Int.self, forKey: .id) {
            id = String(value)
        } else {
            throw DecodingError.keyNotFound(
                CodingKeys.id,
                .init(codingPath: decoder.codingPath, debugDescription: "Artist id is missing")
            )
        }
        name = try box.decodeIfPresent(String.self, forKey: .name) ?? "Исполнитель"
        var raw = (try? box.decode(String.self, forKey: .photo600))
            ?? (try? box.decode(String.self, forKey: .photo300))
            ?? (try? box.decode(String.self, forKey: .photo))
        if raw == nil, let photo = try? box.decode(ArtistPhoto.self, forKey: .photo) {
            raw = photo.photo600 ?? photo.photo300
        }
        artworkURL = raw.flatMap(URL.init(string:))
    }
}

private struct ArtistPhoto: Decodable {
    let photo600: String?
    let photo300: String?

    enum CodingKeys: String, CodingKey {
        case photo600 = "photo_600"
        case photo300 = "photo_300"
    }
}
