package com.werhes.museeks

import android.app.Application
import com.werhes.museeks.data.preferences.UserPreferences
import com.werhes.museeks.api.VkApiClient
import com.werhes.museeks.player.PlayerManager

class MuseeksApplication : Application() {

    lateinit var userPreferences: UserPreferences
        private set

    lateinit var apiClient: VkApiClient
        private set

    lateinit var playerManager: PlayerManager
        private set

    override fun onCreate() {
        super.onCreate()
        instance = this

        userPreferences = UserPreferences(this)
        playerManager = PlayerManager(this)

        apiClient = VkApiClient(
            tokenProvider = { userPreferences.getAccessToken() }
        )
    }

    companion object {
        lateinit var instance: MuseeksApplication
            private set
    }
}