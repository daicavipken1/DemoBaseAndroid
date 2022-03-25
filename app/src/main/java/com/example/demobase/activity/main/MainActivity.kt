package com.example.demobase.activity.main

import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.util.Log
import android.view.Menu
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.demobase.R
import com.example.demobase.base.BaseActivity
import com.example.demobase.databinding.ActivityMainBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : BaseActivity<ActivityMainBinding,MainViewModel>() {
    override fun viewBinding() : ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
    override val viewModel: MainViewModel by viewModel()

    lateinit var navigationController: NavController
    lateinit var drawerLayout: DrawerLayout
    lateinit var appBarConfig: AppBarConfiguration
    lateinit var listener: NavController.OnDestinationChangedListener

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding?.let {
            navigationController = findNavController(R.id.nav_host_fragment)
            drawerLayout = findViewById(R.id.drawer_layout)
            appBarConfig = AppBarConfiguration(navigationController.graph,drawerLayout)
            it.navViewDemo.setupWithNavController(navigationController)
            setupActionBarWithNavController(navigationController,appBarConfig)
            listener = NavController.OnDestinationChangedListener{ controller, destination, arguments ->
                when (destination.id  ){
                    R.id.homeFragment -> {
                        supportActionBar?.setBackgroundDrawable(ColorDrawable(getColor(R.color.black)))
                    }
                    R.id.mainFragment -> {
                        supportActionBar?.setBackgroundDrawable(ColorDrawable(getColor(R.color.purple_700)))
                    }
                    else ->{supportActionBar?.setBackgroundDrawable(ColorDrawable(getColor(R.color.teal_200)))}
                }
            }
        }

    }

    override fun onResume() {
        super.onResume()
        navigationController.addOnDestinationChangedListener(listener)
    }

    override fun onPause() {
        super.onPause()
        navigationController.removeOnDestinationChangedListener(listener)
    }

    override fun onSupportNavigateUp(): Boolean {
        return navigationController.navigateUp(appBarConfig) || super.onSupportNavigateUp()
    }
}