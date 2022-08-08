package com.example.fragmenttestandroid

import androidx.recyclerview.widget.DiffUtil

class MainDiffUtilCallback(val oldList: List<Any>,val newList: List<Any> ) : DiffUtil.Callback() {


    override fun getOldListSize(): Int {
        return oldList.size
    }

    override fun getNewListSize(): Int {
        return newList.size
    }

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        val oldItem = oldList[oldItemPosition]
        val newItem = newList[newItemPosition]
        return oldItem.equals(newItem)
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        val oldItem = oldList.get(oldItemPosition)
        val newItem = newList.get(newItemPosition)
        if ((oldItem is Employee) && (newItem is Employee)){
            val oldEmployee = (oldItem as Employee)
            val newEmployee = (newItem as Employee)
            return oldEmployee.name.equals(newEmployee.name)
                    && oldEmployee.department.equals(newEmployee.department)
                    && oldEmployee.photoUrl.equals(newEmployee.photoUrl)
        }else if ((oldItem is Departament) && (newItem is Departament)){
            val oldDepartament = (oldItem as Departament)
            val newDepartament = (newItem as Departament)
            return oldDepartament.title.equals(newDepartament.title)
        }
        return false
    }
}