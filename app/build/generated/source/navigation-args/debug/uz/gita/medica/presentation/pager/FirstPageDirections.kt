package uz.gita.medica.presentation.pager

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import uz.gita.a5.medica.R

public class FirstPageDirections private constructor() {
  public companion object {
    public fun actionFirstPageToViewPagerScreen(): NavDirections =
        ActionOnlyNavDirections(R.id.action_firstPage_to_viewPagerScreen)
  }
}
