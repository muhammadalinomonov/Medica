package uz.gita.medica.presentation.screen.home

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import uz.gita.a5.medica.R

public class HomeScreenDirections private constructor() {
  public companion object {
    public fun actionHomeScreenToFavouriteScreen(): NavDirections =
        ActionOnlyNavDirections(R.id.action_homeScreen_to_favouriteScreen)

    public fun actionHomeScreenToNotificationScreen(): NavDirections =
        ActionOnlyNavDirections(R.id.action_homeScreen_to_notificationScreen)
  }
}
