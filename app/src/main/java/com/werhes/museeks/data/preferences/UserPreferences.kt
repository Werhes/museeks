package com.werhes.museeks.data.preferences

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.map

private val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = "museeks_prefs")

class UserPreferences(private val context: Context) {

    companion object {
        private val ACCESS_TOKEN = stringPreferencesKey("access_token")
        private val REFRESH_TOKEN = stringPreferencesKey("refresh_token")
        private val USER_ID = stringPreferencesKey("user_id")
        private val DEVICE_ID = stringPreferencesKey("device_id")
        private val SECRET = stringPreferencesKey("secret")
        private val PHONE = stringPreferencesKey("phone")
    }

    val accessTokenFlow: Flow<String?> = context.dataStore.data.map { it[ACCESS_TOKEN] }
    val userIdFlow: Flow<String?> = context.dataStore.data.map { it[USER_ID] }

    suspend fun getAccessToken(): String? = context.dataStore.data.first()[ACCESS_TOKEN]
    suspend fun getRefreshToken(): String? = context.dataStore.data.first()[REFRESH_TOKEN]
    suspend fun getUserId(): String? = context.dataStore.data.first()[USER_ID]
    suspend fun getDeviceId(): String? = context.dataStore.data.first()[DEVICE_ID]
    suspend fun getSecret(): String? = context.dataStore.data.first()[SECRET]
    suspend fun getPhone(): String? = context.dataStore.data.first()[PHONE]

    suspend fun saveAuthData(
        accessToken: String,
        refreshToken: String? = null,
        userId: String? = null,
        deviceId: String? = null,
        secret: String? = null,
        phone: String? = null
    ) {
        context.dataStore.edit { prefs ->
            prefs[ACCESS_TOKEN] = accessToken
            if (refreshToken != null) prefs[REFRESH_TOKEN] = refreshToken
            if (userId != null) prefs[USER_ID] = userId
            if (deviceId != null) prefs[DEVICE_ID] = deviceId
            if (secret != null) prefs[SECRET] = secret
            if (phone != null) prefs[PHONE] = phone
        }
    }

    suspend fun clearAuth() {
        context.dataStore.edit { prefs ->
            prefs.clear()
        }
    }
}