package com.werhes.museeksreborn.playback.auto2

import androidx.car.app.CarContext
import androidx.car.app.Screen
import androidx.car.app.model.Action
import androidx.car.app.model.ActionStrip
import androidx.car.app.model.CarIcon
import androidx.car.app.model.ItemList
import androidx.car.app.model.Row
import androidx.car.app.model.Template
import androidx.car.app.model.ListTemplate
import androidx.core.graphics.drawable.IconCompat
import com.werhes.museeks.R

/**
 * Now Playing screen for Android Auto.
 * Shows current track info and playback controls.
 */
class NowPlayingScreen(carContext: CarContext) : Screen(carContext) {

    override fun onGetTemplate(): Template {
        val listBuilder = ItemList.Builder()

        // Placeholder: currently playing track
        listBuilder.addItem(
            Row.Builder()
                .setTitle("Museeks")
                .addText("No track playing")
                .setImage(
                    CarIcon.Builder(
                        IconCompat.createWithResource(
                            carContext,
                            R.drawable.ic_notification
                        )
                    ).build()
                )
                .build()
        )

        val actionStripBuilder = ActionStrip.Builder()
        actionStripBuilder.addAction(
            Action.Builder()
                .setTitle("Open app")
                .setOnClickListener {
                    // Open main app
                }
                .build()
        )

        return ListTemplate.Builder()
            .setTitle("Now Playing")
            .setSingleList(listBuilder.build())
            .setActionStrip(actionStripBuilder.build())
            .build()
    }
}