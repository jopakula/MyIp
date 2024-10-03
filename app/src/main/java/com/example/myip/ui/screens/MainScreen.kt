package com.example.myip.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.myip.ui.viewModels.MainViewModel
import org.koin.androidx.compose.koinViewModel


@Composable
fun MainScreen(
    myViewModel: MainViewModel = koinViewModel()
) {

    val id = myViewModel.getIpAddress().observeAsState("")
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround
    ) {
        id.value?.let { Text(text = it) }

        Button(onClick = {
            myViewModel.fetchId()
        }) {
            Text(text = "Load Ip ")
        }
    }
}
