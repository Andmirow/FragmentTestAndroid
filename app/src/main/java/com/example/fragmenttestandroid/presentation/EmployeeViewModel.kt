package com.example.fragmenttestandroid.presentation

import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.fragmenttestandroid.data.Employee


class EmployeeViewModel : ViewModel(){

    private val _employee = MutableLiveData(Employee())

    fun getEmployee(): Employee? {
        return _employee.value
    }

}