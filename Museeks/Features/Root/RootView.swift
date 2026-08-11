import SwiftUI

struct RootView: View {
    @EnvironmentObject private var environment: AppEnvironment
    @EnvironmentObject private var sessionStore: SessionStore
    @EnvironmentObject private var network: NetworkMonitor
    @EnvironmentObject private var player: PlayerController

    var body: some View {
        Group {
            if sessionStore.session == nil {
                ConnectView()
            } else {
                MainTabView()
                    .safeAreaInset(edge: .top, spacing: 0) {
                        if !network.isConnected {
                            Label("Нет сети", systemImage: "wifi.slash")
                                .font(.caption.weight(.semibold))
                                .foregroundStyle(.white)
                                .frame(maxWidth: .infinity)
                                .padding(.vertical, 5)
                                .background(.orange)
                        }
                    }
            }
        }
        .task(id: sessionStore.session?.accessToken) {
            while !Task.isCancelled, sessionStore.session != nil {
                await environment.maintainSession()
                let delay = maintenanceDelay
                do {
                    try await Task.sleep(nanoseconds: UInt64(delay * 1_000_000_000))
                } catch {
                    return
                }
            }
        }
        .onChange(of: network.isConnected) { _, connected in
            guard connected, sessionStore.session != nil else { return }
            Task { await environment.maintainSession() }
        }
        .fullScreenCover(isPresented: $player.isPlayerPresented) {
            PlayerView()
        }
        .tint(MuseeksPalette.accent)
        .alert("Ошибка", isPresented: Binding(
            get: { environment.sessionError != nil || player.errorMessage != nil },
            set: { if !$0 { environment.sessionError = nil; player.errorMessage = nil } }
        )) {
            Button("ОК", role: .cancel) {}
        } message: {
            Text(environment.sessionError ?? player.errorMessage ?? "")
        }
    }

    private var maintenanceDelay: TimeInterval {
        guard let expiration = sessionStore.session?.expiresAt else { return 6 * 60 * 60 }
        return min(max(expiration.timeIntervalSinceNow - 10 * 60, 60), 60 * 60)
    }
}
