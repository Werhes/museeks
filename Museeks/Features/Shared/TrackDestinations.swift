import Foundation
import SwiftUI

enum TrackDetailDestination: Hashable, Identifiable {
    case artists(Track)
    case album(Track)

    var id: String {
        switch self {
        case let .artists(track): "artists-\(track.id)"
        case let .album(track): "album-\(track.id)"
        }
    }
}

enum TrackArtistParser {
    private static let separatorPattern =
        #"(?i)\s*(?:,|;|&|×|\bx\b|(?:\bfeat|\bft)\.?(?=\s|$)|\bfeaturing\b|\bи\b)\s*"#

    static func names(from rawValue: String) -> [String] {
        let separated = rawValue.replacingOccurrences(
            of: separatorPattern,
            with: "\u{001F}",
            options: .regularExpression
        )
        var known = Set<String>()
        return separated
            .split(separator: "\u{001F}")
            .map { $0.trimmingCharacters(in: .whitespacesAndNewlines) }
            .filter { !$0.isEmpty }
            .filter {
                known.insert(
                    $0.folding(
                        options: [.caseInsensitive, .diacriticInsensitive],
                        locale: .current
                    )
                ).inserted
            }
    }
}

enum TrackAlbumNavigation {
    static func canOpen(_ track: Track) -> Bool {
        track.albumReference != nil
            || Album.isUsableTitle(track.albumTitle)
    }
}

struct TrackDestinationSheet: View {
    @Environment(\.dismiss) private var dismiss
    let destination: TrackDetailDestination

    var body: some View {
        NavigationStack {
            switch destination {
            case let .artists(track):
                TrackArtistsDestinationView(track: track)
            case let .album(track):
                TrackAlbumDestinationView(track: track)
                    .toolbar {
                        ToolbarItem(placement: .confirmationAction) {
                            Button(L10n.text("Готово")) { dismiss() }
                        }
                    }
            }
        }
        .presentationDetents([.large])
        .presentationDragIndicator(.visible)
    }
}

struct TrackArtistsDestinationView: View {
    @Environment(\.dismiss) private var dismiss
    let track: Track

    private var artists: [String] {
        TrackArtistParser.names(from: track.artist)
    }

    @ViewBuilder
    var body: some View {
        if artists.count == 1, let artist = artists.first {
            ArtistView(artist: artist)
        } else {
            List {
                Section {
                    ForEach(artists, id: \.self) { artist in
                        NavigationLink {
                            ArtistView(artist: artist)
                        } label: {
                            Label(artist, systemImage: "person.crop.circle")
                                .font(.body.weight(.semibold))
                                .padding(.vertical, 6)
                        }
                    }
                } header: {
                    Text(track.title)
                        .lineLimit(2)
                }
            }
            .listStyle(.insetGrouped)
            .scrollContentBackground(.hidden)
            .background(ThemeBackground())
            .navigationTitle(L10n.text("Выберите артиста"))
            .navigationBarTitleDisplayMode(.inline)
            .toolbar {
                ToolbarItem(placement: .cancellationAction) {
                    Button(L10n.text("Закрыть")) { dismiss() }
                }
            }
            .overlay {
                if artists.isEmpty {
                    EmptyStateView(
                        title: "Исполнитель не указан",
                        systemImage: "person.crop.circle.badge.questionmark",
                        description: "VK не вернул исполнителя для этого трека."
                    )
                }
            }
        }
    }
}

struct TrackAlbumDestinationView: View {
    @EnvironmentObject private var environment: AppEnvironment
    let track: Track
    @State private var resolvedAlbum: Album?
    @State private var errorMessage: String?
    @State private var isLoading = true

    var body: some View {
        Group {
            if let resolvedAlbum {
                AlbumDetailView(album: resolvedAlbum)
            } else if let errorMessage {
                VStack(spacing: 14) {
                    EmptyStateView(
                        title: "Не удалось открыть альбом",
                        systemImage: "square.stack.3d.up.slash",
                        description: errorMessage
                    )
                    Button(L10n.text("Повторить")) {
                        Task { await load() }
                    }
                    .buttonStyle(.borderedProminent)
                }
                .padding()
                .background(ThemeBackground())
            } else if isLoading {
                ProgressView(L10n.text("Загружаем альбом…"))
                    .frame(maxWidth: .infinity, maxHeight: .infinity)
                    .background(ThemeBackground())
            }
        }
        .task(id: track.id) { await load() }
    }

    @MainActor
    private func load() async {
        isLoading = true
        errorMessage = nil
        defer { isLoading = false }

        if let reference = track.albumReference {
            let provisional = reference.album(
                title: Album.isUsableTitle(track.albumTitle)
                    ? track.albumTitle ?? ""
                    : "",
                artist: track.artist,
                artworkURL: track.artworkURL
            )
            guard AlbumAccessPolicy.needsAccessKeyResolution(provisional) else {
                resolvedAlbum = provisional
                return
            }
            do {
                resolvedAlbum = try await environment.withAuthorizedToken {
                    token in
                    try await environment.musicService.resolvedAlbum(
                        provisional,
                        accessToken: token
                    )
                }
            } catch is CancellationError {
                return
            } catch {
                // AlbumDetailView performs another guarded resolution pass.
                resolvedAlbum = provisional
            }
            return
        }

        guard let title = track.albumTitle,
              Album.isUsableTitle(title) else {
            errorMessage = L10n.text(
                "VK не вернул данные альбома для этого трека."
            )
            return
        }

        do {
            let page = try await environment.withAuthorizedToken { token in
                try await environment.musicService.searchAlbums(
                    query: title,
                    accessToken: token,
                    offset: 0,
                    count: 20
                )
            }
            try Task.checkCancellation()
            let requestedArtists = Set(
                TrackArtistParser.names(from: track.artist).map(normalized)
            )
            let exactTitle = page.items.filter {
                $0.title.localizedCaseInsensitiveCompare(title) == .orderedSame
            }
            resolvedAlbum = exactTitle.first { album in
                album.artists.isEmpty
                    || !requestedArtists.isDisjoint(
                        with: album.artists.map(normalized)
                    )
            } ?? exactTitle.first
            if resolvedAlbum == nil {
                throw APIError.invalidResponse
            }
        } catch is CancellationError {
            return
        } catch {
            errorMessage = error.localizedDescription
        }
    }

    private func normalized(_ value: String) -> String {
        value
            .folding(
                options: [.caseInsensitive, .diacriticInsensitive],
                locale: .current
            )
            .lowercased()
            .trimmingCharacters(in: .whitespacesAndNewlines)
    }
}
