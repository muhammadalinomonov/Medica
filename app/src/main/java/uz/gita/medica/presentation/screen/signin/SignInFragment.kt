package uz.gita.medica.presentation.screen.signin

import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import androidx.core.widget.doAfterTextChanged
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.google.android.material.snackbar.Snackbar
import dagger.hilt.android.AndroidEntryPoint
import uz.gita.a5.medica.R
import uz.gita.a5.medica.databinding.FragmentSigninBinding
import uz.gita.medica.data.request.RegisterRequest
import uz.gita.medica.presentation.screen.signin.viewmodel.impl.SignViewModeImpl

@AndroidEntryPoint
class SignInFragment : Fragment(R.layout.fragment_signin) {

    private val binding by viewBinding(FragmentSigninBinding::bind)

    private val viewModel by viewModels<SignViewModeImpl>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel.resultLiveData.observe(this) {
            val action  = SignInFragmentDirections.actionSignInFragmentToVerifyFragment(binding.password.text.toString())
            findNavController().navigate(action)
        }

        viewModel.failLiveData.observe(this) {
            Snackbar.make(
                binding.root, "Fail", Snackbar.LENGTH_SHORT
            ).setBackgroundTint(
                ContextCompat.getColor(
                    requireContext(), R.color.teal_200
                )
            ).show()
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {

            phone.doAfterTextChanged {
                check()
            }

            password.doAfterTextChanged {
                check()
            }

            signin.setOnClickListener {
                findNavController().navigate(R.id.action_loginFragment_to_signInFragment)
            }

            signup.setOnClickListener {
                val request = RegisterRequest(
                    phone = phone.text.toString().trim(),
                    password = password.text.toString().trim()
                )
                viewModel.signUp(request)
            }

        }
    }

    private fun check() {

        binding.apply {
            signup.isEnabled = false

            val phoneNumber = phone.text.toString().trim()
            val pasword = password.text.toString().trim()

            if (pasword.length < 6 || pasword.length > 15) return


            if (phoneNumber.length != 13) return

            val str = phoneNumber.substring(0, 4)

            if (str != "+998") return

            signup.isEnabled = true
            signup.isClickable = true

        }

    }


}