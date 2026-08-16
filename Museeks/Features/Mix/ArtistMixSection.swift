import SwiftUI

/// «Микс по артисту» shelf. Cards mirror the official VK client layout
/// (see Music-M `ArtistMixButton`): a square artist image with rounded corners
/// sits on top, the artist name + a short subtitle are shown below it in their
/// own padded area (never covered by the image), and a play button floats in
/// the bottom-right corner of the image. Tapping anywhere on the card starts
/// the artist's continuous mix via `audio.getStreamMixAudios(entity_id=…)`.
struct ArtistMixSection: View {
    let artists: [VKArtist]
    let metrics: HomeMetrics

    @EnvironmentObject private var environment: AppEnvironment
    @EnvironmentObject private var sessionStore: SessionStore
    @EnvironmentObject private var player: AudioPlayer
    @State private var startingArtistID: String?

    var body: some View {
        if !artists.isEmpty {
            VStack(alignment: .leading, spacing: 12) {
                VStack(alignment: .leading, spacing: 2) {
                    Text(L10n.text("Artist Mix"))
                        .font(.headline.weight(.bold))
                    Text(L10n.text("Миксы по артистам из вашей медиатеки"))
                        .font(.caption)
                        .foregroundStyle(.secondary)
                }

                ScrollView(.horizontal, showsIndicators: false) {
                    LazyHStack(alignment: .top, spacing: metrics.cardSpacing) {
                        ForEach(artists) { artist in
                            ArtistMixCard(
                                artist: artist,
                                size: metrics.trackWidth,
                                isPlaying: isCurrentlyPlaying(artist),
                                isLoading: startingArtistID == artist.id,
                                onPlay: { startArtistMix(artist) }
                            )
                        }
                    }
                }
            }
            .accessibilityElement(children: .contain)
        }
    }

    private func startArtistMix(_ artist: VKArtist) {
        guard sessionStore.accessToken != nil,
              startingArtistID == nil else { return }
        startingArtistID = artist.id
        Task {
            defer { startingArtistID = nil }
            do {
                let mix = artistMix(for: artist)
                let bootstrap = try await environment.withAuthorizedToken {
                    token in
                    try await environment.musicService.mixTracksBootstrap(
                        mix,
                        accessToken: token
                    )
                }
                guard let first = bootstrap.first else { return }
                MixBootstrapPrefetch.artwork(for: bootstrap)
                player.play(
                    first,
                    in: bootstrap,
                    continuation: {
                        try await environment.withAuthorizedToken { token in
                            try await environment.musicService
                                .mixTracksContinuation(
                                    mix,
                                    accessToken: token
                                )
                        }
                    },
                    source: .mix(title: artist.name)
                )
            } catch is CancellationError {
                return
            } catch {
                // Playback failed to start — surface nothing heavy, the shelf
                // simply returns to its idle state.
            }
        }
    }

    private func artistMix(for artist: VKArtist) -> MusicMix {
        MusicMix(
            id: "artist-\(artist.id)",
            title: artist.name,
            subtitle: L10n.text("Микс по артисту"),
            artworkURL: artist.photoURL,
            matchPercent: nil,
            isSocial: false,
            sectionTitle: L10n.text("Artist Mix"),
            curator: nil,
            entityID: artist.id,
            reference: nil,
            promptEvents: nil,
            selection: VKMixSelection(),
            backgroundAnimationURL: nil,
            isTunable: false
        )
    }

    private func isCurrentlyPlaying(_ artist: VKArtist) -> Bool {
        guard player.isPlaying else { return false }
        if case let .mix(title) = player.queueSource {
            return title == artist.name
        }
        return false
    }
}