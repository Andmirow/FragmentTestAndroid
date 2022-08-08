package com.example.fragmenttestandroid

import android.content.ContentValues.TAG
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide


const val EMPLOYEE_TYPE = 1
const val DEPARTAMET_TYPE = 2
class EmployeeAdapter(private val deleteAction :(Int)-> Unit) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val employees = mutableListOf<Any>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        when(viewType){
            EMPLOYEE_TYPE ->{
                val view = LayoutInflater.from(parent.context).inflate(R.layout.employee_card,parent,false)
                return EmployeesViewHolder(view)
            }
            DEPARTAMET_TYPE ->{
                val view = LayoutInflater.from(parent.context).inflate(R.layout.departament,parent,false)
                return DepartamentViewHolder(view)
            }
            else -> throw Exception("uncomon type holder")
        }

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        Log.d(TAG, "bind, position = " + position);
        when(holder){
            is EmployeesViewHolder -> {
                with(holder) {
                    val employee = employees[position] as Employee
                    fullNameTextView.text = employee.name
                    departmentTextView.text = employee.department
                    Glide.with(photoImageView.context)
                        .load(employee.photoUrl)
                        .centerCrop()
                        .into(photoImageView)

                    deleteButtonView.setOnClickListener {
                        deleteAction(position)
                    }
                }
            }
            is DepartamentViewHolder ->{
                holder.departamentTitleView.text = (employees[position] as Departament).title
            }
        }

    }



    override fun getItemCount(): Int {
        return employees.size
    }

    override fun getItemViewType(position: Int): Int {
        return when(employees[position]){
            is Employee -> EMPLOYEE_TYPE
            is Departament -> DEPARTAMET_TYPE
            else -> throw Exception("not support type")
        }
    }

    fun reloadList(data : List<Any>){

        val mainDiffUtilCallback = MainDiffUtilCallback(employees,data)
        val DiffResult = DiffUtil.calculateDiff(mainDiffUtilCallback)
        employees.clear()
        employees.addAll(data)
        DiffResult.dispatchUpdatesTo(this)
        //notifyDataSetChanged()
    }




}



