package com.example.telababy1.ui.ARVR

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ARVRViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is AR/VR Fragment"
    }
    val text: LiveData<String> = _text
}