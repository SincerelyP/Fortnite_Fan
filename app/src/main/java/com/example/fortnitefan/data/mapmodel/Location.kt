package com.example.fortnitefan.data.mapmodel


import com.google.gson.annotations.SerializedName

data class Location(
    @SerializedName("x")
    val x: Int,
    @SerializedName("y")
    val y: Int,
    @SerializedName("z")
    val z: Int
)