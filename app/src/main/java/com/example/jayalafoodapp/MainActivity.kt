package com.example.jayalafoodapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.jayalafoodapp.feature.home.HomeScreen
import com.example.jayalafoodapp.ui.theme.JayalaFoodAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JayalaFoodAppTheme {
                HomeScreen()
            }
        }
    }
}
