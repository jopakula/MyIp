package com.example.myip.di

import com.example.myip.domain.useCases.FetchIpUseCase
import org.koin.dsl.module


val domainModule = module {

    factory<FetchIpUseCase> {
        FetchIpUseCase(repository = get())
    }

}