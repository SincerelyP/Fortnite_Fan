package com.example.fortnitefan.di

import com.example.fortnitefan.data.FortniteApi
import com.example.fortnitefan.data.MyInterceptor
import com.example.fortnitefan.data.constants.Constants.BaseUrl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.HttpUrl
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Named
import javax.inject.Singleton
import okhttp3.HttpUrl.Companion.toHttpUrl
import okhttp3.OkHttpClient


@Module
@InstallIn(SingletonComponent::class)
class NewsInstance {
    private val client = OkHttpClient.Builder().apply {
        addInterceptor(MyInterceptor())
    }.build()

    @Provides
    @Named("BaseUrl")
    fun provideBaseUrl() = BaseUrl.toHttpUrl()

    @Singleton
    @Provides



    fun provRetrofit(
        @Named("BaseUrl")baseUrl: HttpUrl
    ):Retrofit{
        return  Retrofit.Builder()
            .baseUrl(baseUrl)
            .client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    @Singleton
    fun newsObject(retrofit: Retrofit): FortniteApi =
        retrofit.create(FortniteApi::class.java)




}