package com.werhes.museeks.data.repository

import com.werhes.museeks.MuseeksApplication
import com.werhes.museeks.api.model.music.AudioPlaylist
import com.werhes.museeks.api.model.music.AudioTrack
import com.werhes.museeks.api.model.users.VKProfile

class MusicRepository(private val app: MuseeksApplication) {

    suspend fun getTracks(ownerId: Long, offset: Int = 0, count: Int = 50): Result<List<AudioTrack>> {
        return app.apiClient.getAudio(ownerId, offset, count).map { it.items }
    }

    suspend fun getPlaylists(ownerId: Long, offset: Int = 0, count: Int = 50): Result<List<AudioPlaylist>> {
        return app.apiClient.getPlaylists(ownerId, offset, count).map { it.items }
    }

    suspend fun getPlaylistTracks(ownerId: Long, playlistId: Int, offset: Int = 0, count: Int = 50): Result<List<AudioTrack>> {
        return app.apiClient.getPlaylistTracks(ownerId, playlistId, offset, count).map { it.items }
    }

    suspend fun searchTracks(query: String, offset: Int = 0, count: Int = 50): Result<List<AudioTrack>> {
        return app.apiClient.searchAudio(query, offset, count).map { it.items }
    }

    suspend fun getRecommendations(offset: Int = 0, count: Int = 50): Result<List<AudioTrack>> {
        return app.apiClient.getRecommendations(offset, count).map { it.items }
    }

    suspend fun getProfile(userIds: String): Result<List<VKProfile>> {
        return app.apiClient.getProfile(userIds)
    }

    suspend fun getFriends(offset: Int = 0, count: Int = 50): Result<List<VKProfile>> {
        return app.apiClient.getFriends(offset, count).map { it.items }
    }
}