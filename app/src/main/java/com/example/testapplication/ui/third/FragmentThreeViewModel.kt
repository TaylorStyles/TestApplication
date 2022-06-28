package com.example.testapplication.ui.third

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FragmentThreeViewModel : ViewModel() {

    val word = MutableLiveData<String>()

    init {
        word.value = "Default Body Text"
    }

    fun updateBodyText() {
        word.value = "Fragment Body Text Updated!"
    }

}