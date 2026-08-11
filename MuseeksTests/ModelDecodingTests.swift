import XCTest
@testable import Museeks

final class ModelDecodingTests: XCTestCase {
    func testTrackDecodesVKPayload() throws {
        let json = #"""
        {
          "id": 42,
          "owner_id": 7,
          "title": "Night Drive",
          "artist": "Museeks",
          "duration": 185,
          "url": "https://example.com/audio.m3u8",
          "lyrics_id": 99,
          "access_key": "key",
          "is_explicit": 1,
          "album": {
            "title": "Signals",
            "thumb": { "photo_600": "https://example.com/cover.jpg" }
          }
        }
        """#.data(using: .utf8)!

        let track = try JSONDecoder().decode(Track.self, from: json)

        XCTAssertEqual(track.id, "7_42")
        XCTAssertEqual(track.apiIdentifier, "7_42_key")
        XCTAssertEqual(track.title, "Night Drive")
        XCTAssertEqual(track.artist, "Museeks")
        XCTAssertEqual(track.duration, 185)
        XCTAssertEqual(track.albumTitle, "Signals")
        XCTAssertEqual(track.lyricsID, 99)
        XCTAssertTrue(track.isExplicit)
        XCTAssertEqual(track.artworkURL?.absoluteString, "https://example.com/cover.jpg")
    }

    func testTrackRoundTripKeepsPlaybackFields() throws {
        let source = Track(
            audioID: 2,
            ownerID: -3,
            title: "Title",
            artist: "Artist",
            duration: 123,
            streamURL: URL(string: "https://example.com/file.mp3"),
            artworkURL: URL(string: "https://example.com/art.jpg"),
            albumTitle: "Album",
            lyricsID: 8,
            accessKey: "secret-key",
            isExplicit: false
        )

        let restored = try JSONDecoder().decode(Track.self, from: JSONEncoder().encode(source))
        XCTAssertEqual(restored, source)
        XCTAssertNil(source.metadataOnly.streamURL)
        XCTAssertEqual(source.metadataOnly.id, source.id)
    }

    func testPlaylistDecodesArtworkFallback() throws {
        let json = #"""
        {
          "id": 10,
          "owner_id": 20,
          "title": "Road Trip",
          "description": "Long roads",
          "count": 14,
          "photo_600": "https://example.com/playlist.jpg",
          "access_key": "playlist-key"
        }
        """#.data(using: .utf8)!

        let playlist = try JSONDecoder().decode(Playlist.self, from: json)
        XCTAssertEqual(playlist.id, "20_10")
        XCTAssertEqual(playlist.count, 14)
        XCTAssertEqual(playlist.artworkURL?.absoluteString, "https://example.com/playlist.jpg")
    }

    func testSessionRefreshPolicy() {
        let fresh = VKSession(
            accessToken: String(repeating: "x", count: 32),
            userID: 1,
            expiresAt: Date().addingTimeInterval(3600),
            cookieHeader: "remixsid=value",
            webUserAgent: "agent",
            apiUserAgent: "api-agent"
        )
        let expiring = VKSession(
            accessToken: fresh.accessToken,
            userID: 1,
            expiresAt: Date().addingTimeInterval(60),
            cookieHeader: fresh.cookieHeader,
            webUserAgent: fresh.webUserAgent,
            apiUserAgent: fresh.apiUserAgent
        )

        XCTAssertFalse(fresh.shouldRefresh)
        XCTAssertTrue(expiring.shouldRefresh)
        XCTAssertFalse(expiring.isExpired)
    }

    func testArtistAcceptsNumericIdentifier() throws {
        let json = #"{"id":123,"name":"Artist","photo_300":"https://example.com/artist.jpg"}"#
            .data(using: .utf8)!
        let artist = try JSONDecoder().decode(Artist.self, from: json)
        XCTAssertEqual(artist.id, "123")
        XCTAssertEqual(artist.name, "Artist")
        XCTAssertEqual(artist.artworkURL?.absoluteString, "https://example.com/artist.jpg")
    }
}
