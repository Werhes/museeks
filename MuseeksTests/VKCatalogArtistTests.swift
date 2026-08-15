import XCTest
@testable import Museeks

final class VKCatalogArtistTests: XCTestCase {
    func testAlbumUnfollowUsesDeletePlaylistNotUnknownMethod() {
        XCTAssertEqual(
            AlbumFollowPolicy.methodPath(follow: true),
            "/method/audio.followPlaylist"
        )
        XCTAssertEqual(
            AlbumFollowPolicy.methodPath(follow: false),
            "/method/audio.deletePlaylist"
        )
        XCTAssertFalse(
            AlbumFollowPolicy.methodPath(follow: false)
                .contains("unfollowPlaylist")
        )
    }

    func testMixQueuePolicyStopsWastefulTenPageFanOut() {
        XCTAssertEqual(MixTrackRequestPolicy.pageCount, 4)
        XCTAssertEqual(MixTrackRequestPolicy.bootstrapPages, 1)
        XCTAssertEqual(MixTrackRequestPolicy.queueLimit, 80)
        XCTAssertLessThan(MixTrackRequestPolicy.pageCount, 10)
        XCTAssertGreaterThan(MixTrackRequestPolicy.queueLimit, 30)
        XCTAssertLessThan(
            MixTrackRequestPolicy.bootstrapPages,
            MixTrackRequestPolicy.pageCount
        )
    }

    func testContinuationPrefetchWaitsUntilQueueIsNearEnd() {
        XCTAssertFalse(
            ContinuationPrefetchPolicy.shouldPrefetch(
                currentIndex: 0,
                queueCount: 40
            )
        )
        XCTAssertTrue(
            ContinuationPrefetchPolicy.shouldPrefetch(
                currentIndex: 35,
                queueCount: 40
            )
        )
        XCTAssertTrue(
            ContinuationPrefetchPolicy.shouldPrefetch(
                currentIndex: 0,
                queueCount: 3
            )
        )
    }

    func testCatalogSectionDetectionUsesTitlesAndUrls() {
        let mix = CatalogSectionRef(
            id: "sec-mix",
            title: "Ваши миксы",
            url: "https://vk.com/audios0?section=mixes"
        )
        let mood = CatalogSectionRef(
            id: "sec-mood",
            title: "Настроение",
            url: "https://vk.com/audios0?section=moods"
        )
        let releases = CatalogSectionRef(
            id: "sec-new",
            title: "Новые релизы",
            url: "https://vk.com/audios0?section=new_albums"
        )
        let other = CatalogSectionRef(
            id: "sec-other",
            title: "Подкасты",
            url: "https://vk.com/audios0?section=podcasts"
        )
        let userAlbums = CatalogSectionRef(
            id: "sec-library-albums",
            title: "Мои альбомы",
            url: "https://vk.com/audios0?section=albums"
        )

        XCTAssertTrue(CatalogSectionPolicy.looksLikeMixSection(mix))
        XCTAssertTrue(CatalogSectionPolicy.looksLikeMixSection(mood))
        XCTAssertTrue(CatalogSectionPolicy.looksLikeReleasesSection(releases))
        XCTAssertFalse(CatalogSectionPolicy.looksLikeMixSection(other))
        XCTAssertFalse(CatalogSectionPolicy.looksLikeReleasesSection(other))
        XCTAssertFalse(
            CatalogSectionPolicy.looksLikeReleasesSection(userAlbums)
        )
    }

    func testMusicMixKeepsOfficialSectionTitle() {
        let mix = MusicMix(
            id: "m1",
            title: "Вечер",
            subtitle: "Спокойное",
            artworkURL: nil
        ).withSectionTitle("Настроение")
        XCTAssertEqual(mix.sectionTitle, "Настроение")
    }

    func testCatalogSectionsParsedFromGetAudioShape() throws {
        let data = """
        {
          "catalog": {
            "default_section": "sec-home",
            "sections": [
              {
                "id": "sec-mix",
                "title": "Миксы",
                "url": "https://vk.com/audios1?section=mixes"
              },
              {
                "id": "sec-new",
                "title": "Новые релизы",
                "url": "https://vk.com/audios1?section=new"
              }
            ]
          },
          "audios": [],
          "playlists": []
        }
        """.data(using: .utf8)!

        let value = try JSONDecoder().decode(JSONValue.self, from: data)
        let sections = value.catalogSections

        XCTAssertEqual(sections.map(\.id), ["sec-mix", "sec-new"])
        XCTAssertTrue(
            sections.contains { CatalogSectionPolicy.looksLikeMixSection($0) }
        )
        XCTAssertTrue(
            sections.contains {
                CatalogSectionPolicy.looksLikeReleasesSection($0)
            }
        )
    }

    func testArtistSearchItemsDecodedFromVKPayload() throws {
        let data = """
        {
          "count": 2,
          "items": [
            {
              "id": "1204512717686522332",
              "name": "Daft Punk",
              "photo": [{"url": "https://cdn.example/a.jpg"}]
            },
            {
              "id": "other",
              "name": "Daft Punk Experience"
            }
          ]
        }
        """.data(using: .utf8)!

        let value = try JSONDecoder().decode(JSONValue.self, from: data)
        let artists = value.artists
        let best = VKArtistMatch.best(in: artists, named: "Daft Punk")

        XCTAssertEqual(best?.id, "1204512717686522332")
        XCTAssertEqual(best?.name, "Daft Punk")
    }

    func testExactArtistMatchOutranksPrefixNoise() {
        let exact = VKArtist(id: "1", name: "Queen")
        let longer = VKArtist(id: "2", name: "Queen Latifah")
        let best = VKArtistMatch.best(
            in: [longer, exact],
            named: "Queen"
        )
        XCTAssertEqual(best?.id, "1")
    }

    func testPlaylistDecodesNestedThumbArtwork() throws {
        let data = """
        {
          "id": 9,
          "owner_id": 1,
          "title": "Favourites",
          "count": 3,
          "thumb": {
            "photo_600": "https://cdn.example/p600.jpg",
            "photo_300": "https://cdn.example/p300.jpg"
          }
        }
        """.data(using: .utf8)!

        let playlist = try JSONDecoder().decode(Playlist.self, from: data)
        XCTAssertEqual(
            playlist.artworkURL?.absoluteString,
            "https://cdn.example/p600.jpg"
        )
    }

    func testLibraryArtistsExtractedFromAudioGetShape() throws {
        let data = """
        {
          "count": 3,
          "items": [
            {
              "id": 1,
              "owner_id": 1,
              "artist": "Rare Monk",
              "title": "Track A",
              "main_artists": [
                {"name": "Rare Monk", "domain": "art-rare", "id": "4373853950134918274"}
              ]
            },
            {
              "id": 2,
              "owner_id": 1,
              "artist": "Virtuals",
              "title": "Track B",
              "main_artists": [
                {"name": "Virtuals", "domain": "art-virt", "id": "5854002937811188266"}
              ]
            },
            {
              "id": 3,
              "owner_id": 1,
              "artist": "Rare Monk",
              "title": "Track C",
              "main_artists": [
                {"name": "Rare Monk", "domain": "art-rare", "id": "4373853950134918274"}
              ]
            }
          ]
        }
        """.data(using: .utf8)!

        let value = try JSONDecoder().decode(JSONValue.self, from: data)
        let artists = value.libraryArtists

        XCTAssertEqual(artists.count, 2)
        XCTAssertEqual(
            artists.map(\.id).sorted(),
            ["4373853950134918274", "5854002937811188266"].sorted()
        )
        XCTAssertTrue(
            artists.contains { $0.name == "Rare Monk" && $0.photoURL == nil }
        )
        XCTAssertTrue(
            artists.contains { $0.name == "Virtuals" }
        )
    }

    func testArtistMixPolicyBoundsAreSane() {
        XCTAssertGreaterThan(ArtistMixPolicy.maximumCards, 0)
        XCTAssertLessThanOrEqual(ArtistMixPolicy.maximumCards, 20)
        XCTAssertGreaterThan(ArtistMixPolicy.searchCandidates, 0)
        XCTAssertGreaterThan(ArtistMixPolicy.libraryPageSize, 0)
    }
}
