package com.example.fragmenttestandroid.hw8

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

    fun setEmployee(indexPosition : Int , employee: Employee) {
        employees.value = employees.value?.toMutableList()?.apply {
            set(indexPosition, employee)
        }
    }



}