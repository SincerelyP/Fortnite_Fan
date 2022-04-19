package com.example.fortnitefan.data.newsmodel


import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("date")
    val date: String,
    @SerializedName("hash")
    val hash: String,
    @SerializedName("image")
    val image: String,
    @SerializedName("messages")
    val messages: Any?,
    @SerializedName("motds")
    val motds: List<Motd>? = emptyList()
)