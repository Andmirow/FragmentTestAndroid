package com.example.fragmenttestandroid

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.*
import com.example.fragmenttestandroid.MainViewModel
import com.example.fragmenttestandroid.Message
import com.example.fragmenttestandroid.R
import com.example.fragmenttestandroid.ReceiverFragment

private const val STATE_MESSAGE = "message_text"

class SenderFragment : Fragment(com.example.fragmenttestandroid.R.layout.fragment_sender) {

    private lateinit var messageView: EditText
    private val viewModel= MainViewModel()
    //private lateinit var messageObj: Message

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        messageView = view.findViewById(R.id.et_message)
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.senderButton).setOnClickListener{
            sendMessage(savedInstanceState)
        }
    }

    private fun sendMessage(savedInstanceState: Bundle?){

        var test = messageView.text.toString()

        viewModel.setMessage(test)

//        messageObj = Message(messageView.text.toString())
//        viewModel.message.observe(viewLifecycleOwner) { value ->
//            messageObj
//        }

        //viewModel.setMessage(messageObj)
        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container_view, ReceiverFragment()).commit()
    }



}