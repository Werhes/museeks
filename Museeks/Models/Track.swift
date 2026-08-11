import Foundation

struct Track: Codable, Identifiable, Hashable, Sendable {
    let audioID: Int
    let ownerID: Int
    let title: String
    let artist: String
    let duration: TimeInterval
    let streamURL: URL?
    let artworkURL: URL?
    let albumTitle: String?
    let lyricsID: Int?
    let accessKey: String?
    let isExplicit: Bool

    var id: String { "\(ownerID)_\(audioID)" }
    var apiIdentifier: String { accessKey.map { "\(id)_\($0)" } ?? id }
    var metadataOnly: Track {
        Track(
            audioID: audioID,
            ownerID: ownerID,
            title: title,
            artist: artist,
            duration: duration,
            streamURL: nil,
            artworkURL: artworkURL,
            albumTitle: albumTitle,
            lyricsID: lyricsID,
            accessKey: accessKey,
            isExplicit: isExplicit
        )
    }

    enum CodingKeys: String, CodingKey {
        case audioID = "id"
        case ownerID = "owner_id"
        case title
        case artist
        case duration
        case streamURL = "url"
        case artworkURL = "artwork_url"
        case albumTitle = "album_title"
        case lyricsID = "lyrics_id"
        case accessKey = "access_key"
        case isExplicit = "is_explicit"
        case album
    }

    private enum AlbumKeys: String, CodingKey { case title, thumb }
    private enum ThumbKeys: String, CodingKey {
        case photo1200 = "photo_1200"
        case photo600 = "photo_600"
        case photo300 = "photo_300"
        case photo270 = "photo_270"
    }

    init(from decoder: Decoder) throws {
        let box = try decoder.container(keyedBy: CodingKeys.self)
        audioID = try box.decode(Int.self, forKey: .audioID)
        ownerID = try box.decode(Int.self, forKey: .ownerID)
        title = try box.decodeIfPresent(String.self, forKey: .title) ?? "Без названия"
        artist = try box.decodeIfPresent(String.self, forKey: .artist) ?? "Неизвестный исполнитель"
        duration = TimeInterval(try box.decodeIfPresent(Int.self, forKey: .duration) ?? 0)
        streamURL = Self.decodeURL(box, key: .streamURL)
        lyricsID = try box.decodeIfPresent(Int.self, forKey: .lyricsID)
        accessKey = try box.decodeIfPresent(String.self, forKey: .accessKey)
        isExplicit = (try? box.decode(Bool.self, forKey: .isExplicit))
            ?? ((try? box.decode(Int.self, forKey: .isExplicit)) == 1)

        var nestedAlbumTitle: String?
        var nestedArtwork: URL?
        if let album = try? box.nestedContainer(keyedBy: AlbumKeys.self, forKey: .album) {
            nestedAlbumTitle = try album.decodeIfPresent(String.self, forKey: .title)
            if let thumb = try? album.nestedContainer(keyedBy: ThumbKeys.self, forKey: .thumb) {
                let raw = try thumb.decodeIfPresent(String.self, forKey: .photo1200)
                    ?? thumb.decodeIfPresent(String.self, forKey: .photo600)
                    ?? thumb.decodeIfPresent(String.self, forKey: .photo300)
                    ?? thumb.decodeIfPresent(String.self, forKey: .photo270)
                nestedArtwork = raw.flatMap(URL.init(string:))
            }
        }
        albumTitle = try box.decodeIfPresent(String.self, forKey: .albumTitle) ?? nestedAlbumTitle
        artworkURL = Self.decodeURL(box, key: .artworkURL) ?? nestedArtwork
    }

    init(
        audioID: Int,
        ownerID: Int,
        title: String,
        artist: String,
        duration: TimeInterval,
        streamURL: URL?,
        artworkURL: URL?,
        albumTitle: String? = nil,
        lyricsID: Int? = nil,
        accessKey: String? = nil,
        isExplicit: Bool = false
    ) {
        self.audioID = audioID
        self.ownerID = ownerID
        self.title = title
        self.artist = artist
        self.duration = duration
        self.streamURL = streamURL
        self.artworkURL = artworkURL
        self.albumTitle = albumTitle
        self.lyricsID = lyricsID
        self.accessKey = accessKey
        self.isExplicit = isExplicit
    }

    func encode(to encoder: Encoder) throws {
        var box = encoder.container(keyedBy: CodingKeys.self)
        try box.encode(audioID, forKey: .audioID)
        try box.encode(ownerID, forKey: .ownerID)
        try box.encode(title, forKey: .title)
        try box.encode(artist, forKey: .artist)
        try box.encode(Int(duration), forKey: .duration)
        try box.encodeIfPresent(streamURL, forKey: .streamURL)
        try box.encodeIfPresent(artworkURL, forKey: .artworkURL)
        try box.encodeIfPresent(albumTitle, forKey: .albumTitle)
        try box.encodeIfPresent(lyricsID, forKey: .lyricsID)
        try box.encodeIfPresent(accessKey, forKey: .accessKey)
        try box.encode(isExplicit, forKey: .isExplicit)
    }

    private static func decodeURL(
        _ box: KeyedDecodingContainer<CodingKeys>,
        key: CodingKeys
    ) -> URL? {
        try? box.decode(URL.self, forKey: key)
    }
}
