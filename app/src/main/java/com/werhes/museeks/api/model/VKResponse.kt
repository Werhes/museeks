package com.werhes.museeks.api.model

import kotlinx.serialization.Serializable

@Serializable
data class VKResponse<T>(
    val response: T? = null,
    val error: VKError? = null
)

@Serializable
data class VKError(
    val error_code: Int = 0,
    val error_msg: String? = null,
    val error_text: String? = null,
    val request_params: List<VKRequestParam>? = null
)

@Serializable
data class VKRequestParam(
    val key: String? = null,
    val value: String? = null
)

@Serializable
data class VKResponseWithItems<T>(
    val count: Int = 0,
    val items: List<T> = emptyList()
)