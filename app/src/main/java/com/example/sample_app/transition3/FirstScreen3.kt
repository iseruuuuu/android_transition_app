package com.example.sample_app.transition3

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun FirstScreen3(
    onNavigateToFriends: (String, Int) -> Unit = { _, _ -> },
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(text = "Screen2 1")
        Button(onClick = { onNavigateToFriends("Good morning", 1) }) {
            Text(text = "Go to Morning")
        }
        Button(onClick = { onNavigateToFriends("Good night", 2) }) {
            Text(text = "Go to Night")
        }
    }
}