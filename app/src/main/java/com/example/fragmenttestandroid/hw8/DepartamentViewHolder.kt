package com.example.fragmenttestandroid.hw8

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.fragmenttestandroid.R

class DepartamentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val departamentTitleView : TextView = itemView.findViewById(R.id.departamentTitle)
}