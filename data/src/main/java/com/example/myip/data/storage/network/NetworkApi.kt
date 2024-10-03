package com.example.myip.data.storage.network

import com.example.myip.data.storage.models.IpResponseData
import retrofit2.http.GET

interface NetworkApi {
    @GET("d4e2bt6jba6cmiekqmsv")
    suspend fun getIpAddress(): IpResponseData
}