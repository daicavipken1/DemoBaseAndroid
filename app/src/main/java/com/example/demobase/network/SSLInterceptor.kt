package com.example.demobase.network

import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response

class SSLInterceptor: Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        val response = chain.proceed(Request.Builder().build())
        return response.newBuilder().code(401)
            .message("SessionExpired")
            .addHeader("code", "401")
            .addHeader("request-data", "")

            .build()
    }
}