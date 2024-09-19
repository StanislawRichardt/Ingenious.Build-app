package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.livedata.observeAsState
import com.example.myapplication.ui.compose.UsersListComposable
import com.example.myapplication.ui.theme.MyApplicationTheme
import com.example.myapplication.ui.vm.UsersListViewModel

class MainActivity : ComponentActivity() {

    private val usersListViewModel : UsersListViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                val items = usersListViewModel.items.collectAsState()
                UsersListComposable(items = items)
            }
        }
    }
}



