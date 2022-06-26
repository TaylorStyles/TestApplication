package com.example.testapplication.ui.second

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FragmentTwoViewModel : ViewModel() {

    val word = MutableLiveData<String>()

    init {
        word.value = "Default Body Text"
    }

    fun updateBodyText() {
        word.value = "Fragment Body Text Updated!"
    }

}