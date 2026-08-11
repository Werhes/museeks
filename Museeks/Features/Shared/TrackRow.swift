import Foundation
import SwiftUI

struct TrackRow: View {
    let track: Track
    var isCurrent = false
    var isPlaying = false
    var action: () -> Void

    var body: some View {
        Button(action: action) {
            HStack(spacing: 12) {
                ZStack {
                    ArtworkView(url: track.artworkURL, size: 52, cornerRadius: 11)
                    if isCurrent {
                        RoundedRectangle(cornerRadius: 11, style: .continuous)
                            .fill(.black.opacity(0.32))
                        Image(systemName: isPlaying ? "waveform" : "pause.fill")
                            .foregroundStyle(.white)
                            .symbolEffect(.variableColor.iterative, isActive: isPlaying)
                    }
                }
                VStack(alignment: .leading, spacing: 3) {
                    Text(track.title)
                        .font(.body.weight(isCurrent ? .semibold : .regular))
                        .foregroundStyle(isCurrent ? MuseeksPalette.accent : .primary)
                        .lineLimit(1)
                    HStack(spacing: 4) {
                        if track.isExplicit {
                            Image(systemName: "e.square.fill").font(.caption2)
                        }
                        Text(track.artist).lineLimit(1)
                    }
                    .font(.subheadline)
                    .foregroundStyle(.secondary)
                }
                Spacer(minLength: 8)
                Text(track.duration.clockText)
                    .font(.caption.monospacedDigit())
                    .foregroundStyle(.tertiary)
            }
            .contentShape(Rectangle())
        }
        .buttonStyle(.plain)
    }
}

extension TimeInterval {
    var clockText: String {
        guard isFinite, self >= 0 else { return "0:00" }
        let total = Int(self.rounded())
        return String(format: "%d:%02d", total / 60, total % 60)
    }
}
