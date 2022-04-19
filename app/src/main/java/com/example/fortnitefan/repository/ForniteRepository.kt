package com.example.fortnitefan.repository

import com.example.fortnitefan.data.FortniteApi
import com.example.fortnitefan.data.mapmodel.Images
import com.example.fortnitefan.data.newsmodel.Motd
import javax.inject.Inject


class ForniteRepoImp @Inject constructor(
    private val api: FortniteApi
): FortniteRepo {


    override suspend fun getNews(): List<Motd>? {
       return api.getNewsList().body()?.data?.motds
    }


    override suspend fun getMap(): Images?{
        return api.getMap().body()?.data?.images

    }



}

interface FortniteRepo{

    suspend fun getNews(): List<Motd>? = emptyList()
    suspend fun getMap(): Images?


}

class MissingApiKeyException : java.lang.Exception()
class ApiKeyInvalidException : java.lang.Exception()
