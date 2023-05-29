package uz.gita.medica.presentation.screen.splash

import android.os.Bundle
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import kotlin.Int
import kotlin.String
import uz.gita.a5.medica.R

public class SplashScreenDirections private constructor() {
  private data class ActionSplashScreenToProfileScreen(
    public val phone: String,
    public val password: String
  ) : NavDirections {
    public override val actionId: Int = R.id.action_splashScreen_to_profileScreen

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("phone", this.phone)
        result.putString("password", this.password)
        return result
      }
  }

  public companion object {
    public fun actionSplashScreenToFirstPage(): NavDirections =
        ActionOnlyNavDirections(R.id.action_splashScreen_to_firstPage)

    public fun actionSplashScreenToProfileScreen(phone: String, password: String): NavDirections =
        ActionSplashScreenToProfileScreen(phone, password)

    public fun actionSplashScreenToMainScreen(): NavDirections =
        ActionOnlyNavDirections(R.id.action_splashScreen_to_mainScreen)
  }
}
