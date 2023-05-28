package uz.gita.medica.data.common

import android.net.Uri

data class ProfileData(
    val name: String,
    val nickname: String,
    val dateOfBirth: String,
    val email: String,
    val phone: String,
    val gender: String,
    val imgUri: Uri? = null,
    val password:String,
    val imageUrl:String = ""
)
