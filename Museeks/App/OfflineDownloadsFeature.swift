import Foundation

/// Central switch for offline downloads, automatic caching and playlist
/// packaging. Museeks ships with the complete download flow enabled.
enum OfflineDownloadsFeature {
    private static let productionEnabled = true

    /// Test seam for verifying both enabled and disabled presentation states.
    static var testingOverride: Bool?

    static var isEnabled: Bool {
        testingOverride ?? productionEnabled
    }

    static var showsControls: Bool { isEnabled }
}
