package com.example.myip.domain.useCases

import com.example.myip.domain.Repository
import com.example.myip.domain.models.IpResponseDomain

class FetchIpUseCase(private val repository: Repository) {
    suspend fun execute(): IpResponseDomain {
        return repository.fetchIp()
    }
}