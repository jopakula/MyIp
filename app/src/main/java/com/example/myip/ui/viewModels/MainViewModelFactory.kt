package com.example.myip.ui.viewModels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.myip.data.RepositoryImpl
import com.example.myip.data.storage.network.HttpClient
import com.example.myip.data.storage.network.NetworkStorageImpl
import com.example.myip.domain.useCases.FetchIpUseCase

//class MainViewModelFactory(): ViewModelProvider.Factory {
//
//    private val networkApi by lazy(LazyThreadSafetyMode.NONE) {
//        HttpClient.api
//    }
//
//    private val networkStorage by lazy (LazyThreadSafetyMode.NONE) {
//        NetworkStorageImpl(networkApi = networkApi)
//    }
//
//    private val repository by lazy(LazyThreadSafetyMode.NONE) {
//        RepositoryImpl(networkStorage = networkStorage)
//    }
//
//    private val fetchIpUseCase by lazy(LazyThreadSafetyMode.NONE) {
//        FetchIpUseCase(repository = repository)
//    }
//    override fun <T : ViewModel> create(modelClass: Class<T>): T {
//        return MainViewModel(fetchIpUseCase = fetchIpUseCase) as T
//    }
//}