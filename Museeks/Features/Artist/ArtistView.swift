import SwiftUI

struct ArtistView: View {
    let artist: Artist
    @EnvironmentObject private var environment: AppEnvironment
    @EnvironmentObject private var player: PlayerController
    @EnvironmentObject private var library: MusicLibraryStore
    @State private var tracks: [Track] = []
    @State private var isLoading = false
    @State private var errorMessage: String?

    var body: some View {
        ZStack {
            AppBackground()
            ScrollView {
                LazyVStack(spacing: 14) {
                    VStack(spacing: 12) {
                        ArtworkView(url: artist.artworkURL, size: 190, cornerRadius: 95)
                            .shadow(color: .black.opacity(0.2), radius: 20, y: 10)
                        Text(artist.name)
                            .font(.largeTitle.bold())
                            .multilineTextAlignment(.center)
                        Button {
                            if let first = tracks.first {
                                player.play(first, in: tracks, title: artist.name)
                            }
                        } label: {
                            Label("Слушать", systemImage: "play.fill")
                                .font(.headline)
                                .foregroundStyle(.white)
                                .padding(.horizontal, 25)
                                .frame(height: 48)
                                .background(MuseeksPalette.accent, in: Capsule())
                        }
                        .buttonStyle(.plain)
                        .disabled(tracks.isEmpty)
                    }
                    .frame(maxWidth: .infinity)
                    .padding(.vertical, 22)

                    if isLoading && tracks.isEmpty {
                        ProgressView().padding(.top, 30)
                    } else {
                        ForEach(tracks) { track in
                            TrackRow(
                                track: track,
                                isCurrent: player.currentTrack?.id == track.id,
                                isPlaying: player.isPlaying
                            ) { player.play(track, in: tracks, title: artist.name) }
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
                .padding(.horizontal, 16)
                .padding(.bottom, 30)
            }
        }
        .navigationTitle(artist.name)
        .navigationBarTitleDisplayMode(.inline)
        .task { await load() }
        .alert("Ошибка", isPresented: Binding(
            get: { errorMessage != nil },
            set: { if !$0 { errorMessage = nil } }
        )) { Button("ОК", role: .cancel) {} } message: { Text(errorMessage ?? "") }
    }

    @MainActor
    private func load() async {
        guard let token = environment.sessionStore.session?.accessToken else { return }
        isLoading = true
        defer { isLoading = false }
        do {
            tracks = try await environment.musicService.artistTracks(token: token, artist: artist)
            errorMessage = nil
        } catch {
            errorMessage = error.localizedDescription
        }
    }
}
