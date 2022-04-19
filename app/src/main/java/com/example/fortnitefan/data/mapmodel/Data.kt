package com.example.fortnitefan.data.mapmodel


import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("images")
    val images: Images,
    @SerializedName("pois")
    val pois: List<Poi>
)