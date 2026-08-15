import Foundation

enum JSONValue: Codable, Sendable {
    case object([String: JSONValue])
    case array([JSONValue])
    case string(String)
    case number(Double)
    case bool(Bool)
    case null

    init(from decoder: Decoder) throws {
        let container = try decoder.singleValueContainer()
        if container.decodeNil() {
            self = .null
        } else if let value = try? container.decode([String: JSONValue].self) {
            self = .object(value)
        } else if let value = try? container.decode([JSONValue].self) {
            self = .array(value)
        } else if let value = try? container.decode(Bool.self) {
            self = .bool(value)
        } else if let value = try? container.decode(Double.self) {
            self = .number(value)
        } else if let value = try? container.decode(String.self) {
            self = .string(value)
        } else {
            throw DecodingError.dataCorruptedError(
                in: container,
                debugDescription: "Unsupported JSON value"
            )
        }
    }

    func encode(to encoder: Encoder) throws {
        var container = encoder.singleValueContainer()
        switch self {
        case let .object(value): try container.encode(value)
        case let .array(value): try container.encode(value)
        case let .string(value): try container.encode(value)
        case let .number(value): try container.encode(value)
        case let .bool(value): try container.encode(value)
        case .null: try container.encodeNil()
        }
    }

    var tracks: [Track] {
        var result: [Track] = []
        collectTracks(into: &result)
        var ids = Set<String>()
        return result.filter { ids.insert($0.id).inserted }
    }

    /// Top-level `audio.get` / playlist items array only — skips nested
    /// playlist metadata tracks that recursive `tracks` would also collect.
    var libraryAudioItems: [Track] {
        guard case let .object(object) = self,
              case let .array(values)? = object["items"] else {
            return tracks
        }
        var result: [Track] = []
        for value in values {
            if case let .object(item) = value,
               item["owner_id"] != nil,
               item["artist"] != nil,
               item["title"] != nil,
               let data = try? JSONEncoder().encode(value),
               let track = try? JSONDecoder().decode(Track.self, from: data) {
                result.append(track)
            }
        }
        return result
    }

    var libraryTotalCount: Int? {
        guard case let .object(object) = self,
              case let .number(value)? = object["count"] else {
            return nil
        }
        return Int(value.rounded())
    }

    var musicMixes: [MusicMix] {
        var collected: [MusicMix] = []
        collectMixes(into: &collected)
        var order: [String] = []
        var byID: [String: MusicMix] = [:]
        for mix in collected {
            if let existing = byID[mix.id] {
                byID[mix.id] = existing.merging(richer: mix)
            } else {
                order.append(mix.id)
                byID[mix.id] = mix
            }
        }
        return order.compactMap { byID[$0] }
    }

    /// Section list from `catalog.getAudio` (`response.catalog.sections`).
    /// Real section ids must be passed to `catalog.getSection` — guessed
    /// names like `audio_stream_mixes` are not stable.
    var catalogSections: [CatalogSectionRef] {
        var result: [CatalogSectionRef] = []
        collectCatalogSections(into: &result)
        var ids = Set<String>()
        return result.filter { ids.insert($0.id).inserted }
    }

    /// Scans a `catalog.getAudio` / `catalog.getSection` response for album
    /// blocks (official releases carry `main_artists`/`year`, which plain
    /// user playlists never have).
    var releaseAlbums: [Album] {
        var result: [Album] = []
        collectAlbums(into: &result)
        var ids = Set<String>()
        return result.filter { ids.insert($0.id).inserted }
    }

    var artists: [VKArtist] {
        var result: [VKArtist] = []
        collectArtists(into: &result)
        var ids = Set<String>()
        return result.filter { ids.insert($0.id).inserted }
    }

    var directAudioItems: [JSONValue]? {
        guard case let .object(object) = self,
              let audios = object["audios"] else {
            return nil
        }
        switch audios {
        case let .array(values):
            return values
        case .null:
            return []
        default:
            return nil
        }
    }

    /// Playlist objects embedded in a `catalog.getSection` payload. VK nests
    /// the actual playlist metadata under `response.playlists`, separate from
    /// the block id lists.
    var catalogPlaylists: [Playlist] {
        guard case let .object(object) = self,
              case let .array(items)? = object["playlists"] else {
            return []
        }
        var result: [Playlist] = []
        for item in items {
            guard case let .object(playlistObject) = item,
                  playlistObject["id"] != nil,
                  playlistObject["owner_id"] != nil,
                  playlistObject["title"] != nil,
                  let data = try? JSONEncoder().encode(item),
                  let playlist = try? JSONDecoder().decode(
                    Playlist.self,
                    from: data
                  ) else {
                continue
            }
            result.append(playlist)
        }
        var ids = Set<String>()
        return result.filter {
            ids.insert("\($0.ownerID)_\($0.id)").inserted
        }
    }

    /// The «Обзор» section id from `catalog.getAudio` root catalog sections.
    /// The «Обзор» explore catalog is distinct from the «Главная» home feed.
    var overviewSectionID: String? {
        guard case let .object(object) = self,
              case let .object(catalog)? = object["catalog"],
              case let .array(sections)? = catalog["sections"] else {
            return nil
        }
        for section in sections {
            guard case let .object(sectionObject) = section else { continue }
            let title = sectionObject["title"]?.stringValue ?? ""
            if title == "Обзор" || title == "Overview" {
                return sectionObject["id"]?.stringValue
            }
        }
        return nil
    }

    /// The «Главная» (Home) section id from `catalog.getAudio` root catalog
    /// sections. This is the personalised feed the home tab surfaces.
    var homeSectionID: String? {
        guard case let .object(object) = self,
              case let .object(catalog)? = object["catalog"],
              case let .array(sections)? = catalog["sections"] else {
            return nil
        }
        for section in sections {
            guard case let .object(sectionObject) = section else { continue }
            let title = sectionObject["title"]?.stringValue ?? ""
            if title == "Главная" || title == "Home" {
                return sectionObject["id"]?.stringValue
            }
        }
        return nil
    }

    var overviewShelves: [VKOverviewShelf] {
        guard case let .object(object) = self,
              case let .object(section)? = object["section"],
              case let .array(blocks)? = section["blocks"] else {
            return []
        }
        let audios = tracks
        let playlists = catalogPlaylists
        var result: [VKOverviewShelf] = []
        for block in blocks {
            guard case let .object(blockObject) = block else { continue }
            let dataType = blockObject["data_type"]?.stringValue ?? ""
            let title = blockObject["title"]?.stringValue ?? ""
            let layoutName = blockObject.objectValue("layout")?["name"]?.stringValue
                ?? ""
            guard !title.isEmpty,
                  dataType == "music_audios"
                    || dataType == "music_playlists" else {
                continue
            }
            let id = blockObject["id"]?.stringValue ?? "\(title)-\(layoutName)"
            let blockTracks = blockObject.overviewTrackIDs(audios: audios)
            let blockPlaylists = blockObject.overviewPlaylistIDs(playlists: playlists)
            let kind: VKOverviewShelf.Kind =
                dataType == "music_playlists" ? .playlists : .tracks
            let shelf = VKOverviewShelf(
                id: id,
                title: title,
                kind: kind,
                layoutName: layoutName,
                tracks: blockTracks,
                playlists: blockPlaylists
            )
            if !shelf.isEmpty {
                result.append(shelf)
            }
        }
        return VKOverviewBlockPolicy.ordered(result)
    }

    /// Promo banner images from the first `catalog_banners` block.
    var overviewBannerURLs: [URL] {
        guard case let .object(object) = self,
              case let .object(section)? = object["section"],
              case let .array(blocks)? = section["blocks"] else {
            return []
        }
        var result: [URL] = []
        for block in blocks {
            guard case let .object(blockObject) = block,
                  blockObject["data_type"]?.stringValue == "catalog_banners" else {
                continue
            }
            guard case let .array(images)? = blockObject["images"] else {
                continue
            }
            for image in images {
                if case let .object(imageObject) = image,
                   let url = imageObject.firstRemoteURL {
                    result.append(url)
                    if result.count >= 8 { break }
                }
            }
            if !result.isEmpty { break }
        }
        return result
    }

    /// Genres parsed from the «Жанры» action block of a «Главная» (Home)
    /// `catalog.getSection` response. Each genre is an `action` item carrying
    /// a title, a cover image and the `additionals` token used to play its VK
    /// mix.
    var overviewGenres: [VKGenre] {
        guard case let .object(object) = self,
              case let .object(section)? = object["section"],
              case let .array(blocks)? = section["blocks"] else {
            return []
        }
        var result: [VKGenre] = []
        for block in blocks {
            guard case let .object(blockObject) = block,
                  blockObject["data_type"]?.stringValue == "action",
                  let blockTitle = blockObject["title"]?.stringValue,
                  (blockTitle == "Жанры" || blockTitle == "Genres"),
                  case let .array(actions)? = blockObject["actions"] else {
                continue
            }
            for action in actions {
                guard case let .object(item) = action,
                      let title = item["title"]?.stringValue,
                      !title.isEmpty else {
                    continue
                }
                let id = item["id"]?.stringValue ?? title
                let image = item.firstRemoteURL
                // `mix_options` is delivered as a JSON string (or object); the
                // existing `mixSelection` parser handles both forms.
                let additional = item.mixSelection
                    .valuesByCategory["additionals"]?
                    .first ?? ""
                result.append(
                    VKGenre(
                        id: id,
                        title: title,
                        artworkURL: image,
                        additional: additional
                    )
                )
            }
            if !result.isEmpty { break }
        }
        return result
    }

    /// Moods/activities parsed from the «Настроения и занятия» action block of
    /// a «Главная» (Home) response. Structurally identical to genres, so the
    /// same `VKGenre` model is reused (each mood plays a VK mix).
    var overviewMoods: [VKGenre] {
        guard case let .object(object) = self,
              case let .object(section)? = object["section"],
              case let .array(blocks)? = section["blocks"] else {
            return []
        }
        var result: [VKGenre] = []
        for block in blocks {
            guard case let .object(blockObject) = block,
                  blockObject["data_type"]?.stringValue == "action",
                  let title = blockObject["title"]?.stringValue,
                  (title.localizedCaseInsensitiveContains("настроени")
                    || title.localizedCaseInsensitiveContains("mood")
                    || title.localizedCaseInsensitiveContains("activit")),
                  case let .array(actions)? = blockObject["actions"] else {
                continue
            }
            for action in actions {
                guard case let .object(item) = action,
                      let itemTitle = item["title"]?.stringValue,
                      !itemTitle.isEmpty else {
                    continue
                }
                let id = item["id"]?.stringValue ?? itemTitle
                let image = item.firstRemoteURL
                let additional = item.mixSelection
                    .valuesByCategory["additionals"]?
                    .first ?? ""
                result.append(
                    VKGenre(
                        id: id,
                        title: itemTitle,
                        artworkURL: image,
                        additional: additional
                    )
                )
            }
            if !result.isEmpty { break }
        }
        return result
    }

    private func collectTracks(into result: inout [Track]) {
        switch self {
        case let .object(object):
            if object["owner_id"] != nil,
               object["artist"] != nil,
               object["title"] != nil,
               let data = try? JSONEncoder().encode(self),
               let track = try? JSONDecoder().decode(Track.self, from: data) {
                result.append(track)
                return
            }
            object.values.forEach { $0.collectTracks(into: &result) }
        case let .array(values):
            values.forEach { $0.collectTracks(into: &result) }
        default:
            break
        }
    }

    private func collectMixes(into result: inout [MusicMix]) {
        switch self {
        case let .object(object):
            let type = object["data_type"]?.stringValue
                ?? object["type"]?.stringValue
                ?? ""
            let referencedIDs = object.mixReferencedIDs
            if !referencedIDs.isEmpty {
                let layout = object.objectValue("layout")
                let blockTitle = object["title"]?.stringValue
                    ?? layout?["title"]?.stringValue
                for id in referencedIDs {
                    result.append(
                        MusicMix(
                            id: id,
                            title: id == MusicMix.common.id
                                ? L10n.text("VK Микс") : "",
                            subtitle: id == MusicMix.common.id
                                ? L10n.text("Персональная подборка VK") : "",
                            artworkURL: object.mixCoverURL,
                            sectionTitle: blockTitle,
                            entityID: object.mixEntityID,
                            reference: object.mixReference,
                            promptEvents: object.mixPromptEvents,
                            selection: object.mixSelection,
                            backgroundAnimationURL:
                                object.mixBackgroundAnimationURL,
                            isTunable: id == MusicMix.common.id
                                || object["is_tunable"]?.boolValue == true
                        )
                    )
                }
            }
            let streamMix = object.objectValue("stream_mix")
            let explicitID = object["mix_id"]?.stringValue
                ?? streamMix?["mix_id"]?.stringValue
                ?? streamMix?["id"]?.stringValue
            let isMix = referencedIDs.isEmpty
                && (explicitID != nil
                    || type.localizedCaseInsensitiveContains("stream_mix")
                    || (object["is_tunable"] != nil
                        && object["settings"] != nil))
            if isMix,
               let id = explicitID ?? object["id"]?.stringValue,
               !id.isEmpty {
                let title = object["title"]?.stringValue
                    ?? streamMix?["title"]?.stringValue
                    ?? object["name"]?.stringValue
                    ?? L10n.text("VK Микс")
                var subtitle = L10n.text("Персональная подборка VK")
                if let s = object["subtitle"]?.stringValue {
                    subtitle = s
                } else if let s = object["description"]?.stringValue {
                    subtitle = s
                } else if let s = streamMix?["description"]?.stringValue {
                    subtitle = s
                } else if let s = object["caption"]?.stringValue {
                    subtitle = s
                }
                let matchPercent = object.mixMatchPercent
                let curator = object.mixCurator
                let social = object.looksLikeSocialMix(
                    type: type,
                    title: title,
                    subtitle: subtitle,
                    matchPercent: matchPercent
                ) || (curator?.isUsable == true)
                result.append(
                    MusicMix(
                        id: id,
                        title: title,
                        subtitle: subtitle,
                        artworkURL: object.mixCoverURL,
                        matchPercent: matchPercent,
                        isSocial: social,
                        curator: curator,
                        entityID: object.mixEntityID,
                        reference: object.mixReference,
                        promptEvents: object.mixPromptEvents,
                        selection: object.mixSelection,
                        backgroundAnimationURL: object.mixBackgroundAnimationURL,
                        isTunable: object["is_tunable"]?.boolValue == true
                            || object["settings"] != nil
                    )
                )
            }
            object.values.forEach { $0.collectMixes(into: &result) }
        case let .array(values):
            values.forEach { $0.collectMixes(into: &result) }
        default:
            break
        }
    }

    private func collectCatalogSections(
        into result: inout [CatalogSectionRef]
    ) {
        switch self {
        case let .object(object):
            if case let .object(catalog)? = object["catalog"],
               case let .array(sections)? = catalog["sections"] {
                for section in sections {
                    if let parsed = section.asCatalogSection {
                        result.append(parsed)
                    }
                }
            }
            if case let .array(sections)? = object["sections"] {
                for section in sections {
                    if let parsed = section.asCatalogSection {
                        result.append(parsed)
                    }
                }
            }
            if let parsed = asCatalogSection {
                result.append(parsed)
            }
            object.values.forEach { $0.collectCatalogSections(into: &result) }
        case let .array(values):
            values.forEach { $0.collectCatalogSections(into: &result) }
        default:
            break
        }
    }

    private var asCatalogSection: CatalogSectionRef? {
        guard case let .object(object) = self else { return nil }
        let id = object["id"]?.stringValue
            ?? object["section_id"]?.stringValue
        guard let id, !id.isEmpty else { return nil }
        // Mix / audio objects also have id+title — require section-ish shape.
        let type = object["type"]?.stringValue
            ?? object["data_type"]?.stringValue
            ?? ""
        let url = object["url"]?.stringValue
        let looksLikeSection = url?.contains("audios") == true
            || type.localizedCaseInsensitiveContains("section")
            || object["blocks"] != nil
            || object["next_from"] != nil
        guard looksLikeSection || (object["title"] != nil && url != nil) else {
            return nil
        }
        return CatalogSectionRef(
            id: id,
            title: object["title"]?.stringValue
                ?? object["name"]?.stringValue
                ?? "",
            url: url
        )
    }

    private func collectAlbums(into result: inout [Album]) {
        switch self {
        case let .object(object):
            let looksLikeAlbum = object["owner_id"] != nil
                && object["id"] != nil
                && object["title"] != nil
                && (object["main_artists"] != nil || object["year"] != nil)
            if looksLikeAlbum,
               let data = try? JSONEncoder().encode(self),
               let album = try? JSONDecoder().decode(Album.self, from: data) {
                result.append(album)
                return
            }
            object.values.forEach { $0.collectAlbums(into: &result) }
        case let .array(values):
            values.forEach { $0.collectAlbums(into: &result) }
        default:
            break
        }
    }

    private func collectArtists(into result: inout [VKArtist]) {
        switch self {
        case let .object(object):
            if let artist = object.asVKArtist {
                result.append(artist)
            }
            object.values.forEach { $0.collectArtists(into: &result) }
        case let .array(values):
            values.forEach { $0.collectArtists(into: &result) }
        default:
            break
        }
    }

    fileprivate var stringValue: String? {
        switch self {
        case let .string(value): value
        case let .number(value):
            value.rounded() == value ? String(Int(value)) : String(value)
        default: nil
        }
    }

    fileprivate var numberValue: Double? {
        switch self {
        case let .number(value): value
        case let .string(value):
            Double(
                value.replacingOccurrences(of: "%", with: "")
                    .trimmingCharacters(in: .whitespaces)
            )
        default: nil
        }
    }
}

extension Dictionary where Key == String, Value == JSONValue {
    var mixReferencedIDs: [String] {
        guard case let .array(values)? = self["audio_stream_mixes_ids"] else {
            return []
        }
        var known = Set<String>()
        return values.compactMap(\.stringValue).filter {
            !$0.isEmpty && known.insert($0).inserted
        }
    }

    var mixMatchPercent: Int? {
        let keys = [
            "percent", "match_percent", "match", "compatibility",
            "similarity", "score", "overlap"
        ]
        for key in keys {
            guard let value = self[key]?.numberValue else { continue }
            let percent = value <= 1 ? value * 100 : value
            let rounded = Int(percent.rounded())
            if (1...100).contains(rounded) { return rounded }
        }
        return nil
    }

    /// Mix cover only — never recurse into nested owner/user avatars.
    var mixCoverURL: URL? {
        let preferredKeys = [
            "photo_1200", "photo_600", "photo_300", "photo_270",
            "cover_url", "thumb_url", "image", "background_image_url"
        ]
        for key in preferredKeys {
            if case let .string(raw)? = self[key],
               let url = URL.secureRemoteURL(raw) {
                return url
            }
            if case let .object(nested)? = self[key],
               let url = nested.firstRemoteURL {
                return url
            }
        }
        if case let .array(thumbs)? = self["thumbs"]
            ?? self["foreground_images"]
            ?? self["images"]
            ?? self["photos"] {
            for item in thumbs {
                if case let .object(object) = item,
                   let url = object.firstRemoteURL {
                    return url
                }
                if case let .string(raw) = item,
                   let url = URL.secureRemoteURL(raw) {
                    return url
                }
            }
        }
        return nil
    }

    var mixEntityID: String? {
        self["entity_id"]?.stringValue
            ?? objectValue("action")?["entity_id"]?.stringValue
    }

    var mixReference: String? {
        self["ref"]?.stringValue
            ?? objectValue("action")?["ref"]?.stringValue
    }

    var mixPromptEvents: String? {
        if let value = self["prompt_events"]?.stringValue {
            return value
        }
        if case let .array(values)? = self["prompt_events"] {
            let events = values.compactMap(\.stringValue)
            return events.isEmpty ? nil : events.joined(separator: ",")
        }
        return nil
    }

    var mixBackgroundAnimationURL: URL? {
        guard case let .string(raw)? = self["background_animation_url"] else {
            return nil
        }
        return URL.secureRemoteURL(raw)
    }

    var mixSelection: VKMixSelection {
        guard let raw = self["mix_options"] ?? self["options"] else {
            return VKMixSelection()
        }
        switch raw {
        case let .string(json):
            guard let data = json.data(using: .utf8),
                  let object = try? JSONSerialization.jsonObject(with: data),
                  let dictionary = object as? [String: [String]] else {
                return VKMixSelection()
            }
            return VKMixSelection(valuesByCategory: dictionary)
        case let .object(object):
            var result: [String: [String]] = [:]
            for (key, value) in object {
                switch value {
                case let .array(items):
                    let values = items.compactMap(\.stringValue)
                    if !values.isEmpty { result[key] = values }
                case .string, .number:
                    if let value = value.stringValue { result[key] = [value] }
                default:
                    continue
                }
            }
            return VKMixSelection(valuesByCategory: result)
        default:
            return VKMixSelection()
        }
    }

    var mixCurator: MixCurator? {
        var candidates: [[String: JSONValue]] = [
            objectValue("owner"),
            objectValue("user"),
            objectValue("profile"),
            objectValue("friend"),
            objectValue("author")
        ].compactMap { $0 }
        let selfLooksLikePerson = self["first_name"] != nil
            || self["last_name"] != nil
            || self["user_id"] != nil
            || self["friend_id"] != nil
        if selfLooksLikePerson {
            candidates.insert(self, at: 0)
        }

        for object in candidates {
            let id = object["id"]?.stringValue
                ?? object["user_id"]?.stringValue
                ?? object["owner_id"]?.stringValue
            let first = object["first_name"]?.stringValue
            let last = object["last_name"]?.stringValue
            let joinedName = [first, last]
                .compactMap { $0 }
                .filter { !$0.isEmpty }
                .joined(separator: " ")
            let name = object["name"]?.stringValue
                ?? object["title"]?.stringValue
                ?? (joinedName.isEmpty ? nil : joinedName)
            let trimmed = name?
                .trimmingCharacters(in: .whitespacesAndNewlines)
            guard let trimmed, !trimmed.isEmpty else { continue }
            let photo = object["photo_200"]?.stringValue
                ?? object["photo_100"]?.stringValue
                ?? object["photo"]?.stringValue
            return MixCurator(
                id: id ?? trimmed,
                displayName: trimmed,
                photoURL: photo.flatMap(URL.secureRemoteURL)
            )
        }
        return nil
    }

    fileprivate func objectValue(_ key: String) -> [String: JSONValue]? {
        if case let .object(value)? = self[key] {
            return value
        }
        return nil
    }

    /// Tracks referenced by a `music_audios` block, matched by composite id.
    func overviewTrackIDs(audios: [Track]) -> [Track] {
        guard case let .array(values)? = self["audios_ids"] else {
            return []
        }
        let rawIDs = values.compactMap(\.stringValue)
        var byID: [String: Track] = [:]
        for track in audios {
            if byID[track.id] == nil {
                byID[track.id] = track
            }
        }
        var seen = Set<String>()
        return rawIDs.compactMap { byID[$0] }.filter {
            seen.insert($0.id).inserted
        }
    }

    /// Playlists referenced by a `music_playlists` block, matched by composite
    /// id (`owner_id_id`).
    func overviewPlaylistIDs(playlists: [Playlist]) -> [Playlist] {
        guard case let .array(values)? = self["playlists_ids"] else {
            return []
        }
        let rawIDs = values.compactMap(\.stringValue)
        var byID: [String: Playlist] = [:]
        for playlist in playlists {
            let key = "\(playlist.ownerID)_\(playlist.id)"
            if byID[key] == nil {
                byID[key] = playlist
            }
        }
        var seen = Set<String>()
        return rawIDs.compactMap { byID[$0] }.filter {
            seen.insert("\($0.ownerID)_\($0.id)").inserted
        }
    }

    func looksLikeSocialMix(
        type: String,
        title: String,
        subtitle: String,
        matchPercent: Int?
    ) -> Bool {
        if matchPercent != nil { return true }
        let blob = "\(type) \(title) \(subtitle)".lowercased()
        let markers = [
            "friend", "friends", "taste", "mutual", "совпад",
            "друг", "слушайте друг", "listen together"
        ]
        return markers.contains { blob.contains($0) }
    }

    var firstRemoteURL: URL? {
        let preferredKeys = [
            "photo_1200", "photo_600", "photo_300", "photo_270",
            "cover_url", "url"
        ]
        for key in preferredKeys {
            if case let .string(raw)? = self[key],
               let url = URL.secureRemoteURL(raw) {
                return url
            }
        }
        // Banner objects put their images under an `images` array.
        if case let .array(images)? = self["images"] {
            for image in images {
                if case let .object(imageObject) = image,
                   let url = imageObject.firstRemoteURL {
                    return url
                }
            }
        }
        for value in values {
            switch value {
            case let .object(object):
                if let url = object.firstRemoteURL { return url }
            case let .array(values):
                for item in values {
                    if case let .object(object) = item,
                       let url = object.firstRemoteURL {
                        return url
                    }
                }
            default:
                continue
            }
        }
        return nil
    }

    var asVKArtist: VKArtist? {
        let name = self["name"]?.stringValue
            ?? self["title"]?.stringValue
        guard let name, !name.isEmpty else { return nil }
        let id = self["id"]?.stringValue
            ?? self["artist_id"]?.stringValue
            ?? self["domain"]?.stringValue
        guard let id, !id.isEmpty else { return nil }
        // Reject track / album shaped objects that also have id+name.
        if self["owner_id"] != nil, self["duration"] != nil { return nil }
        if self["owner_id"] != nil, self["main_artists"] != nil { return nil }
        let type = self["type"]?.stringValue
            ?? self["data_type"]?.stringValue
            ?? ""
        if !type.isEmpty,
           !type.localizedCaseInsensitiveContains("artist"),
           self["photo"] == nil,
           self["photo_600"] == nil,
           firstRemoteURL == nil {
            return nil
        }
        return VKArtist(
            id: id,
            name: name,
            photoURL: firstRemoteURL,
            isAlbumCover: self["is_album_cover"]?.boolValue == true
        )
    }
}

private extension JSONValue {
    var boolValue: Bool? {
        switch self {
        case let .bool(value): value
        case let .number(value): value != 0
        case let .string(value):
            ["1", "true", "yes"].contains(value.lowercased())
        default: nil
        }
    }
}
