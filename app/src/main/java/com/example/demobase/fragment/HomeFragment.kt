package com.example.demobase.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.example.demobase.R
import com.example.demobase.activity.main.HomeActivity
import com.example.demobase.base.BaseFragment
import com.example.demobase.databinding.FragmentHomeBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class HomeFragment: BaseFragment<FragmentHomeBinding,HomeViewModel>() {
    override fun inflateViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?,
        attachToParent: Boolean
    ): FragmentHomeBinding {
        return FragmentHomeBinding.inflate(inflater,container,false)
    }
    override val viewModel: HomeViewModel by viewModel()

    val arg: HomeFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.let { binding ->
            val ack = arg.number
            binding.switchMain.text = ack.toString()
            binding.switchMain.setOnClickListener {
                val i = Intent(context,HomeActivity::class.java)
                startActivity(i)
            }

        }
    }
}