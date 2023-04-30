package com.example.mysports.ui.my_sport

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MySportViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is My Sport Fragment"
    }
    val text: LiveData<String> = _text
}