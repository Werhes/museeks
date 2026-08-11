import XCTest
@testable import Museeks

final class VKMixContractTests: XCTestCase {
    func testSettingsDecodeServerCategoriesAndPictureIcons() throws {
        let data = """
        {
          "title": "Настройте микс",
          "subtitle": "Выберите звучание",
          "mix_categories": [
            {
              "id": "mood",
              "title": "Настроение",
              "type": "pictured_button_horizontal_group",
              "options": [
                {
                  "id": "calm",
                  "title": "Спокойное",
                  "icon": "https://cdn.example/mood.json",
                  "selected": true
                }
              ]
            },
            {
              "id": "language",
              "title": "Язык",
              "type": "button_horizontal_group",
              "options": [
                {"id": "ru", "title": "Русский", "selected": false}
              ]
            }
          ]
        }
        """.data(using: .utf8)!

        let settings = try JSONDecoder().decode(VKMixSettings.self, from: data)

        XCTAssertEqual(settings.categories.map(\.id), ["mood", "language"])
        XCTAssertTrue(settings.categories[0].usesPictures)
        XCTAssertEqual(
            settings.categories[0].options[0].iconURL?.host,
            "cdn.example"
        )
        XCTAssertTrue(
            settings.defaultSelection.contains(
                categoryID: "mood",
                optionID: "calm"
            )
        )
    }

    func testSelectionSerializesAsVKOptionsObject() throws {
        let selection = VKMixSelection(
            valuesByCategory: [
                "mood": ["calm", "energy", "calm"],
                "language": ["ru"]
            ]
        )
        let json = try XCTUnwrap(selection.jsonString)
        let data = try XCTUnwrap(json.data(using: .utf8))
        let object = try XCTUnwrap(
            JSONSerialization.jsonObject(with: data) as? [String: [String]]
        )

        XCTAssertEqual(object["mood"], ["calm", "energy"])
        XCTAssertEqual(object["language"], ["ru"])
    }

    func testTrackRequestUsesNativeMixParameters() throws {
        let mix = MusicMix(
            id: "common",
            title: "VK Mix",
            subtitle: "For you",
            artworkURL: nil,
            entityID: "entity-7",
            reference: "catalog_home",
            promptEvents: "play,skip",
            selection: VKMixSelection(
                valuesByCategory: ["mood": ["calm"]]
            )
        )

        let parameters = VKMixRequestParameters.tracks(
            for: mix,
            append: true,
            count: 50
        )

        XCTAssertEqual(parameters["mix_id"], "common")
        XCTAssertEqual(parameters["append"], "1")
        XCTAssertEqual(parameters["count"], "50")
        XCTAssertEqual(parameters["entity_id"], "entity-7")
        XCTAssertEqual(parameters["ref"], "catalog_home")
        XCTAssertEqual(parameters["prompt_events"], "play,skip")
        XCTAssertNotNil(parameters["options"])
        XCTAssertNil(parameters["offset"])
    }

    func testCatalogStreamMixKeepsRequestContext() throws {
        let data = """
        {
          "id": "discover",
          "data_type": "audio_stream_mix",
          "stream_mix": {"title": "Открытия"},
          "description": "Новое для вас",
          "entity_id": "42",
          "ref": "catalog_home",
          "prompt_events": ["play", "skip"],
          "background_animation_url": "https://cdn.example/background.json",
          "is_tunable": true,
          "mix_options": "{\\"language\\":[\\"ru\\"]}"
        }
        """.data(using: .utf8)!

        let value = try JSONDecoder().decode(JSONValue.self, from: data)
        let mix = try XCTUnwrap(value.musicMixes.first)

        XCTAssertEqual(mix.id, "discover")
        XCTAssertEqual(mix.title, "Открытия")
        XCTAssertEqual(mix.entityID, "42")
        XCTAssertEqual(mix.reference, "catalog_home")
        XCTAssertEqual(mix.promptEvents, "play,skip")
        XCTAssertTrue(mix.isTunable)
        XCTAssertTrue(
            mix.selection.contains(categoryID: "language", optionID: "ru")
        )
    }

    func testCatalogBlockUsesReferencedMixIDsInsteadOfBlockID() throws {
        let data = """
        {
          "id": "algorithm_block",
          "data_type": "audio_stream_mixes",
          "layout": {"title": "Собрано алгоритмами"},
          "audio_stream_mixes_ids": ["discover", "new_music"]
        }
        """.data(using: .utf8)!

        let value = try JSONDecoder().decode(JSONValue.self, from: data)
        let mixes = value.musicMixes

        XCTAssertEqual(mixes.map(\.id), ["discover", "new_music"])
        XCTAssertFalse(mixes.contains { $0.id == "algorithm_block" })
        XCTAssertEqual(mixes.first?.sectionTitle, "Собрано алгоритмами")
    }
}

final class AlgorithmicMixPolicyTests: XCTestCase {
    func testCreatesDiscoveryNewMusicAndThirdCardsFromVKMixes() {
        let cards = AlgorithmicMixPolicy.cards(
            from: [
                MusicMix.common,
                makeMix(id: "new_music", title: "Новинки", subtitle: "slowme, GOTHBOY и другие"),
                makeMix(id: "daily", title: "На повторе", subtitle: "Любимые треки"),
                makeMix(id: "discover", title: "Открытия", subtitle: "Новое для вас")
            ]
        )

        XCTAssertEqual(cards.count, 3)
        XCTAssertEqual(cards[0].kind, .discovery)
        XCTAssertEqual(cards[0].mix.id, "discover")
        XCTAssertEqual(cards[1].kind, .newMusic)
        XCTAssertEqual(cards[1].subtitle, "slowme, GOTHBOY и другие")
        XCTAssertEqual(cards[2].mix.id, "daily")
    }

    func testDoesNotInventAlgorithmicCardsWithoutVKData() {
        XCTAssertTrue(AlgorithmicMixPolicy.cards(from: [.common]).isEmpty)
    }

    private func makeMix(
        id: String,
        title: String,
        subtitle: String
    ) -> MusicMix {
        MusicMix(
            id: id,
            title: title,
            subtitle: subtitle,
            artworkURL: nil
        )
    }
}
