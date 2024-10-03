package com.example.myip.data

import com.example.myip.data.storage.NetworkStorage
import com.example.myip.data.storage.models.IpResponseData
import com.example.myip.domain.Repository
import com.example.myip.domain.models.IpResponseDomain
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class RepositoryImpl(private val networkStorage: NetworkStorage): Repository {


    override suspend fun fetchIp(): IpResponseDomain {
        return withContext(Dispatchers.IO){
            val data = networkStorage.fetchIp()
            mapNetworkProductToDomain(responseData = data)
        }
    }

    private fun mapNetworkProductToDomain(responseData: IpResponseData): IpResponseDomain {
        return IpResponseDomain(
            myip = responseData.myip
        )
    }
}