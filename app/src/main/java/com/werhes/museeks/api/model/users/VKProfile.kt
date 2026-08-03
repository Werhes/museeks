package com.werhes.museeks.api.model.users

import kotlinx.serialization.Serializable

@Serializable
data class VKProfile(
    val id: Long = 0,
    val first_name: String = "",
    val last_name: String = "",
    val photo_100: String? = null,
    val photo_200: String? = null,
    val photo_max_orig: String? = null,
    val sex: Int? = null,
    val domain: String? = null,
    val status: String? = null,
    val online: Boolean = false,
    val can_access_closed: Boolean = true,
    val is_closed: Boolean = false
) {
    val fullName: String get() = "$first_name $last_name"
    val photoUrl: String? get() = photo_max_orig ?: photo_200 ?: photo_100
}