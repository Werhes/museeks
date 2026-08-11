import SwiftUI
import Lottie

struct VKMixHomeCard: View {
    let mix: MusicMix

    @State private var selection: VKMixSelection
    @State private var showsSettings = false

    init(mix: MusicMix) {
        self.mix = mix
        _selection = State(
            initialValue: VKMixSelectionStorage.load(mixID: mix.id)
                ?? mix.selection
        )
    }

    var body: some View {
        ZStack(alignment: .bottomLeading) {
            NavigationLink {
                VKMixView(mix: tunedMix)
            } label: {
                heroContent
            }
            .buttonStyle(PremiumPressStyle())

            Button {
                showsSettings = true
            } label: {
                Label(L10n.text("Настроить"), systemImage: "slider.horizontal.3")
                    .font(.subheadline.weight(.semibold))
                    .foregroundStyle(.white)
                    .padding(.horizontal, 14)
                    .frame(minHeight: 40)
                    .adaptiveGlass(
                        in: Capsule(style: .continuous),
                        interactive: true,
                        tint: .white.opacity(0.12)
                    )
            }
            .buttonStyle(PremiumPressStyle())
            .padding(18)
        }
        .frame(height: 210)
        .clipShape(
            RoundedRectangle(
                cornerRadius: PremiumLayout.cardRadius,
                style: .continuous
            )
        )
        .overlay {
            RoundedRectangle(
                cornerRadius: PremiumLayout.cardRadius,
                style: .continuous
            )
            .stroke(.white.opacity(0.16), lineWidth: 0.8)
        }
        .shadow(color: .indigo.opacity(0.18), radius: 20, y: 10)
        .sheet(isPresented: $showsSettings) {
            NavigationStack {
                VKMixSettingsView(
                    mix: tunedMix,
                    currentSelection: selection
                ) { updated in
                    selection = updated
                    VKMixSelectionStorage.save(updated, mixID: mix.id)
                    showsSettings = false
                }
            }
        }
    }

    private var tunedMix: MusicMix { mix.tuned(with: selection) }

    private var heroContent: some View {
        ZStack(alignment: .topTrailing) {
            IridescentMixBackground()

            VStack(alignment: .leading, spacing: 7) {
                Text("VK Mix")
                    .font(.system(size: 34, weight: .black, design: .rounded))
                Text(L10n.text("Музыкальные рекомендации для вас"))
                    .font(.subheadline.weight(.medium))
                    .foregroundStyle(.white.opacity(0.82))
                    .lineLimit(2)
                Spacer(minLength: 54)
            }
            .frame(maxWidth: .infinity, alignment: .leading)
            .padding(22)

            Image(systemName: "waveform.circle.fill")
                .font(.system(size: 52, weight: .semibold))
                .symbolRenderingMode(.palette)
                .foregroundStyle(.white, .white.opacity(0.2))
                .padding(20)
        }
        .foregroundStyle(.white)
        .contentShape(Rectangle())
        .accessibilityElement(children: .combine)
        .accessibilityLabel(
            "VK Mix, \(L10n.text("Музыкальные рекомендации для вас"))"
        )
    }
}

struct VKMixView: View {
    let mix: MusicMix
    let displayTitle: String
    let displaySubtitle: String
    let colors: [Color]

    @EnvironmentObject private var environment: AppEnvironment
    @EnvironmentObject private var sessionStore: SessionStore
    @EnvironmentObject private var player: AudioPlayer
    @State private var selection: VKMixSelection
    @State private var tracks: [Track] = []
    @State private var isLoading = true
    @State private var isStarting = false
    @State private var errorMessage: String?
    @State private var showsSettings = false

    init(
        mix: MusicMix,
        displayTitle: String = "VK Mix",
        displaySubtitle: String = "Музыкальные рекомендации для вас",
        colors: [Color] = [
            Color(red: 0.04, green: 0.45, blue: 1),
            Color(red: 0.48, green: 0.13, blue: 0.94),
            Color(red: 0.93, green: 0.24, blue: 0.65)
        ]
    ) {
        self.mix = mix
        self.displayTitle = displayTitle
        self.displaySubtitle = displaySubtitle
        self.colors = colors
        _selection = State(
            initialValue: VKMixSelectionStorage.load(mixID: mix.id)
                ?? mix.selection
        )
    }

    var body: some View {
        ScrollView {
            LazyVStack(alignment: .leading, spacing: 22) {
                detailHero

                if isLoading && tracks.isEmpty {
                    trackSkeleton
                } else if tracks.isEmpty {
                    emptyState
                } else {
                    HStack {
                        Text(L10n.text("В этом миксе"))
                            .font(.title2.weight(.bold))
                        Spacer()
                        Text(L10n.trackCount(tracks.count))
                            .font(.caption)
                            .foregroundStyle(.secondary)
                    }

                    VStack(spacing: 0) {
                        ForEach(Array(tracks.enumerated()), id: \.element.id) {
                            index, track in
                            TrackRow(
                                track: track,
                                queue: tracks,
                                source: .mix(title: displayTitle)
                            )
                            .padding(.vertical, 6)
                            if index < tracks.count - 1 {
                                Divider().padding(.leading, 62)
                            }
                        }
                    }
                }
            }
            .padding(.horizontal, 16)
            .padding(.bottom, 120)
        }
        .background(ThemeBackground())
        .navigationTitle(displayTitle)
        .navigationBarTitleDisplayMode(.inline)
        .toolbar {
            if mix.isTunable || mix.id == MusicMix.common.id {
                ToolbarItem(placement: .topBarTrailing) {
                    Button {
                        showsSettings = true
                    } label: {
                        Image(systemName: "slider.horizontal.3")
                    }
                    .accessibilityLabel(L10n.text("Настроить VK Mix"))
                }
            }
        }
        .sheet(isPresented: $showsSettings) {
            NavigationStack {
                VKMixSettingsView(
                    mix: tunedMix,
                    currentSelection: selection
                ) { updated in
                    selection = updated
                    VKMixSelectionStorage.save(updated, mixID: mix.id)
                    showsSettings = false
                }
            }
        }
        .task(id: loadIdentity) {
            await load()
        }
        .refreshable { await load() }
    }

    private var tunedMix: MusicMix { mix.tuned(with: selection) }

    private var loadIdentity: String {
        "\(sessionStore.sessionRevision)-\(mix.id)-\(selection.jsonString ?? "default")"
    }

    private var detailHero: some View {
        ZStack {
            IridescentMixBackground(colors: colors)

            VStack(spacing: 13) {
                Image(systemName: "waveform")
                    .font(.system(size: 42, weight: .bold))
                    .symbolEffect(.variableColor.iterative, isActive: player.isPlaying)
                Text(displayTitle)
                    .font(.system(size: 34, weight: .black, design: .rounded))
                    .multilineTextAlignment(.center)
                Text(L10n.text(displaySubtitle))
                    .font(.subheadline.weight(.medium))
                    .foregroundStyle(.white.opacity(0.82))
                    .multilineTextAlignment(.center)
                    .lineLimit(3)

                HStack(spacing: 12) {
                    Button { startPlayback() } label: {
                        HStack(spacing: 8) {
                            if isStarting {
                                ProgressView().tint(.black)
                            } else {
                                Image(systemName: "play.fill")
                            }
                            Text(L10n.text("Слушать"))
                        }
                        .font(.headline.weight(.bold))
                        .foregroundStyle(.black)
                        .padding(.horizontal, 20)
                        .frame(minHeight: 48)
                        .background(.white, in: Capsule(style: .continuous))
                    }
                    .buttonStyle(PremiumPressStyle())
                    .disabled(isStarting)

                    if mix.isTunable || mix.id == MusicMix.common.id {
                        Button { showsSettings = true } label: {
                            Image(systemName: "slider.horizontal.3")
                                .font(.headline.weight(.bold))
                                .foregroundStyle(.white)
                                .frame(width: 48, height: 48)
                                .adaptiveGlass(
                                    in: Circle(),
                                    interactive: true,
                                    tint: .white.opacity(0.1)
                                )
                        }
                        .buttonStyle(PremiumPressStyle())
                        .accessibilityLabel(L10n.text("Настроить VK Mix"))
                    }
                }
                .padding(.top, 5)
            }
            .padding(24)
        }
        .foregroundStyle(.white)
        .frame(minHeight: 300)
        .clipShape(
            RoundedRectangle(
                cornerRadius: PremiumLayout.cardRadius,
                style: .continuous
            )
        )
    }

    private var trackSkeleton: some View {
        VStack(spacing: 10) {
            ForEach(0..<6, id: \.self) { _ in
                HStack(spacing: 12) {
                    RoundedRectangle(cornerRadius: 10)
                        .fill(.primary.opacity(0.08))
                        .frame(width: 50, height: 50)
                    VStack(alignment: .leading, spacing: 8) {
                        RoundedRectangle(cornerRadius: 4)
                            .fill(.primary.opacity(0.1))
                            .frame(height: 11)
                        RoundedRectangle(cornerRadius: 4)
                            .fill(.primary.opacity(0.07))
                            .frame(width: 150, height: 9)
                    }
                }
            }
        }
        .redacted(reason: .placeholder)
    }

    private var emptyState: some View {
        VStack(spacing: 12) {
            Image(systemName: "waveform.slash")
                .font(.system(size: 34))
                .foregroundStyle(.secondary)
            Text(errorMessage ?? L10n.text("VK не вернул треки для этого микса."))
                .font(.subheadline)
                .foregroundStyle(.secondary)
                .multilineTextAlignment(.center)
            Button(L10n.text("Повторить")) { Task { await load() } }
                .buttonStyle(.bordered)
        }
        .frame(maxWidth: .infinity)
        .padding(.vertical, 34)
    }

    private func load() async {
        guard sessionStore.accessToken != nil else { return }
        isLoading = true
        errorMessage = nil
        do {
            tracks = try await environment.withAuthorizedToken { token in
                try await environment.musicService.mixTracksBootstrap(
                    tunedMix,
                    accessToken: token
                )
            }
        } catch is CancellationError {
            return
        } catch {
            tracks = []
            errorMessage = error.localizedDescription
        }
        isLoading = false
    }

    private func startPlayback() {
        guard !isStarting else { return }
        isStarting = true
        Task {
            defer { isStarting = false }
            do {
                let bootstrap: [Track]
                if tracks.isEmpty {
                    bootstrap = try await environment.withAuthorizedToken { token in
                        try await environment.musicService.mixTracksBootstrap(
                            tunedMix,
                            accessToken: token
                        )
                    }
                    tracks = bootstrap
                } else {
                    bootstrap = tracks
                }
                guard let first = bootstrap.first else { return }
                player.play(
                    first,
                    in: bootstrap,
                    continuation: {
                        try await environment.withAuthorizedToken { token in
                            try await environment.musicService
                                .mixTracksContinuation(
                                    tunedMix,
                                    accessToken: token
                                )
                        }
                    },
                    source: .mix(title: displayTitle)
                )
            } catch is CancellationError {
                return
            } catch {
                errorMessage = error.localizedDescription
            }
        }
    }

}

struct VKMixSettingsView: View {
    let mix: MusicMix
    let currentSelection: VKMixSelection
    let onApply: (VKMixSelection) -> Void

    @EnvironmentObject private var environment: AppEnvironment
    @EnvironmentObject private var sessionStore: SessionStore
    @Environment(\.dismiss) private var dismiss
    @State private var settings: VKMixSettings?
    @State private var draft: VKMixSelection
    @State private var isLoading = true
    @State private var errorMessage: String?
    @State private var initializedFromServer = false

    init(
        mix: MusicMix,
        currentSelection: VKMixSelection,
        onApply: @escaping (VKMixSelection) -> Void
    ) {
        self.mix = mix
        self.currentSelection = currentSelection
        self.onApply = onApply
        _draft = State(initialValue: currentSelection)
    }

    var body: some View {
        ScrollView {
            VStack(alignment: .leading, spacing: 26) {
                if let settings {
                    VStack(spacing: 5) {
                        Text(settings.title.isEmpty
                             ? L10n.text("Настройте VK Mix")
                             : settings.title)
                            .font(.title2.weight(.bold))
                        if !settings.subtitle.isEmpty {
                            Text(settings.subtitle)
                                .font(.subheadline)
                                .foregroundStyle(.secondary)
                                .multilineTextAlignment(.center)
                        }
                    }
                    .frame(maxWidth: .infinity)

                    ForEach(settings.categories) { category in
                        categoryView(category)
                    }
                } else if isLoading {
                    ProgressView(L10n.text("Загружаем настройки VK Mix…"))
                        .frame(maxWidth: .infinity)
                        .padding(.vertical, 70)
                } else {
                    VStack(spacing: 12) {
                        Image(systemName: "slider.horizontal.3")
                            .font(.system(size: 34))
                        Text(errorMessage ?? L10n.text("Настройки VK Mix недоступны."))
                            .multilineTextAlignment(.center)
                        Button(L10n.text("Повторить")) {
                            Task { await loadSettings() }
                        }
                        .buttonStyle(.bordered)
                    }
                    .foregroundStyle(.secondary)
                    .frame(maxWidth: .infinity)
                    .padding(.vertical, 70)
                }
            }
            .padding(16)
            .padding(.bottom, 30)
        }
        .background(ThemeBackground())
        .navigationTitle(L10n.text("Настройки микса"))
        .navigationBarTitleDisplayMode(.inline)
        .toolbar {
            ToolbarItem(placement: .cancellationAction) {
                Button(L10n.text("Закрыть")) { dismiss() }
            }
            ToolbarItem(placement: .confirmationAction) {
                Button(L10n.text("Применить")) { onApply(draft) }
                    .fontWeight(.semibold)
                    .disabled(settings == nil)
            }
            ToolbarItem(placement: .bottomBar) {
                Button(role: .destructive) {
                    draft = VKMixSelection()
                } label: {
                    Label(L10n.text("Сбросить настройки"), systemImage: "arrow.counterclockwise")
                }
                .disabled(draft.isEmpty)
            }
        }
        .task(id: "\(sessionStore.sessionRevision)-\(mix.id)") {
            await loadSettings()
        }
    }

    @ViewBuilder
    private func categoryView(_ category: VKMixSettingCategory) -> some View {
        VStack(alignment: .leading, spacing: 12) {
            Text(category.title)
                .font(.headline.weight(.bold))

            if category.usesPictures {
                ScrollView(.horizontal, showsIndicators: false) {
                    LazyHStack(alignment: .top, spacing: 12) {
                        ForEach(category.options) { option in
                            picturedOption(option, category: category)
                        }
                    }
                }
            } else {
                LazyVGrid(
                    columns: [GridItem(.adaptive(minimum: 118), spacing: 9)],
                    spacing: 9
                ) {
                    ForEach(category.options) { option in
                        simpleOption(option, category: category)
                    }
                }
            }
        }
    }

    private func picturedOption(
        _ option: VKMixSettingOption,
        category: VKMixSettingCategory
    ) -> some View {
        let selected = draft.contains(
            categoryID: category.id,
            optionID: option.id
        )
        return Button {
            toggle(option, category: category)
        } label: {
            VStack(spacing: 8) {
                VKMixOptionArtwork(
                    url: option.iconURL,
                    prefersLottie: category.usesPictures
                )
                .frame(width: 82, height: 82)
                .clipShape(RoundedRectangle(cornerRadius: 18, style: .continuous))
                .overlay {
                    RoundedRectangle(cornerRadius: 18, style: .continuous)
                        .stroke(
                            selected ? Color.accentColor : .primary.opacity(0.08),
                            lineWidth: selected ? 3 : 1
                        )
                }
                .overlay(alignment: .topTrailing) {
                    if selected {
                        Image(systemName: "checkmark.circle.fill")
                            .symbolRenderingMode(.palette)
                            .foregroundStyle(.white, Color.accentColor)
                            .padding(6)
                    }
                }
                Text(option.title)
                    .font(.caption.weight(selected ? .bold : .medium))
                    .foregroundStyle(.primary)
                    .multilineTextAlignment(.center)
                    .lineLimit(2)
            }
            .frame(width: 88)
        }
        .buttonStyle(PremiumPressStyle())
    }

    private func simpleOption(
        _ option: VKMixSettingOption,
        category: VKMixSettingCategory
    ) -> some View {
        let selected = draft.contains(
            categoryID: category.id,
            optionID: option.id
        )
        return Button {
            toggle(option, category: category)
        } label: {
            HStack(spacing: 7) {
                if selected { Image(systemName: "checkmark") }
                Text(option.title).lineLimit(2)
            }
            .font(.subheadline.weight(.semibold))
            .foregroundStyle(selected ? Color.white : Color.primary)
            .frame(maxWidth: .infinity, minHeight: 44)
            .padding(.horizontal, 11)
            .background(
                selected ? Color.accentColor : .primary.opacity(0.065),
                in: RoundedRectangle(cornerRadius: 13, style: .continuous)
            )
        }
        .buttonStyle(PremiumPressStyle())
    }

    private func toggle(
        _ option: VKMixSettingOption,
        category: VKMixSettingCategory
    ) {
        Haptics.selection()
        draft = draft.toggling(
            categoryID: category.id,
            optionID: option.id
        )
    }

    private func loadSettings() async {
        guard sessionStore.accessToken != nil else { return }
        isLoading = true
        errorMessage = nil
        do {
            let loaded = try await environment.withAuthorizedToken { token in
                try await environment.musicService.mixSettings(
                    mix,
                    accessToken: token
                )
            }
            settings = loaded
            if !initializedFromServer {
                initializedFromServer = true
                if currentSelection.isEmpty {
                    draft = loaded.defaultSelection
                }
            }
        } catch is CancellationError {
            return
        } catch {
            settings = nil
            errorMessage = error.localizedDescription
        }
        isLoading = false
    }
}

private struct VKMixOptionArtwork: View {
    let url: URL?
    let prefersLottie: Bool

    var body: some View {
        Group {
            if let url, isLottie(url) {
                LottieView {
                    try await LottieAnimation.loadedFrom(url: url)
                } placeholder: {
                    fallback
                }
                .looping()
                .resizable()
                .aspectRatio(contentMode: .fit)
            } else {
                CachedRemoteImage(url: url) { image in
                    image.resizable().scaledToFill()
                } placeholder: {
                    fallback
                }
            }
        }
    }

    private func isLottie(_ url: URL) -> Bool {
        let path = url.path.lowercased()
        return (prefersLottie && !path.hasSuffix(".lottie"))
            || path.hasSuffix(".json")
    }

    private var fallback: some View {
        ZStack {
            LinearGradient(
                colors: [.indigo.opacity(0.8), .pink.opacity(0.75)],
                startPoint: .topLeading,
                endPoint: .bottomTrailing
            )
            Image(systemName: "sparkles")
                .font(.title2.weight(.bold))
                .foregroundStyle(.white)
        }
    }
}

struct AlgorithmicMixCard: Identifiable {
    enum Kind: Hashable {
        case discovery
        case newMusic
        case custom
    }

    let mix: MusicMix
    let kind: Kind
    let title: String
    let subtitle: String
    let colors: [Color]

    var id: String { mix.id }
}

enum AlgorithmicMixPolicy {
    static func cards(from mixes: [MusicMix]) -> [AlgorithmicMixCard] {
        var candidates = mixes.filter {
            $0.id != MusicMix.common.id && !$0.isSocial
        }
        let algorithmic = candidates.filter {
            let section = ($0.sectionTitle ?? "").lowercased()
            return section.contains("алгоритм") || section.contains("algorithm")
        }
        if !algorithmic.isEmpty { candidates = algorithmic }

        var known = Set<String>()
        candidates = candidates.filter { known.insert($0.id).inserted }
        guard !candidates.isEmpty else { return [] }

        var remaining = candidates
        let discovery = takeMatch(
            from: &remaining,
            markers: ["discover", "открыт", "recommend", "для вас"]
        ) ?? remaining.removeFirstIfPresent()
        let newMusic = takeMatch(
            from: &remaining,
            markers: ["new", "fresh", "новин", "новая музыка"]
        ) ?? remaining.removeFirstIfPresent()

        var result: [AlgorithmicMixCard] = []
        if let discovery {
            result.append(
                AlgorithmicMixCard(
                    mix: discovery,
                    kind: .discovery,
                    title: L10n.text("Открытия"),
                    subtitle: L10n.text("Новое для вас"),
                    colors: [
                        Color(red: 0.36, green: 0.12, blue: 0.82),
                        Color(red: 0.67, green: 0.18, blue: 0.92)
                    ]
                )
            )
        }
        if let newMusic {
            result.append(
                AlgorithmicMixCard(
                    mix: newMusic,
                    kind: .newMusic,
                    title: L10n.text("Новинки"),
                    subtitle: usefulSubtitle(newMusic)
                        ?? L10n.text("Свежая музыка для вас"),
                    colors: [
                        Color(red: 0.03, green: 0.44, blue: 0.96),
                        Color(red: 0.03, green: 0.72, blue: 0.76)
                    ]
                )
            )
        }
        if let third = remaining.first {
            result.append(
                AlgorithmicMixCard(
                    mix: third,
                    kind: .custom,
                    title: third.title.isEmpty
                        ? L10n.text("Микс дня") : third.title,
                    subtitle: usefulSubtitle(third)
                        ?? L10n.text("Подобрано специально для вас"),
                    colors: [
                        Color(red: 0.92, green: 0.27, blue: 0.43),
                        Color(red: 0.96, green: 0.56, blue: 0.18)
                    ]
                )
            )
        }
        return result
    }

    private static func takeMatch(
        from mixes: inout [MusicMix],
        markers: [String]
    ) -> MusicMix? {
        guard let index = mixes.firstIndex(where: { mix in
            let blob = "\(mix.id) \(mix.title) \(mix.subtitle)".lowercased()
            return markers.contains { blob.contains($0) }
        }) else { return nil }
        return mixes.remove(at: index)
    }

    private static func usefulSubtitle(_ mix: MusicMix) -> String? {
        let value = mix.subtitle.trimmingCharacters(in: .whitespacesAndNewlines)
        let generic = ["персональная подборка vk", "музыкальный микс", "vk mix"]
        guard !value.isEmpty,
              !generic.contains(where: { value.lowercased().contains($0) }) else {
            return nil
        }
        return value
    }
}

struct AlgorithmicMixSection: View {
    let mixes: [MusicMix]

    private var cards: [AlgorithmicMixCard] {
        AlgorithmicMixPolicy.cards(from: mixes)
    }

    var body: some View {
        if !cards.isEmpty {
            VStack(alignment: .leading, spacing: 12) {
                VStack(alignment: .leading, spacing: 2) {
                    Text(L10n.text("Собрано алгоритмами"))
                        .font(.headline.weight(.bold))
                    Text(L10n.text("Персональные подборки VK"))
                        .font(.caption)
                        .foregroundStyle(.secondary)
                }

                ScrollView(.horizontal, showsIndicators: false) {
                    LazyHStack(spacing: 12) {
                        ForEach(cards) { card in
                            NavigationLink {
                                AlgorithmicMixView(card: card)
                            } label: {
                                algorithmCard(card)
                            }
                            .buttonStyle(PremiumPressStyle())
                        }
                    }
                }
            }
        }
    }

    private func algorithmCard(_ card: AlgorithmicMixCard) -> some View {
        ZStack(alignment: .bottomLeading) {
            LinearGradient(
                colors: card.colors,
                startPoint: .topLeading,
                endPoint: .bottomTrailing
            )
            if let url = card.mix.artworkURL {
                CachedRemoteImage(url: url) { image in
                    image.resizable().scaledToFill()
                } placeholder: { Color.clear }
                .opacity(0.36)
                .blendMode(.screen)
            }
            LinearGradient(
                colors: [.clear, .black.opacity(0.56)],
                startPoint: .top,
                endPoint: .bottom
            )
            VStack(alignment: .leading, spacing: 4) {
                Image(systemName: icon(for: card.kind))
                    .font(.title2.weight(.bold))
                    .padding(.bottom, 17)
                Text(card.title)
                    .font(.title3.weight(.heavy))
                    .lineLimit(1)
                Text(card.subtitle)
                    .font(.caption.weight(.medium))
                    .foregroundStyle(.white.opacity(0.82))
                    .lineLimit(2)
            }
            .padding(16)
        }
        .foregroundStyle(.white)
        .frame(width: 218, height: 142)
        .clipShape(RoundedRectangle(cornerRadius: 20, style: .continuous))
        .overlay {
            RoundedRectangle(cornerRadius: 20, style: .continuous)
                .stroke(.white.opacity(0.14), lineWidth: 0.7)
        }
    }

    private func icon(for kind: AlgorithmicMixCard.Kind) -> String {
        switch kind {
        case .discovery: "sparkles"
        case .newMusic: "wand.and.stars"
        case .custom: "waveform.path.ecg"
        }
    }
}

struct AlgorithmicMixView: View {
    let card: AlgorithmicMixCard

    var body: some View {
        VKMixView(
            mix: card.mix,
            displayTitle: card.title,
            displaySubtitle: card.subtitle,
            colors: card.colors
        )
    }
}

private struct IridescentMixBackground: View {
    var colors: [Color] = [
        Color(red: 0.03, green: 0.45, blue: 1),
        Color(red: 0.48, green: 0.12, blue: 0.94),
        Color(red: 0.95, green: 0.22, blue: 0.64),
        Color(red: 0.05, green: 0.77, blue: 0.67)
    ]

    @Environment(\.accessibilityReduceMotion) private var reduceMotion

    var body: some View {
        TimelineView(
            .periodic(from: .now, by: reduceMotion ? 30.0 : 1.0 / 24.0)
        ) {
            context in
            let time = context.date.timeIntervalSinceReferenceDate
            let x = 0.5 + sin(time * 0.34) * 0.34
            let y = 0.5 + cos(time * 0.27) * 0.31
            ZStack {
                LinearGradient(
                    colors: colors,
                    startPoint: .topLeading,
                    endPoint: .bottomTrailing
                )
                RadialGradient(
                    colors: [.white.opacity(0.38), .clear],
                    center: UnitPoint(x: x, y: y),
                    startRadius: 0,
                    endRadius: 250
                )
                .blendMode(.screen)
                AngularGradient(
                    colors: colors + [colors.first ?? .blue],
                    center: .center,
                    angle: .degrees(reduceMotion ? 0 : time * 7)
                )
                .opacity(0.24)
                .blendMode(.plusLighter)
            }
        }
    }
}

private extension Array {
    mutating func removeFirstIfPresent() -> Element? {
        isEmpty ? nil : removeFirst()
    }
}
