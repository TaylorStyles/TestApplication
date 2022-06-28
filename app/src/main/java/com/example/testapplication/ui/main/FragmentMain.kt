package com.example.testapplication.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.testapplication.R
import com.example.testapplication.databinding.FragmentMainBinding
import com.example.testapplication.databinding.FragmentOneBinding
import com.example.testapplication.ui.first.FragmentOneViewModel
import javax.inject.Inject

class FragmentMain : Fragment() {

    @Inject
    lateinit var viewModel: FragmentMainViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        super.onCreateView(inflater, container, savedInstanceState)

        return DataBindingUtil.inflate<FragmentMainBinding>(inflater, R.layout.fragment_main ,container, false)
            .also { binding ->
                binding.viewModel = viewModel
                binding.lifecycleOwner = this
            }.root
    }

}