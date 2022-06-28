package com.example.testapplication.ui.third

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.testapplication.R
import com.example.testapplication.databinding.FragmentThreeBinding
import javax.inject.Inject


class FragmentThree : Fragment() {

    @Inject lateinit var viewModel: FragmentThreeViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        super.onCreateView(inflater, container, savedInstanceState)

        return DataBindingUtil.inflate<FragmentThreeBinding>(inflater, R.layout.fragment_three, container, false)
            .also { binding ->
                binding.viewModel = viewModel
                binding.lifecycleOwner = this
            }.root
    }
}