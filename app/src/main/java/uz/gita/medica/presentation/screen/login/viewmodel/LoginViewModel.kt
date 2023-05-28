package uz.gita.medica.presentation.screen.login.viewmodel

import androidx.lifecycle.LiveData
import uz.gita.medica.data.request.LoginRequest
import uz.gita.medica.data.response.UserData

interface LoginViewModel {

    val resultLiveData: LiveData<UserData>

    val failLiveData: LiveData<String>

    fun logIn(loginRequest: LoginRequest)

}