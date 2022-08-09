package com.example.fragmenttestandroid.hw8

class Departament(val id : Long, val title : String) {

    companion object {
        fun getMockDepartment() = listOf<Departament>(
            Departament(1,"Fitnes department"),
            Departament(2,"Action department"),
            Departament(3,"Comedy department")
        )
    }


    override fun equals(other: Any?): Boolean {
        if (other is Departament){
            return id == (other as Departament).id
        }
        return false
    }

    override fun hashCode(): Int {
        var result = id.hashCode()
        result *= 31 + (id as Int)
        return result
    }


}