package com.example.myapplication.src.repo

import com.example.myapplication.src.model.api.RemoteDataSource
import com.example.myapplication.src.model.cache.LocalDataSource


class RepositoryImpl(private val localDataSource: LocalDataSource,
                     private val remoteDataSource: RemoteDataSource):Repository {
    override fun getData(): List<String> {
        return try {
            remoteDataSource.getRemoteData()
        }catch(e:Exception){
            localDataSource.getLocalData()
        }
    }
}