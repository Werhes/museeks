import XCTest
@testable import Museeks

final class JSONValueTests: XCTestCase {
    func testJSONValueRoundTrip() throws {
        let source = #"{"section":{"id":"mixes","items":[1,true,null,"value"]}}"#.data(using: .utf8)!
        let decoded = try JSONDecoder().decode(JSONValue.self, from: source)
        let encoded = try JSONEncoder().encode(decoded)
        let restored = try JSONDecoder().decode(JSONValue.self, from: encoded)

        guard case let .object(root) = restored,
              case let .object(section)? = root["section"] else {
            return XCTFail("Object shape was not preserved")
        }
        XCTAssertEqual(section["id"]?.string, "mixes")
        XCTAssertEqual(section["items"]?.array?.count, 4)
    }
}

