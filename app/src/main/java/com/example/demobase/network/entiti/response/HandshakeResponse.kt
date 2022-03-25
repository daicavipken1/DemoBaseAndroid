package com.example.demobase.network.entiti.response

import com.example.demobase.base.BaseResponseEntity
import com.google.gson.annotations.SerializedName

data class HandshakeResponse(
    @SerializedName("Data") val Data: Data
) : BaseResponseEntity()

data class Data(
    @SerializedName("Salt")
    val Salt: String,
    @SerializedName("SessionKey")
    val SessionKey: String,
    @SerializedName("PublicKey")
    val PublicKey: String,
)