package com.example.myip.data.storage.network

import com.example.myip.data.storage.NetworkStorage
import com.example.myip.data.storage.models.IpResponseData

class NetworkStorageImpl(private val networkApi: NetworkApi): NetworkStorage {
    override suspend fun fetchIp(): IpResponseData {
        return networkApi.getIpAddress()
    }
}