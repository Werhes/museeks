import SwiftUI

enum MuseeksPalette {
    static let accent = Color(red: 0.72, green: 0.34, blue: 0.92)
    static let pink = Color(red: 0.96, green: 0.38, blue: 0.66)
    static let deep = Color(red: 0.08, green: 0.06, blue: 0.12)
}

struct AppBackground: View {
    var body: some View {
        ZStack {
            Color(uiColor: .systemBackground)
            RadialGradient(
                colors: [MuseeksPalette.accent.opacity(0.2), .clear],
                center: .topTrailing,
                startRadius: 10,
                endRadius: 460
            )
            .ignoresSafeArea()
            RadialGradient(
                colors: [MuseeksPalette.pink.opacity(0.12), .clear],
                center: .bottomLeading,
                startRadius: 10,
                endRadius: 420
            )
            .ignoresSafeArea()
        }
        .ignoresSafeArea()
    }
}

private struct AdaptiveGlassModifier<S: Shape>: ViewModifier {
    let shape: S
    let interactive: Bool
    let tint: Color?
    @Environment(\.accessibilityReduceTransparency) private var reduceTransparency

    @ViewBuilder
    func body(content: Content) -> some View {
        if #available(iOS 26.0, *), !reduceTransparency {
            content
                .glassEffect(
                    .regular.tint(tint).interactive(interactive),
                    in: shape
                )
        } else {
            content
                .background {
                    if reduceTransparency {
                        shape.fill(Color(uiColor: .secondarySystemBackground))
                    } else {
                        shape.fill(.ultraThinMaterial)
                    }
                }
                .overlay(shape.stroke(.white.opacity(0.12), lineWidth: 0.8))
                .clipShape(shape)
        }
    }
}

extension View {
    func museeksGlass<S: Shape>(
        in shape: S,
        interactive: Bool = false,
        tint: Color? = nil
    ) -> some View {
        modifier(AdaptiveGlassModifier(shape: shape, interactive: interactive, tint: tint))
    }
}

struct MuseeksGlassContainer<Content: View>: View {
    let spacing: CGFloat
    private let content: Content

    init(spacing: CGFloat, @ViewBuilder content: () -> Content) {
        self.spacing = spacing
        self.content = content()
    }

    @ViewBuilder
    var body: some View {
        if #available(iOS 26.0, *) {
            GlassEffectContainer(spacing: spacing) { content }
        } else {
            content
        }
    }
}

struct GlassIconButton: View {
    let systemImage: String
    let accessibilityLabel: String
    var tint: Color?
    let action: () -> Void

    var body: some View {
        Button(action: action) {
            Image(systemName: systemImage)
                .font(.system(size: 17, weight: .semibold))
                .frame(width: 44, height: 44)
                .contentShape(Circle())
        }
        .buttonStyle(.plain)
        .museeksGlass(in: Circle(), interactive: true, tint: tint)
        .accessibilityLabel(accessibilityLabel)
    }
}

struct PrimaryActionButton: View {
    let title: String
    let systemImage: String
    var isLoading = false
    let action: () -> Void

    var body: some View {
        Button(action: action) {
            HStack(spacing: 9) {
                if isLoading { ProgressView().tint(.white) }
                else { Image(systemName: systemImage) }
                Text(title).fontWeight(.semibold)
            }
            .foregroundStyle(.white)
            .frame(maxWidth: .infinity, minHeight: 52)
            .background(
                LinearGradient(
                    colors: [MuseeksPalette.accent, MuseeksPalette.pink],
                    startPoint: .leading,
                    endPoint: .trailing
                ),
                in: RoundedRectangle(cornerRadius: 18, style: .continuous)
            )
        }
        .buttonStyle(.plain)
        .disabled(isLoading)
        .museeksGlass(
            in: RoundedRectangle(cornerRadius: 18, style: .continuous),
            interactive: true,
            tint: MuseeksPalette.accent.opacity(0.2)
        )
    }
}
