package com.example.fortnitefan.data.newsmodel


import com.google.gson.annotations.SerializedName

data class NewsList(
    @SerializedName("data")
    val `data`: Data,
    @SerializedName("status")
    val status: Int
)