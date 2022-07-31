package com.example.fragmenttestandroid

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_start.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        buttonStart.setOnClickListener{(openFragment())}
    }


    fun openFragment(){
            getSupportFragmentManager()
                .beginTransaction()
                .setCustomAnimations(R.anim.up_in,R.anim.up_out)
                .add(R.id.start_view, AnimationFragment::class.java, null)
                .commit()
    }





}