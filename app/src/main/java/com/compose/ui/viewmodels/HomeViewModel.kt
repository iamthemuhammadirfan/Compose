package com.compose.ui.viewmodels

import androidx.lifecycle.ViewModel
import com.compose.data.models.ScreenItem
import com.compose.data.repository.ScreenRepository

class HomeViewModel: ViewModel() {
    private  val repository = ScreenRepository();
    val screens: List<ScreenItem> = repository.getScreens();
}