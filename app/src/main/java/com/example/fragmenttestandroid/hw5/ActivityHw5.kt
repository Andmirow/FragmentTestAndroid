package com.example.fragmenttestandroid.hw5

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.fragmenttestandroid.R

class ActivityHw5 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if(savedInstanceState == null){
            supportFragmentManager
                .beginTransaction()
                .add(R.id.fragment_container_view, SenderFragment::class.java, null)
                .commit()
        }



    }
}