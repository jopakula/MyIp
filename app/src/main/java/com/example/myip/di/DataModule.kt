package com.example.myip.di

import com.example.myip.data.RepositoryImpl
import com.example.myip.data.storage.NetworkStorage
import com.example.myip.data.storage.network.HttpClient
import com.example.myip.data.storage.network.NetworkApi
import com.example.myip.data.storage.network.NetworkStorageImpl
import com.example.myip.domain.Repository
import org.koin.dsl.module

val dataModule = module {

    single<NetworkApi> { HttpClient.api }
    single<NetworkStorage> { NetworkStorageImpl(networkApi = get()) }
    single<Repository> { RepositoryImpl(networkStorage = get()) }
}