package com.example.fragmenttestandroid.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.fragmenttestandroid.MainViewModel
import com.example.fragmenttestandroid.R
import com.example.fragmenttestandroid.ReceiverFragment
import com.example.fragmenttestandroid.SenderFragment

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if(savedInstanceState == null){
            getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.fragment_container_view, EmployeeFragment::class.java, null)
                .commit()
        }

    }


//    private fun addFragmentA(){
//        supportFragmentManager.beginTransaction().add(R.id., ContentFragmentKt).commit()
//    }

}