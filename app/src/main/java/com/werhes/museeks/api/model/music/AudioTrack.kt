package com.werhes.museeks.api.model.music

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AudioTrack(
    val id: Long = 0,
    val owner_id: Long = 0,
    val artist: String = "",
    val title: String = "",
    val duration: Int = 0,
    val url: String? = null,
    val track_code: String? = null,
    val genre_id: Int? = null,
    val date: Long? = null,
    val album: AudioAlbum? = null,
    val is_explicit: Boolean = false,
    val is_focus_track: Boolean? = null,
    val no_search: Boolean? = null,
    val main_artists: List<AudioArtist>? = null,
    val featured_artists: List<AudioArtist>? = null,
    val track_covers: List<AudioCover>? = null,
    val lyrics_id: Long? = null,
    val subtitle: String? = null,
    val restriction: MusicRestriction? = null,
    val chart_info: AudioChartInfo? = null
) {
    fun getAlbumArtUrl(): String? {
        track_covers?.let { covers ->
            if (covers.isNotEmpty()) {
                val cover = covers.first()
                return cover.photo_sizes?.maxByOrNull { it.width }?.url
                    ?: cover.photo_sizes?.lastOrNull()?.url
            }
        }
        return album?.thumb?.photo_sizes?.maxByOrNull { it.width }?.url
            ?: album?.thumb?.photo_sizes?.lastOrNull()?.url
    }
}

@Serializable
data class AudioArtist(
    val id: Long = 0,
    val name: String = "",
    val domain: String? = null,
    val photo: String? = null
)

@Serializable
data class AudioCover(
    val photo_sizes: List<PhotoSize>? = null
)

@Serializable
data class PhotoSize(
    val url: String = "",
    val width: Int = 0,
    val height: Int = 0
)

@Serializable
data class AudioChartInfo(
    val position: Int? = null,
    val chart_type: String? = null
)

@Serializable
data class MusicRestriction(
    val text: String? = null
)

@Serializable
data class AudioAlbum(
    val id: Long = 0,
    val title: String = "",
    val owner_id: Long = 0,
    val access_key: String? = null,
    val thumb: AudioAlbumThumb? = null
)

@Serializable
data class AudioAlbumThumb(
    val photo_sizes: List<PhotoSize>? = null
)