package com.example.telababy1.ui.Tracker

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TrackerViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Tracker Fragment"
    }
    val text: LiveData<String> = _text
}