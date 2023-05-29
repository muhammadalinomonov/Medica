package uz.gita.medica.presentation.screen.login

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import uz.gita.a5.medica.R

public class LoginFragmentDirections private constructor() {
  public companion object {
    public fun actionLoginFragmentToSignInFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_loginFragment_to_signInFragment)

    public fun actionLoginFragmentToMainScreen(): NavDirections =
        ActionOnlyNavDirections(R.id.action_loginFragment_to_mainScreen)
  }
}
