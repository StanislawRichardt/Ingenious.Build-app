package com.example.myapplication.src.model.cache


interface LocalDataSource {
    fun getLocalData(): List<String>

}