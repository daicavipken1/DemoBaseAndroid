package com.example.demobase.activity.main

import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.demobase.R
import com.example.demobase.base.BaseActivity
import com.example.demobase.databinding.ActivityHomeBinding
import com.example.demobase.fragment.HomeViewModel
import com.google.android.material.bottomnavigation.BottomNavigationMenuView
import com.google.android.material.bottomnavigation.BottomNavigationView
import org.koin.androidx.viewmodel.ext.android.viewModel

class HomeActivity: BaseActivity<ActivityHomeBinding,HomeViewModel>() {
    override fun viewBinding(): ActivityHomeBinding = ActivityHomeBinding.inflate(layoutInflater)

    override val viewModel: HomeViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val bottom = findViewById<BottomNavigationView>(R.id.bottom_view)
        val navController = findNavController(R.id.nav_home_fragment)
        val appBarConfig = AppBarConfiguration(setOf(R.id.mainFragment,R.id.homeFragment))
        setupActionBarWithNavController(navController,appBarConfig)
        bottom.setupWithNavController(navController)
    }
}