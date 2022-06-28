package com.example.testapplication.ui.second

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.testapplication.R
import com.example.testapplication.databinding.FragmentOneBinding
import com.example.testapplication.databinding.FragmentTwoBinding
import com.example.testapplication.ui.first.FragmentOneViewModel
import javax.inject.Inject


class FragmentTwo : Fragment() {

    @Inject lateinit var viewModel: FragmentTwoViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        super.onCreateView(inflater, container, savedInstanceState)

        return DataBindingUtil.inflate<FragmentTwoBinding>(inflater, R.layout.fragment_two ,container, false)
            .also { binding ->
                binding.viewModel = viewModel
                binding.lifecycleOwner = this
            }.root
    }

}