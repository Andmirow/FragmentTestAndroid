package com.example.fragmenttestandroid

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if(savedInstanceState == null){
            getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.fragment_container_view,SenderFragment::class.java, null)
                .commit()
        }

    }


//    private fun addFragmentA(){
//        supportFragmentManager.beginTransaction().add(R.id., ContentFragmentKt).commit()
//    }

}