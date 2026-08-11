import Foundation

struct VKMixSelection: Codable, Hashable, Sendable {
    let valuesByCategory: [String: [String]]

    init(valuesByCategory: [String: [String]] = [:]) {
        self.valuesByCategory = valuesByCategory.reduce(into: [:]) {
            result, entry in
            let key = entry.key.trimmingCharacters(in: .whitespacesAndNewlines)
            let values = Array(
                Set(
                    entry.value
                        .map { $0.trimmingCharacters(in: .whitespacesAndNewlines) }
                        .filter { !$0.isEmpty }
                )
            ).sorted()
            if !key.isEmpty, !values.isEmpty {
                result[key] = values
            }
        }
    }

    var isEmpty: Bool { valuesByCategory.isEmpty }

    var jsonString: String? {
        guard !isEmpty,
              JSONSerialization.isValidJSONObject(valuesByCategory),
              let data = try? JSONSerialization.data(
                withJSONObject: valuesByCategory,
                options: [.sortedKeys]
              ) else {
            return nil
        }
        return String(data: data, encoding: .utf8)
    }

    func contains(categoryID: String, optionID: String) -> Bool {
        valuesByCategory[categoryID]?.contains(optionID) == true
    }

    func toggling(categoryID: String, optionID: String) -> VKMixSelection {
        var values = valuesByCategory
        var selected = values[categoryID] ?? []
        if let index = selected.firstIndex(of: optionID) {
            selected.remove(at: index)
        } else {
            selected.append(optionID)
        }
        if selected.isEmpty {
            values.removeValue(forKey: categoryID)
        } else {
            values[categoryID] = selected
        }
        return VKMixSelection(valuesByCategory: values)
    }

    static func == (lhs: VKMixSelection, rhs: VKMixSelection) -> Bool {
        lhs.valuesByCategory == rhs.valuesByCategory
    }

    func hash(into hasher: inout Hasher) {
        for key in valuesByCategory.keys.sorted() {
            hasher.combine(key)
            for value in valuesByCategory[key, default: []].sorted() {
                hasher.combine(value)
            }
        }
    }
}

enum VKMixSelectionStorage {
    private static let keyPrefix = "vk.mix.selection.v1."

    static func load(mixID: String, defaults: UserDefaults = .standard) -> VKMixSelection? {
        guard let data = defaults.data(forKey: keyPrefix + mixID) else {
            return nil
        }
        return try? JSONDecoder().decode(VKMixSelection.self, from: data)
    }

    static func save(
        _ selection: VKMixSelection,
        mixID: String,
        defaults: UserDefaults = .standard
    ) {
        guard let data = try? JSONEncoder().encode(selection) else { return }
        defaults.set(data, forKey: keyPrefix + mixID)
    }

    static func reset(mixID: String, defaults: UserDefaults = .standard) {
        defaults.removeObject(forKey: keyPrefix + mixID)
    }
}

enum VKMixRequestParameters {
    static func settings(for mix: MusicMix) -> [String: String] {
        ["mix_id": mix.id]
    }

    static func tracks(
        for mix: MusicMix,
        append: Bool,
        count: Int
    ) -> [String: String] {
        var parameters = [
            "mix_id": mix.id,
            "append": append ? "1" : "0",
            "count": String(max(count, 1))
        ]
        if let options = mix.selection.jsonString {
            parameters["options"] = options
        }
        if let entityID = mix.entityID, !entityID.isEmpty {
            parameters["entity_id"] = entityID
        }
        if let promptEvents = mix.promptEvents, !promptEvents.isEmpty {
            parameters["prompt_events"] = promptEvents
        }
        if let reference = mix.reference, !reference.isEmpty {
            parameters["ref"] = reference
        }
        return parameters
    }
}

struct VKMixSettingOption: Decodable, Hashable, Identifiable, Sendable {
    let id: String
    let title: String
    let iconURL: URL?
    let isSelected: Bool

    enum CodingKeys: String, CodingKey {
        case id
        case title
        case icon
        case selected
    }

    init(from decoder: Decoder) throws {
        let container = try decoder.container(keyedBy: CodingKeys.self)
        id = try container.decodeIfPresent(String.self, forKey: .id) ?? ""
        title = try container.decodeIfPresent(String.self, forKey: .title) ?? id
        iconURL = try container.decodeIfPresent(String.self, forKey: .icon)
            .flatMap(URL.secureRemoteURL)
        if let value = try? container.decode(Bool.self, forKey: .selected) {
            isSelected = value
        } else if let value = try? container.decode(Int.self, forKey: .selected) {
            isSelected = value != 0
        } else if let value = try? container.decode(String.self, forKey: .selected) {
            isSelected = ["1", "true", "yes"].contains(value.lowercased())
        } else {
            isSelected = false
        }
    }
}

struct VKMixSettingCategory: Decodable, Hashable, Identifiable, Sendable {
    let id: String
    let title: String
    let type: String
    let options: [VKMixSettingOption]

    enum CodingKeys: String, CodingKey {
        case id
        case title
        case type
        case options
    }

    init(from decoder: Decoder) throws {
        let container = try decoder.container(keyedBy: CodingKeys.self)
        id = try container.decodeIfPresent(String.self, forKey: .id) ?? ""
        title = try container.decodeIfPresent(String.self, forKey: .title) ?? id
        type = try container.decodeIfPresent(String.self, forKey: .type) ?? ""
        let decodedOptions = try container.decodeIfPresent(
            [VKMixSettingOption].self,
            forKey: .options
        ) ?? []
        options = decodedOptions.filter { !$0.id.isEmpty }
    }

    var usesPictures: Bool {
        type.localizedCaseInsensitiveContains("pictured")
            || options.contains { $0.iconURL != nil }
    }
}

struct VKMixSettings: Decodable, Hashable, Sendable {
    let title: String
    let subtitle: String
    let categories: [VKMixSettingCategory]

    enum CodingKeys: String, CodingKey {
        case title
        case subtitle
        case categories = "mix_categories"
    }

    init(from decoder: Decoder) throws {
        let container = try decoder.container(keyedBy: CodingKeys.self)
        title = try container.decodeIfPresent(String.self, forKey: .title) ?? ""
        subtitle = try container.decodeIfPresent(
            String.self,
            forKey: .subtitle
        ) ?? ""
        let decodedCategories = try container.decodeIfPresent(
            [VKMixSettingCategory].self,
            forKey: .categories
        ) ?? []
        categories = decodedCategories.filter { !$0.id.isEmpty }
    }

    var defaultSelection: VKMixSelection {
        let values = categories.reduce(into: [String: [String]]()) {
            result, category in
            let selected = category.options.filter(\.isSelected).map(\.id)
            if !category.id.isEmpty, !selected.isEmpty {
                result[category.id, default: []].append(contentsOf: selected)
            }
        }
        return VKMixSelection(
            valuesByCategory: values
        )
    }
}

struct MixCurator: Hashable, Sendable, Codable {
    let id: String
    let displayName: String
    let photoURL: URL?

    var isUsable: Bool {
        !displayName.trimmingCharacters(in: .whitespacesAndNewlines).isEmpty
    }
}

struct MusicMix: Hashable, Identifiable, Sendable {
    let id: String
    let title: String
    let subtitle: String
    let artworkURL: URL?
    /// Taste-match percentage when VK exposes one (friend / listen-together mixes).
    let matchPercent: Int?
    /// Social / friend taste mixes shown under «Слушайте друг друга».
    let isSocial: Bool
    /// Official catalog section title when the mix came from `catalog.getSection`.
    let sectionTitle: String?
    /// Friend / curator identity when VK exposes one on social mixes.
    let curator: MixCurator?
    /// Optional catalog entity used by artist and button-backed mixes.
    let entityID: String?
    /// VK catalog attribution forwarded back when requesting the stream.
    let reference: String?
    let promptEvents: String?
    /// Options supplied by catalog buttons or selected in Mix settings.
    let selection: VKMixSelection
    /// Animation provided by VK for the hero background when available.
    let backgroundAnimationURL: URL?
    let isTunable: Bool

    init(
        id: String,
        title: String,
        subtitle: String,
        artworkURL: URL?,
        matchPercent: Int? = nil,
        isSocial: Bool = false,
        sectionTitle: String? = nil,
        curator: MixCurator? = nil,
        entityID: String? = nil,
        reference: String? = nil,
        promptEvents: String? = nil,
        selection: VKMixSelection = VKMixSelection(),
        backgroundAnimationURL: URL? = nil,
        isTunable: Bool = false
    ) {
        self.id = id
        self.title = title
        self.subtitle = subtitle
        self.artworkURL = artworkURL
        self.matchPercent = matchPercent
        self.isSocial = isSocial || (curator?.isUsable == true)
        self.sectionTitle = sectionTitle
        self.curator = curator
        self.entityID = entityID
        self.reference = reference
        self.promptEvents = promptEvents
        self.selection = selection
        self.backgroundAnimationURL = backgroundAnimationURL
        self.isTunable = isTunable
    }

    func withSectionTitle(_ title: String?) -> MusicMix {
        guard let title else { return self }
        let trimmed = title.trimmingCharacters(in: .whitespacesAndNewlines)
        guard !trimmed.isEmpty else { return self }
        return MusicMix(
            id: id,
            title: self.title,
            subtitle: subtitle,
            artworkURL: artworkURL,
            matchPercent: matchPercent,
            isSocial: isSocial,
            sectionTitle: trimmed,
            curator: curator,
            entityID: entityID,
            reference: reference,
            promptEvents: promptEvents,
            selection: selection,
            backgroundAnimationURL: backgroundAnimationURL,
            isTunable: isTunable
        )
    }

    func tuned(with selection: VKMixSelection) -> MusicMix {
        MusicMix(
            id: id,
            title: title,
            subtitle: subtitle,
            artworkURL: artworkURL,
            matchPercent: matchPercent,
            isSocial: isSocial,
            sectionTitle: sectionTitle,
            curator: curator,
            entityID: entityID,
            reference: reference,
            promptEvents: promptEvents,
            selection: selection,
            backgroundAnimationURL: backgroundAnimationURL,
            isTunable: isTunable
        )
    }

    func merging(richer other: MusicMix) -> MusicMix {
        MusicMix(
            id: id,
            title: Self.preferredText(
                current: title,
                candidate: other.title,
                generic: ["vk mix", "vk микс", "микс vk"]
            ),
            subtitle: Self.preferredText(
                current: subtitle,
                candidate: other.subtitle,
                generic: ["персональная подборка vk", "музыкальный микс"]
            ),
            artworkURL: artworkURL ?? other.artworkURL,
            matchPercent: matchPercent ?? other.matchPercent,
            isSocial: isSocial || other.isSocial,
            sectionTitle: sectionTitle ?? other.sectionTitle,
            curator: curator ?? other.curator,
            entityID: entityID ?? other.entityID,
            reference: reference ?? other.reference,
            promptEvents: promptEvents ?? other.promptEvents,
            selection: selection.isEmpty ? other.selection : selection,
            backgroundAnimationURL:
                backgroundAnimationURL ?? other.backgroundAnimationURL,
            isTunable: isTunable || other.isTunable
        )
    }

    private static func preferredText(
        current: String,
        candidate: String,
        generic: [String]
    ) -> String {
        let currentValue = current.trimmingCharacters(in: .whitespacesAndNewlines)
        let candidateValue = candidate.trimmingCharacters(
            in: .whitespacesAndNewlines
        )
        guard !candidateValue.isEmpty else { return currentValue }
        guard !currentValue.isEmpty else { return candidateValue }
        let normalized = currentValue.lowercased()
        if generic.contains(normalized), !generic.contains(candidateValue.lowercased()) {
            return candidateValue
        }
        return currentValue
    }

    static let common = MusicMix(
        id: "common",
        title: L10n.text("Составлено Селеной"),
        subtitle: L10n.text("Селена подбирает музыку под ваш вкус"),
        artworkURL: nil,
        matchPercent: nil,
        isSocial: false,
        sectionTitle: nil,
        curator: nil,
        isTunable: true
    )
}
