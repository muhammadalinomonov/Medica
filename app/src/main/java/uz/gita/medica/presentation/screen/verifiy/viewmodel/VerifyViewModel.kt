package uz.gita.medica.presentation.screen.verifiy.viewmodel

import androidx.lifecycle.LiveData
import uz.gita.medica.data.request.VerifyRequest
import uz.gita.medica.data.response.UserData
import uz.gita.medica.data.response.VerifyResponse

interface VerifyViewModel {

    val successLiveData: LiveData<VerifyResponse>
    val addLiveData: LiveData<String>
    val failLiveData: LiveData<String>

    fun verify(request: VerifyRequest)

    fun addUser(user: UserData)

}