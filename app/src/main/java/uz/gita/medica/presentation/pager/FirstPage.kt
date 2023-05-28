package uz.gita.medica.presentation.pager

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import uz.gita.a5.medica.R
import uz.gita.a5.medica.databinding.ScreenFirstPageBinding

class FirstPage : Fragment(R.layout.screen_first_page) {
    private val binding by viewBinding(ScreenFirstPageBinding::bind)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.root.setOnClickListener {
            findNavController().navigate(R.id.action_firstPage_to_viewPagerScreen)
        }
    }
}