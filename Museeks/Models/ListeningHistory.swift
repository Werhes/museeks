import Combine
import Foundation

@MainActor
final class ListeningHistory: ObservableObject {
    @Published private(set) var tracks: [Track] = []
    private let key = "listening-history.v1"
    private let defaults = UserDefaults.standard

    init() {
        guard let data = defaults.data(forKey: key),
              let saved = try? JSONDecoder().decode([Track].self, from: data) else { return }
        tracks = saved
    }

    func record(_ track: Track) {
        tracks.removeAll { $0.id == track.id }
        tracks.insert(track.metadataOnly, at: 0)
        tracks = Array(tracks.prefix(50))
        if let data = try? JSONEncoder().encode(tracks) { defaults.set(data, forKey: key) }
    }

    func clear() {
        tracks = []
        defaults.removeObject(forKey: key)
    }
}
