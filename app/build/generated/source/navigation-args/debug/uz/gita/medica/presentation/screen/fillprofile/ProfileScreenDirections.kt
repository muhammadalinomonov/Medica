package uz.gita.medica.presentation.screen.fillprofile

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import uz.gita.a5.medica.R

public class ProfileScreenDirections private constructor() {
  public companion object {
    public fun actionProfileScreenToMainScreen(): NavDirections =
        ActionOnlyNavDirections(R.id.action_profileScreen_to_mainScreen)
  }
}
