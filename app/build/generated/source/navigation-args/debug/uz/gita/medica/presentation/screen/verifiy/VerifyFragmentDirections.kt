package uz.gita.medica.presentation.screen.verifiy

import android.os.Bundle
import androidx.navigation.NavDirections
import kotlin.Int
import kotlin.String
import uz.gita.a5.medica.R

public class VerifyFragmentDirections private constructor() {
  private data class ActionVerifyFragmentToProfileScreen(
    public val phone: String,
    public val password: String
  ) : NavDirections {
    public override val actionId: Int = R.id.action_verifyFragment_to_profileScreen

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("phone", this.phone)
        result.putString("password", this.password)
        return result
      }
  }

  public companion object {
    public fun actionVerifyFragmentToProfileScreen(phone: String, password: String): NavDirections =
        ActionVerifyFragmentToProfileScreen(phone, password)
  }
}
