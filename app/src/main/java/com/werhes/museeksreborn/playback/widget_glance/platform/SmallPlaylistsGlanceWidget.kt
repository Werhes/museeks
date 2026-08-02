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

/**
 * Glance widget that shows small playlists/recommendations grid.
 * Tapping opens the app to the corresponding section.
 */
class SmallPlaylistsGlanceWidget : GlanceAppWidget() {

    companion object {
        const val ACTION_OPEN_LIBRARY = "action_open_library"
        const val ACTION_OPEN_RECOMMENDATIONS = "action_open_recommendations"
    }

    override suspend fun provideContent(context: Context, id: GlanceId) {
        provideContent {
            Box(
                modifier = GlanceModifier
                    .fillMaxSize()
                    .background(ColorProvider(com.werhes.museeks.R.color.glance_colorWidgetBackground))
                    .padding(8.dp),
                contentAlignment = Alignment.Center
            ) {
                Column(
                    modifier = GlanceModifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = context.getString(com.werhes.museeks.R.string.widget_glance_recommendations_small),
                        style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            color = ColorProvider(com.werhes.museeks.R.color.glance_colorOnSurface),
                            textAlign = TextAlign.Center
                        ),
                        modifier = GlanceModifier.fillMaxWidth()
                    )

                    Spacer(modifier = GlanceModifier.height(8.dp))

                    Row(
                        modifier = GlanceModifier.fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        // My Music button
                        Column(
                            modifier = GlanceModifier
                                .clickable(actionRunCallback(PlaylistsActionCallback::class.java, actionParametersOf(ActionParameters.Key<String>("action") to ACTION_OPEN_LIBRARY))),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Image(
                                provider = ImageProvider(com.werhes.museeks.R.drawable.ic_playlist_32),
                                contentDescription = context.getString(com.werhes.museeks.R.string.widget_glance_recommendations_type_recent),
                                modifier = GlanceModifier.size(32.dp)
                            )
                            Spacer(modifier = GlanceModifier.height(2.dp))
                            Text(
                                text = context.getString(com.werhes.museeks.R.string.widget_glance_recommendations_type_recent),
                                style = TextStyle(
                                    color = ColorProvider(com.werhes.museeks.R.color.glance_colorOnSurfaceVariant),
                                    textAlign = TextAlign.Center,
                                    fontSize = 10
                                )
                            )
                        }

                        Spacer(modifier = GlanceModifier.width(16.dp))

                        // Recommendations button
                        Column(
                            modifier = GlanceModifier
                                .clickable(actionRunCallback(PlaylistsActionCallback::class.java, actionParametersOf(ActionParameters.Key<String>("action") to ACTION_OPEN_RECOMMENDATIONS))),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Image(
                                provider = ImageProvider(com.werhes.museeks.R.drawable.ic_headphones_outline_24),
                                contentDescription = context.getString(com.werhes.museeks.R.string.widget_glance_recommendations_type_recoms),
                                modifier = GlanceModifier.size(32.dp)
                            )
                            Spacer(modifier = GlanceModifier.height(2.dp))
                            Text(
                                text = context.getString(com.werhes.museeks.R.string.widget_glance_recommendations_type_recoms),
                                style = TextStyle(
                                    color = ColorProvider(com.werhes.museeks.R.color.glance_colorOnSurfaceVariant),
                                    textAlign = TextAlign.Center,
                                    fontSize = 10
                                )
                            )
                        }
                    }
                }
            }
        }
    }
}

/**
 * Action callback for playlists widget.
 */
class PlaylistsActionCallback : ActionCallback {
    override suspend fun onAction(context: Context, glanceId: GlanceId, parameters: ActionParameters) {
        val action = parameters[ActionParameters.Key<String>("action")] ?: return

        val intent = context.packageManager.getLaunchIntentForPackage(context.packageName) ?: return
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_SINGLE_TOP

        when (action) {
            SmallPlaylistsGlanceWidget.ACTION_OPEN_LIBRARY -> {
                intent.putExtra("navigate_to", "library")
            }
            SmallPlaylistsGlanceWidget.ACTION_OPEN_RECOMMENDATIONS -> {
                intent.putExtra("navigate_to", "home")
            }
        }

        context.startActivity(intent)
    }
}

/**
 * Receiver for SmallPlaylistsGlanceWidget.
 * Registered in AndroidManifest.xml.
 */
class SmallPlaylistsGlanceWidgetReceiver : GlanceAppWidgetReceiver() {
    override val glanceAppWidget: GlanceAppWidget = SmallPlaylistsGlanceWidget()
}