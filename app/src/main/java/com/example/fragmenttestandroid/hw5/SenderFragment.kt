package com.example.fragmenttestandroid.hw5

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.*
import com.example.fragmenttestandroid.R

class SenderFragment : Fragment(R.layout.fragment_sender) {

    private lateinit var messageView: EditText
    private val viewModel : MainViewModel by activityViewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        messageView = view.findViewById(R.id.et_message)
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.senderButton).setOnClickListener{
            sendMessage()
        }
    }

    private fun sendMessage(){
        val textMessage = messageView.text.toString()
        viewModel.select(textMessage)
        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container_view, ReceiverFragment()).commit()
    }

}