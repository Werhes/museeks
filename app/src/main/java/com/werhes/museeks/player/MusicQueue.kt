package com.werhes.museeks.player

import com.werhes.museeks.api.model.music.AudioTrack

class MusicQueue {
    private val originalTracks = mutableListOf<AudioTrack>()
    private var shuffledIndices = mutableListOf<Int>()
    private var currentIndex = 0
    var repeatMode = RepeatMode.NONE
    var shuffleMode = ShuffleMode.OFF

    val currentTrack: AudioTrack?
        get() = if (originalTracks.isEmpty()) null
        else originalTracks[getActualIndex(currentIndex)]

    val allTracks: List<AudioTrack> get() = originalTracks.toList()
    val size: Int get() = originalTracks.size

    fun setTracks(tracks: List<AudioTrack>, startIndex: Int = 0) {
        originalTracks.clear()
        originalTracks.addAll(tracks)
        currentIndex = startIndex.coerceIn(0, maxOf(0, tracks.size - 1))
        rebuildShuffle()
    }

    fun addTracksNext(tracks: List<AudioTrack>) {
        val insertPos = currentIndex + 1
        originalTracks.addAll(insertPos, tracks)
        rebuildShuffle()
    }

    fun addTracksToEnd(tracks: List<AudioTrack>) {
        originalTracks.addAll(tracks)
        rebuildShuffle()
    }

    fun next(): Boolean {
        if (originalTracks.isEmpty()) return false
        return when (repeatMode) {
            RepeatMode.ONE -> true
            RepeatMode.NONE -> {
                if (currentIndex < originalTracks.size - 1) {
                    currentIndex++
                    true
                } else false
            }
            RepeatMode.ALL -> {
                currentIndex = (currentIndex + 1) % originalTracks.size
                true
            }
        }
    }

    fun previous(): Boolean {
        if (originalTracks.isEmpty()) return false
        return when (repeatMode) {
            RepeatMode.ONE -> true
            RepeatMode.NONE -> {
                if (currentIndex > 0) {
                    currentIndex--
                    true
                } else false
            }
            RepeatMode.ALL -> {
                currentIndex = if (currentIndex > 0) currentIndex - 1
                else originalTracks.size - 1
                true
            }
        }
    }

    fun seekTo(index: Int): Boolean {
        if (index < 0 || index >= originalTracks.size) return false
        currentIndex = index
        return true
    }

    fun removeAt(index: Int) {
        if (index < 0 || index >= originalTracks.size) return
        originalTracks.removeAt(index)
        if (currentIndex >= originalTracks.size) currentIndex = maxOf(0, originalTracks.size - 1)
        rebuildShuffle()
    }

    fun clear() {
        originalTracks.clear()
        shuffledIndices.clear()
        currentIndex = 0
    }

    fun getTrackAt(index: Int): AudioTrack? =
        originalTracks.getOrNull(getActualIndex(index))

    private fun getActualIndex(displayIndex: Int): Int {
        if (shuffledIndices.isEmpty()) return displayIndex
        return shuffledIndices.getOrElse(displayIndex) { displayIndex }
    }

    private fun rebuildShuffle() {
        shuffledIndices = if (shuffleMode == ShuffleMode.ON) {
            val indices = (0 until originalTracks.size).toMutableList()
            indices.shuffle()
            indices
        } else mutableListOf()
    }
}