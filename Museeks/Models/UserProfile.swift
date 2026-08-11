import Foundation

struct UserProfile: Codable, Identifiable, Hashable, Sendable {
    let id: Int
    let firstName: String
    let lastName: String
    let photoURL: URL?

    var fullName: String {
        [firstName, lastName].filter { !$0.isEmpty }.joined(separator: " ")
    }

    enum CodingKeys: String, CodingKey {
        case id
        case firstName = "first_name"
        case lastName = "last_name"
        case photoURL = "photo_200"
    }
}

