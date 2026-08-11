import SwiftUI

struct LibraryView: View {
    @EnvironmentObject private var environment: AppEnvironment
    @EnvironmentObject private var library: MusicLibraryStore
    @EnvironmentObject private var player: PlayerController
    @State private var section = 0

    var body: some View {
        ZStack {
            AppBackground()
            VStack(spacing: 0) {
                Picker("Раздел", selection: $section) {
                    Text("Треки").tag(0)
                    Text("Плейлисты").tag(1)
                }
                .pickerStyle(.segmented)
                .padding(.horizontal, 16)
                .padding(.bottom, 8)

                if library.isLoading && library.tracks.isEmpty {
                    Spacer(); ProgressView("Загружаем медиатеку…"); Spacer()
                } else if section == 0 {
                    tracks
                } else {
                    playlists
                }
            }
        }
        .navigationTitle("Медиатека")
        .task { await library.refresh(environment: environment) }
        .refreshable { await library.refresh(environment: environment, force: true) }
        .alert("Ошибка медиатеки", isPresented: Binding(
            get: { library.errorMessage != nil },
            set: { if !$0 { library.errorMessage = nil } }
        )) { Button("ОК", role: .cancel) {} } message: { Text(library.errorMessage ?? "") }
    }

    private var tracks: some View {
        Group {
            if library.tracks.isEmpty {
                ContentUnavailableView(
                    "Медиатека пуста",
                    systemImage: "music.note",
                    description: Text("Добавляйте треки из поиска и рекомендаций")
                )
            } else {
                List(library.tracks) { track in
                    TrackRow(
                        track: track,
                        isCurrent: player.currentTrack?.id == track.id,
                        isPlaying: player.isPlaying
                    ) { player.play(track, in: library.tracks, title: "Моя музыка") }
                    .listRowBackground(Color.clear)
                    .swipeActions(edge: .trailing) {
                        Button(role: .destructive) {
                            Task { await library.toggle(track, environment: environment) }
                        } label: { Label("Удалить", systemImage: "heart.slash") }
                    }
                    .contextMenu {
                        Button { player.playNext(track) } label: {
                            Label("Играть следующей", systemImage: "text.line.first.and.arrowtriangle.forward")
                        }
                        Button { player.addToQueue(track) } label: {
                            Label("Добавить в очередь", systemImage: "text.badge.plus")
                        }
                    }
                }
                .listStyle(.plain)
                .scrollContentBackground(.hidden)
            }
        }
    }

    private var playlists: some View {
        Group {
            if library.playlists.isEmpty {
                ContentUnavailableView("Нет плейлистов", systemImage: "music.note.list")
            } else {
                List(library.playlists) { playlist in
                    NavigationLink(value: playlist) {
                        HStack(spacing: 13) {
                            ArtworkView(url: playlist.artworkURL, size: 62, cornerRadius: 13)
                            VStack(alignment: .leading, spacing: 4) {
                                Text(playlist.title).font(.headline).lineLimit(2)
                                Text("\(playlist.count) треков")
                                    .font(.subheadline)
                                    .foregroundStyle(.secondary)
                            }
                        }
                    }
                    .listRowBackground(Color.clear)
                }
                .listStyle(.plain)
                .scrollContentBackground(.hidden)
                .navigationDestination(for: Playlist.self) { PlaylistDetailView(playlist: $0) }
            }
        }
    }
}

