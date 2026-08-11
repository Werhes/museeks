import Foundation

actor VKMusicService {
    private let client: VKAPIClient

    init(client: VKAPIClient) {
        self.client = client
    }

    func configure(userAgent: String?) async {
        await client.configure(userAgent: userAgent)
    }

    func profile(token: String) async throws -> UserProfile {
        let users: [UserProfile] = try await client.call(
            "users.get",
            token: token,
            parameters: ["fields": "photo_200"]
        )
        guard let profile = users.first else { throw APIError.invalidResponse }
        return profile
    }

    func library(token: String, offset: Int = 0, count: Int = 100) async throws -> Page<Track> {
        let response: ItemsResponse<Track> = try await client.call(
            "audio.get",
            token: token,
            parameters: [
                "offset": String(offset),
                "count": String(count),
                "need_user": "0"
            ]
        )
        return response.page(offset: offset, requested: count)
    }

    func recommendations(token: String, count: Int = 100) async throws -> [Track] {
        let response: FlexibleItems<Track> = try await client.call(
            "audio.getRecommendations",
            token: token,
            parameters: ["count": String(count), "shuffle": "1"]
        )
        return response.items.uniqued()
    }

    func search(token: String, query: String, offset: Int = 0) async throws -> Page<Track> {
        let response: ItemsResponse<Track> = try await client.call(
            "audio.search",
            token: token,
            parameters: [
                "q": query,
                "offset": String(offset),
                "count": "100",
                "auto_complete": "1",
                "sort": "2",
                "search_own": "1"
            ]
        )
        return response.page(offset: offset, requested: 100)
    }

    func searchArtists(token: String, query: String) async throws -> [Artist] {
        let raw = try await client.raw(
            "audio.searchArtists",
            token: token,
            parameters: ["q": query, "count": "30"]
        )
        let values = Self.decodeObjects(Artist.self, in: raw) { object in
            object["id"] != nil && object["name"]?.string != nil
                && object["artist"] == nil && object["duration"] == nil
        }
        return values.reduce(into: []) { result, artist in
            if !result.contains(where: { $0.id == artist.id }) { result.append(artist) }
        }
    }

    func artistTracks(token: String, artist: Artist) async throws -> [Track] {
        if let response: FlexibleItems<Track> = try? await client.call(
            "audio.getAudiosByArtist",
            token: token,
            parameters: ["artist_id": artist.id, "count": "100"]
        ), !response.items.isEmpty {
            return response.items.uniqued()
        }
        let raw = try await client.raw(
            "catalog.getAudioArtist",
            token: token,
            parameters: ["artist_id": artist.id]
        )
        let tracks = Self.tracks(in: raw)
        guard !tracks.isEmpty else {
            throw APIError.server(code: 0, message: "У VK нет доступных треков этого исполнителя.")
        }
        return tracks
    }

    func playlists(token: String, ownerID: Int? = nil, offset: Int = 0) async throws -> Page<Playlist> {
        var parameters = ["offset": String(offset), "count": "100"]
        if let ownerID { parameters["owner_id"] = String(ownerID) }
        let response: ItemsResponse<Playlist> = try await client.call(
            "audio.getPlaylists",
            token: token,
            parameters: parameters
        )
        return response.page(offset: offset, requested: 100)
    }

    func playlistTracks(token: String, playlist: Playlist, offset: Int = 0) async throws -> Page<Track> {
        var parameters = [
            "owner_id": String(playlist.ownerID),
            "album_id": String(playlist.playlistID),
            "offset": String(offset),
            "count": "100"
        ]
        if let key = playlist.accessKey { parameters["access_key"] = key }
        let response: ItemsResponse<Track> = try await client.call(
            "audio.get",
            token: token,
            parameters: parameters
        )
        return response.page(offset: offset, requested: 100)
    }

    func refreshedTrack(token: String, track: Track) async throws -> Track {
        let response: FlexibleItems<Track> = try await client.call(
            "audio.getById",
            token: token,
            parameters: ["audios": track.apiIdentifier]
        )
        guard let value = response.items.first, value.streamURL != nil else {
            throw APIError.noPlayableURL
        }
        return value
    }

    func setLiked(_ liked: Bool, token: String, track: Track) async throws {
        let method = liked ? "audio.add" : "audio.delete"
        _ = try await client.raw(
            method,
            token: token,
            parameters: ["audio_id": String(track.audioID), "owner_id": String(track.ownerID)]
        )
    }

    func lyrics(token: String, track: Track) async throws -> Lyrics {
        var parameters = ["audio_id": String(track.audioID), "owner_id": String(track.ownerID)]
        if let lyricsID = track.lyricsID { parameters["lyrics_id"] = String(lyricsID) }
        let raw = try await client.raw("audio.getLyrics", token: token, parameters: parameters)
        guard let text = Self.firstString(named: "text", in: raw), !text.isEmpty else {
            throw APIError.server(code: 0, message: "Текст песни не найден.")
        }
        return Lyrics(text: text)
    }

    func home(token: String, userID: Int?) async -> HomeContent {
        async let recommended = try? recommendations(token: token)
        async let recentPage = try? library(token: token, count: 30)
        async let playlistPage = try? playlists(token: token, ownerID: userID)
        async let catalog = try? catalogSections(token: token)
        let result = await (recommended, recentPage, playlistPage, catalog)
        return HomeContent(
            recommendations: result.0 ?? [],
            recent: Array((result.1?.items ?? []).prefix(16)),
            playlists: result.2?.items ?? [],
            catalogSections: result.3 ?? []
        )
    }

    func catalogSections(token: String) async throws -> [MusicSection] {
        let root = try await client.raw("catalog.getAudio", token: token)
        let refs = Self.sectionReferences(in: root).prefix(8)
        let client = self.client
        return await withTaskGroup(of: MusicSection?.self) { group in
            for ref in refs {
                group.addTask {
                    guard let payload = try? await client.raw(
                        "catalog.getSection",
                        token: token,
                        parameters: ["section_id": ref.id]
                    ) else { return nil }
                    let tracks = Self.tracks(in: payload)
                    let playlists = Self.playlists(in: payload)
                    guard !tracks.isEmpty || !playlists.isEmpty else { return nil }
                    return MusicSection(
                        id: ref.id,
                        title: ref.title.isEmpty ? "Подборка" : ref.title,
                        tracks: tracks,
                        playlists: playlists
                    )
                }
            }
            var sections: [MusicSection] = []
            for await section in group {
                if let section { sections.append(section) }
            }
            let order = Dictionary(uniqueKeysWithValues: refs.enumerated().map { ($0.element.id, $0.offset) })
            return sections.sorted {
                order[$0.id, default: Int.max] < order[$1.id, default: Int.max]
            }
        }
    }

    private static func sectionReferences(in value: JSONValue) -> [SectionReference] {
        var result: [SectionReference] = []
        func collect(_ value: JSONValue) {
            switch value {
            case let .object(object):
                if case let .array(sections)? = object["sections"] {
                    for section in sections {
                        guard let item = section.object,
                              let id = item["id"]?.string ?? item["section_id"]?.string else { continue }
                        result.append(
                            SectionReference(id: id, title: item["title"]?.string ?? "")
                        )
                    }
                }
                object.values.forEach(collect)
            case let .array(array):
                array.forEach(collect)
            default:
                break
            }
        }
        collect(value)
        return result.reduce(into: []) { values, item in
            if !values.contains(where: { $0.id == item.id }) { values.append(item) }
        }
    }

    private static func tracks(in value: JSONValue) -> [Track] {
        decodeObjects(Track.self, in: value) { object in
            object["id"] != nil && object["owner_id"] != nil
                && object["artist"] != nil && object["duration"] != nil
        }.uniqued()
    }

    private static func playlists(in value: JSONValue) -> [Playlist] {
        let values = decodeObjects(Playlist.self, in: value) { object in
            object["id"] != nil && object["owner_id"] != nil
                && object["title"] != nil && object["artist"] == nil
                && (object["count"] != nil || object["access_key"] != nil)
        }
        return values.reduce(into: []) { result, item in
            if !result.contains(where: { $0.id == item.id }) { result.append(item) }
        }
    }

    private static func decodeObjects<T: Decodable>(
        _ type: T.Type,
        in value: JSONValue,
        matching: ([String: JSONValue]) -> Bool
    ) -> [T] {
        var result: [T] = []
        walk(value) { object in
            guard matching(object),
                  let data = try? JSONEncoder().encode(JSONValue.object(object)),
                  let decoded = try? JSONDecoder().decode(T.self, from: data) else { return }
            result.append(decoded)
        }
        return result
    }

    private static func walk(_ value: JSONValue, visit: ([String: JSONValue]) -> Void) {
        switch value {
        case let .object(object):
            visit(object)
            object.values.forEach { walk($0, visit: visit) }
        case let .array(array):
            array.forEach { walk($0, visit: visit) }
        default:
            break
        }
    }

    private static func firstString(named key: String, in value: JSONValue) -> String? {
        switch value {
        case let .object(object):
            if let text = object[key]?.string { return text }
            for child in object.values {
                if let text = firstString(named: key, in: child) { return text }
            }
        case let .array(array):
            for child in array {
                if let text = firstString(named: key, in: child) { return text }
            }
        default:
            break
        }
        return nil
    }
}

private struct SectionReference: Sendable {
    let id: String
    let title: String
}

private struct ItemsResponse<Item: Decodable & Sendable>: Decodable, Sendable {
    let count: Int
    let items: [Item]

    func page(offset: Int, requested: Int) -> Page<Item> {
        let next = items.count == requested && offset + items.count < count
            ? offset + items.count
            : nil
        return Page(items: items, total: count, nextOffset: next)
    }
}

private struct FlexibleItems<Item: Decodable & Sendable>: Decodable, Sendable {
    let items: [Item]

    private enum CodingKeys: String, CodingKey { case items }

    init(from decoder: Decoder) throws {
        if let array = try? decoder.singleValueContainer().decode([Item].self) {
            items = array
            return
        }
        let box = try decoder.container(keyedBy: CodingKeys.self)
        items = try box.decode([Item].self, forKey: .items)
    }
}

private extension Array where Element == Track {
    func uniqued() -> [Track] {
        reduce(into: []) { result, track in
            if !result.contains(where: { $0.id == track.id }) { result.append(track) }
        }
    }
}
