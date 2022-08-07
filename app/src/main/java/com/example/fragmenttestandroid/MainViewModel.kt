package com.example.fragmenttestandroid

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    var employees = MutableLiveData(Employee.getMockEmployees() + Departament.getMockDepartment())


    fun addRandomEmployee(){
        employees.value = employees.value?.toMutableList()?.apply {
            add(Employee.getMockEmployees().random())
        }
    }

    fun deleteEmployee(indexPosition : Int){
        employees.value = employees.value?.toMutableList()?.apply {
            removeAt(indexPosition)
        }
    }

}