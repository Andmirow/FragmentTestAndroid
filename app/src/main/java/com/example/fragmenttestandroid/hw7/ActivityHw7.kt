package com.example.fragmenttestandroid.hw7

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.fragmenttestandroid.R

class ActivityHw7 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

    }


    fun onClick(view: View) {
        getSupportFragmentManager()
            .beginTransaction()
            .setCustomAnimations(R.anim.up_in,R.anim.up_out)
            .add(R.id.start_view, AnimationFragment::class.java, null)
            .commit()
    }
}