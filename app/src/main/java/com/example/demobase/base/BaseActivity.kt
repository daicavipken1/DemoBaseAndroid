package com.example.demobase.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

abstract class BaseActivity<V: ViewBinding,M: BaseViewModel>: AppCompatActivity() {
    private var viewBinding : V? = null
    val binding get() = viewBinding

    abstract fun  viewBinding(): V

    abstract val viewModel: M

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = viewBinding()
        setContentView(binding?.root)
    }


}