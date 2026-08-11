import SwiftUI

struct ConnectView: View {
    @EnvironmentObject private var environment: AppEnvironment
    @State private var showsLogin = false

    var body: some View {
        ZStack {
            AppBackground()
            ScrollView {
                VStack(spacing: 28) {
                    Spacer(minLength: 50)
                    icon
                    VStack(spacing: 9) {
                        Text("Museeks")
                            .font(.system(size: 42, weight: .bold, design: .rounded))
                        Text("Ваша музыка VK — в нативном плеере для iPhone")
                            .font(.title3)
                            .foregroundStyle(.secondary)
                            .multilineTextAlignment(.center)
                    }
                    benefits
                    PrimaryActionButton(
                        title: "Продолжить с VK",
                        systemImage: "person.crop.circle.badge.checkmark"
                    ) { showsLogin = true }
                    privacy
                    Spacer(minLength: 30)
                }
                .padding(.horizontal, 22)
            }
        }
        .sheet(isPresented: $showsLogin) { VKWebLoginView() }
    }

    private var icon: some View {
        Image("AppIconPreview")
            .resizable()
            .scaledToFit()
            .frame(width: 126, height: 126)
            .clipShape(RoundedRectangle(cornerRadius: 29, style: .continuous))
            .shadow(color: MuseeksPalette.accent.opacity(0.35), radius: 28, y: 12)
            .accessibilityHidden(true)
    }

    private var benefits: some View {
        VStack(alignment: .leading, spacing: 15) {
            benefit("sparkles", "Персональные рекомендации и миксы")
            benefit("magnifyingglass", "Поиск по музыке VK")
            benefit("waveform", "Фоновое воспроизведение и AirPlay")
            benefit("lock.shield", "Токен хранится только в Keychain")
        }
        .frame(maxWidth: .infinity, alignment: .leading)
        .padding(20)
        .museeksGlass(
            in: RoundedRectangle(cornerRadius: 24, style: .continuous)
        )
    }

    private func benefit(_ icon: String, _ text: String) -> some View {
        Label(text, systemImage: icon)
            .font(.subheadline.weight(.medium))
            .foregroundStyle(.primary)
    }

    private var privacy: some View {
        Label {
            Text("Museeks не видит и не сохраняет пароль или код подтверждения. Вход выполняется на странице VK.")
        } icon: {
            Image(systemName: "checkmark.shield.fill").foregroundStyle(.green)
        }
        .font(.caption)
        .foregroundStyle(.secondary)
    }
}

