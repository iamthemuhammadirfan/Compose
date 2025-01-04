package com.compose.data.repository

import com.compose.data.models.ScreenItem

class ScreenRepository {
    fun getScreens(): List <ScreenItem>{
        return listOf(
            ScreenItem(title = "Basic Compose Components", route = "basic_compose_components"),
        )
    }
}