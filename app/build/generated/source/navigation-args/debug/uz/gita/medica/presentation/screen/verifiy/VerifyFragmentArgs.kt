package uz.gita.medica.presentation.screen.verifiy

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class VerifyFragmentArgs(
  public val password: String
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("password", this.password)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("password", this.password)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): VerifyFragmentArgs {
      bundle.setClassLoader(VerifyFragmentArgs::class.java.classLoader)
      val __password : String?
      if (bundle.containsKey("password")) {
        __password = bundle.getString("password")
        if (__password == null) {
          throw IllegalArgumentException("Argument \"password\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"password\" is missing and does not have an android:defaultValue")
      }
      return VerifyFragmentArgs(__password)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): VerifyFragmentArgs {
      val __password : String?
      if (savedStateHandle.contains("password")) {
        __password = savedStateHandle["password"]
        if (__password == null) {
          throw IllegalArgumentException("Argument \"password\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"password\" is missing and does not have an android:defaultValue")
      }
      return VerifyFragmentArgs(__password)
    }
  }
}
