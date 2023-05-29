package uz.gita.medica.presentation.pager

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import uz.gita.a5.medica.R

public class ViewPagerScreenDirections private constructor() {
  public companion object {
    public fun actionViewPagerScreenToRegisterFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_viewPagerScreen_to_registerFragment)
  }
}
