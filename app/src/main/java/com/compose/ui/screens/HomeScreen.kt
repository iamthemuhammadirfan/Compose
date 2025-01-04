package com.compose.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.compose.ui.viewmodels.HomeViewModel

@Composable
fun HomeScreen(navController: NavController, viewModel: HomeViewModel = viewModel()){
    Column (
        modifier = Modifier.fillMaxSize()
            .padding(16.dp),
    ){
        viewModel.screens.forEach { screen ->
            Text(
                text = screen.title,
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable {
                        navController.navigate(screen.route)
                    }
                    .padding(8.dp)
            )
        }
    }
}