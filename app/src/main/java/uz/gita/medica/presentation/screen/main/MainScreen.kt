package uz.gita.medica.presentation.screen.main

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import uz.gita.a5.medica.R
import uz.gita.a5.medica.databinding.ScreenMainBinding

class MainScreen:Fragment(R.layout.screen_main) {
    private val binding by viewBinding(ScreenMainBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.bottomNavigation.itemIconTintList = null

        val navController = (childFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment).navController

        binding.bottomNavigation.setupWithNavController(navController)
    }
}