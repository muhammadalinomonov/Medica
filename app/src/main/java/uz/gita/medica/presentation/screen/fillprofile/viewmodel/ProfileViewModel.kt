package uz.gita.medica.presentation.screen.fillprofile.viewmodel

import android.net.Uri
import androidx.lifecycle.LiveData
import uz.gita.medica.data.common.GenderEnum

interface ProfileViewModel {
    val errorLiveData: LiveData<String>
    val openNextScreenLiveData: LiveData<Unit>
    fun addProfile(
        fullName: String,
        nickName: String,
        date: String,
        email: String,
        phone: String,
        gender: String,
        imgUri: Uri? = null,
        password:String
    )
}