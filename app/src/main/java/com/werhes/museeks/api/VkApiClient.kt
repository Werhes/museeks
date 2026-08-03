package com.werhes.museeks.api

import com.werhes.museeks.api.model.VKResponse
import com.werhes.museeks.api.model.VKResponseWithItems
import com.werhes.museeks.api.model.auth.AuthResponse
import com.werhes.museeks.api.model.auth.AuthValidateResponse
import com.werhes.museeks.api.model.auth.RefreshTokenResponse
import com.werhes.museeks.api.model.auth.VkConnectResponse
import com.werhes.museeks.api.model.music.AudioLyrics
import com.werhes.museeks.api.model.music.AudioPlaylist
import com.werhes.museeks.api.model.music.AudioTrack
import com.werhes.museeks.api.model.users.VKProfile
import com.werhes.museeks.util.Constants
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.engine.android.*
import io.ktor.client.plugins.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive

class VkApiClient(
    private val tokenProvider: suspend () -> String?
) {
    private val json = Json {
        ignoreUnknownKeys = true
        isLenient = true
        coerceInputValues = true
    }

    private val client = HttpClient(Android) {
        install(ContentNegotiation) {
            json(json)
        }
        install(HttpTimeout) {
            requestTimeoutMillis = 30_000
            connectTimeoutMillis = 15_000
        }
        defaultRequest {
            url(Constants.VK_API_BASE_URL)
        }
    }

    // ===== Auth (по телефону, как в VK X) =====

    suspend fun authByPhone(phone: String): Result<AuthResponse> = runCatching {
        val response: AuthResponse = client.get("https://oauth.vk.com/token") {
            parameter("grant_type", "password")
            parameter("client_id", Constants.VK_CLIENT_ID)
            parameter("client_secret", Constants.VK_CLIENT_SECRET)
            parameter("username", phone)
            parameter("password", "")
            parameter("v", Constants.VK_API_VERSION)
            parameter("2fa_supported", "1")
            parameter("force_sms", "1")
            parameter("scope", Constants.VK_SCOPE)
        }.body()
        response
    }

    suspend fun authValidateCode(sid: String, code: String): Result<AuthValidateResponse> = runCatching {
        val response: AuthValidateResponse = client.get("https://oauth.vk.com/token") {
            parameter("grant_type", "password")
            parameter("client_id", Constants.VK_CLIENT_ID)
            parameter("client_secret", Constants.VK_CLIENT_SECRET)
            parameter("username", "")
            parameter("password", "")
            parameter("v", Constants.VK_API_VERSION)
            parameter("2fa_supported", "1")
            parameter("validation_sid", sid)
            parameter("code", code)
            parameter("scope", Constants.VK_SCOPE)
        }.body()
        response
    }

    suspend fun refreshToken(refreshToken: String): Result<RefreshTokenResponse> = runCatching {
        val response: RefreshTokenResponse = client.get("https://oauth.vk.com/token") {
            parameter("grant_type", "refresh_token")
            parameter("client_id", Constants.VK_CLIENT_ID)
            parameter("client_secret", Constants.VK_CLIENT_SECRET)
            parameter("refresh_token", refreshToken)
        }.body()
        response
    }

    suspend fun vkConnect(token: String, deviceId: String): Result<VkConnectResponse> = runCatching {
        val response: VkConnectResponse = client.get(Constants.VK_CONNECT_URL) {
            parameter("v", Constants.VK_API_VERSION)
            parameter("access_token", token)
            parameter("device_id", deviceId)
        }.body()
        response
    }

    // ===== API Methods =====

    private suspend fun <T> call(
        method: String,
        params: Map<String, String> = emptyMap(),
        deserializer: (String) -> T
    ): Result<T> = runCatching {
        val token = tokenProvider() ?: throw VkApiException("Not authenticated")
        val response: String = client.get(method) {
            parameter("v", Constants.VK_API_VERSION)
            parameter("access_token", token)
            params.forEach { (k, v) -> parameter(k, v) }
        }.bodyAsText()

        val jsonObj = json.parseToJsonElement(response).jsonObject
        val error = jsonObj["error"]
        if (error != null) {
            val errorCode = error.jsonObject["error_code"]?.jsonPrimitive?.content ?: "-1"
            val errorMsg = error.jsonObject["error_msg"]?.jsonPrimitive?.content ?: "Unknown error"
            throw VkApiException("VK API error $errorCode: $errorMsg")
        }

        val responseData = jsonObj["response"]?.toString() ?: throw VkApiException("No response field")
        deserializer(responseData)
    }

    suspend fun getAudio(ownerId: Long, offset: Int = 0, count: Int = 50): Result<VKResponseWithItems<AudioTrack>> =
        call("audio.get", mapOf(
            "owner_id" to ownerId.toString(),
            "offset" to offset.toString(),
            "count" to count.toString()
        )) { json.decodeFromString(it) }

    suspend fun getAudioById(audioId: String): Result<List<AudioTrack>> =
        call("audio.getById", mapOf("audios" to audioId)) { json.decodeFromString(it) }

    suspend fun getRecommendations(offset: Int = 0, count: Int = 50): Result<VKResponseWithItems<AudioTrack>> =
        call("audio.getRecommendations", mapOf(
            "offset" to offset.toString(),
            "count" to count.toString()
        )) { json.decodeFromString(it) }

    suspend fun searchAudio(query: String, offset: Int = 0, count: Int = 50): Result<VKResponseWithItems<AudioTrack>> =
        call("audio.search", mapOf(
            "q" to query,
            "offset" to offset.toString(),
            "count" to count.toString()
        )) { json.decodeFromString(it) }

    suspend fun getPopular(genreId: Int? = null, offset: Int = 0, count: Int = 50): Result<VKResponseWithItems<AudioTrack>> {
        val params = mutableMapOf("offset" to offset.toString(), "count" to count.toString())
        genreId?.let { params["genre_id"] = it.toString() }
        return call("audio.getPopular", params) { json.decodeFromString(it) }
    }

    suspend fun getPlaylist(ownerId: Long, playlistId: Int, accessKey: String? = null): Result<AudioPlaylist> {
        val params = mutableMapOf(
            "owner_id" to ownerId.toString(),
            "playlist_id" to playlistId.toString()
        )
        accessKey?.let { params["access_key"] = it }
        return call("audio.getPlaylist", params) { json.decodeFromString(it) }
    }

    suspend fun getPlaylistTracks(ownerId: Long, playlistId: Int, offset: Int = 0, count: Int = 50): Result<VKResponseWithItems<AudioTrack>> =
        call("audio.getPlaylistTracks", mapOf(
            "owner_id" to ownerId.toString(),
            "playlist_id" to playlistId.toString(),
            "offset" to offset.toString(),
            "count" to count.toString()
        )) { json.decodeFromString(it) }

    suspend fun getPlaylists(ownerId: Long, offset: Int = 0, count: Int = 50): Result<VKResponseWithItems<AudioPlaylist>> =
        call("audio.getPlaylists", mapOf(
            "owner_id" to ownerId.toString(),
            "offset" to offset.toString(),
            "count" to count.toString()
        )) { json.decodeFromString(it) }

    suspend fun followPlaylist(ownerId: Long, playlistId: Int, accessKey: String? = null): Result<Int> {
        val params = mutableMapOf(
            "owner_id" to ownerId.toString(),
            "playlist_id" to playlistId.toString()
        )
        accessKey?.let { params["access_key"] = it }
        return call("audio.followPlaylist", params) { json.decodeFromString<JsonObject>(it)["followers"]?.jsonPrimitive?.content?.toIntOrNull() ?: 0 }
    }

    suspend fun getCatalog(): Result<List<JsonObject>> =
        call("catalog.getCatalog", mapOf()) { json.decodeFromString(it) }

    suspend fun getCatalogBlock(blockId: String): Result<JsonObject> =
        call("catalog.getCatalogBlock", mapOf("block_id" to blockId)) { json.decodeFromString(it) }

    suspend fun getLyrics(lyricsId: Int): Result<AudioLyrics> =
        call("audio.getLyrics", mapOf("lyrics_id" to lyricsId.toString())) { json.decodeFromString(it) }

    suspend fun getProfile(userIds: String): Result<List<VKProfile>> =
        call("users.get", mapOf("user_ids" to userIds, "fields" to "photo_100,photo_200,photo_max_orig,sex,domain,status,online")) { json.decodeFromString(it) }

    suspend fun getFriends(offset: Int = 0, count: Int = 50): Result<VKResponseWithItems<VKProfile>> =
        call("friends.get", mapOf(
            "offset" to offset.toString(),
            "count" to count.toString(),
            "fields" to "photo_100,photo_200,photo_max_orig,sex,domain,status,online"
        )) { json.decodeFromString(it) }

    suspend fun execute(code: String): Result<JsonObject> =
        call("execute", mapOf("code" to code)) { json.decodeFromString(it) }
}

class VkApiException(message: String) : Exception(message)