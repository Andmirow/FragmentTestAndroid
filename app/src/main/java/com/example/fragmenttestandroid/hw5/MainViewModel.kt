package com.example.fragmenttestandroid.hw5

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    val selected = MutableLiveData<String>()

    fun select(message: String) {
        selected.value = message
    }


}