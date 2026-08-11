import SwiftUI

struct LyricsView: View {
    @Environment(\.dismiss) private var dismiss
    @EnvironmentObject private var environment: AppEnvironment
    @EnvironmentObject private var player: PlayerController
    @State private var text = ""
    @State private var isLoading = true
    @State private var errorMessage: String?

    var body: some View {
        NavigationStack {
            ZStack {
                AppBackground()
                if isLoading {
                    ProgressView("Загружаем текст…")
                } else if let errorMessage {
                    ContentUnavailableView(
                        "Текст недоступен",
                        systemImage: "quote.bubble",
                        description: Text(errorMessage)
                    )
                } else {
                    ScrollView {
                        Text(text)
                            .font(.title3.weight(.semibold))
                            .lineSpacing(7)
                            .frame(maxWidth: .infinity, alignment: .leading)
                            .padding(22)
                    }
                }
            }
            .navigationTitle(player.currentTrack?.title ?? "Текст")
            .navigationBarTitleDisplayMode(.inline)
            .toolbar {
                ToolbarItem(placement: .confirmationAction) {
                    Button("Готово") { dismiss() }
                }
            }
        }
        .task(id: player.currentTrack?.id) { await load() }
    }

    @MainActor
    private func load() async {
        guard let track = player.currentTrack,
              let token = environment.sessionStore.session?.accessToken else {
            errorMessage = "Трек не выбран."
            isLoading = false
            return
        }
        isLoading = true
        defer { isLoading = false }
        do {
            text = try await environment.musicService.lyrics(token: token, track: track).text
            errorMessage = nil
        } catch {
            errorMessage = error.localizedDescription
        }
    }
}

