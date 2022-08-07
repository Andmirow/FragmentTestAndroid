package com.example.fragmenttestandroid

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DepartamentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val departamentTitleView : TextView = itemView.findViewById(R.id.departamentTitle)
}