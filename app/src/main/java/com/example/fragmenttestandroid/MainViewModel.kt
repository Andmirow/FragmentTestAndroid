package com.example.fragmenttestandroid

import android.text.Editable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {


    fun setMessage(message: String) {
        Message.message.value = message
    }

    fun getMessage(): String? {
        return Message.message.value
    }



//    private val _message: MutableLiveData<Message> by lazy {
//        MutableLiveData<Message>()
//    }
//
//    val message: LiveData<Message> = _message
//
//    fun setMessage(message: Message) {
//        _message.value = message
//    }




}