package uz.gita.medica.presentation.screen.register

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import uz.gita.a5.medica.R

public class RegisterFragmentDirections private constructor() {
  public companion object {
    public fun actionRegisterFragmentToLoginFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_registerFragment_to_loginFragment)

    public fun actionRegisterFragmentToSignInFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_registerFragment_to_signInFragment)
  }
}
