package com.example.fragmenttestandroid

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class EmployeeAdapter : RecyclerView.Adapter<EmployeesViewHolder>() {

    private val employees = Employee.getMockEmployees()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmployeesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.employee_card,parent,false)
        return EmployeesViewHolder(view)
    }

    override fun onBindViewHolder(holder: EmployeesViewHolder, position: Int) {
        val employee = employees[position]
        with(holder){
            fullNameTextView.text = employee.name
            departmentTextView.text = employee.department
            Glide.with(photoImageView.context)
                .load(employee.photoUrl)
                .centerCrop()
                .into(photoImageView)
        }

    }

    override fun getItemCount(): Int {
        return employees.size
    }
}