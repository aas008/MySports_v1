package com.example.mysports.ui.my_sport.basketball

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BasketballViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Basketball Fragment"
    }
    val text: LiveData<String> = _text
}