package com.example.demobase.base

import com.example.demobase.utils.extendsions.toTimeString
import com.google.gson.annotations.SerializedName
import java.util.*

abstract class BaseRequestEntity {
    @SerializedName("RequestDateTime")
    var RequestDateTime: String? = null

    @SerializedName("RequestID")
    var RequestID: String? = null

    init {
        RequestDateTime =
            System.currentTimeMillis().toTimeString("yyyy-MM-dd'T'HH:mm:ss", Locale.US)
        RequestID = UUID.randomUUID().toString()

    }
}