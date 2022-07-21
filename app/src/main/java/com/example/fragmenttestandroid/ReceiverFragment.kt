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

class ReceiverFragment :Fragment(com.example.fragmenttestandroid.R.layout.fragment_receiver) {

    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        readButton.setOnClickListener{ onClickRead() }

        var massage = view?.findViewById<TextView>(R.id.et_message)
        textView = view?.findViewById<TextView>(R.id.textView)!!

        textView.text = massage?.text

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_receiver, container, false)
    }


    fun onClickRead(){
        if (textView!=null){
            textView.text = "All messages is read"
        }
    }



}