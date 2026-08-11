import SwiftUI

struct SearchView: View {
    @EnvironmentObject private var environment: AppEnvironment
    @EnvironmentObject private var player: PlayerController
    @EnvironmentObject private var library: MusicLibraryStore
    @StateObject private var model = SearchViewModel()

    var body: some View {
        ZStack {
            AppBackground()
            Group {
                if model.query.isEmpty {
                    ContentUnavailableView(
                        "Найдите музыку",
                        systemImage: "magnifyingglass",
                        description: Text("Треки и исполнители из каталога VK")
                    )
                } else if model.isLoading && model.tracks.isEmpty && model.artists.isEmpty {
                    ProgressView("Ищем…")
                } else if model.tracks.isEmpty && model.artists.isEmpty {
                    ContentUnavailableView.search(text: model.query)
                } else {
                    List {
                        if !model.artists.isEmpty {
                            Section("Исполнители") {
                                ScrollView(.horizontal, showsIndicators: false) {
                                    LazyHStack(spacing: 16) {
                                        ForEach(model.artists) { artist in
                                            NavigationLink(value: artist) {
                                                VStack(spacing: 7) {
                                                    ArtworkView(
                                                        url: artist.artworkURL,
                                                        size: 78,
                                                        cornerRadius: 39
                                                    )
                                                    Text(artist.name)
                                                        .font(.caption.weight(.semibold))
                                                        .foregroundStyle(.primary)
                                                        .lineLimit(1)
                                                }
                                                .frame(width: 88)
                                            }
                                            .buttonStyle(.plain)
                                        }
                                    }
                                    .padding(.vertical, 4)
                                }
                                .listRowBackground(Color.clear)
                            }
                        }
                        Section(model.artists.isEmpty ? "Результаты" : "Треки") {
                            ForEach(model.tracks) { track in
                                TrackRow(
                                    track: track,
                                    isCurrent: player.currentTrack?.id == track.id,
                                    isPlaying: player.isPlaying
                                ) { player.play(track, in: model.tracks, title: "Поиск: \(model.query)") }
                                .listRowBackground(Color.clear)
                                .contextMenu {
                                    Button { player.playNext(track) } label: {
                                        Label("Играть следующей", systemImage: "text.line.first.and.arrowtriangle.forward")
                                    }
                                    Button { Task { await library.toggle(track, environment: environment) } } label: {
                                        Label(
                                            library.contains(track) ? "Убрать из моей музыки" : "Добавить в мою музыку",
                                            systemImage: library.contains(track) ? "heart.slash" : "heart"
                                        )
                                    }
                                }
                            }
                        }
                    }
                    .listStyle(.plain)
                    .scrollContentBackground(.hidden)
                }
            }
        }
        .navigationTitle("Поиск")
        .navigationDestination(for: Artist.self) { ArtistView(artist: $0) }
        .searchable(text: $model.query, prompt: "Трек или исполнитель")
        .onSubmit(of: .search) { Task { await model.search(environment: environment) } }
        .onChange(of: model.query) { _, _ in model.queryChanged(environment: environment) }
        .alert("Ошибка поиска", isPresented: Binding(
            get: { model.errorMessage != nil },
            set: { if !$0 { model.errorMessage = nil } }
        )) { Button("ОК", role: .cancel) {} } message: { Text(model.errorMessage ?? "") }
    }
}
