package com.werhes.museeks.service

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import androidx.annotation.OptIn
import androidx.core.app.NotificationCompat
import androidx.media3.common.Player
import androidx.media3.common.util.UnstableApi
import androidx.media3.session.MediaSession
import androidx.media3.ui.PlayerNotificationManager
import com.werhes.museeks.MainActivity
import com.werhes.museeks.R
import com.werhes.museeks.api.model.music.AudioTrack
import coil.Coil
import coil.request.ImageRequest
import coil.target.Target
import kotlinx.coroutines.runBlocking

@OptIn(UnstableApi::class)
class PlaybackNotificationManager(
    private val context: Context,
    private val mediaSession: MediaSession
) : PlayerNotificationManager.NotificationListener {

    private val notificationManager: PlayerNotificationManager

    init {
        createNotificationChannel()

        notificationManager = PlayerNotificationManager.Builder(context, NOTIFICATION_ID, CHANNEL_ID)
            .setMediaDescriptionAdapter(MuseeksMediaDescriptionAdapter(context))
            .setNotificationListener(this)
            .build()

        notificationManager.setPlayer(mediaSession.player)
        notificationManager.setPriority(NotificationCompat.PRIORITY_LOW)
    }

    fun start() {
        notificationManager.setPlayer(mediaSession.player)
    }

    fun stop() {
        notificationManager.setPlayer(null)
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

    override fun onNotificationPosted(notificationId: Int, notification: android.app.Notification, ongoing: Boolean) {
        // Notification posted
    }

    override fun onNotificationCancelled(notificationId: Int, dismissedByUser: Boolean) {
        // Notification cancelled
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

@OptIn(UnstableApi::class)
class MuseeksMediaDescriptionAdapter(
    private val context: Context
) : PlayerNotificationManager.MediaDescriptionAdapter {

    override fun getCurrentContentTitle(player: Player): CharSequence {
        val track = getCurrentTrack(player)
        return track?.title ?: context.getString(R.string.unknown_track)
    }

    override fun getCurrentContentText(player: Player): CharSequence? {
        val track = getCurrentTrack(player)
        return track?.artist ?: context.getString(R.string.unknown_artist)
    }

    override fun getCurrentLargeIcon(player: Player): CompletableFuture<Bitmap> {
        val future = CompletableFuture<Bitmap>()
        val track = getCurrentTrack(player)
        val artUrl = track?.getAlbumArtUrl()

        if (artUrl != null) {
            val request = ImageRequest.Builder(context)
                .data(artUrl)
                .target(object : Target {
                    override fun onSuccess(result: Drawable) {
                        future.complete(result.toBitmap())
                    }

                    override fun onError(error: Drawable?) {
                        future.complete(null)
                    }

                    override fun onStart(placeholder: Drawable?) {
                        // Not needed
                    }
                })
                .build()
            Coil.imageLoader(context).enqueue(request)
        } else {
            future.complete(null)
        }

        return future
    }

    override fun getCurrentContentIntent(player: Player): PendingIntent? {
        return PlaybackNotificationManager.createMainActivityPendingIntent(context)
    }

    private fun getCurrentTrack(player: Player): AudioTrack? {
        val app = context.applicationContext as com.werhes.museeks.MuseeksApplication
        return app.playerManager.currentTrack
    }
}

private fun Drawable.toBitmap(): Bitmap {
    if (this is BitmapDrawable) {
        return bitmap
    }
    val bitmap = Bitmap.createBitmap(intrinsicWidth.coerceAtLeast(1), intrinsicHeight.coerceAtLeast(1), Bitmap.Config.ARGB_8888)
    val canvas = android.graphics.Canvas(bitmap)
    setBounds(0, 0, canvas.width, canvas.height)
    draw(canvas)
    return bitmap
}