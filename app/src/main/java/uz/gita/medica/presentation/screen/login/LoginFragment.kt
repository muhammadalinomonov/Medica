package uz.gita.medica.presentation.screen.login

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
import uz.gita.a5.medica.databinding.FragmentLoginBinding
import uz.gita.medica.data.request.LoginRequest
import uz.gita.medica.data.source.local.sharedpref.MySharedPref
import uz.gita.medica.presentation.screen.login.viewmodel.impl.LoginViewModelImpl
import javax.inject.Inject

@AndroidEntryPoint
class LoginFragment : Fragment(R.layout.fragment_login) {

    private val viewModel by viewModels<LoginViewModelImpl>()

    @Inject
    lateinit var sharedPref: MySharedPref
    private val binding by viewBinding(FragmentLoginBinding::bind)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.resultLiveData.observe(this) {
            sharedPref.phone = binding.phone.text.toString()
            sharedPref.isFirst = false
            sharedPref.hasProfile = true
            sharedPref.password = binding.password.text.toString()



            findNavController().navigate(R.id.action_loginFragment_to_mainScreen)

            /*val action =
                LoginFragmentDirections.actionLoginFragmentToProfileScreen(
                    binding.phone.text.toString(),
                    binding.phone.text.toString()
                )
            findNavController().navigate(action)*/
        }

        viewModel.failLiveData.observe(this) {
            Snackbar.make(
                binding.root, "user mavjud emas yoki xatolik mavjud", Snackbar.LENGTH_SHORT
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
                val request = LoginRequest(
                    phone = phone.text.toString().trim(),
                    password = password.text.toString().trim()
                )
                viewModel.logIn(request)
            }

            signup.setOnClickListener {
                findNavController().navigate(R.id.action_loginFragment_to_signInFragment)
            }


        }
    }

    private fun check() {

        binding.apply {
            signin.isEnabled = false
            val phoneNumber = phone.text.toString().trim()
            val pasword = password.text.toString().trim()

            if (pasword.length < 6 || pasword.length > 15) return


            if (phoneNumber.length != 13) return

            val str = phoneNumber.substring(0, 4)

            if (str != "+998") return

            signin.isEnabled = true

        }

    }

}