package com.werhes.museeks.auth

import android.content.Context
import android.webkit.WebView
import android.webkit.WebViewClient
import android.webkit.WebChromeClient
import com.werhes.museeks.MuseeksApplication
import com.werhes.museeks.util.Constants
import kotlinx.coroutines.suspendCancellableCoroutine
import kotlin.coroutines.resume

class VkAuthManager(private val context: Context) {

    private val app = context.applicationContext as MuseeksApplication

    suspend fun startPhoneAuth(phone: String): Result<Unit> {
        return app.apiClient.authByPhone(phone).map { }
    }

    suspend fun confirmCode(sid: String, code: String): Result<String> {
        val response = app.apiClient.authValidateCode(sid, code)
        return response.map { it.token ?: throw Exception("No token in response") }
    }

    suspend fun loginWithToken(token: String) {
        val deviceId = app.userPreferences.getDeviceId() ?: Constants.DEVICE_ID
        val connectResult = app.apiClient.vkConnect(token, deviceId)
        app.userPreferences.saveAuthData(
            accessToken = token,
            deviceId = deviceId
        )
    }

    suspend fun logout() {
        app.playerManager.stop()
        app.userPreferences.clearAuth()
    }

    suspend fun isLoggedIn(): Boolean {
        return app.userPreferences.getAccessToken() != null
    }
}