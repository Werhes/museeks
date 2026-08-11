import Foundation

struct HomeContent: Sendable {
    var recommendations: [Track] = []
    var recent: [Track] = []
    var playlists: [Playlist] = []
    var catalogSections: [MusicSection] = []
}

struct MusicSection: Identifiable, Hashable, Sendable {
    let id: String
    let title: String
    let tracks: [Track]
    let playlists: [Playlist]
}

struct Page<Item: Sendable>: Sendable {
    let items: [Item]
    let total: Int
    let nextOffset: Int?
}

struct Lyrics: Equatable, Sendable {
    let text: String
}

