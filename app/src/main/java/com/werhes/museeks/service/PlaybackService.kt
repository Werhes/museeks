package com.werhes.museeks.service

import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import androidx.media3.session.MediaNotification
import androidx.media3.session.MediaSession
import androidx.media3.session.MediaSessionService
import com.werhes.museeks.MuseeksApplication

class PlaybackService : MediaSessionService() {

    private lateinit var mediaSession: MediaSession
    private lateinit var notificationManager: PlaybackNotificationManager

    override fun onCreate() {
        super.onCreate()

        val app = application as MuseeksApplication
        val playerManager = app.playerManager

        val notificationProvider = PlaybackMediaNotificationProvider(this)

        mediaSession = MediaSession.Builder(this, playerManager.exoPlayer)
            .setSessionActivity(PlaybackNotificationManager.createMainActivityPendingIntent(this))
            .setNotificationProvider(notificationProvider)
            .build()

        notificationManager = PlaybackNotificationManager(this, mediaSession)
        notificationManager.start()
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        super.onStartCommand(intent, flags, startId)

        when (intent?.action) {
            ACTION_PLAY -> {
                val app = application as MuseeksApplication
                app.playerManager.resume()
            }
            ACTION_PAUSE -> {
                val app = application as MuseeksApplication
                app.playerManager.pause()
            }
            ACTION_NEXT -> {
                val app = application as MuseeksApplication
                app.playerManager.next()
            }
            ACTION_PREVIOUS -> {
                val app = application as MuseeksApplication
                app.playerManager.previous()
            }
        }

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

    override fun onUpdateNotification(
        mediaSession: MediaSession,
        startInForeground: Boolean
    ) {
        // Уведомление теперь управляется через MediaNotification.Provider,
        // установленный в MediaSession.Builder.setNotificationProvider()
    }

    companion object {
        const val ACTION_PLAY = "com.werhes.museeks.action.PLAY"
        const val ACTION_PAUSE = "com.werhes.museeks.action.PAUSE"
        const val ACTION_NEXT = "com.werhes.museeks.action.NEXT"
        const val ACTION_PREVIOUS = "com.werhes.museeks.action.PREVIOUS"

        fun createPendingIntent(context: Context, action: String): PendingIntent {
            val intent = Intent(context, PlaybackService::class.java).apply {
                this.action = action
            }
            return PendingIntent.getService(
                context, action.hashCode(), intent,
                PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE
            )
        }
    }
}