package com.example.myip.data.storage.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object HttpClient {
    private val retrofit =
        Retrofit.Builder()
            .baseUrl("https://functions.yandexcloud.net/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    val api = retrofit.create(NetworkApi::class.java)
}