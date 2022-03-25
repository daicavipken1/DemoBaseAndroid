package com.example.demobase.network.entiti.request

import com.example.demobase.base.BaseRequestEntity
import com.google.gson.annotations.SerializedName

data class HandShakeRequest(
    @SerializedName("Data") var data: DataHandshake?
) : BaseRequestEntity()

data class DataHandshake(
    @SerializedName("PublicKey") var PublicKey: String?
)
