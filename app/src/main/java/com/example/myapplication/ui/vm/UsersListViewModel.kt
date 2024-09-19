package com.example.myapplication.ui.vm

import androidx.lifecycle.ViewModel
import com.example.myapplication.src.model.api.RemoteDataSourceImpl
import com.example.myapplication.src.model.cache.LocalDataSourceImpl
import com.example.myapplication.src.repo.Repository
import com.example.myapplication.src.repo.RepositoryImpl
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class UsersListViewModel : ViewModel() {

    private val _items = MutableStateFlow<List<String>>(emptyList())
    val items: StateFlow<List<String>> = _items
    private val repository = RepositoryImpl(LocalDataSourceImpl(), RemoteDataSourceImpl())

    fun fetchData(){
        _items.value = repository.getData()
    }
}