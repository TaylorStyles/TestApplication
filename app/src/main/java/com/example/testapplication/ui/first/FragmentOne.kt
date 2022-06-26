package com.example.testapplication.ui.first

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.testapplication.databinding.FragmentOneBinding


class FragmentOne : Fragment() {

    companion object {
        fun newInstance() = FragmentOne()
    }

    private lateinit var viewModel: FragmentOneViewModel
    private lateinit var binding: FragmentOneBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentOneBinding.inflate(inflater, container, false)
        viewModel = FragmentOneViewModel()
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
}