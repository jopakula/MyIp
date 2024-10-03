package com.example.myip.ui.viewModels

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myip.domain.useCases.FetchIpUseCase
import kotlinx.coroutines.launch

class MainViewModel( private val fetchIpUseCase: FetchIpUseCase): ViewModel(){

    private val _ipAddress = MutableLiveData("")
    private val ipAddress: LiveData<String> = _ipAddress

    fun fetchId(){
        Log.d("AAA", "fetchId called")
        viewModelScope.launch {
            try {
                Log.d("AAA", "Executing use case")
                val data = fetchIpUseCase.execute()
                _ipAddress.value = data.myip
                Log.d("AAA", "data")
            } catch (e: Exception) {
                _ipAddress.value = "Error: ${e.message}"
                Log.wtf("AAA", e.message)
            }
        }
    }

    fun getIpAddress(): LiveData<String> = ipAddress
}