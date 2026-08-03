package com.werhes.museeks.player

sealed class PlaybackState {
    data object Idle : PlaybackState()
    data object Loading : PlaybackState()
    data class Playing(val trackIndex: Int) : PlaybackState()
    data class Paused(val trackIndex: Int) : PlaybackState()
    data class Error(val message: String) : PlaybackState()
}

enum class RepeatMode {
    NONE, ONE, ALL
}

enum class ShuffleMode {
    ON, OFF
}