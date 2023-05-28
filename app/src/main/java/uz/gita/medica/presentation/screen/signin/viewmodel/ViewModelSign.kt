package uz.gita.medica.presentation.screen.signin.viewmodel

import androidx.lifecycle.LiveData
import uz.gita.medica.data.request.RegisterRequest
import uz.gita.medica.data.response.MessageResponse

interface ViewModelSign {

    val resultLiveData: LiveData<MessageResponse>

    val failLiveData: LiveData<String>

    fun signUp(registerRequest: RegisterRequest)

}