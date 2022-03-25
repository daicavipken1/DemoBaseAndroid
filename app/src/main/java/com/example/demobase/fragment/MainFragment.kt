package com.example.demobase.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.demobase.R
import com.example.demobase.activity.main.MainViewModel
import com.example.demobase.base.BaseFragment
import com.example.demobase.databinding.FragmentMainBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainFragment: BaseFragment<FragmentMainBinding, MainViewModel>() {
    override fun inflateViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?,
        attachToParent: Boolean
    ): FragmentMainBinding {
       return FragmentMainBinding.inflate(inflater,container,false)
    }

    override val viewModel: MainViewModel by viewModel()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.switchHome?.setOnClickListener {
            binding?.let {
                Navigation.findNavController(it.root).navigate(R.id.navigateToHome)
            }

        }
    }
}