package uz.gita.medica.presentation.screen.verifiy

import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import androidx.core.widget.doAfterTextChanged
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import by.kirich1409.viewbindingdelegate.viewBinding
import com.google.android.material.snackbar.Snackbar
import dagger.hilt.android.AndroidEntryPoint
import uz.gita.a5.medica.R
import uz.gita.a5.medica.databinding.FragmentVerifyBinding
import uz.gita.medica.data.request.VerifyRequest
import uz.gita.medica.data.response.UserData
import uz.gita.medica.data.source.local.sharedpref.MySharedPref
import uz.gita.medica.presentation.screen.verifiy.viewmodel.impl.VerifyViewModelImpl
import javax.inject.Inject

@AndroidEntryPoint
class VerifyFragment : Fragment(R.layout.fragment_verify) {

    private val viewModel by viewModels<VerifyViewModelImpl>()

    private val binding by viewBinding(FragmentVerifyBinding::bind)
    private val args by navArgs<VerifyFragmentArgs>()

    @Inject
    lateinit var sharePref: MySharedPref
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.successLiveData.observe(this) {
            val user =
                UserData(
                    phone = binding.number.text.toString().trim(),
                    password = "454545455"
                )
            viewModel.addUser(user)
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
        viewModel.addLiveData.observe(this) {
            sharePref.phone = binding.number.text.toString()
            sharePref.isFirst = false
            sharePref.password = args.password
            val action =
                VerifyFragmentDirections.actionVerifyFragmentToProfileScreen(
                    binding.number.text.toString(),
                    sharePref.password
                )
            findNavController().navigate(action)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {

            number.doAfterTextChanged {
                check()
            }

            password.doAfterTextChanged {
                check()
            }

            sendBtn.setOnClickListener {
                val request = VerifyRequest(
                    phone = number.text.toString().trim(),
                    code = password.text.toString().trim()
                )
                viewModel.verify(request)
            }

        }

    }

    private fun check() {
        binding.apply {
            sendBtn.isEnabled = false
            val phoneNumber = number.text.toString().trim()
            val pasword = password.text.toString().trim()
            if (pasword.length < 6 || pasword.length > 15) return
            if (phoneNumber.length != 13) return
            val str = phoneNumber.substring(0, 4)
            if (str != "+998") return
            sendBtn.isEnabled = true
        }
    }

}