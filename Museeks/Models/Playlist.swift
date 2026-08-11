import Foundation

struct Playlist: Codable, Identifiable, Hashable, Sendable {
    let playlistID: Int
    let ownerID: Int
    let title: String
    let subtitle: String?
    let count: Int
    let artworkURL: URL?
    let accessKey: String?

    var id: String { "\(ownerID)_\(playlistID)" }

    enum CodingKeys: String, CodingKey {
        case playlistID = "id"
        case ownerID = "owner_id"
        case title
        case subtitle = "description"
        case count
        case artworkURL = "artwork_url"
        case photo300 = "photo_300"
        case photo600 = "photo_600"
        case photo
        case thumbs
        case accessKey = "access_key"
    }

    init(from decoder: Decoder) throws {
        let box = try decoder.container(keyedBy: CodingKeys.self)
        playlistID = try box.decode(Int.self, forKey: .playlistID)
        ownerID = try box.decode(Int.self, forKey: .ownerID)
        title = try box.decodeIfPresent(String.self, forKey: .title) ?? "Плейлист"
        subtitle = try box.decodeIfPresent(String.self, forKey: .subtitle)
        count = try box.decodeIfPresent(Int.self, forKey: .count) ?? 0
        accessKey = try box.decodeIfPresent(String.self, forKey: .accessKey)
        var raw = try box.decodeIfPresent(String.self, forKey: .artworkURL)
            ?? box.decodeIfPresent(String.self, forKey: .photo600)
            ?? box.decodeIfPresent(String.self, forKey: .photo300)
        if raw == nil, let photo = try? box.decode(PlaylistPhoto.self, forKey: .photo) {
            raw = photo.photo1200 ?? photo.photo600 ?? photo.photo300
        }
        if raw == nil, let thumbs = try? box.decode([PlaylistThumb].self, forKey: .thumbs) {
            raw = thumbs.max { ($0.width ?? 0) < ($1.width ?? 0) }?.url
        }
        artworkURL = raw.flatMap(URL.init(string:))
    }

    init(
        playlistID: Int,
        ownerID: Int,
        title: String,
        subtitle: String?,
        count: Int,
        artworkURL: URL?,
        accessKey: String?
    ) {
        self.playlistID = playlistID
        self.ownerID = ownerID
        self.title = title
        self.subtitle = subtitle
        self.count = count
        self.artworkURL = artworkURL
        self.accessKey = accessKey
    }

    func encode(to encoder: Encoder) throws {
        var box = encoder.container(keyedBy: CodingKeys.self)
        try box.encode(playlistID, forKey: .playlistID)
        try box.encode(ownerID, forKey: .ownerID)
        try box.encode(title, forKey: .title)
        try box.encodeIfPresent(subtitle, forKey: .subtitle)
        try box.encode(count, forKey: .count)
        try box.encodeIfPresent(artworkURL, forKey: .artworkURL)
        try box.encodeIfPresent(accessKey, forKey: .accessKey)
    }
}

private struct PlaylistPhoto: Decodable {
    let photo1200: String?
    let photo600: String?
    let photo300: String?

    enum CodingKeys: String, CodingKey {
        case photo1200 = "photo_1200"
        case photo600 = "photo_600"
        case photo300 = "photo_300"
    }
}

private struct PlaylistThumb: Decodable {
    let url: String
    let width: Int?
}
