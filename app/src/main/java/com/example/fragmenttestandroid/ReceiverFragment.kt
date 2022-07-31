package com.example.fragmenttestandroid

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer

class ReceiverFragment : androidx.fragment.app.Fragment(R.layout.fragment_receiver) {

    private lateinit var textView: TextView
    private val viewModel : MainViewModel by activityViewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textView = view.findViewById(R.id.textView)

        viewModel.selected.observe(viewLifecycleOwner, Observer<String> { message ->
            textView.text = message
        })


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