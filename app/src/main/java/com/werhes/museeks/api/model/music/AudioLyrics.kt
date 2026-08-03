package com.werhes.museeks.api.model.music

import kotlinx.serialization.Serializable

@Serializable
data class AudioLyrics(
    val lyrics_id: Long = 0,
    val text: String = "",
    val timestamps: List<List<Long>>? = null,
    val md5: String? = null
)