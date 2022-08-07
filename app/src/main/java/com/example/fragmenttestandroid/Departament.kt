package com.example.fragmenttestandroid

class Departament(val title : String) {

    companion object {
        fun getMockDepartment() = listOf<Departament>(
            Departament("Fitnes department"),
            Departament("Action department"),
            Departament("Comedy department")
        )
    }

}