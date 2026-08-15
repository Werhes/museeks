import SwiftUI

/// «Микс по артисту» shelf: a horizontal row of square artist cards (rounded
/// corners), each showing the artist's VK avatar, the artist name underneath,
/// and a play button in the bottom-right corner that starts a continuous mix
/// built around that artist via `audio.getStreamMixAudios(entity_id=…)`.
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
                            artistCard(artist)
                        }
                    }
                }
            }
            .accessibilityElement(children: .contain)
        }
    }

    private func artistCard(_ artist: VKArtist) -> some View {
        VStack(alignment: .leading, spacing: 6) {
            ZStack(alignment: .bottomTrailing) {
                AsyncArtwork(url: artist.photoURL, size: metrics.trackWidth)

                Button {
                    startArtistMix(artist)
                } label: {
                    Group {
                        if startingArtistID == artist.id {
                            ProgressView()
                                .tint(.black)
                        } else {
                            Image(systemName: "play.fill")
                        }
                    }
                    .font(.caption.weight(.bold))
                    .foregroundStyle(.black)
                    .frame(width: 34, height: 34)
                    .background(.white, in: Circle())
                }
                .buttonStyle(PremiumPressStyle())
                .offset(
                    x: metrics.trackWidth - 41,
                    y: metrics.trackWidth - 41
                )
                .disabled(startingArtistID != nil)
                .accessibilityLabel(
                    L10n.format(
                        "%@ · %@",
                        artist.name,
                        L10n.text("Воспроизвести микс артиста")
                    )
                )
            }
            .frame(width: metrics.trackWidth, height: metrics.trackWidth)

            Text(artist.name)
                .font(.footnote.weight(.semibold))
                .foregroundStyle(
                    isCurrentlyPlaying(artist)
                        ? Color.accentColor
                        : Color.primary
                )
                .lineLimit(1)
                .truncationMode(.tail)
                .frame(width: metrics.trackWidth, alignment: .leading)
        }
        .frame(width: metrics.trackWidth, alignment: .topLeading)
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