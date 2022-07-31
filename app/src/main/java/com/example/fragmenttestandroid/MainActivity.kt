package com.example.fragmenttestandroid

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.fragmenttestandroid.SenderFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if(savedInstanceState == null){
            getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.fragment_container_view, SenderFragment::class.java, null)
                .commit()
        }

    }
}