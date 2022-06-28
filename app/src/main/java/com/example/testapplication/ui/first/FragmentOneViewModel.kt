package com.example.testapplication.ui.first

import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.testapplication.ui.second.FragmentTwo

class FragmentOneViewModel : ViewModel() {

    val word = MutableLiveData<String>()

    init {
        word.value = "Default Fragment One Body Text"
    }

    fun updateBodyText() {
        word.value = "Fragment Body Text Updated!"
    }

}