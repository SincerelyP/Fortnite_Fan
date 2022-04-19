package com.example.fortnitefan.data.mapmodel


import com.google.gson.annotations.SerializedName

data class Images(
    @SerializedName("blank")
    val blank: String,
    @SerializedName("pois")
    val pois: String // Image with named location
)