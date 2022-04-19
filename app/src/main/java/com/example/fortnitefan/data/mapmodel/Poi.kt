package com.example.fortnitefan.data.mapmodel


import com.google.gson.annotations.SerializedName

data class Poi(
    @SerializedName("id")
    val id: String,
    @SerializedName("location")
    val location: Location,
    @SerializedName("name")
    val name: String
)