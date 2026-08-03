package com.werhes.museeks.api.model.podcasts

import kotlinx.serialization.Serializable

@Serializable
data class PodcastInfo(
    val id: Long = 0,
    val owner_id: Long = 0,
    val title: String = "",
    val url: String? = null,
    val cover: PodcastCover? = null
)

@Serializable
data class PodcastCover(
    val sizes: List<PodcastCoverSize>? = null
)

@Serializable
data class PodcastCoverSize(
    val url: String = "",
    val width: Int = 0,
    val height: Int = 0
)