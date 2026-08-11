import SwiftUI

struct ProfileView: View {
    @EnvironmentObject private var environment: AppEnvironment
    @EnvironmentObject private var sessionStore: SessionStore
    @EnvironmentObject private var history: ListeningHistory
    @State private var confirmsLogout = false
    @State private var confirmsHistoryClear = false

    var body: some View {
        ZStack {
            AppBackground()
            List {
                profileHeader
                    .listRowBackground(Color.clear)
                    .listRowSeparator(.hidden)

                Section("Сессия") {
                    LabeledContent("Хранение", value: "Keychain")
                    if let expiration = sessionStore.session?.expiresAt {
                        LabeledContent("Действует до") {
                            Text(expiration, style: .date)
                        }
                    } else {
                        LabeledContent("Срок действия", value: "Без ограничения")
                    }
                    Button {
                        Task { await environment.maintainSession(force: true) }
                    } label: {
                        Label(
                            environment.isMaintainingSession ? "Обновляем…" : "Обновить подключение",
                            systemImage: "arrow.triangle.2.circlepath"
                        )
                    }
                    .disabled(environment.isMaintainingSession)
                }

                Section("Данные") {
                    Button { confirmsHistoryClear = true } label: {
                        Label("Очистить историю прослушиваний", systemImage: "clock.arrow.circlepath")
                    }
                    LabeledContent("Сохранено в истории", value: String(history.tracks.count))
                }

                Section("О приложении") {
                    LabeledContent("Приложение", value: "Museeks")
                    LabeledContent("Версия", value: appVersion)
                    Label("Без аналитики и рекламных SDK", systemImage: "hand.raised.fill")
                        .foregroundStyle(.secondary)
                }

                Section {
                    Button("Выйти из VK", role: .destructive) { confirmsLogout = true }
                } footer: {
                    Text("При выходе токен и данные веб-сессии удаляются из Keychain.")
                }
            }
            .scrollContentBackground(.hidden)
        }
        .navigationTitle("Профиль")
        .confirmationDialog("Выйти из VK?", isPresented: $confirmsLogout) {
            Button("Выйти", role: .destructive) { environment.logout() }
        } message: {
            Text("Для нового входа потребуется снова открыть страницу VK.")
        }
        .confirmationDialog("Очистить историю?", isPresented: $confirmsHistoryClear) {
            Button("Очистить", role: .destructive) { history.clear() }
        }
    }

    private var profileHeader: some View {
        VStack(spacing: 12) {
            ArtworkView(url: sessionStore.profile?.photoURL, size: 94, cornerRadius: 47)
            Text(sessionStore.profile?.fullName ?? "Пользователь VK")
                .font(.title2.bold())
            Text("Музыка VK подключена")
                .font(.subheadline)
                .foregroundStyle(.secondary)
        }
        .frame(maxWidth: .infinity)
        .padding(.vertical, 18)
    }

    private var appVersion: String {
        let version = Bundle.main.infoDictionary?["CFBundleShortVersionString"] as? String ?? "1.0"
        let build = Bundle.main.infoDictionary?["CFBundleVersion"] as? String ?? "1"
        return "\(version) (\(build))"
    }
}
