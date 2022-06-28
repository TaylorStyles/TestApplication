package com.example.testapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testapplication.ui.first.FragmentOne
import com.example.testapplication.ui.main.FragmentMain
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .add(R.id.nav_host_fragment, FragmentMain(), null)
                .commit()
        }

    }
}