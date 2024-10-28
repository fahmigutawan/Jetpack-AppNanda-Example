package com.example.appnanda.presentation.splash

import android.window.SplashScreen
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.appnanda.components.Header
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(
    modifier: Modifier = Modifier,
    navController: NavController
) {
    LaunchedEffect(key1 = true) {
        delay(3000)
        navController.navigate("bicara")
    }

    Column {
        Header()
        //component 2
        //component 3
    }

    Row {
        //component 1
        //component 2
    }
}