import SwiftUI

private enum MainTab: Hashable {
    case home, search, library, profile
}

struct MainTabView: View {
    @EnvironmentObject private var player: PlayerController
    @State private var selection: MainTab = .home

    var body: some View {
        TabView(selection: $selection) {
            NavigationStack { HomeView() }
                .tabItem { Label("Главная", systemImage: "sparkles") }
                .tag(MainTab.home)

            NavigationStack { SearchView() }
                .tabItem { Label("Поиск", systemImage: "magnifyingglass") }
                .tag(MainTab.search)

            NavigationStack { LibraryView() }
                .tabItem { Label("Медиатека", systemImage: "music.note.list") }
                .tag(MainTab.library)

            NavigationStack { ProfileView() }
                .tabItem { Label("Профиль", systemImage: "person.crop.circle") }
                .tag(MainTab.profile)
        }
        .safeAreaInset(edge: .bottom, spacing: 4) {
            if player.currentTrack != nil { MiniPlayerView() }
        }
    }
}

