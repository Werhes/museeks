import Foundation

struct AppConfiguration: Sendable {
    let apiBaseURL = URL(string: "https://api.vk.ru")!
    let webLoginURL = URL(string: "https://vk.ru/")!
    let webTokenURL = URL(string: "https://login.vk.ru/?act=web_token")!
    let webClientID = "6287487"
    let apiVersion = "5.199"

    // Audio methods require a mobile-compatible VK API identity.
    let apiUserAgent = "KateMobileAndroid/56 lite-460 (Android 4.4.2; SDK 19; x86; ru)"
    let webUserAgent = "Mozilla/5.0 (iPhone; CPU iPhone OS 18_0 like Mac OS X) AppleWebKit/605.1.15 Mobile/15E148 Safari/604.1"

    static let current = AppConfiguration()
}

