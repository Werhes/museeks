import SwiftUI

struct ArtworkView: View {
    let url: URL?
    var size: CGFloat
    var cornerRadius: CGFloat = 14

    var body: some View {
        AsyncImage(url: url, transaction: Transaction(animation: .easeInOut(duration: 0.2))) { phase in
            switch phase {
            case let .success(image):
                image.resizable().scaledToFill()
            case .failure:
                placeholder
            case .empty:
                ZStack { placeholder; ProgressView().controlSize(.small) }
            @unknown default:
                placeholder
            }
        }
        .frame(width: size, height: size)
        .clipShape(RoundedRectangle(cornerRadius: cornerRadius, style: .continuous))
        .overlay {
            RoundedRectangle(cornerRadius: cornerRadius, style: .continuous)
                .stroke(.white.opacity(0.1), lineWidth: 0.7)
        }
    }

    private var placeholder: some View {
        ZStack {
            LinearGradient(
                colors: [MuseeksPalette.accent.opacity(0.8), MuseeksPalette.pink.opacity(0.7)],
                startPoint: .topLeading,
                endPoint: .bottomTrailing
            )
            Image(systemName: "music.note")
                .font(.system(size: size * 0.3, weight: .semibold))
                .foregroundStyle(.white.opacity(0.88))
        }
    }
}

