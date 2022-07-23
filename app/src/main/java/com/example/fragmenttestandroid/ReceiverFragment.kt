package com.example.fragmenttestandroid

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_receiver.*
import org.w3c.dom.Text

class ReceiverFragment : androidx.fragment.app.Fragment(com.example.fragmenttestandroid.R.layout.fragment_receiver) {

    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textView = view.findViewById(R.id.textView)
        view.findViewById<Button>(R.id.readButton).setOnClickListener{
            onClickRead()
        }
    }


    fun onClickRead(){
        if (textView!=null){
            textView.text = "All messages is read"
        }
    }



}