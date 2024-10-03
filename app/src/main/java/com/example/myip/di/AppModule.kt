package com.example.myip.di

import com.example.myip.ui.viewModels.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    viewModel<MainViewModel> {
        MainViewModel(
            fetchIpUseCase = get()
        )
    }
}