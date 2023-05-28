package uz.gita.medica.presentation.screen.login.viewmodel.impl

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import uz.gita.medica.data.request.LoginRequest
import uz.gita.medica.data.response.UserData
import uz.gita.medica.domain.usecase.LoginUseCase
import uz.gita.medica.presentation.screen.login.viewmodel.LoginViewModel
import javax.inject.Inject

@HiltViewModel
class LoginViewModelImpl @Inject constructor(
    private val useCase: LoginUseCase,
) : ViewModel(), LoginViewModel {


    override val resultLiveData = MutableLiveData<UserData>()
    override val failLiveData = MutableLiveData<String>()

    override fun logIn(loginRequest: LoginRequest) {
        useCase.getUser(loginRequest).onEach { result ->
            result.onSuccess { list ->
                if (list.isEmpty()) {
                    failLiveData.value = "Not user"
                } else {
                    resultLiveData.value = list[0]
                }
            }
            result.onFailure {
                failLiveData.value = "Fail"
            }
        }.launchIn(viewModelScope)
    }
}