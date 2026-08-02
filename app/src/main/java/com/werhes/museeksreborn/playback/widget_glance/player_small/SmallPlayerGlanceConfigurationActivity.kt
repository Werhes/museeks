package com.werhes.museeksreborn.playback.widget_glance.player_small

import android.app.Activity
import android.appwidget.AppWidgetManager
import android.content.Intent
import android.os.Bundle
import com.werhes.museeks.R

/**
 * Configuration activity for SmallPlayerGlanceWidget.
 * Allows user to configure widget source (recent tracks or recommendations).
 */
class SmallPlayerGlanceConfigurationActivity : Activity() {

    private var appWidgetId = AppWidgetManager.INVALID_APPWIDGET_ID

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setResult(RESULT_CANCELED)

        appWidgetId = intent?.getIntExtra(
            AppWidgetManager.EXTRA_APPWIDGET_ID,
            AppWidgetManager.INVALID_APPWIDGET_ID
        ) ?: AppWidgetManager.INVALID_APPWIDGET_ID

        if (appWidgetId == AppWidgetManager.INVALID_APPWIDGET_ID) {
            finish()
            return
        }

        // Simple confirmation - widget will use default settings
        val resultValue = Intent().putExtra(
            AppWidgetManager.EXTRA_APPWIDGET_ID,
            appWidgetId
        )
        setResult(RESULT_OK, resultValue)

        // Trigger initial widget update
        val appWidgetManager = AppWidgetManager.getInstance(this)
        val views = android.widget.RemoteViews(packageName, R.layout.glance_default_loading_layout)
        appWidgetManager.updateAppWidget(appWidgetId, views)

        finish()
    }
}