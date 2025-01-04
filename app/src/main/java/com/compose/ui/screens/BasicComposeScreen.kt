package com.compose.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun BasicComposeScreen(navController: NavController){
    Column(modifier = Modifier.fillMaxSize()
        .padding(16.dp)
    ){
        Text(text = "Welcome to Basic Compose Scree");
    }
}