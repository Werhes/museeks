import Combine
import Foundation

@MainActor
final class SessionStore: ObservableObject {
    @Published private(set) var session: VKSession?
    @Published private(set) var profile: UserProfile?
    @Published private(set) var revision = 0
    @Published var errorMessage: String?

    private let keychain: KeychainStore
    private let sessionAccount = "vk-session-v1"
    private let profileAccount = "vk-profile-v1"

    init(keychain: KeychainStore = KeychainStore()) {
        self.keychain = keychain
        do {
            session = try keychain.load(VKSession.self, account: sessionAccount)
            profile = try keychain.load(UserProfile.self, account: profileAccount)
        } catch {
            errorMessage = error.localizedDescription
        }
    }

    func save(session: VKSession, profile: UserProfile) throws {
        try keychain.save(session, account: sessionAccount)
        try keychain.save(profile, account: profileAccount)
        self.session = session
        self.profile = profile
        revision &+= 1
        errorMessage = nil
    }

    func replaceSession(_ session: VKSession) throws {
        try keychain.save(session, account: sessionAccount)
        self.session = session
        revision &+= 1
        errorMessage = nil
    }

    func updateProfile(_ profile: UserProfile) {
        try? keychain.save(profile, account: profileAccount)
        self.profile = profile
    }

    func logout() {
        do {
            try keychain.delete(account: sessionAccount)
            try keychain.delete(account: profileAccount)
            errorMessage = nil
        } catch {
            errorMessage = error.localizedDescription
        }
        session = nil
        profile = nil
        revision &+= 1
    }
}
