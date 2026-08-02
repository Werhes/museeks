package com.werhes.museeksreborn.playback.widget_glance.platform

import android.content.Context
import android.content.Intent
import androidx.glance.GlanceId
import androidx.glance.GlanceModifier
import androidx.glance.Image
import androidx.glance.ImageProvider
import androidx.glance.action.ActionParameters
import androidx.glance.action.actionParametersOf
import androidx.glance.action.clickable
import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.GlanceAppWidgetReceiver
import androidx.glance.appwidget.action.ActionCallback
import androidx.glance.appwidget.action.actionRunCallback
import androidx.glance.appwidget.provideContent
import androidx.glance.background
import androidx.glance.layout.Alignment
import androidx.glance.layout.Box
import androidx.glance.layout.Column
import androidx.glance.layout.Row
import androidx.glance.layout.Spacer
import androidx.glance.layout.fillMaxSize
import androidx.glance.layout.fillMaxWidth
import androidx.glance.layout.height
import androidx.glance.layout.padding
import androidx.glance.layout.size
import androidx.glance.layout.width
import androidx.glance.text.FontWeight
import androidx.glance.text.Text
import androidx.glance.text.TextAlign
import androidx.glance.text.TextStyle
import androidx.glance.unit.ColorProvider
import com.werhes.museeks.R
import com.werhes.museeks.service.PlaybackService

/**
 * Glance widget that shows currently playing track with play/pause controls.
 * Uses the Glance AppWidget framework for a modern, responsive widget.
 */
class PlayerGlanceWidget : GlanceAppWidget() {

    companion object {
        const val ACTION_PLAY_PAUSE = "action_play_pause"
        const val ACTION_NEXT = "action_next"
        const val ACTION_PREVIOUS = "action_previous"
        const val ACTION_OPEN_APP = "action_open_app"
    }

    override suspend fun provideContent(context: Context, id: GlanceId) {
        provideContent {
            Box(
                modifier = GlanceModifier
                    .fillMaxSize()
                    .background(ColorProvider(R.color.glance_colorWidgetBackground))
                    .padding(12.dp),
                contentAlignment = Alignment.Center
            ) {
                Column(
                    modifier = GlanceModifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    // Track info
                    Text(
                        text = context.getString(R.string.widget_glance_playing),
                        style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            color = ColorProvider(R.color.glance_colorOnSurface),
                            textAlign = TextAlign.Center
                        ),
                        modifier = GlanceModifier.fillMaxWidth()
                    )

                    Spacer(modifier = GlanceModifier.height(4.dp))

                    Text(
                        text = context.getString(R.string.widget_glance_playing_empty_state),
                        style = TextStyle(
                            color = ColorProvider(R.color.glance_colorOnSurfaceVariant),
                            textAlign = TextAlign.Center
                        ),
                        modifier = GlanceModifier.fillMaxWidth()
                    )

                    Spacer(modifier = GlanceModifier.height(8.dp))

                    // Playback controls
                    Row(
                        modifier = GlanceModifier.fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        // Previous button
                        Image(
                            provider = ImageProvider(R.drawable.ic_skip_previous_24),
                            contentDescription = "Previous",
                            modifier = GlanceModifier
                                .size(36.dp)
                                .clickable(actionRunCallback(PlaybackActionCallback::class.java, actionParametersOf(ActionParameters.Key<String>("action") to ACTION_PREVIOUS)))
                        )

                        Spacer(modifier = GlanceModifier.width(24.dp))

                        // Play/Pause button
                        Image(
                            provider = ImageProvider(R.drawable.ic_play_arrow_24),
                            contentDescription = "Play/Pause",
                            modifier = GlanceModifier
                                .size(48.dp)
                                .clickable(actionRunCallback(PlaybackActionCallback::class.java, actionParametersOf(ActionParameters.Key<String>("action") to ACTION_PLAY_PAUSE)))
                        )

                        Spacer(modifier = GlanceModifier.width(24.dp))

                        // Next button
                        Image(
                            provider = ImageProvider(R.drawable.ic_skip_next_24),
                            contentDescription = "Next",
                            modifier = GlanceModifier
                                .size(36.dp)
                                .clickable(actionRunCallback(PlaybackActionCallback::class.java, actionParametersOf(ActionParameters.Key<String>("action") to ACTION_NEXT)))
                        )
                    }

                    Spacer(modifier = GlanceModifier.height(4.dp))

                    // Tap to open app
                    Text(
                        text = context.getString(R.string.open_vkx),
                        style = TextStyle(
                            color = ColorProvider(R.color.glance_colorPrimary),
                            textAlign = TextAlign.Center,
                            fontWeight = FontWeight.Medium
                        ),
                        modifier = GlanceModifier
                            .fillMaxWidth()
                            .clickable(actionRunCallback(PlaybackActionCallback::class.java, actionParametersOf(ActionParameters.Key<String>("action") to ACTION_OPEN_APP)))
                    )
                }
            }
        }
    }
}

/**
 * Action callback for widget playback controls.
 * Sends intents to PlaybackService for media control.
 */
class PlaybackActionCallback : ActionCallback {
    override suspend fun onAction(context: Context, glanceId: GlanceId, parameters: ActionParameters) {
        val action = parameters[ActionParameters.Key<String>("action")] ?: return

        when (action) {
            PlayerGlanceWidget.ACTION_PLAY_PAUSE -> {
                val intent = Intent(context, PlaybackService::class.java).apply {
                    this.action = "toggle_play_pause"
                }
                context.startService(intent)
            }
            PlayerGlanceWidget.ACTION_NEXT -> {
                val intent = Intent(context, PlaybackService::class.java).apply {
                    this.action = "next"
                }
                context.startService(intent)
            }
            PlayerGlanceWidget.ACTION_PREVIOUS -> {
                val intent = Intent(context, PlaybackService::class.java).apply {
                    this.action = "previous"
                }
                context.startService(intent)
            }
            PlayerGlanceWidget.ACTION_OPEN_APP -> {
                val intent = context.packageManager.getLaunchIntentForPackage(context.packageName)
                intent?.let {
                    it.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_SINGLE_TOP
                    context.startActivity(it)
                }
            }
        }
    }
}

/**
 * Receiver for PlayerGlanceWidget.
 * Registered in AndroidManifest.xml.
 */
class PlayerGlanceWidgetReceiver : GlanceAppWidgetReceiver() {
    override val glanceAppWidget: GlanceAppWidget = PlayerGlanceWidget()
}