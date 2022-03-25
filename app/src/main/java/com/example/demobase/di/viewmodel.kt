package com.example.demobase.di

import com.example.demobase.activity.main.MainViewModel
import com.example.demobase.fragment.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel {
        MainViewModel()
    }
    viewModel {
        HomeViewModel()
    }
}