package com.example.fragmenttestandroid

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val _message: MutableLiveData<Message> by lazy {
        MutableLiveData<Message>(Message())
    }

    val message: LiveData<Message> = _message

    fun setMessage(message: Message) {
        _message.value = message
    }

}