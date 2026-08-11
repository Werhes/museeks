import Foundation

@MainActor
final class OverviewCatalogStore: ObservableObject {
    static let staleInterval: TimeInterval = 15 * 60

    @Published private(set) var shelves: [VKOverviewShelf] = []
    @Published private(set) var bannerURLs: [URL] = []
    @Published private(set) var isRefreshing = false
    @Published private(set) var lastRefreshedAt: Date?
    @Published var errorMessage: String?
    private var accountID: Int?
    private var lastAttemptedAt: Date?
    private var refreshGeneration = 0

    var isEmpty: Bool { shelves.allSatisfy(\.isEmpty) && bannerURLs.isEmpty }

    func prepare(accountID: Int?) {
        guard self.accountID != accountID else { return }
        self.accountID = accountID
        refreshGeneration += 1
        shelves = []
        bannerURLs = []
        lastRefreshedAt = nil
        lastAttemptedAt = nil
        errorMessage = nil
        isRefreshing = false
    }

    func shouldRefresh(force: Bool, now: Date = Date()) -> Bool {
        guard !isRefreshing else { return false }
        guard !force else { return true }
        guard !isEmpty,
              let freshnessDate = lastRefreshedAt ?? lastAttemptedAt else {
            return true
        }
        return now.timeIntervalSince(freshnessDate) >= Self.staleInterval
    }

    func beginRefreshing() -> Int {
        isRefreshing = true
        refreshGeneration += 1
        return refreshGeneration
    }

    func finish(
        shelves: [VKOverviewShelf]?,
        bannerURLs: [URL]?,
        errorMessage: String?,
        refreshID: Int? = nil,
        now: Date = Date()
    ) {
        guard refreshID == nil || refreshID == refreshGeneration else {
            return
        }
        if let shelves { self.shelves = shelves }
        if let bannerURLs { self.bannerURLs = bannerURLs }
        self.errorMessage = errorMessage
        lastAttemptedAt = now
        if errorMessage == nil {
            lastRefreshedAt = now
        }
        isRefreshing = false
    }

    func cancelRefreshing(refreshID: Int? = nil) {
        guard refreshID == nil || refreshID == refreshGeneration else {
            return
        }
        isRefreshing = false
    }
}