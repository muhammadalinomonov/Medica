package uz.gita.medica.data.source.local.sharedpref

import android.content.SharedPreferences
import javax.inject.Inject

class MySharedPref @Inject constructor(private val pref: SharedPreferences) {
    var hasProfile: Boolean
        get() = pref.getBoolean("PROFILE", false)
        set(value) {
            pref.edit().putBoolean("PROFILE", value).apply()
        }
    var isFirst: Boolean
        get() = pref.getBoolean("IS_FIRST", true)
        set(value) {
            pref.edit().putBoolean("IS_FIRST", value).apply()
        }
    var phone: String
        get() = pref.getString("PHONE", "")!!
        set(value) {
            pref.edit().putString("PHONE", value).apply()
        }
    var password: String
        get() = pref.getString("PASSWORD", "")!!
        set(value) {
            pref.edit().putString("PASSWORD", value).apply()
        }

}