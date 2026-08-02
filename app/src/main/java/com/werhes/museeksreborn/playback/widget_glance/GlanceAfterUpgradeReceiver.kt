package com.werhes.museeksreborn.playback.widget_glance

import android.appwidget.AppWidgetManager
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import androidx.glance.appwidget.GlanceAppWidgetManager
import androidx.glance.appwidget.state.updateAllState

/**
 * Receiver that handles widget updates after app upgrade.
 * Ensures Glance widgets are properly re-initialized.
 */
class GlanceAfterUpgradeReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        if (intent.action == AppWidgetManager.ACTION_APPWIDGET_UPDATE) {
            // Trigger update for all Glance widgets
            val glanceManager = GlanceAppWidgetManager(context)
            val glanceIds = glanceManager.getGlanceIds(
                com.werhes.museeksreborn.playback.widget_glance.platform.PlayerGlanceWidget::class.java
            )
            for (glanceId in glanceIds) {
                com.werhes.museeksreborn.playback.widget_glance.platform.PlayerGlanceWidget().update(context, glanceId)
            }

            val playlistGlanceIds = glanceManager.getGlanceIds(
                com.werhes.museeksreborn.playback.widget_glance.platform.SmallPlaylistsGlanceWidget::class.java
            )
            for (glanceId in playlistGlanceIds) {
                com.werhes.museeksreborn.playback.widget_glance.platform.SmallPlaylistsGlanceWidget().update(context, glanceId)
            }
        }
    }
}