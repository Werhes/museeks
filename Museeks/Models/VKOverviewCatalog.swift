import Foundation

/// One horizontal shelf on the «Обзор» tab. VK returns each shelf as a block
/// inside `catalog.getSection` for the «Обзор» section. A block is either a
/// track shelf (`music_audios`) or a playlist/album shelf (`music_playlists`).
struct VKOverviewShelf: Identifiable, Hashable, Sendable {
    enum Kind: Hashable, Sendable {
        case tracks
        case playlists
    }

    let id: String
    let title: String
    let kind: Kind
    let layoutName: String
    let tracks: [Track]
    let playlists: [Playlist]

    var isEmpty: Bool { tracks.isEmpty && playlists.isEmpty }
}

/// Full «Обзор» catalog: ordered shelves plus optional promo banners.
struct VKOverviewCatalog: Sendable {
    var shelves: [VKOverviewShelf]
    var bannerURLs: [URL]
    var genres: [VKGenre]
    var moods: [VKGenre]

    var isEmpty: Bool {
        shelves.allSatisfy(\.isEmpty)
            && bannerURLs.isEmpty
            && genres.isEmpty
            && moods.isEmpty
    }
}

/// A music genre surfaced on the «Главная» (Home) feed («Поп», «Хип-хоп», …).
/// Tapping a genre plays the VK mix with the genre applied as an
/// `additionals` option.
struct VKGenre: Identifiable, Hashable, Sendable {
    let id: String
    let title: String
    let artworkURL: URL?
    /// Genre token sent to the VK mix, e.g. `pop` for «Поп».
    let additional: String

    /// The `MusicMix` used to launch playback for this genre.
    var mix: MusicMix {
        MusicMix(
            id: MusicMix.common.id,
            title: title,
            subtitle: L10n.text("Персональный микс"),
            artworkURL: artworkURL,
            selection: VKMixSelection(
                valuesByCategory: additional.isEmpty
                    ? [:]
                    : ["additionals": [additional]]
            ),
            isTunable: false
        )
    }
}

/// Fallback section ids for the home-feed catalog. The real id is resolved at
/// runtime from `catalog.getAudio`; these are only used when that resolution
/// fails. `home` is the «Главная» personalised feed; `overview` is the
/// «Обзор» explore catalog.
enum VKOverviewSectionID {
    static let home =
        "PUldVA8FR0RzSVNUUlEFAzQKBVQZFlJEfFpFVA0WUVFxX1lHAQBSUDs"
    static let explore =
        "PUldVA8FR0RzSVNUUEwbCikZDFQZFlJEfFpFVA0WUVFxX1lHAQBSUDs"
}

/// Mapping helpers used while decoding the raw `catalog.getSection` payload.
enum VKOverviewBlockPolicy {
    /// Shelf layout names that render wide cards (albums / playlists).
    static func isLargeLayout(_ name: String) -> Bool {
        ["large_slider", "recomms_slider"].contains(name)
    }

    /// Block titles the product intentionally surfaces in a fixed order.
    static func preferredOrder() -> [String] {
        [
            // «Главная» (Home) feed shelves.
            "Мои треки",
            "Собрано алгоритмами",
            "Похоже на",
            // «Обзор» (Overview) explore shelves.
            "Сегодня в плеере",
            "Выбор редакции",
            "Новинки",
            "Оставаться в тренде",
            "Новые альбомы",
            "Новые имена",
            "Новинки по жанрам",
            "Собрано редакцией",
            "Новинки под настроение",
            "VK Акустика"
        ]
    }

    /// Orders the raw blocks following the product layout, falling back to
    /// the server order for unknown titles.
    static func ordered(_ blocks: [VKOverviewShelf]) -> [VKOverviewShelf] {
        let rank = Dictionary(
            uniqueKeysWithValues: preferredOrder()
                .enumerated()
                .map { ($0.element, $0.offset) }
        )
        return blocks.sorted { lhs, rhs in
            let lhsRank = rank[lhs.title] ?? Int.max
            let rhsRank = rank[rhs.title] ?? Int.max
            if lhsRank != rhsRank { return lhsRank < rhsRank }
            return lhs.id < rhs.id
        }
    }
}