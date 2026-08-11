import SwiftUI

struct QueueView: View {
    @Environment(\.dismiss) private var dismiss
    @EnvironmentObject private var player: PlayerController

    var body: some View {
        NavigationStack {
            List {
                if let index = player.currentIndex, player.queue.indices.contains(index) {
                    Section("Сейчас играет") {
                        TrackRow(
                            track: player.queue[index],
                            isCurrent: true,
                            isPlaying: player.isPlaying
                        ) { player.playPause() }
                    }
                }
                Section("Далее") {
                    ForEach(upcoming) { item in
                        TrackRow(track: item.track) { player.jump(to: item.queueIndex) }
                    }
                    .onDelete(perform: deleteUpcoming)
                }
            }
            .navigationTitle("Очередь")
            .navigationBarTitleDisplayMode(.inline)
            .toolbar {
                ToolbarItem(placement: .confirmationAction) {
                    Button("Готово") { dismiss() }
                }
            }
        }
        .presentationDetents([.medium, .large])
    }

    private var upcoming: [QueueItem] {
        player.queue.enumerated().compactMap { index, track in
            index == player.currentIndex ? nil : QueueItem(queueIndex: index, track: track)
        }
    }

    private func deleteUpcoming(at offsets: IndexSet) {
        let items = upcoming
        let queueOffsets = IndexSet(offsets.compactMap { offset in
            items.indices.contains(offset) ? items[offset].queueIndex : nil
        })
        player.removeFromQueue(at: queueOffsets)
    }
}

private struct QueueItem: Identifiable {
    let queueIndex: Int
    let track: Track
    var id: String { track.id }
}
