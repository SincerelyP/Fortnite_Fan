package com.example.fortnitefan.data

import okhttp3.Interceptor
import okhttp3.Response
import retrofit2.http.GET

class MyInterceptor: Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain
            .request()
            .newBuilder()
            .addHeader("Authorization","2c32e6a6-2255-47a8-a72f-bff077036f73")
            .build()
        return chain.proceed(request)
    }

}