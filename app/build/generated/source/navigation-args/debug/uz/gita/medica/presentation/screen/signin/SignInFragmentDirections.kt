package uz.gita.medica.presentation.screen.signin

import android.os.Bundle
import androidx.navigation.NavDirections
import kotlin.Int
import kotlin.String
import uz.gita.a5.medica.R

public class SignInFragmentDirections private constructor() {
  private data class ActionSignInFragmentToVerifyFragment(
    public val password: String
  ) : NavDirections {
    public override val actionId: Int = R.id.action_signInFragment_to_verifyFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("password", this.password)
        return result
      }
  }

  public companion object {
    public fun actionSignInFragmentToVerifyFragment(password: String): NavDirections =
        ActionSignInFragmentToVerifyFragment(password)
  }
}
