package com.example.testapplication.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FragmentOneViewModel : ViewModel() {

    val word = MutableLiveData<String>()

    init {
        word.value = "Default Body Text"
    }

    fun updateBodyText() {
        word.value = "Fragment Body Text Updated!"
    }


}