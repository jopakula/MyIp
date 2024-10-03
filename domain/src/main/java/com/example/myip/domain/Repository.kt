package com.example.myip.domain

import com.example.myip.domain.models.IpResponseDomain

interface Repository {
    suspend fun fetchIp(): IpResponseDomain
}