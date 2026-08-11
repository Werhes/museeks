import SwiftUI
import WebKit

struct VKWebLoginView: View {
    @Environment(\.dismiss) private var dismiss
    @EnvironmentObject private var environment: AppEnvironment
    @State private var cookieHeader = ""
    @State private var canContinue = false
    @State private var isConnecting = false
    @State private var errorMessage: String?

    var body: some View {
        NavigationStack {
            VKLoginWebView(cookieHeader: $cookieHeader, canContinue: $canContinue)
                .ignoresSafeArea(edges: .bottom)
                .safeAreaInset(edge: .bottom, spacing: 0) {
                    VStack(spacing: 8) {
                        PrimaryActionButton(
                            title: canContinue ? "Подключить Museeks" : "Завершите вход в VK",
                            systemImage: "checkmark.circle.fill",
                            isLoading: isConnecting
                        ) { Task { await connect() } }
                        .disabled(!canContinue || isConnecting)
                        Text("Пароль и коды остаются внутри защищённой страницы VK.")
                            .font(.caption2)
                            .foregroundStyle(.secondary)
                    }
                    .padding(.horizontal, 16)
                    .padding(.top, 10)
                    .padding(.bottom, 8)
                    .background(.bar)
                }
                .navigationTitle("Вход в VK")
                .navigationBarTitleDisplayMode(.inline)
                .toolbar {
                    ToolbarItem(placement: .topBarLeading) {
                        Button("Отмена") { dismiss() }
                    }
                }
        }
        .interactiveDismissDisabled(isConnecting)
        .alert("Не удалось войти", isPresented: Binding(
            get: { errorMessage != nil },
            set: { if !$0 { errorMessage = nil } }
        )) {
            Button("ОК", role: .cancel) {}
        } message: {
            Text(errorMessage ?? "")
        }
    }

    @MainActor
    private func connect() async {
        guard canContinue else { return }
        isConnecting = true
        defer { isConnecting = false }
        do {
            let result = try await environment.authService.exchange(
                cookieHeader: cookieHeader,
                webUserAgent: environment.configuration.webUserAgent
            )
            try await environment.completeAuthentication(result)
            dismiss()
        } catch {
            errorMessage = error.localizedDescription
        }
    }
}

private struct VKLoginWebView: UIViewRepresentable {
    @Binding var cookieHeader: String
    @Binding var canContinue: Bool

    func makeCoordinator() -> Coordinator { Coordinator(parent: self) }

    func makeUIView(context: Context) -> WKWebView {
        let configuration = WKWebViewConfiguration()
        configuration.websiteDataStore = .nonPersistent()
        configuration.defaultWebpagePreferences.allowsContentJavaScript = true
        let webView = WKWebView(frame: .zero, configuration: configuration)
        webView.navigationDelegate = context.coordinator
        webView.customUserAgent = AppConfiguration.current.webUserAgent
        webView.allowsBackForwardNavigationGestures = true
        context.coordinator.startMonitoring(webView)
        webView.load(URLRequest(url: AppConfiguration.current.webLoginURL))
        return webView
    }

    func updateUIView(_ webView: WKWebView, context: Context) {}

    final class Coordinator: NSObject, WKNavigationDelegate {
        private var parent: VKLoginWebView
        private weak var webView: WKWebView?
        private var timer: Timer?

        init(parent: VKLoginWebView) { self.parent = parent }

        deinit { timer?.invalidate() }

        func startMonitoring(_ webView: WKWebView) {
            self.webView = webView
            timer = Timer.scheduledTimer(withTimeInterval: 1, repeats: true) { [weak self] _ in
                guard let self, let webView = self.webView else { return }
                self.readCookies(from: webView)
            }
        }

        func webView(_ webView: WKWebView, didFinish navigation: WKNavigation?) {
            readCookies(from: webView)
        }

        func webView(
            _ webView: WKWebView,
            decidePolicyFor navigationAction: WKNavigationAction,
            decisionHandler: @escaping (WKNavigationActionPolicy) -> Void
        ) {
            guard let url = navigationAction.request.url else {
                decisionHandler(.cancel)
                return
            }
            // VK can use third-party HTTPS pages for a CAPTCHA or a passkey.
            // The web view remains isolated; only VK-domain cookies are read.
            let allowed = url.scheme == "https" || url.scheme == "about"
            decisionHandler(allowed ? .allow : .cancel)
        }

        private func readCookies(from webView: WKWebView) {
            webView.configuration.websiteDataStore.httpCookieStore.getAllCookies { [weak self] cookies in
                let relevant = cookies.filter {
                    $0.domain.hasSuffix("vk.ru") || $0.domain.hasSuffix("vk.com")
                }
                let header = relevant
                    .sorted { $0.name < $1.name }
                    .map { "\($0.name)=\($0.value)" }
                    .joined(separator: "; ")
                let sessionNames = Set(["remixsid", "remixsid6", "remixstid"])
                let ready = relevant.contains { sessionNames.contains($0.name.lowercased()) }
                DispatchQueue.main.async {
                    self?.parent.cookieHeader = header
                    self?.parent.canContinue = ready
                }
            }
        }
    }
}
