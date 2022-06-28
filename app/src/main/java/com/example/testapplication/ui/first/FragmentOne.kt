package com.example.testapplication.ui.first

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.testapplication.R
import com.example.testapplication.databinding.FragmentOneBinding
import javax.inject.Inject


class FragmentOne : Fragment() {

    @Inject lateinit var viewModel: FragmentOneViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        super.onCreateView(inflater, container, savedInstanceState)

        return DataBindingUtil.inflate<FragmentOneBinding>(inflater, R.layout.fragment_one, container, false)
            .also { binding ->
                binding.viewModel = viewModel
                binding.lifecycleOwner = this
            }.root
    }

}