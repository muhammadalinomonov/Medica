package uz.gita.medica.presentation.screen.splash

import android.annotation.SuppressLint
import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import uz.gita.a5.medica.R
import uz.gita.a5.medica.databinding.ScreenSplashBinding
import uz.gita.medica.data.source.local.sharedpref.MySharedPref
import javax.inject.Inject

@SuppressLint("CustomSplashScreen")
@AndroidEntryPoint
class SplashScreen : Fragment(R.layout.screen_splash) {
    @Inject
    lateinit var sharedPref: MySharedPref
    private val binding by viewBinding(ScreenSplashBinding::bind)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {


        val animLoad = binding.imageView2.drawable as AnimationDrawable
        animLoad.start()
        lifecycleScope.launch {
            delay(2000)

            if (sharedPref.isFirst) {
                findNavController().navigate(R.id.action_splashScreen_to_firstPage)
            } else {
                if (sharedPref.hasProfile) {
                    findNavController().navigate(R.id.action_splashScreen_to_mainScreen)
                } else {
                    val action = SplashScreenDirections.actionSplashScreenToProfileScreen(
                        sharedPref.phone,
                        sharedPref.password
                    )
                    findNavController().navigate(action)
                }
            }
        }
    }
}