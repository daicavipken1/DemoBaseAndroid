package com.example.demobase

import android.app.Application
import com.example.demobase.di.networkModule
import com.example.demobase.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class BaseDemoApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@BaseDemoApplication)
            modules( viewModelModule)
        }
    }
}