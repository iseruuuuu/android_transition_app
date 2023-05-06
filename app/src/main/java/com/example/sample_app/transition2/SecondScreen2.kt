package com.example.sample_app.transition2

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun SecondScreen2(
    onNavigateToFriends: () -> Unit,
    onTabBack: () -> Unit,
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(text = "Screen2 2")
        Button(onClick = onNavigateToFriends) {
            Text(text = "Go to Screen 3")
        }
        Button(onClick = onTabBack) {
            Text(text = "Pop")
        }
    }
}