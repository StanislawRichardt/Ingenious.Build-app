package com.example.myapplication.ui.compose

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun UsersListComposable(items: State<List<String>>) {

    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        items(items.value) { item ->
            Text(
                text = item,
                style = MaterialTheme.typography.bodyLarge
            )
            
        }

    }
}

@Preview(showBackground = true)
@Composable
fun UsersListComposablePreview() {
    UsersListComposable(items = remember { mutableStateOf(listOf("Item 1", "Item 2", "Item 3"))})
}
