package com.example.myapplication

import android.app.Application
import com.example.myapplication.src.di.appModule
import com.example.myapplication.src.di.networkModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class IngeniousBuildApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@IngeniousBuildApplication)
            modules(appModule, networkModule)
        }
    }

}