package com.example.fortnitefan.data.newsmodel


import com.google.gson.annotations.SerializedName

data class Motd(
    @SerializedName("body")
    val body: String,
    @SerializedName("hidden")
    val hidden: Boolean,
    @SerializedName("id")
    val id: String,
    @SerializedName("image")
    val image: String,
    @SerializedName("sortingPriority")
    val sortingPriority: Int,
    @SerializedName("tabTitle")
    val tabTitle: String,
    @SerializedName("tileImage")
    val tileImage: String,
    @SerializedName("title")
    val title: String
)