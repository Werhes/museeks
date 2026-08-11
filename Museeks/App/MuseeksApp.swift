import SwiftUI

@main
@MainActor
struct MuseeksApp: App {
    @StateObject private var environment: AppEnvironment

    init() {
        _environment = StateObject(wrappedValue: AppEnvironment())
    }

    var body: some Scene {
        WindowGroup {
            RootView()
                .environmentObject(environment)
                .environmentObject(environment.sessionStore)
                .environmentObject(environment.networkMonitor)
                .environmentObject(environment.player)
                .environmentObject(environment.history)
                .environmentObject(environment.library)
        }
    }
}
