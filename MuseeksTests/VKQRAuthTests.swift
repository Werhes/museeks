import XCTest
@testable import Museeks

final class VKQRAuthTests: XCTestCase {
    func testUUIDParsedFromURLQuery() throws {
        let url = "https://id.vk.ru/qr_auth?scheme=vkcom_dark&uuid=abc-123-def"
        XCTAssertEqual(try VKQRAuthService.uuid(from: url), "abc-123-def")
    }

    func testRawUUIDAcceptedWhenTokenLike() throws {
        let raw = "550e8400-e29b-41d4-a716-446655440000"
        XCTAssertEqual(try VKQRAuthService.uuid(from: raw), raw)
    }

    func testUUIDThrowsForEmpty() {
        XCTAssertThrowsError(try VKQRAuthService.uuid(from: "   "))
        XCTAssertThrowsError(try VKQRAuthService.uuid(from: "no-uuid-here"))
    }

    func testAccessTokenExtractedFromConnectResponse() throws {
        let json = """
        {"data": {"access_token": "vk1.a.long-token-value-1234567890"}}
        """.data(using: .utf8)!
        XCTAssertEqual(
            try VKQRAuthService.accessToken(from: json),
            "vk1.a.long-token-value-1234567890"
        )
    }

    func testAccessTokenRejectedWhenMissing() {
        let json = #"{"type":"error","error_info":"bad session"}"#
            .data(using: .utf8)!
        XCTAssertThrowsError(try VKQRAuthService.accessToken(from: json)) {
            error in
            guard case VKQRAuthError.rejected = error else {
                return XCTFail("Expected .rejected, got \(error)")
            }
        }
    }

    func testAccessTokenRejectedWhenTooShort() {
        let json = #"{"data":{"access_token":"short"}}"#
            .data(using: .utf8)!
        XCTAssertThrowsError(try VKQRAuthService.accessToken(from: json))
    }
}