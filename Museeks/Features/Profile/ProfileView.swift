import SwiftUI

struct ProfileView: View {
    @EnvironmentObject private var environment: AppEnvironment
    @EnvironmentObject private var sessionStore: SessionStore
    @EnvironmentObject private var scrollCoordinator: MainTabScrollCoordinator
    @Environment(\.openURL) private var openURL
    @Environment(\.accessibilityReduceMotion) private var reduceMotion
    @State private var showingLogoutConfirmation = false

    var body: some View {
        ScrollViewReader { proxy in
            ScrollView {
                VStack(spacing: 22) {
                    profileCard
                    NavigationLink {
                        SettingsView()
                    } label: {
                        Label("Настройки", systemImage: "gearshape.fill")
                            .frame(maxWidth: .infinity, alignment: .leading)
                            .padding()
                            .premiumCard(interactive: true)
                    }
                    .buttonStyle(.plain)
                    linksCard

                    Button(role: .destructive) {
                        showingLogoutConfirmation = true
                    } label: {
                        Label("Выйти", systemImage: "rectangle.portrait.and.arrow.right")
                            .frame(maxWidth: .infinity, alignment: .leading)
                            .padding()
                            .premiumCard(interactive: true)
                    }

                    VStack(spacing: 8) {
                        Image("AppIconPreview")
                            .resizable()
                            .frame(width: 60, height: 60)
                            .clipShape(
                                RoundedRectangle(
                                    cornerRadius: PremiumLayout.controlRadius,
                                    style: .continuous
                                )
                            )
                        Text("Museeks \(version)")
                            .foregroundStyle(.secondary)
                        Text("Werhes")
                            .font(.caption)
                            .foregroundStyle(.tertiary)
                    }
                    .padding(.top, 28)
                }
                .id(MainTabScrollDestination.profile)
                .padding()
            }
            .onReceive(scrollCoordinator.$request) { request in
                guard request?.destination == .profile else { return }
                if reduceMotion {
                    proxy.scrollTo(MainTabScrollDestination.profile, anchor: .top)
                } else {
                    withAnimation(.easeOut(duration: 0.28)) {
                        proxy.scrollTo(
                            MainTabScrollDestination.profile,
                            anchor: .top
                        )
                    }
                }
            }
        }
        .background(ThemeBackground())
        .navigationTitle("Профиль")
        .confirmationDialog(
            "Выйти из Museeks?",
            isPresented: $showingLogoutConfirmation,
            titleVisibility: .visible
        ) {
            Button("Выйти", role: .destructive) {
                sessionStore.logout()
            }
            Button("Отмена", role: .cancel) {}
        } message: {
            Text(
                L10n.text(
                    "После выхода сохранённая сессия будет удалена с этого "
                        + "устройства. Для подключения потребуется снова "
                        + "войти в VK."
                )
            )
        }
    }

    private var version: String {
        Bundle.main.object(
            forInfoDictionaryKey: "CFBundleShortVersionString"
        ) as? String ?? "—"
    }

    private var profileCard: some View {
        HStack(spacing: 16) {
            AsyncArtwork(url: sessionStore.profile?.photoURL, size: 76)
            VStack(alignment: .leading, spacing: 4) {
                Text(
                    sessionStore.profile?.displayName
                        ?? L10n.text("Слушатель")
                )
                    .font(.title3.bold())
                Text("Museeks")
                    .foregroundStyle(.secondary)
            }
            Spacer()
        }
        .padding()
        .premiumCard()
    }

    private var linksCard: some View {
        VStack(spacing: 0) {
            linkButton(
                title: "Museeks на GitHub",
                subtitle: "Исходный код и обновления",
                icon: "chevron.left.forwardslash.chevron.right",
                url: environment.configuration.projectURL
            )
            Divider().padding(.leading, 54)
            linkButton(
                title: "Сообщить о проблеме",
                subtitle: "Открыть список задач",
                icon: "exclamationmark.bubble.fill",
                url: environment.configuration.issuesURL
            )
        }
        .padding(.horizontal)
        .premiumCard()
    }

    private func linkButton(
        title: String,
        subtitle: String,
        icon: String,
        url: URL
    ) -> some View {
        Button {
            openURL(url)
        } label: {
            HStack(spacing: 14) {
                Image(systemName: icon)
                    .frame(width: 28)
                    .foregroundStyle(.primary)
                VStack(alignment: .leading, spacing: 2) {
                    Text(L10n.text(title))
                        .foregroundStyle(.primary)
                    Text(L10n.text(subtitle))
                        .font(.caption)
                        .foregroundStyle(.secondary)
                }
                Spacer()
                Image(systemName: "arrow.up.right")
                    .foregroundStyle(.tertiary)
            }
            .padding(.vertical, 15)
        }
        .buttonStyle(.plain)
    }
}
