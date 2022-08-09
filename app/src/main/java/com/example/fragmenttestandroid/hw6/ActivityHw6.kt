package com.example.fragmenttestandroid.hw6

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.fragmenttestandroid.R

class ActivityHw6 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if(savedInstanceState == null){
            supportFragmentManager
                .beginTransaction()
                .add(R.id.fragment_container_view, EmployeeFragment::class.java, null)
                .commit()
        }



    }
}