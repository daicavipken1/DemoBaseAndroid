package com.example.demobase.network.service

import com.example.demobase.network.entiti.request.HandShakeRequest
import com.example.demobase.network.entiti.response.HandshakeResponse
import com.example.demobase.utils.Tags
import retrofit2.http.Body
import retrofit2.http.POST

interface CommonService {
    @POST(Tags.ENDPOINT_HANDSHAKE)
    suspend fun handShake(
        @Body data: HandShakeRequest,
    ): HandshakeResponse

    @POST(Tags.ENDPOINT_INIT_APP)
    suspend fun initApp(
        @Body data: String,
    ): String

    @POST(Tags.ENDPOINT_AUTHENTICATION)
    suspend fun authentication(
        @Body data: String,
    ): String

    @POST(Tags.ENDPOINT_LOGON)
    suspend fun logon(
        @Body data: String,
    ): String


    @POST(Tags.ENDPOINT_SALE)
    suspend fun sale(
        @Body data: String,
    ): String

    @POST(Tags.ENDPOINT_LOAD_IPEK)
    suspend fun loadIPEK(
        @Body data: String,
    ): String

    @POST(Tags.ENDPOINT_TRANSACTION_HISTORY)
    suspend fun transactionHistory(
        @Body data: String
    ): String

    @POST(Tags.ENDPOINT_TRANSACTION_DETAIL)
    suspend fun transactionDetail(
        @Body data: String
    ): String

    @POST(Tags.ENDPOINT_SUBMIT_RECEIPT)
    suspend fun submitReceipt(
        @Body data: String
    ): String


    @POST(Tags.ENDPOINT_REFUND_LIST)
    suspend fun refundList(
        @Body data: String,
    ): String

    @POST(Tags.ENDPOINT_REFUND)
    suspend fun refund(
        @Body data: String,
    ): String

    @POST(Tags.ENDPOINT_REFUND_DETAIL)
    suspend fun refundDetail(
        @Body data: String,
    ): String

    @POST(Tags.ENDPOINT_COMPLETE_TXN)
    suspend fun completeTransaction(
        @Body data: String,
    ): String

    @POST(Tags.ENDPOINT_SALE_MOTO)
    suspend fun saleMoto(
        @Body data: String,
    ): String
}