package com.example.myip

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.lifecycle.ViewModelProvider
import com.example.myip.ui.screens.MainScreen
import com.example.myip.ui.viewModels.MainViewModel
import com.example.myip.ui.viewModels.MainViewModelFactory

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val viewModel = ViewModelProvider(this, MainViewModelFactory())
            .get(MainViewModel::class.java)

        setContent {
           MainScreen(myViewModel = viewModel)
        }
    }
}
