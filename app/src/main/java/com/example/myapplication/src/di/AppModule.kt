package com.example.myapplication.src.di

import com.example.myapplication.src.repo.RepositoryImpl
import org.koin.dsl.module

val appModule = module {
    single{ RepositoryImpl(get(),get())}
}