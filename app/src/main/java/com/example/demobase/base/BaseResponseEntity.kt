package com.example.demobase.base

import com.google.gson.annotations.SerializedName

abstract class BaseResponseEntity {
    @SerializedName("ResponseCode")
    var ResponseCode: String? = null

    @SerializedName("Description")
    var Description: String? = null

    @SerializedName("RequestDateTime")
    val RequestDateTime: String? = null

    @SerializedName("RequestID")
    val RequestID: String? = null

    @SerializedName("Status")
    var Status: String? = null


}

class ResponseData : BaseResponseEntity(){

}