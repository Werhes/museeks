package com.werhes.museeks.api.model.auth

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AuthResponse(
    val token: String? = null,
    val secret: String? = null,
    val phone: String? = null,
    val `val`: String? = null,
    val tfa_app: Boolean? = null,
    val tfa_required: Boolean? = null,
    val tfa_type: String? = null,
    val sms_to: String? = null,
    val sms_code_length: Int? = null,
    val validation_type: String? = null,
    val validation_sid: String? = null,
    val phone_mask: String? = null,
    val error: String? = null,
    val error_description: String? = null
)

@Serializable
data class AuthValidateResponse(
    val token: String? = null,
    val secret: String? = null,
    val error: String? = null,
    val error_description: String? = null
)

@Serializable
data class RefreshTokenResponse(
    val access_token: String? = null,
    val refresh_token: String? = null,
    val error: String? = null,
    val error_description: String? = null
)

@Serializable
data class VkConnectResponse(
    val token: String? = null,
    val secret: String? = null,
    val device_id: String? = null,
    val error: String? = null
)