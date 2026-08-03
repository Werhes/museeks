package com.werhes.museeks.service

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import androidx.core.app.NotificationCompat
import androidx.media3.common.Player
import androidx.media3.session.MediaSession
import com.werhes.museeks.MainActivity
import com.werhes.museeks.R
import com.werhes.museeks.api.model.music.AudioTrack
import kotlinx.coroutines.runBlocking

class PlaybackNotificationManager(
    private val context: Context,
    private val mediaSession: MediaSession
) {
    private var notificationShown = false

    init {
        createNotificationChannel()
    }

    fun start() {
        if (!notificationShown) {
            notificationShown = true
        }
    }

    fun stop() {
        notificationShown = false
    }

    private fun createNotificationChannel() {
        val channel = NotificationChannel(
            CHANNEL_ID,
            context.getString(R.string.notification_channel_name),
            NotificationManager.IMPORTANCE_LOW
        ).apply {
            description = context.getString(R.string.notification_channel_description)
            setShowBadge(false)
        }
        val manager = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        manager.createNotificationChannel(channel)
    }

    companion object {
        const val NOTIFICATION_ID = 1001
        const val CHANNEL_ID = "playback_channel"

        fun createMainActivityPendingIntent(context: Context): PendingIntent {
            val intent = Intent(context, MainActivity::class.java).apply {
                flags = Intent.FLAG_ACTIVITY_SINGLE_TOP
            }
            return PendingIntent.getActivity(
                context, 0, intent,
                PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE
            )
        }
    }
}

/**
 * Provider для MediaSession, который создаёт уведомление о воспроизведении.
 * Используется с MediaSession.Builder.setNotificationProvider() в Media3 1.5.x.
 */
class PlaybackMediaNotificationProvider(
    private val context: Context
) : MediaNotification.Provider {

    override fun createNotification(
        mediaSession: MediaSession,
        customLayout: MediaSession.ControllerInfo?,
        actionFactory: MediaSession.CommandButtonFactory
    ): MediaNotification {
        val player = mediaSession.player
        val notification = buildNotification(player)
        return MediaNotification(
            PlaybackNotificationManager.NOTIFICATION_ID,
            notification
        )
    }

    override fun handleCustomCommand(
        mediaSession: MediaSession,
        controller: MediaSession.ControllerInfo,
        customAction: String,
        extras: android.os.Bundle
    ): Boolean {
        return false
    }

    private fun buildNotification(player: Player?): android.app.Notification {
        val track = getCurrentTrack(player)

        val builder = NotificationCompat.Builder(context, PlaybackNotificationManager.CHANNEL_ID)
            .setSmallIcon(R.drawable.ic_notification)
            .setContentTitle(track?.title ?: context.getString(R.string.unknown_track))
            .setContentText(track?.artist ?: context.getString(R.string.unknown_artist))
            .setContentIntent(PlaybackNotificationManager.createMainActivityPendingIntent(context))
            .setVisibility(NotificationCompat.VISIBILITY_PUBLIC)
            .setOngoing(player?.isPlaying == true)
            .setShowWhen(false)

        // Добавляем кнопки управления
        builder.addAction(
            R.drawable.ic_skip_previous_24,
            "Previous",
            PlaybackService.createPendingIntent(context, PlaybackService.ACTION_PREVIOUS)
        )

        if (player?.isPlaying == true) {
            builder.addAction(
                R.drawable.ic_pause_24,
                "Pause",
                PlaybackService.createPendingIntent(context, PlaybackService.ACTION_PAUSE)
            )
        } else {
            builder.addAction(
                R.drawable.ic_play_arrow_24,
                "Play",
                PlaybackService.createPendingIntent(context, PlaybackService.ACTION_PLAY)
            )
        }

        builder.addAction(
            R.drawable.ic_skip_next_24,
            "Next",
            PlaybackService.createPendingIntent(context, PlaybackService.ACTION_NEXT)
        )

        // Загружаем обложку альбома
        val artUrl = track?.getAlbumArtUrl()
        if (artUrl != null) {
            val bitmap = loadBitmapSync(artUrl)
            if (bitmap != null) {
                builder.setLargeIcon(bitmap)
            }
        }

        return builder.build()
    }

    private fun getCurrentTrack(player: Player?): AudioTrack? {
        if (player == null) return null
        val app = context.applicationContext as com.werhes.museeks.MuseeksApplication
        return app.playerManager.currentTrack
    }

    private fun loadBitmapSync(url: String): Bitmap? {
        return try {
            val request = coil.request.ImageRequest.Builder(context)
                .data(url)
                .allowHardware(false)
                .build()
            val result = runBlocking {
                coil.Coil.imageLoader(context).execute(request)
            }
            result.drawable?.toBitmap()
        } catch (e: Exception) {
            null
        }
    }
}

private fun Drawable.toBitmap(): Bitmap {
    if (this is BitmapDrawable) {
        return bitmap
    }
    val bitmap = Bitmap.createBitmap(
        intrinsicWidth.coerceAtLeast(1),
        intrinsicHeight.coerceAtLeast(1),
        Bitmap.Config.ARGB_8888
    )
    val canvas = android.graphics.Canvas(bitmap)
    setBounds(0, 0, canvas.width, canvas.height)
    draw(canvas)
    return bitmap
}