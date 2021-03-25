package com.oandradev.filmescoroutines.di

import com.oandradev.filmescoroutines.ui.main.MainRepository
import com.oandradev.filmescoroutines.ui.main.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val mainModule = module {

    factory {
        MainRepository()
    }

    viewModel {
        MainViewModel(
            repository = get()
        )
    }
}