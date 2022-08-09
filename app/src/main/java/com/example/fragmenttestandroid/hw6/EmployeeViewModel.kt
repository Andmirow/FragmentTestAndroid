package com.example.fragmenttestandroid.hw6

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class EmployeeViewModel : ViewModel(){

    private val _employee = MutableLiveData(Employee())

    fun getEmployee(): Employee? {
        return _employee.value
    }

}