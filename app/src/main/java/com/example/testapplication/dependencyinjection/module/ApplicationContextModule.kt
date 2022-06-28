package com.example.testapplication.dependencyinjection.module

import android.content.Context
import dagger.Module
import dagger.Provides

@Module
class ApplicationContextModule(private val context: Context) {

    @Provides
    fun context(): Context = context.applicationContext
}