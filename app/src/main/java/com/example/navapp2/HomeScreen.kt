package com.example.navapp2

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen (
    gotosecondscreen : () -> Unit
) {
    Column (
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Ndaku Screen",
            fontSize = 20.sp
        )

        Button(
            onClick = {
                gotosecondscreen()
            }
        ) {
            Text(
                text = "Go to Second Screen"
            )
        }
    }
}