package uz.gita.medica.presentation.screen.fillprofile

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class ProfileScreenArgs(
  public val phone: String,
  public val password: String
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("phone", this.phone)
    result.putString("password", this.password)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("phone", this.phone)
    result.set("password", this.password)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): ProfileScreenArgs {
      bundle.setClassLoader(ProfileScreenArgs::class.java.classLoader)
      val __phone : String?
      if (bundle.containsKey("phone")) {
        __phone = bundle.getString("phone")
        if (__phone == null) {
          throw IllegalArgumentException("Argument \"phone\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"phone\" is missing and does not have an android:defaultValue")
      }
      val __password : String?
      if (bundle.containsKey("password")) {
        __password = bundle.getString("password")
        if (__password == null) {
          throw IllegalArgumentException("Argument \"password\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"password\" is missing and does not have an android:defaultValue")
      }
      return ProfileScreenArgs(__phone, __password)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): ProfileScreenArgs {
      val __phone : String?
      if (savedStateHandle.contains("phone")) {
        __phone = savedStateHandle["phone"]
        if (__phone == null) {
          throw IllegalArgumentException("Argument \"phone\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"phone\" is missing and does not have an android:defaultValue")
      }
      val __password : String?
      if (savedStateHandle.contains("password")) {
        __password = savedStateHandle["password"]
        if (__password == null) {
          throw IllegalArgumentException("Argument \"password\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"password\" is missing and does not have an android:defaultValue")
      }
      return ProfileScreenArgs(__phone, __password)
    }
  }
}
