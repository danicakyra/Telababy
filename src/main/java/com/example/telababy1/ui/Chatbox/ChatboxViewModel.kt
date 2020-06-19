package com.example.telababy1.ui.Chatbox

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ChatboxViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is chatbox Fragment"
    }
    val text: LiveData<String> = _text
}