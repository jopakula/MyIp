package com.example.myip.data.storage

import com.example.myip.data.storage.models.IpResponseData

interface NetworkStorage {
    suspend fun fetchIp(): IpResponseData
}