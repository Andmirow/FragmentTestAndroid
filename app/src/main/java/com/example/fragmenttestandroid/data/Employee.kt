package com.example.fragmenttestandroid.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Employee(
    val name: String = "Смирнов Андрей Андреевич",
    val foto: String = "photo",
    val position : String = "Программист-технолог (3+ категории)",
    val department : String = "Служба поддержки клиентов и внедрение систем/Внедрение/Внедрение интеграционных решений/Kilo (Кострома)",
    val achievements : List<String> = mutableListOf("hardworking2","ambitious3"),
    val contacts : List<String> = mutableListOf("89997853824"),
    val enebled : Boolean = true,
    val workExperience : Float = 1.7F,
    val DateOfBirth : String = "1995-11-09",
    val location : String = "Россия, Центральный федеральный округ, Костромская область, город Кострома, улица лесная, дом 11"
) : Parcelable