package com.example.testapplication.dependencyinjection.module

import com.example.testapplication.ui.first.FragmentOneViewModel
import com.example.testapplication.ui.main.FragmentMainViewModel
import com.example.testapplication.ui.second.FragmentTwoViewModel
import com.example.testapplication.ui.third.FragmentThreeViewModel
import dagger.Module
import dagger.Provides

@Module
class ViewModelModule {

    @Provides
    fun provideFragmentMainViewModel() = FragmentMainViewModel()

    @Provides
    fun provideFragmentOneViewModel() = FragmentOneViewModel()

    @Provides
    fun provideFragmentTwoViewModel() = FragmentTwoViewModel()

    @Provides
    fun provideFragmentThreeViewModel() = FragmentThreeViewModel()

}
