package com.example.fragmenttestandroid

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.fragmenttestandroid.hw5.ActivityHw5
import com.example.fragmenttestandroid.hw6.ActivityHw6
import com.example.fragmenttestandroid.hw7.ActivityHw7
import com.example.fragmenttestandroid.hw8.ActivityHw8
import kotlinx.android.synthetic.main.start_activity.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.start_activity)

        homework5.setOnClickListener {
            val intent = Intent(this, ActivityHw5:: class.java)
            startActivity(intent)
        }

        homework6.setOnClickListener {
            val intent = Intent(this, ActivityHw6:: class.java)
            startActivity(intent)
        }

        homework7.setOnClickListener {
            val intent = Intent(this, ActivityHw7:: class.java)
            startActivity(intent)
        }

        homework8.setOnClickListener {
            val intent = Intent(this, ActivityHw8:: class.java)
            startActivity(intent)
        }

        homework12.setOnClickListener {
//            val intent = Intent(this, ActivityHw8:: class.java)
//            startActivity(intent)
        }
    }
}