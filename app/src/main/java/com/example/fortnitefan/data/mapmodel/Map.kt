package com.example.fortnitefan.data.mapmodel


import com.google.gson.annotations.SerializedName

data class Map(
    @SerializedName("data")
    val `data`: Data,
    @SerializedName("status")
    val status: Int
)