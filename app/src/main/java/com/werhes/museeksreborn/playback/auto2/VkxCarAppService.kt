package com.werhes.museeksreborn.playback.auto2

import android.content.Intent
import androidx.car.app.CarAppService
import androidx.car.app.Session
import androidx.car.app.SessionInfo
import androidx.car.app.media.CarAppMediaService
import androidx.car.app.media.MediaSession
import androidx.car.app.notification.CarAppNotificationService
import androidx.car.app.validation.HostValidator

/**
 * Android Auto (Car App) service for Museeks.
 * Provides media playback controls in Android Auto and Apple CarPlay (via AA).
 */
class VkxCarAppService : CarAppService() {

    override fun createSession(sessionInfo: SessionInfo): Session {
        return MuseeksCarAppSession(sessionInfo)
    }

    override fun getHostValidator(): HostValidator {
        return HostValidator.ALLOW_ALL_HOSTS_VALIDATOR
    }
}

/**
 * Car App session that provides the media browsing and playback UI.
 */
class MuseeksCarAppSession(
    sessionInfo: SessionInfo
) : Session(sessionInfo) {

    override fun onCreateScreen(intent: Intent) {
        // TODO: Implement Car App media browsing screen
        // This will show: "Now Playing", library, playlists, search
        setScreen(NowPlayingScreen(carContext))
    }
}

/**
 * Media browser service for Android Auto.
 * Provides browse tree and media playback.
 */
class MuseeksCarAppMediaService : CarAppMediaService() {
    // Media session is handled by PlaybackService
}

/**
 * Notification service for Android Auto.
 */
class MuseeksCarAppNotificationService : CarAppNotificationService()