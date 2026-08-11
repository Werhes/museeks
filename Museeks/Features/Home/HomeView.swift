import SwiftUI

struct HomeView: View {
    @EnvironmentObject private var environment: AppEnvironment
    @EnvironmentObject private var sessionStore: SessionStore
    @EnvironmentObject private var player: PlayerController
    @EnvironmentObject private var history: ListeningHistory
    @EnvironmentObject private var library: MusicLibraryStore
    @StateObject private var model = HomeViewModel()

    var body: some View {
        ZStack {
            AppBackground()
            ScrollView {
                LazyVStack(alignment: .leading, spacing: 28) {
                    greeting
                    if model.isLoading && model.content.recommendations.isEmpty {
                        loading
                    } else {
                        if !history.tracks.isEmpty {
                            trackCarousel(title: "Недавно слушали", tracks: history.tracks)
                        }
                        if !model.content.recommendations.isEmpty {
                            trackCarousel(title: "Для вас", tracks: model.content.recommendations)
                            trackList(title: "Рекомендации", tracks: Array(model.content.recommendations.prefix(12)))
                        }
                        if !model.content.playlists.isEmpty {
                            playlistCarousel(title: "Ваши плейлисты", playlists: model.content.playlists)
                        }
                        ForEach(model.content.catalogSections) { section in
                            if !section.tracks.isEmpty {
                                trackCarousel(title: section.title, tracks: section.tracks)
                            } else if !section.playlists.isEmpty {
                                playlistCarousel(title: section.title, playlists: section.playlists)
                            }
                        }
                        if let message = model.errorMessage { errorCard(message) }
                    }
                }
                .padding(.vertical, 12)
            }
        }
        .navigationTitle("Главная")
        .navigationDestination(for: Playlist.self) { PlaylistDetailView(playlist: $0) }
        .refreshable { await model.load(environment: environment, force: true) }
        .task(id: sessionStore.session?.accessToken) {
            async let home: Void = model.load(environment: environment)
            async let media: Void = library.refresh(environment: environment)
            _ = await (home, media)
        }
    }

    private var greeting: some View {
        HStack(spacing: 12) {
            VStack(alignment: .leading, spacing: 2) {
                Text(greetingText.uppercased())
                    .font(.caption2.weight(.bold))
                    .tracking(0.8)
                    .foregroundStyle(.secondary)
                Text(sessionStore.profile?.firstName ?? "Слушатель")
                    .font(.title2.bold())
            }
            Spacer()
            ArtworkView(url: sessionStore.profile?.photoURL, size: 44, cornerRadius: 22)
        }
        .padding(.horizontal, 18)
    }

    private var greetingText: String {
        switch Calendar.current.component(.hour, from: Date()) {
        case 5..<12: "Доброе утро"
        case 12..<18: "Добрый день"
        case 18..<23: "Добрый вечер"
        default: "Доброй ночи"
        }
    }

    private var loading: some View {
        VStack(spacing: 18) {
            ProgressView().controlSize(.large)
            Text("Собираем музыку для вас…").foregroundStyle(.secondary)
        }
        .frame(maxWidth: .infinity)
        .padding(.top, 90)
    }

    private func trackCarousel(title: String, tracks: [Track]) -> some View {
        VStack(alignment: .leading, spacing: 12) {
            sectionTitle(title)
            ScrollView(.horizontal, showsIndicators: false) {
                LazyHStack(spacing: 14) {
                    ForEach(Array(tracks.prefix(20))) { track in
                        Button {
                            player.play(track, in: tracks, title: title)
                        } label: {
                            VStack(alignment: .leading, spacing: 7) {
                                ArtworkView(url: track.artworkURL, size: 154, cornerRadius: 19)
                                Text(track.title)
                                    .font(.subheadline.weight(.semibold))
                                    .foregroundStyle(.primary)
                                    .lineLimit(1)
                                Text(track.artist)
                                    .font(.caption)
                                    .foregroundStyle(.secondary)
                                    .lineLimit(1)
                            }
                            .frame(width: 154, alignment: .leading)
                        }
                        .buttonStyle(.plain)
                        .contextMenu { trackMenu(track) }
                    }
                }
                .padding(.horizontal, 18)
            }
        }
    }

    private func trackList(title: String, tracks: [Track]) -> some View {
        VStack(alignment: .leading, spacing: 12) {
            sectionTitle(title)
            LazyVStack(spacing: 13) {
                ForEach(tracks) { track in
                    TrackRow(
                        track: track,
                        isCurrent: player.currentTrack?.id == track.id,
                        isPlaying: player.isPlaying
                    ) { player.play(track, in: tracks, title: title) }
                    .contextMenu { trackMenu(track) }
                }
            }
            .padding(16)
            .museeksGlass(in: RoundedRectangle(cornerRadius: 24, style: .continuous))
            .padding(.horizontal, 16)
        }
    }

    private func playlistCarousel(title: String, playlists: [Playlist]) -> some View {
        VStack(alignment: .leading, spacing: 12) {
            sectionTitle(title)
            ScrollView(.horizontal, showsIndicators: false) {
                LazyHStack(spacing: 14) {
                    ForEach(Array(playlists.prefix(20))) { playlist in
                        NavigationLink(value: playlist) {
                            VStack(alignment: .leading, spacing: 7) {
                                ArtworkView(url: playlist.artworkURL, size: 168, cornerRadius: 20)
                                Text(playlist.title)
                                    .font(.subheadline.weight(.semibold))
                                    .foregroundStyle(.primary)
                                    .lineLimit(2)
                                Text("\(playlist.count) треков")
                                    .font(.caption)
                                    .foregroundStyle(.secondary)
                            }
                            .frame(width: 168, alignment: .leading)
                        }
                        .buttonStyle(.plain)
                    }
                }
                .padding(.horizontal, 18)
            }
        }
    }

    private func sectionTitle(_ title: String) -> some View {
        Text(title)
            .font(.title3.bold())
            .padding(.horizontal, 18)
    }

    @ViewBuilder
    private func trackMenu(_ track: Track) -> some View {
        Button { player.playNext(track) } label: {
            Label("Играть следующей", systemImage: "text.line.first.and.arrowtriangle.forward")
        }
        Button { player.addToQueue(track) } label: {
            Label("Добавить в очередь", systemImage: "text.badge.plus")
        }
        Button { Task { await library.toggle(track, environment: environment) } } label: {
            Label(
                library.contains(track) ? "Убрать из моей музыки" : "Добавить в мою музыку",
                systemImage: library.contains(track) ? "heart.slash" : "heart"
            )
        }
    }

    private func errorCard(_ message: String) -> some View {
        ContentUnavailableView(
            "Рекомендации недоступны",
            systemImage: "wifi.exclamationmark",
            description: Text(message)
        )
        .frame(maxWidth: .infinity)
        .padding(.vertical, 40)
    }
}
