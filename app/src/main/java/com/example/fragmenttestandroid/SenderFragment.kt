package com.example.fragmenttestandroid

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.*
import timber.log.Timber

private const val STATE_MESSAGE = "message_text"

class SenderFragment : Fragment(com.example.fragmenttestandroid.R.layout.fragment_sender) {

    private lateinit var messageView: EditText
    private val viewModel: MainViewModel by viewModels()
    private var messageObj: Message = Message()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        messageView = view.findViewById(R.id.et_message)

        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.senderButton).setOnClickListener{
            sendMessage()
        }
    }

    private fun sendMessage(){

        messageObj.message = messageView.text.toString()

        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container_view, ReceiverFragment()).commit()




    }

//    override fun onSaveInstanceState(outState: Bundle) {
//        Timber.i("PuppyCounter - MainActivity - onSaveInstanceState()")
//        // Save the dog count state
//        outState.putSerializable(STATE_MESSAGE, messageObj)
//        // Always call the superclass so it can save the view hierarchy state
//        super.onSaveInstanceState(outState)
//    }




}