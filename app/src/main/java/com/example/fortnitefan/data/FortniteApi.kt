package com.example.fortnitefan.data

import com.example.fortnitefan.data.mapmodel.Map
import com.example.fortnitefan.data.newsmodel.NewsList
import retrofit2.Response
import retrofit2.http.GET

interface FortniteApi {

    @GET("v2/news/br")
    suspend fun getNewsList(


    ): Response<NewsList>


    @GET("v1/map")
    suspend fun getMap(

    ):Response<Map>
}