import SwiftUI

// MARK: - Yandex HTTP client
//
// The Yandex Music API differs from the VK API: it uses JSON GET/POST
// requests with a Bearer token and its own error envelope. Rather than
// coupling the VK-oriented `APIClient` to a second backend, Yandex mode
// carries a small dedicated client.

enum YandexAPIError: LocalizedError, Equatable {
    case invalidRequest
    case invalidResponse
    case unauthorized
    case offline
    case timedOut
    case http(Int)
    case transport(String)
    case decoding(String)

    var errorDescription: String? {
        switch self {
        case .invalidRequest:
            return L10n.text("Не удалось создать запрос.")
        case .invalidResponse:
            return L10n.text("Сервер вернул некорректный ответ.")
        case .unauthorized:
            return L10n.text("Сессия Яндекс Музыки требует обновления.")
        case .offline:
            return L10n.text("Нет подключения к интернету.")
        case .timedOut:
            return L10n.text(
                "Сервер не ответил вовремя. Попробуйте ещё раз."
            )
        case let .http(code):
            return L10n.format("Ошибка сервера: %d", code)
        case let .transport(message):
            return L10n.format("Сетевая ошибка: %@", message)
        case let .decoding(message):
            return L10n.format(
                "Не удалось обработать ответ: %@",
                message
            )
        }
    }
}

private actor YandexHTTPClient {
    private let baseURL: URL
    private let session: URLSession
    private let decoder: JSONDecoder
    private var userAgent: String?

    init(baseURL: URL = URL(string: "https://api.music.yandex.net/")!) {
        self.baseURL = baseURL
        let configuration = URLSessionConfiguration.ephemeral
        configuration.timeoutIntervalForRequest = 30
        configuration.timeoutIntervalForResource = 45
        configuration.waitsForConnectivity = true
        configuration.httpCookieStorage = nil
        configuration.httpShouldSetCookies = false
        configuration.urlCache = nil
        self.session = URLSession(configuration: configuration)
        self.decoder = JSONDecoder()
    }

    func setUserAgent(_ value: String?) {
        let cleaned = value?.trimmingCharacters(in: .whitespacesAndNewlines)
        userAgent = cleaned?.isEmpty == false ? cleaned : nil
    }

    func get<Response: Decodable>(
        path: String,
        token: String,
        query: [String: String] = [:]
    ) async throws -> Response {
        try await request(
            method: "GET",
            path: path,
            token: token,
            query: query,
            body: nil
        )
    }

    func post<Response: Decodable>(
        path: String,
        token: String,
        body: [String: Any] = [:]
    ) async throws -> Response {
        try await request(
            method: "POST",
            path: path,
            token: token,
            query: [:],
            body: body
        )
    }

    private func request<Response: Decodable>(
        method: String,
        path: String,
        token: String,
        query: [String: String],
        body: [String: Any]?
    ) async throws -> Response {
        guard var components = URLComponents(
            url: baseURL.appendingPathComponent(path),
            resolvingAgainstBaseURL: false
        ) else {
            throw YandexAPIError.invalidRequest
        }
        if !query.isEmpty {
            components.queryItems = query.map {
                URLQueryItem(name: $0.key, value: $0.value)
            }
        }
        guard let url = components.url else {
            throw YandexAPIError.invalidRequest
        }

        var request = URLRequest(
            url: url,
            cachePolicy: .reloadIgnoringLocalCacheData,
            timeoutInterval: 30
        )
        request.httpMethod = method
        request.setValue("application/json", forHTTPHeaderField: "Accept")
        request.setValue("OAuth \(token)", forHTTPHeaderField: "Authorization")
        if let userAgent {
            request.setValue(userAgent, forHTTPHeaderField: "User-Agent")
        }
        if let body {
            request.setValue(
                "application/json; charset=utf-8",
                forHTTPHeaderField: "Content-Type"
            )
            request.httpBody = try? JSONSerialization.data(withJSONObject: body)
        }

        do {
            let (data, response) = try await session.data(for: request)
            guard let http = response as? HTTPURLResponse else {
                throw YandexAPIError.invalidResponse
            }
            if http.statusCode == 401 {
                throw YandexAPIError.unauthorized
            }
            guard (200..<300).contains(http.statusCode) else {
                throw YandexAPIError.http(http.statusCode)
            }
            // Yandex wraps responses in an `invocationInfo` + payload envelope;
            // decode the raw payload first, falling back to the error body.
            let rawEnvelope = try? decoder.decode(YandexEnvelope.self, from: data)
            if let error = rawEnvelope?.error {
                throw YandexAPIError.http(error)
            }
            do {
                return try decoder.decode(Response.self, from: data)
            } catch {
                throw YandexAPIError.decoding(error.localizedDescription)
            }
        } catch let error as YandexAPIError {
            throw error
        } catch is CancellationError {
            throw CancellationError()
        } catch let error as URLError where error.code == .cancelled {
            throw CancellationError()
        } catch let error as URLError {
            switch error.code {
            case .notConnectedToInternet,
                 .networkConnectionLost,
                 .dataNotAllowed,
                 .internationalRoamingOff:
                throw YandexAPIError.offline
            case .timedOut:
                throw YandexAPIError.timedOut
            default:
                throw YandexAPIError.transport(error.localizedDescription)
            }
        } catch {
            throw YandexAPIError.transport(error.localizedDescription)
        }
    }
}

private struct YandexEnvelope: Decodable {
    let error: Int?
}

// MARK: - Yandex DTOs (decoded subset of the API)

/// Covers both album and track artworks. Yandex serves images through
/// `https://{host}/get-mp3/{size}/{hash}/cover`. The `size` placeholder is
/// replaced with a concrete pixel size (e.g. `1000x1000`).
enum YandexImage {
    static func url(
        host: String?,
        uri: String?,
        size: String = "1000x1000"
    ) -> URL? {
        guard let host, let uri else { return nil }
        let resolved = uri.hasPrefix("avatars.yandex.net")
            ? uri.replacingOccurrences(
                of: "avatars.yandex.net",
                with: "https://avatars.yandex.net"
            )
            : uri
        let full: String
        if resolved.hasPrefix("https://") || resolved.hasPrefix("http://") {
            full = resolved
        } else {
            full = "https://\(host)/get-mp3/\(size)/\(resolved)/cover"
        }
        return URL.secureRemoteURL(full)
    }
}

struct YandexTrackDTO: Decodable, Sendable {
    struct ArtistDTO: Decodable, Sendable {
        let name: String
    }
    struct AlbumDTO: Decodable, Sendable {
        let id: Int
        let title: String
        let coverUri: String?
        let coverUriHost: String?
    }
    let id: Int
    let title: String
    let artists: [ArtistDTO]?
    let albums: [AlbumDTO]?
    let durationMs: Int?
    let available: Bool?
    let coverUri: String?
    let coverUriHost: String?

    enum CodingKeys: String, CodingKey {
        case id
        case title
        case artists
        case albums
        case durationMs = "durationMs"
        case available
        case coverUri = "coverUri"
        case coverUriHost = "coverUriHost"
    }

    var artistText: String {
        (artists ?? []).map(\.name).joined(separator: ", ")
    }

    var album: AlbumDTO? { albums?.first }

    func toTrack() -> Track? {
        guard available != false else { return nil }
        let albumID = album?.id ?? 0
        // Yandex track id is `{album}:{track}` in some list contexts; the raw
        // `id` is used as the owner so likes map back to a stable key.
        let artwork = coverUri.flatMap {
            YandexImage.url(
                host: coverUriHost,
                uri: $0
            )
        }
        return Track(
            trackID: id,
            ownerID: albumID,
            title: title,
            artist: artistText,
            albumTitle: album?.title,
            duration: TimeInterval(durationMs ?? 0) / 1000.0,
            streamURL: nil,
            artworkURL: artwork,
            accessKey: nil,
            lyricsID: nil,
            albumReference: nil
        )
    }
}

struct YandexTrackShortDTO: Decodable, Sendable {
    let id: String
    let albumId: Int?
    let title: String?
    let coverUri: String?

    enum CodingKeys: String, CodingKey {
        case id
        case albumId = "albumId"
        case title
        case coverUri = "coverUri"
    }

    var parsedID: Int {
        // `id` is usually "album:track" or a plain number.
        let components = id.split(separator: ":")
        return Int(components.last.map(String.init) ?? id) ?? 0
    }
}

struct YandexTracksListDTO: Decodable, Sendable {
    struct ShortDTO: Decodable, Sendable {
        let id: String
        let albumId: Int?
        let coverUri: String?
        enum CodingKeys: String, CodingKey {
            case id
            case albumId = "albumId"
            case coverUri = "coverUri"
        }
        var parsedID: Int {
            let c = id.split(separator: ":")
            return Int(c.last.map(String.init) ?? id) ?? 0
        }
    }
    let ids: [String]?
    let tracks: [ShortDTO]?
    let pager: YandexPagerDTO?
}

struct YandexPagerDTO: Decodable, Sendable {
    let total: Int?
    let page: Int?
    let perPage: Int?
    let totalPages: Int?
}

struct YandexPlaylistDTO: Decodable, Sendable {
    let kind: Int
    let title: String
    let trackCount: Int?
    let coverUri: String?
    let coverUriHost: String?
    let tracks: [YandexTrackDTO]?
    let owner: YandexOwnerDTO?

    enum CodingKeys: String, CodingKey {
        case kind
        case title
        case trackCount = "trackCount"
        case coverUri = "coverUri"
        case coverUriHost = "coverUriHost"
        case tracks
        case owner
    }
}

struct YandexOwnerDTO: Decodable, Sendable {
    let uid: Int
    let login: String?
}

struct YandexAlbumDTO: Decodable, Sendable {
    struct ArtistDTO: Decodable, Sendable {
        let name: String
    }
    let id: Int
    let title: String
    let coverUri: String?
    let coverUriHost: String?
    let year: Int?
    let artists: [ArtistDTO]?
    let trackCount: Int?

    enum CodingKeys: String, CodingKey {
        case id
        case title
        case coverUri = "coverUri"
        case coverUriHost = "coverUriHost"
        case year
        case artists
        case trackCount = "trackCount"
    }

    func toAlbum() -> Album {
        Album(
            id: id,
            ownerID: 0,
            title: title,
            count: trackCount ?? 0,
            artworkURL: YandexImage.url(
                host: coverUriHost,
                uri: coverUri
            ),
            accessKey: nil,
            artists: (artists ?? []).map(\.name),
            releaseDate: year.map {
                Calendar.current.date(
                    from: DateComponents(year: $0)
                )
            },
            releaseYear: year,
            isFollowed: false,
            followHash: nil
        )
    }
}

// MARK: - Landing / feed

struct YandexLandingDTO: Decodable, Sendable {
    struct BlockDTO: Decodable, Sendable {
        struct EntityDTO: Decodable, Sendable {
            let type: String?
            let data: YandexEntityData?
        }
        let id: String?
        let type: String?
        let title: String?
        let entities: [EntityDTO]?
    }
    let blocks: [BlockDTO]?
}

struct YandexEntityData: Decodable, Sendable {
    let playlist: YandexPlaylistDTO?
    let album: YandexAlbumDTO?
    let track: YandexTrackDTO?
}

// MARK: - My Wave (rotor) settings

/// Selection categories surfaced in "Настроить мою волну":
/// activity (По занятию), mood (Под настроение), language (По языку) and
/// energy/character (По характеру).
struct YandexWaveSettings: Codable, Hashable, Sendable {
    let activity: Set<String>
    let mood: Set<String>
    let language: Set<String>
    let energy: Set<String>

    init(
        activity: Set<String> = [],
        mood: Set<String> = [],
        language: Set<String> = [],
        energy: Set<String> = []
    ) {
        self.activity = activity
        self.mood = mood
        self.language = language
        self.energy = energy
    }

    var isEmpty: Bool {
        activity.isEmpty && mood.isEmpty && language.isEmpty && energy.isEmpty
    }

    func toggling(category: YandexWaveCategory, option: String) -> YandexWaveSettings {
        switch category {
        case .activity:
            return YandexWaveSettings(
                activity: toggling(activity, option),
                mood: mood,
                language: language,
                energy: energy
            )
        case .mood:
            return YandexWaveSettings(
                activity: activity,
                mood: toggling(mood, option),
                language: language,
                energy: energy
            )
        case .language:
            return YandexWaveSettings(
                activity: activity,
                mood: mood,
                language: toggling(language, option),
                energy: energy
            )
        case .energy:
            return YandexWaveSettings(
                activity: activity,
                mood: mood,
                language: language,
                energy: toggling(energy, option)
            )
        }
    }

    private func toggling(_ set: Set<String>, _ option: String) -> Set<String> {
        var result = set
        if result.contains(option) {
            result.remove(option)
        } else {
            result.insert(option)
        }
        return result
    }
}

enum YandexWaveCategory: String, CaseIterable, Identifiable, Sendable {
    case activity
    case mood
    case language
    case energy

    var id: String { rawValue }

    var title: String {
        switch self {
        case .activity: L10n.text("По занятию")
        case .mood: L10n.text("Под настроение")
        case .language: L10n.text("По языку")
        case .energy: L10n.text("По характеру")
        }
    }
}

/// Static catalog of options per wave category. Yandex exposes these from
/// `rotor_station_settings2`, but a fixed, well-known subset keeps the UI
/// stable and matches the on-device categories the user described.
enum YandexWaveOptions {
    static func options(for category: YandexWaveCategory) -> [YandexWaveOption] {
        switch category {
        case .activity:
            return [
                YandexWaveOption(
                    id: "waking-up",
                    title: L10n.text("Просыпаюсь"),
                    systemImage: "sunrise.fill"
                ),
                YandexWaveOption(
                    id: "commuting",
                    title: L10n.text("В дороге"),
                    systemImage: "car.fill"
                ),
                YandexWaveOption(
                    id: "working",
                    title: L10n.text("Работаю"),
                    systemImage: "briefcase.fill"
                ),
                YandexWaveOption(
                    id: "training",
                    title: L10n.text("Тренируюсь"),
                    systemImage: "figure.run"
                ),
                YandexWaveOption(
                    id: "sleeping",
                    title: L10n.text("Засыпаю"),
                    systemImage: "moon.zzz.fill"
                )
            ]
        case .energy:
            return [
                YandexWaveOption(
                    id: "favorite",
                    title: L10n.text("Любимое"),
                    systemImage: "heart.fill",
                    color: .red
                ),
                YandexWaveOption(
                    id: "unfamiliar",
                    title: L10n.text("Незнакомое"),
                    systemImage: "sparkles",
                    color: .purple
                ),
                YandexWaveOption(
                    id: "popular",
                    title: L10n.text("Популярное"),
                    systemImage: "flame.fill",
                    color: .orange
                )
            ]
        case .mood:
            return [
                YandexWaveOption(
                    id: "cheerful",
                    title: L10n.text("Бодрое"),
                    systemImage: "circle.fill",
                    color: Color(
                        red: 1.0, green: 0.62, blue: 0.04
                    )
                ),
                YandexWaveOption(
                    id: "fun",
                    title: L10n.text("Весёлое"),
                    systemImage: "circle.fill",
                    color: .green
                ),
                YandexWaveOption(
                    id: "calm",
                    title: L10n.text("Спокойное"),
                    systemImage: "circle.fill",
                    color: .blue
                ),
                YandexWaveOption(
                    id: "sad",
                    title: L10n.text("Грустное"),
                    systemImage: "circle.fill",
                    color: Color(
                        red: 0.35, green: 0.2, blue: 0.7
                    )
                )
            ]
        case .language:
            return [
                YandexWaveOption(
                    id: "russian",
                    title: L10n.text("Русский"),
                    systemImage: nil
                ),
                YandexWaveOption(
                    id: "foreign",
                    title: L10n.text("Иностранный"),
                    systemImage: nil
                ),
                YandexWaveOption(
                    id: "instrumental",
                    title: L10n.text("Без слов"),
                    systemImage: nil
                )
            ]
        }
    }

    static func option(category: YandexWaveCategory, id: String) -> YandexWaveOption? {
        options(for: category).first { $0.id == id }
    }
}

struct YandexWaveOption: Identifiable, Hashable, Sendable {
    let id: String
    let title: String
    let systemImage: String?
    var color: Color = .accentColor

    init(
        id: String,
        title: String,
        systemImage: String?,
        color: Color = .accentColor
    ) {
        self.id = id
        self.title = title
        self.systemImage = systemImage
        self.color = color
    }
}

// MARK: - Service

/// Minimal concrete `MusicService` for the Yandex Music backend. The bulk of
/// the app (playback, downloads, offline) is backend-agnostic and reuses the
/// shared `Track`/`Album`/`Playlist` models, so this adapter maps Yandex DTOs
/// onto those models.
struct YandexMusicService: MusicService {
    private let client = YandexHTTPClient()

    func configure(userAgent: String?) async {
        await client.setUserAgent(userAgent)
    }

    // MARK: Account

    func profile(accessToken: String) async throws -> UserProfile {
        struct AccountDTO: Decodable {
            struct UserDTO: Decodable {
                let uid: Int
                let firstName: String?
                let lastName: String?
                enum CodingKeys: String, CodingKey {
                    case uid
                    case firstName = "first_name"
                    case lastName = "last_name"
                }
            }
            let account: UserDTO
        }
        let account: AccountDTO = try await client.get(
            path: "account/status",
            token: accessToken
        )
        return UserProfile(
            id: account.account.uid,
            firstName: account.account.firstName ?? "",
            lastName: account.account.lastName ?? "",
            photoURL: nil
        )
    }

    // MARK: Library / liked tracks

    func library(
        accessToken: String,
        offset: Int,
        count: Int
    ) async throws -> MusicPage<Track> {
        let list: YandexTracksListDTO = try await client.get(
            path: "users/me/likes/tracks",
            token: accessToken
        )
        return try await resolveTracks(
            shorts: list.tracks ?? [],
            accessToken: accessToken
        )
    }

    func recommendations(accessToken: String) async throws -> [Track] {
        // My Wave / rotor as the default recommendation feed.
        try await waveTracks(accessToken: accessToken)
    }

    func refreshedTrack(
        _ track: Track,
        accessToken: String
    ) async throws -> Track {
        // Yandex stream URLs are resolved on demand by the AudioPlayer through
        // the resolver; a refresh keeps metadata (title/artwork) fresh.
        track
    }

    // MARK: Mixes

    func mixes(accessToken: String) async throws -> [MusicMix] {
        // VK-only concept; Yandex home is driven from the landing feed.
        []
    }

    func catalogSnapshot(accessToken: String) async throws -> VKCatalogSnapshot {
        throw YandexAPIError.invalidResponse
    }

    func overviewCatalog(accessToken: String) async throws -> VKOverviewCatalog {
        throw YandexAPIError.invalidResponse
    }

    func newReleases(accessToken: String) async throws -> [Album] {
        struct ReleasesDTO: Decodable {
            let albums: [YandexAlbumDTO]
        }
        let releases: ReleasesDTO = try await client.get(
            path: "landing/releases",
            token: accessToken
        )
        return releases.albums.map(\.toAlbum)
    }

    func mixSettings(
        _ mix: MusicMix,
        accessToken: String
    ) async throws -> VKMixSettings {
        throw YandexAPIError.invalidResponse
    }

    func mixTracks(
        _ mix: MusicMix,
        accessToken: String,
        startingAppend: Int,
        pages: Int
    ) async throws -> [Track] {
        try await waveTracks(accessToken: accessToken)
    }

    // MARK: Search

    func search(
        query: String,
        accessToken: String,
        offset: Int,
        count: Int
    ) async throws -> MusicPage<Track> {
        struct SearchDTO: Decodable {
            struct SearchResultDTO: Decodable {
                let tracks: YandexTracksListDTO?
            }
            let searchResult: SearchResultDTO?
        }
        let result: SearchDTO = try await client.get(
            path: "search",
            token: accessToken,
            query: [
                "text": query,
                "page": String(offset / max(count, 1)),
                "type": "track",
                "pageSize": String(count)
            ]
        )
        let tracks = result.searchResult?.tracks?.tracks ?? []
        return try await resolveTracks(
            shorts: tracks,
            accessToken: accessToken
        )
    }

    func searchArtists(
        query: String,
        accessToken: String,
        offset: Int,
        count: Int
    ) async throws -> [VKArtist] {
        []
    }

    func artistTracks(
        artistID: String,
        accessToken: String,
        offset: Int,
        count: Int
    ) async throws -> MusicPage<Track> {
        MusicPage(items: [], totalCount: 0, nextOffset: nil)
    }

    func artistAlbums(
        artistID: String,
        accessToken: String,
        offset: Int,
        count: Int
    ) async throws -> MusicPage<Album> {
        MusicPage(items: [], totalCount: 0, nextOffset: nil)
    }

    func searchAlbums(
        query: String,
        accessToken: String,
        offset: Int,
        count: Int
    ) async throws -> MusicPage<Album> {
        struct SearchDTO: Decodable {
            struct SearchResultDTO: Decodable {
                let albums: YandexAlbumListDTO?
            }
            let searchResult: SearchResultDTO?
        }
        struct YandexAlbumListDTO: Decodable {
            let results: [YandexAlbumDTO]
        }
        let result: SearchDTO = try await client.get(
            path: "search",
            token: accessToken,
            query: [
                "text": query,
                "page": String(offset / max(count, 1)),
                "type": "album",
                "pageSize": String(count)
            ]
        )
        let albums = result.searchResult?.albums?.results ?? []
        return MusicPage(
            items: albums.map(\.toAlbum),
            totalCount: albums.count,
            nextOffset: nil
        )
    }

    func likedAlbums(
        accessToken: String,
        offset: Int,
        count: Int
    ) async throws -> MusicPage<Album> {
        struct LikesDTO: Decodable {
            struct ItemDTO: Decodable {
                let album: YandexAlbumDTO
            }
            let likes: [ItemDTO]?
        }
        let result: LikesDTO = try await client.get(
            path: "users/me/likes/albums",
            token: accessToken
        )
        let albums = result.likes?.map(\.album) ?? []
        return MusicPage(
            items: albums.map(\.toAlbum),
            totalCount: albums.count,
            nextOffset: nil
        )
    }

    func albumTracks(
        _ album: Album,
        accessToken: String,
        offset: Int,
        count: Int
    ) async throws -> MusicPage<Track> {
        struct AlbumDTO: Decodable {
            let volumes: [[YandexTrackDTO]]?
        }
        let result: AlbumDTO = try await client.get(
            path: "albums/\(album.albumID)/with-tracks",
            token: accessToken
        )
        let tracks = (result.volumes ?? []).flatMap { $0 }.compactMap(\.toTrack)
        return MusicPage(
            items: tracks,
            totalCount: tracks.count,
            nextOffset: nil
        )
    }

    func resolvedAlbum(
        _ album: Album,
        accessToken: String
    ) async throws -> Album {
        album
    }

    func toggleAlbumFollow(
        _ album: Album,
        follow: Bool,
        accessToken: String
    ) async throws {
        _ = try await client.post(
            path: follow
                ? "users/me/likes/albums/add-multiple"
                : "users/me/likes/albums/remove",
            token: accessToken,
            body: ["album-ids": [album.albumID]]
        )
    }

    // MARK: Playlists

    func playlists(
        accessToken: String,
        offset: Int,
        count: Int
    ) async throws -> MusicPage<Playlist> {
        struct KindsDTO: Decodable {
            struct OwnerDTO: Decodable {
                let uid: Int
            }
            let library: [Int]?
            let owner: OwnerDTO?
        }
        let kinds: KindsDTO = try await client.get(
            path: "users/me/playlists/list",
            token: accessToken
        )
        let ownerID = kinds.owner?.uid ?? 0
        let ids = kinds.library ?? []
        var playlists: [Playlist] = []
        for id in ids.prefix(max(count, 1)) {
            if let playlist = try? await playlist(
                kind: id,
                ownerID: ownerID,
                accessToken: accessToken
            ) {
                playlists.append(playlist)
            }
        }
        return MusicPage(
            items: playlists,
            totalCount: ids.count,
            nextOffset: nil
        )
    }

    private func playlist(
        kind: Int,
        ownerID: Int,
        accessToken: String
    ) async throws -> Playlist {
        let dto: YandexPlaylistDTO = try await client.get(
            path: "users/\(ownerID)/playlists/\(kind)",
            token: accessToken
        )
        return Playlist(
            id: dto.kind,
            ownerID: ownerID,
            title: dto.title,
            description: nil,
            count: dto.trackCount ?? dto.tracks?.count ?? 0,
            artworkURL: YandexImage.url(
                host: dto.coverUriHost,
                uri: dto.coverUri
            ),
            accessKey: nil
        )
    }

    func playlistTracks(
        _ playlist: Playlist,
        accessToken: String,
        offset: Int,
        count: Int
    ) async throws -> MusicPage<Track> {
        let dto: YandexPlaylistDTO = try await client.get(
            path: "users/\(playlist.ownerID)/playlists/\(playlist.id)",
            token: accessToken
        )
        let tracks = (dto.tracks ?? []).compactMap(\.toTrack)
        return MusicPage(
            items: tracks,
            totalCount: tracks.count,
            nextOffset: nil
        )
    }

    func addToLibrary(
        _ track: Track,
        accessToken: String
    ) async throws -> Track {
        _ = try await client.post(
            path: "users/me/likes/tracks/add-multiple",
            token: accessToken,
            body: ["track-ids": [yandexTrackID(track)]]
        )
        return track
    }

    func removeFromLibrary(
        _ track: Track,
        accessToken: String
    ) async throws {
        _ = try await client.post(
            path: "users/me/likes/tracks/remove",
            token: accessToken,
            body: ["track-ids": [yandexTrackID(track)]]
        )
    }

    func dislikeTrack(
        _ track: Track,
        accessToken: String
    ) async throws {
        _ = try await client.post(
            path: "users/me/dislikes/tracks/add-multiple",
            token: accessToken,
            body: ["track-ids": [yandexTrackID(track)]]
        )
    }

    func lyrics(
        for track: Track,
        accessToken: String
    ) async throws -> Lyrics {
        struct SupplementDTO: Decodable {
            struct LyricsDTO: Decodable {
                let fullLyrics: String?
            }
            let lyrics: LyricsDTO?
        }
        let supplement: SupplementDTO = try await client.get(
            path: "tracks/\(yandexTrackID(track))/supplement",
            token: accessToken
        )
        if let text = supplement.lyrics?.fullLyrics, !text.isEmpty {
            return Lyrics(
                text: text,
                source: "Яндекс Музыка"
            )
        }
        return Lyrics(text: "", source: nil)
    }

    func createPlaylist(
        title: String,
        description: String,
        ownerID: Int,
        accessToken: String
    ) async throws -> Playlist {
        struct CreateDTO: Decodable {
            let kind: Int
        }
        let result: CreateDTO = try await client.post(
            path: "users/\(ownerID)/playlists/create",
            token: accessToken,
            body: ["title": title]
        )
        return Playlist(
            id: result.kind,
            ownerID: ownerID,
            title: title,
            description: description,
            count: 0,
            artworkURL: nil,
            accessKey: nil
        )
    }

    func editPlaylist(
        _ playlist: Playlist,
        title: String,
        description: String,
        accessToken: String
    ) async throws {
        _ = try await client.post(
            path: "users/\(playlist.ownerID)/playlists/\(playlist.id)/name",
            token: accessToken,
            body: ["value": title]
        )
    }

    func deletePlaylist(
        _ playlist: Playlist,
        accessToken: String
    ) async throws {
        _ = try await client.post(
            path: "users/\(playlist.ownerID)/playlists/\(playlist.id)/delete",
            token: accessToken
        )
    }

    func add(
        _ track: Track,
        to playlist: Playlist,
        accessToken: String
    ) async throws {
        _ = try await client.post(
            path: "users/\(playlist.ownerID)/playlists/\(playlist.id)/change-relative",
            token: accessToken,
            body: [
                "diff": [
                    [
                        "op": "insert",
                        "at": 0,
                        "tracks": [["id": yandexTrackID(track)]]
                    ]
                ]
            ]
        )
    }

    func remove(
        _ track: Track,
        from playlist: Playlist,
        accessToken: String
    ) async throws {
        _ = try await client.post(
            path: "users/\(playlist.ownerID)/playlists/\(playlist.id)/change-relative",
            token: accessToken,
            body: [
                "diff": [
                    [
                        "op": "delete",
                        "from": 0,
                        "to": 1,
                        "tracks": [["id": yandexTrackID(track)]]
                    ]
                ]
            ]
        )
    }

    // MARK: My Wave / rotor

    func waveTracks(accessToken: String) async throws -> [Track] {
        struct TracksDTO: Decodable {
            struct SequenceDTO: Decodable {
                struct TrackDTO: Decodable {
                    let track: YandexTrackDTO
                }
                let track: TrackDTO?
            }
            let sequence: [SequenceDTO]
        }
        let result: TracksDTO = try await client.get(
            path: "rotor/station/user:onyourwave/tracks",
            token: accessToken,
            query: ["settings2": "true"]
        )
        return result.sequence.compactMap { $0.track?.track.toTrack() }
    }

    // MARK: Landing / home feed

    func landingBlocks(accessToken: String) async throws -> [YandexLandingBlock] {
        struct LandingDTO: Decodable {
            struct BlockDTO: Decodable {
                struct EntityDTO: Decodable {
                    let type: String?
                    let data: YandexEntityData?
                }
                let id: String?
                let type: String?
                let title: String?
                let entities: [EntityDTO]?
            }
            let blocks: [BlockDTO]?
        }
        let result: LandingDTO = try await client.get(
            path: "landing3",
            token: accessToken,
            query: ["blocks": "personalplaylists,new-releases,promotions"]
        )
        return result.blocks?.compactMap { block in
            guard let title = block.title else { return nil }
            var playlists: [Playlist] = []
            var albums: [Album] = []
            for entity in block.entities ?? [] {
                if let playlist = entity.data?.playlist {
                    playlists.append(
                        Playlist(
                            id: playlist.kind,
                            ownerID: playlist.owner?.uid ?? 0,
                            title: playlist.title,
                            description: nil,
                            count: playlist.trackCount
                                ?? playlist.tracks?.count ?? 0,
                            artworkURL: YandexImage.url(
                                host: playlist.coverUriHost,
                                uri: playlist.coverUri
                            ),
                            accessKey: nil
                        )
                    )
                }
                if let album = entity.data?.album {
                    albums.append(album.toAlbum())
                }
            }
            if playlists.isEmpty && albums.isEmpty { return nil }
            return YandexLandingBlock(
                id: block.id ?? title,
                title: title,
                playlists: playlists,
                albums: albums
            )
        } ?? []
    }

    // MARK: My Wave settings

    /// Reads the rotor station settings (activity/mood/language/energy).
    func waveSettings(accessToken: String) async throws -> YandexWaveSettings {
        struct SettingsDTO: Decodable {
            struct OptionDTO: Decodable {
                let value: String
            }
            struct CategoryDTO: Decodable {
                let name: String
                let options: [OptionDTO]?
            }
            let categories: [CategoryDTO]?
        }
        let settings: SettingsDTO = try await client.get(
            path: "rotor/station/user:onyourwave/settings2",
            token: accessToken
        )
        var result = YandexWaveSettings()
        for category in settings.categories ?? [] {
            let values = Set((category.options ?? []).map(\.value))
            switch category.name {
            case "activity":
                result = YandexWaveSettings(
                    activity: values,
                    mood: result.mood,
                    language: result.language,
                    energy: result.energy
                )
            case "mood":
                result = YandexWaveSettings(
                    activity: result.activity,
                    mood: values,
                    language: result.language,
                    energy: result.energy
                )
            case "language":
                result = YandexWaveSettings(
                    activity: result.activity,
                    mood: result.mood,
                    language: values,
                    energy: result.energy
                )
            case "energy":
                result = YandexWaveSettings(
                    activity: result.activity,
                    mood: result.mood,
                    language: result.language,
                    energy: values
                )
            default:
                break
            }
        }
        return result
    }

    func setWaveSettings(
        _ settings: YandexWaveSettings,
        accessToken: String
    ) async throws {
        let payload: [String: Any] = [
            "categories": [
                ["name": "activity", "values": Array(settings.activity)],
                ["name": "mood", "values": Array(settings.mood)],
                ["name": "language", "values": Array(settings.language)],
                ["name": "energy", "values": Array(settings.energy)]
            ]
        ]
        _ = try await client.post(
            path: "rotor/station/user:onyourwave/settings2",
            token: accessToken,
            body: payload
        )
    }

    /// Starts playback of the personal wave ("Моя волна").
    func playWave(accessToken: String) async throws -> [Track] {
        try await waveTracks(accessToken: accessToken)
    }

    // MARK: Helpers

    private func resolveTracks(
        shorts: [YandexTracksListDTO.ShortDTO],
        accessToken: String
    ) async throws -> MusicPage<Track> {
        guard !shorts.isEmpty else {
            return MusicPage(items: [], totalCount: 0, nextOffset: nil)
        }
        let ids = shorts.map(\.id).joined(separator: ",")
        struct BatchDTO: Decodable {
            let tracks: [YandexTrackDTO]
        }
        let batch: BatchDTO = try await client.get(
            path: "tracks",
            token: accessToken,
            query: ["trackIds": ids, "with-positions": "true"]
        )
        let tracks = batch.tracks.compactMap(\.toTrack)
        return MusicPage(
            items: tracks,
            totalCount: tracks.count,
            nextOffset: nil
        )
    }

    private func resolveTracks(
        shorts: [YandexTrackShortDTO],
        accessToken: String
    ) async throws -> MusicPage<Track> {
        guard !shorts.isEmpty else {
            return MusicPage(items: [], totalCount: 0, nextOffset: nil)
        }
        let ids = shorts.map(\.id).joined(separator: ",")
        struct BatchDTO: Decodable {
            let tracks: [YandexTrackDTO]
        }
        let batch: BatchDTO = try await client.get(
            path: "tracks",
            token: accessToken,
            query: ["trackIds": ids, "with-positions": "true"]
        )
        let tracks = batch.tracks.compactMap(\.toTrack)
        return MusicPage(
            items: tracks,
            totalCount: tracks.count,
            nextOffset: nil
        )
    }

    private func yandexTrackID(_ track: Track) -> String {
        // Yandex expects "{track_id}:{album_id}". In `toTrack()` we stored the
        // album id in `ownerID`, so swap the order back here.
        "\(track.trackID):\(track.ownerID)"
    }
}

/// A rendered home-feed block (playlist/album rail) from the landing feed.
struct YandexLandingBlock: Identifiable, Hashable, Sendable {
    let id: String
    let title: String
    let playlists: [Playlist]
    let albums: [Album]
}