package com.example.fragmenttestandroid.hw8

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Employee (
    val id : Long,
    var name : String,
    var photoUrl : String,
    var department : String
) : Parcelable{


    companion object{
        fun getMockEmployees() = listOf<Employee>(
            Employee(0,
                "Matthew McConaughey",
                "https://avatars.mds.yandex.net/get-kinopoisk-image/1777765/7b37ed50-2bb0-4f22-adba-d94023ed9a38/280x420",
                "acter"),
            Employee(1,
                "Abraham Lincoln",
                "https://upload.wikimedia.org/wikipedia/commons/a/ab/Abraham_Lincoln_O-77_matte_collodion_print.jpg",
                "president")
        )
    }

    override fun equals(other: Any?): Boolean {
        if (other is Employee){
            return id == (other as Employee).id
        }
        return false
    }

    override fun hashCode(): Int {
        var result = id.hashCode()
        result *= 31 + (id as Int)
        return result
    }
}