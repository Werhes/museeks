import SwiftUI

struct ConnectView: View {
    @EnvironmentObject private var environment: AppEnvironment
    @EnvironmentObject private var sessionStore: SessionStore
    @EnvironmentObject private var settings: AppSettings
    @State private var token = ""
    @State private var userAgent = ""
    @State private var isConnecting = false
    @State private var isWebLoginPresented = false
    @State private var isQRLoginPresented = false
    @State private var showsManualImport = false
    @State private var errorMessage: String?

    var body: some View {
        ZStack {
            ThemeBackground()

            ScrollView {
                VStack(spacing: 28) {
                    Spacer(minLength: 20)
                    brandHeader
                    actionButtons
                    manualImport
                    Spacer(minLength: 24)
                }
                .frame(maxWidth: 520)
                .padding(.horizontal, 20)
                .frame(maxWidth: .infinity)
            }
        }
        .alert(
            "Не удалось подключить",
            isPresented: Binding(
                get: { errorMessage != nil },
                set: { if !$0 { errorMessage = nil } }
            )
        ) {
            Button("ОК", role: .cancel) {}
        } message: {
            Text(errorMessage ?? "")
        }
        .sheet(isPresented: $isWebLoginPresented) {
            VKWebLoginView { result in
                Task { await connectWebSession(result) }
            }
        }
        .sheet(isPresented: $isQRLoginPresented) {
            VKQRLoginView { scanned in
                handleScannedQR(scanned)
            }
        }
    }

    // MARK: - Бренд

    private var brandHeader: some View {
        VStack(spacing: 18) {
            // Иконка по центру.
            Image("AppIconPreview")
                .resizable()
                .scaledToFit()
                .frame(width: 96, height: 96)
                .clipShape(
                    RoundedRectangle(
                        cornerRadius: PremiumLayout.cardRadius,
                        style: .continuous
                    )
                )
                .shadow(color: .black.opacity(0.15), radius: 22, y: 10)

            VStack(spacing: 7) {
                Text("Welcome to Museeks")
                    .font(.system(size: 30, weight: .bold))
                    .multilineTextAlignment(.center)

                Text("Revolution in the music world")
                    .font(.headline)
                    .foregroundStyle(.secondary)
                    .multilineTextAlignment(.center)
            }
        }
    }

    // MARK: - Кнопки входа

    private var actionButtons: some View {
        VStack(spacing: 14) {
            vkLoginButton
            qrLoginButton
        }
    }

    /// Синяя кнопка (не liquid glass) — открывает обычную авторизацию VK.
    private var vkLoginButton: some View {
        Button {
            isWebLoginPresented = true
        } label: {
            HStack(spacing: 10) {
                if isConnecting {
                    ProgressView().tint(.white)
                } else {
                    Image(systemName: "person.crop.circle.badge.checkmark")
                        .font(.body.weight(.semibold))
                }
                Text(
                    L10n.text(
                        isConnecting
                            ? "Подключаем аккаунт…"
                            : "Log in with VK"
                    )
                )
                .font(.headline)
            }
            .frame(maxWidth: .infinity)
            .padding(.vertical, 15)
            .foregroundStyle(.white)
            .background(
                Color(red: 0.04, green: 0.50, blue: 1.0),
                in: RoundedRectangle(
                    cornerRadius: PremiumLayout.compactRadius,
                    style: .continuous
                )
            )
            .contentShape(
                RoundedRectangle(
                    cornerRadius: PremiumLayout.compactRadius,
                    style: .continuous
                )
            )
        }
        .buttonStyle(PremiumPressStyle())
        .disabled(isConnecting)
    }

    /// Чёрная кнопка с серым фреймом (не liquid glass) —
    /// слева от текста нарисован QR-код.
    private var qrLoginButton: some View {
        Button {
            isQRLoginPresented = true
        } label: {
            HStack(spacing: 12) {
                QRCodeGlyph()
                    .frame(width: 24, height: 24)
                    .foregroundStyle(.white)
                Text(L10n.text("Sign in with QR-Code"))
                    .font(.headline)
                Spacer(minLength: 0)
            }
            .frame(maxWidth: .infinity)
            .padding(.vertical, 15)
            .padding(.horizontal, 18)
            .foregroundStyle(.white)
            .background(
                Color.black,
                in: RoundedRectangle(
                    cornerRadius: PremiumLayout.compactRadius,
                    style: .continuous
                )
            )
            .overlay {
                RoundedRectangle(
                    cornerRadius: PremiumLayout.compactRadius,
                    style: .continuous
                )
                .stroke(
                    Color(white: 0.55),
                    lineWidth: 1
                )
            }
            .contentShape(
                RoundedRectangle(
                    cornerRadius: PremiumLayout.compactRadius,
                    style: .continuous
                )
            )
        }
        .buttonStyle(PremiumPressStyle())
    }

    // MARK: - Обработка QR-кода

    private func handleScannedQR(_ scanned: String) {
        // Содержимое QR-кода VK обычно является ссылкой на вход.
        // Здесь можно передать его в веб-вход или показать ошибку.
        // Для простоты закрываем скан и открываем обычный веб-вход,
        // если это ссылка на VK.
        isQRLoginPresented = false
        DispatchQueue.main.asyncAfter(deadline: .now() + 0.4) {
            isWebLoginPresented = true
        }
    }

    // MARK: - Ручной импорт

    private var manualImport: some View {
        DisclosureGroup(
            "Есть готовая сессия?",
            isExpanded: $showsManualImport
        ) {
            VStack(spacing: 12) {
                SecureField("VK access token", text: $token)
                    .textInputAutocapitalization(.never)
                    .autocorrectionDisabled()
                    .textContentType(.password)
                    .padding()
                    .background(
                        Color(uiColor: .tertiarySystemFill),
                        in: RoundedRectangle(
                            cornerRadius: PremiumLayout.controlRadius,
                            style: .continuous
                        )
                    )

                TextField("User-Agent из VKpyMusic", text: $userAgent)
                    .textInputAutocapitalization(.never)
                    .autocorrectionDisabled()
                    .padding()
                    .background(
                        Color(uiColor: .tertiarySystemFill),
                        in: RoundedRectangle(
                            cornerRadius: PremiumLayout.controlRadius,
                            style: .continuous
                        )
                    )

                Button {
                    Task { await connectImportedSession() }
                } label: {
                    Label(
                        "Импортировать",
                        systemImage: "square.and.arrow.down"
                    )
                    .frame(maxWidth: .infinity)
                }
                .buttonStyle(.bordered)
                .disabled(
                    isConnecting
                        || token.count < 16
                        || userAgent.count < 12
                )
            }
            .padding(.top, 14)
        }
        .font(.subheadline)
        .padding(16)
        .background(
            Color(uiColor: .secondarySystemBackground),
            in: RoundedRectangle(
                cornerRadius: PremiumLayout.compactRadius,
                style: .continuous
            )
        )
    }

    @MainActor
    private func connectImportedSession() async {
        let cleaned = token.trimmingCharacters(in: .whitespacesAndNewlines)
        let cleanedUserAgent = userAgent.trimmingCharacters(
            in: .whitespacesAndNewlines
        )
        guard cleaned.count >= 16, cleanedUserAgent.count >= 12 else {
            errorMessage = APIError.unauthorized.localizedDescription
            return
        }
        isConnecting = true
        defer { isConnecting = false }
        do {
            await environment.musicService.configure(
                userAgent: cleanedUserAgent
            )
            environment.player.configureNetwork(
                userAgent: cleanedUserAgent
            )
            let profile = try await environment.musicService.profile(
                accessToken: cleaned
            )
            try sessionStore.connect(
                accessToken: cleaned,
                userAgent: cleanedUserAgent,
                profile: profile
            )
            token = ""
            userAgent = ""
        } catch {
            errorMessage = error.localizedDescription
        }
    }

    @MainActor
    private func connectWebSession(_ result: VKWebAuthResult) async {
        isConnecting = true
        defer { isConnecting = false }
        do {
            await environment.musicService.configure(
                userAgent: result.apiUserAgent
            )
            environment.player.configureNetwork(
                userAgent: result.apiUserAgent
            )
            let profile = try await environment.musicService.profile(
                accessToken: result.accessToken
            )
            try sessionStore.updateWebSession(
                result,
                profile: profile
            )
        } catch {
            errorMessage = error.localizedDescription
        }
    }
}

/// Рисует простой QR-подобный глиф из чёрных квадратов (без ассета).
struct QRCodeGlyph: View {
    private let grid: [[Bool]] = [
        [true, true, true, false, false, true, false, true],
        [true, false, true, false, true, false, true, true],
        [true, true, true, false, false, true, true, false],
        [false, false, false, true, false, false, false, true],
        [true, false, false, false, true, true, false, false],
        [false, true, true, true, false, true, true, true],
        [true, false, true, true, false, false, true, false],
        [true, true, false, true, true, true, false, true]
    ]

    var body: some View {
        GeometryReader { proxy in
            let cell = proxy.size.width / CGFloat(grid.count)
            ZStack(alignment: .topLeading) {
                Color.clear
                ForEach(0..<grid.count, id: \.self) { row in
                    ForEach(0..<grid[row].count, id: \.self) { col in
                        if grid[row][col] {
                            Rectangle()
                                .frame(
                                    width: cell,
                                    height: cell
                                )
                                .offset(
                                    x: CGFloat(col) * cell,
                                    y: CGFloat(row) * cell
                                )
                        }
                    }
                }
            }
        }
    }
}
