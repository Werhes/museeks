package com.werhes.museeks.player

import android.content.Context
import androidx.annotation.OptIn
import androidx.media3.common.MediaItem
import androidx.media3.common.MediaMetadata
import androidx.media3.common.Player
import androidx.media3.common.util.UnstableApi
import androidx.media3.exoplayer.ExoPlayer
import com.werhes.museeks.api.model.music.AudioTrack
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

@OptIn(UnstableApi::class)
class PlayerManager(private val context: Context) {

    val exoPlayer: ExoPlayer = ExoPlayer.Builder(context).build()
    private val queue = MusicQueue()

    val isPlaying: Boolean get() = exoPlayer.isPlaying
    val currentTrack: AudioTrack? get() = queue.currentTrack
    private val scope = CoroutineScope(Dispatchers.Main + SupervisorJob())

    private val _playbackState = MutableStateFlow<PlaybackState>(PlaybackState.Idle)
    val playbackState: StateFlow<PlaybackState> = _playbackState.asStateFlow()

    private val _currentPosition = MutableStateFlow(0L)
    val currentPosition: StateFlow<Long> = _currentPosition.asStateFlow()

    private var positionUpdateJob: Job? = null

    init {
        setupPlayerListeners()
    }

    private fun setupPlayerListeners() {
        exoPlayer.addListener(object : Player.Listener {
            override fun onPlaybackStateChanged(playbackState: Int) {
                val trackIndex = queue.currentTrack?.let { 0 } ?: -1
                when (playbackState) {
                    Player.STATE_BUFFERING -> _playbackState.value = PlaybackState.Loading
                    Player.STATE_READY -> {
                        if (exoPlayer.playWhenReady) {
                            _playbackState.value = PlaybackState.Playing(trackIndex)
                        } else {
                            _playbackState.value = PlaybackState.Paused(trackIndex)
                        }
                    }
                    Player.STATE_ENDED -> {
                        if (queue.next()) {
                            playCurrent()
                        } else {
                            _playbackState.value = PlaybackState.Idle
                        }
                    }
                }
            }

            override fun onPlayWhenReadyChanged(playWhenReady: Boolean, reason: Int) {
                val trackIndex = queue.currentTrack?.let { 0 } ?: -1
                _playbackState.value = if (playWhenReady) {
                    PlaybackState.Playing(trackIndex)
                } else {
                    PlaybackState.Paused(trackIndex)
                }
            }

            override fun onPlayerError(error: androidx.media3.common.PlaybackException) {
                _playbackState.value = PlaybackState.Error(error.message ?: "Playback error")
            }

            override fun onMediaItemTransition(mediaItem: MediaItem?, reason: Int) {
                updateMediaSessionMetadata()
            }
        })
    }

    fun play(tracks: List<AudioTrack>, startIndex: Int = 0) {
        queue.setTracks(tracks, startIndex)
        buildMediaItems(tracks)
        exoPlayer.seekTo(startIndex, 0)
        exoPlayer.prepare()
        exoPlayer.play()
        startPositionUpdates()
    }

    fun playNext(tracks: List<AudioTrack>) {
        queue.addTracksNext(tracks)
        val currentIndex = exoPlayer.currentMediaItemIndex
        val mediaItems = tracks.map { buildMediaItem(it) }
        val insertIndex = currentIndex + 1
        exoPlayer.addMediaItems(insertIndex, mediaItems)
    }

    fun resume() {
        exoPlayer.play()
    }

    fun pause() {
        exoPlayer.pause()
    }

    fun togglePlayPause() {
        if (exoPlayer.isPlaying) exoPlayer.pause()
        else exoPlayer.play()
    }

    fun next() {
        if (queue.next()) {
            val nextIndex = exoPlayer.nextMediaItemIndex
            if (nextIndex >= 0) {
                exoPlayer.seekTo(nextIndex, 0)
            }
        } else {
            stop()
        }
    }

    fun previous() {
        if (exoPlayer.currentPosition > 3000) {
            exoPlayer.seekTo(0)
        } else if (queue.previous()) {
            val prevIndex = exoPlayer.previousMediaItemIndex
            if (prevIndex >= 0) {
                exoPlayer.seekTo(prevIndex, 0)
            }
        }
    }

    fun seekTo(positionMs: Long) {
        exoPlayer.seekTo(positionMs)
    }

    fun stop() {
        exoPlayer.stop()
        exoPlayer.clearMediaItems()
        queue.clear()
        _playbackState.value = PlaybackState.Idle
        stopPositionUpdates()
    }

    fun release() {
        stop()
        positionUpdateJob?.cancel()
        scope.cancel()
        exoPlayer.release()
    }

    private fun playCurrent() {
        val track = queue.currentTrack ?: return
        val mediaItem = buildMediaItem(track)
        exoPlayer.setMediaItem(mediaItem)
        exoPlayer.prepare()
        exoPlayer.play()
    }

    private fun buildMediaItems(tracks: List<AudioTrack>) {
        val mediaItems = tracks.map { buildMediaItem(it) }
        exoPlayer.setMediaItems(mediaItems)
    }

    private fun buildMediaItem(track: AudioTrack): MediaItem {
        val uri = track.url ?: return MediaItem.fromUri("")
        return MediaItem.Builder()
            .setUri(uri)
            .setMediaMetadata(
                MediaMetadata.Builder()
                    .setTitle(track.title)
                    .setArtist(track.artist)
                    .setArtworkUri(track.getAlbumArtUrl()?.let { android.net.Uri.parse(it) })
                    .build()
            )
            .build()
    }

    private fun onTrackEnded() {
        if (queue.next()) {
            playCurrent()
        } else {
            stop()
        }
    }

    private fun startPositionUpdates() {
        positionUpdateJob?.cancel()
        positionUpdateJob = scope.launch {
            while (isActive) {
                _currentPosition.value = exoPlayer.currentPosition
                delay(250)
            }
        }
    }

    private fun stopPositionUpdates() {
        positionUpdateJob?.cancel()
        positionUpdateJob = null
        _currentPosition.value = 0
    }

    private fun updateMediaSessionMetadata() {
        val track = queue.currentTrack ?: return
        exoPlayer.setMediaMetadata(
            MediaMetadata.Builder()
                .setTitle(track.title)
                .setArtist(track.artist)
                .setArtworkUri(track.getAlbumArtUrl()?.let { android.net.Uri.parse(it) })
                .build()
        )
    }
}