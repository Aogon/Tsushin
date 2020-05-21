package app.sakai.tororoimo.tsushin

import com.google.gson.annotations.SerializedName

data class User(
    val naem: String,
    @SerializedName("login") val userId: String,
    @SerializedName("avater_url") val avatar_url: String,
    val following: Int,
    val followers: Int
)