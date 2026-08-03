package com.werhes.museeks.api.model.music

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AudioPlaylist(
    val id: Long = 0,
    val owner_id: Long = 0,
    val title: String = "",
    val description: String? = null,
    val access_key: String? = null,
    val count: Int = 0,
    val plays: Int = 0,
    val followers: Int = 0,
    val photo: AudioPlaylistPhoto? = null,
    val thumbs: List<AudioPlaylistThumb>? = null,
    val album_meta: AlbumMeta? = null,
    val main_artists: List<AudioPlaylistArtist>? = null,
    val subtitle: String? = null,
    val is_following: Boolean = false,
    val year: Int? = null,
    val genre: String? = null,
    val create_time: Long? = null,
    val update_time: Long? = null,
    val original: OriginalPlaylist? = null,
    val followed_metadata: FollowedMetadata? = null,
    val permissions: AudioPlaylistPermissions? = null
) {
    val artistName: String
        get() = main_artists?.firstOrNull()?.name
            ?: subtitle
            ?: ""

    val tracksCount: Int
        get() = count

    val photoUrl: String?
        get() {
            photo?.let {
                it.sizes?.maxByOrNull { s -> s.width }?.url?.let { return it }
            }
            thumbs?.firstOrNull()?.let {
                it.photo_sizes?.maxByOrNull { s -> s.width }?.url?.let { return it }
            }
            album_meta?.photo?.let { return it }
            return null
        }
}

@Serializable
data class AudioPlaylistPhoto(
    val sizes: List<PhotoSize>? = null
)

@Serializable
data class AudioPlaylistThumb(
    val photo_sizes: List<PhotoSize>? = null
)

@Serializable
data class AudioPlaylistArtist(
    val id: Long = 0,
    val name: String = "",
    val domain: String? = null
)

@Serializable
data class AlbumMeta(
    val photo: String? = null,
    val title: String? = null
)

@Serializable
data class OriginalPlaylist(
    val owner_id: Long = 0,
    val id: Long = 0,
    val access_key: String? = null
)

@Serializable
data class FollowedMetadata(
    val is_followed: Boolean = false
)

@Serializable
data class AudioPlaylistPermissions(
    val can_edit: Boolean = false,
    val can_delete: Boolean = false,
    val can_report: Boolean = false
)