package com.example.fragmenttestandroid.hw8

import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.fragmenttestandroid.R

class EmployeesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
    val photoImageView : ImageView = itemView.findViewById(R.id.photo)
    val fullNameTextView : TextView = itemView.findViewById(R.id.fullName)
    val departmentTextView : TextView = itemView.findViewById(R.id.department)
    val deleteButtonView : Button = itemView.findViewById(R.id.delete_button)
}