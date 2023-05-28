package uz.gita.medica.presentation.screen.register

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import dagger.hilt.android.AndroidEntryPoint
import uz.gita.a5.medica.R
import uz.gita.a5.medica.databinding.FragmentRegisterBinding

@AndroidEntryPoint
class RegisterFragment : Fragment(R.layout.fragment_register) {

    private val binding by viewBinding(FragmentRegisterBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            logn.setOnClickListener {
                findNavController().navigate(R.id.action_registerFragment_to_loginFragment)
            }

            sign.setOnClickListener {
                findNavController().navigate(R.id.action_registerFragment_to_signInFragment)
            }

        }

    }


}