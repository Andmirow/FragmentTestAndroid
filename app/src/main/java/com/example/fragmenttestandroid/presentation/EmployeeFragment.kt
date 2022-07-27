package com.example.fragmenttestandroid.presentation

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.fragmenttestandroid.MainViewModel
import com.example.fragmenttestandroid.R
import com.example.fragmenttestandroid.data.Employee
import java.text.SimpleDateFormat

class EmployeeFragment :Fragment(R.layout.employee_card) {

    private val  viewModel = EmployeeViewModel()
    private lateinit var employee : Employee



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        employee = viewModel.getEmployee()!!

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val enebledView = view.findViewById<TextView>(R.id.enebled)
        val fioView = view.findViewById<TextView>(R.id.fio)
        val fotoView = view.findViewById<ImageView>(R.id.foto)
        val workExperienceView =  view.findViewById<TextView>(R.id.workExperience)
        val positionView = view.findViewById<TextView>(R.id.position)
        val locationView = view.findViewById<TextView>(R.id.location)
        val DateOfBirthView = view.findViewById<TextView>(R.id.dateOfBirth)


        enebledView.text = if (employee.enebled) "В сети" else "Не в сети"
        fioView.text = employee.name
        positionView.text = employee.position
        locationView.text = employee.location

        var year = employee.workExperience.toInt()
        val month = ((employee.workExperience % 1)*10).toInt()
        workExperienceView.text = "$year год и $month месяцев"








//        var dataTemp = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
//        var date = dataTemp.format(employee.DateOfBirth)
        DateOfBirthView.text = employee.DateOfBirth


    }


}