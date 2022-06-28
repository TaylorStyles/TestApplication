package com.example.testapplication.dependencyinjection.component

import com.example.testapplication.dependencyinjection.module.ViewModelModule
import com.example.testapplication.ui.first.FragmentOne
import com.example.testapplication.ui.main.FragmentMain
import com.example.testapplication.ui.second.FragmentTwo
import com.example.testapplication.ui.third.FragmentThree
import dagger.Component

@Component(modules = [ViewModelModule::class])
interface FragmentComponent {
    fun inject(fragment: FragmentMain)
    fun inject(fragment: FragmentOne)
    fun inject(fragment: FragmentTwo)
    fun inject(fragment: FragmentThree)
}