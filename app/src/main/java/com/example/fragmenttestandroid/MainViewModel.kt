package com.example.fragmenttestandroid

import android.text.Editable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val _message: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }

    val message: LiveData<String> = _message

    fun setMessage(message: String) {
        _message.value = message
    }

}