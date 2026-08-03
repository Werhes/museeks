package com.werhes.museeks.service

import android.content.Intent
import androidx.annotation.OptIn
import androidx.media3.common.util.UnstableApi
import androidx.media3.session.MediaSession
import androidx.media3.session.MediaSessionService
import com.werhes.museeks.MuseeksApplication

@OptIn(UnstableApi::class)
class PlaybackService : MediaSessionService() {

    private lateinit var mediaSession: MediaSession
    private lateinit var notificationManager: PlaybackNotificationManager

    override fun onCreate() {
        super.onCreate()

        val app = application as MuseeksApplication
        val playerManager = app.playerManager

        mediaSession = MediaSession.Builder(this, playerManager.exoPlayer)
            .setSessionActivity(PlaybackNotificationManager.createMainActivityPendingIntent(this))
            .build()

        notificationManager = PlaybackNotificationManager(this, mediaSession)
        notificationManager.start()
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        super.onStartCommand(intent, flags, startId)
        return START_STICKY
    }

    override fun onTaskRemoved(rootIntent: Intent?) {
        val playerManager = (application as MuseeksApplication).playerManager
        if (!playerManager.isPlaying) {
            stopSelf()
        }
    }

    override fun onDestroy() {
        notificationManager.stop()
        mediaSession.release()
        super.onDestroy()
    }

    override fun onGetSession(controllerInfo: MediaSession.ControllerInfo): MediaSession? {
        return mediaSession
    }

    companion object {
        const val ACTION_PLAY = "com.werhes.museeks.action.PLAY"
        const val ACTION_PAUSE = "com.werhes.museeks.action.PAUSE"
        const val ACTION_NEXT = "com.werhes.museeks.action.NEXT"
        const val ACTION_PREVIOUS = "com.werhes.museeks.action.PREVIOUS"
    }
}