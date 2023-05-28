package uz.gita.medica.presentation.screen.signin.viewmodel.impl

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import uz.gita.medica.data.request.RegisterRequest
import uz.gita.medica.data.response.MessageResponse
import uz.gita.medica.domain.usecase.SignInUseCase
import uz.gita.medica.presentation.screen.signin.viewmodel.ViewModelSign
import javax.inject.Inject


@HiltViewModel
class SignViewModeImpl @Inject constructor(
    private val useCase: SignInUseCase,
) : ViewModel(), ViewModelSign {

    override val resultLiveData = MutableLiveData<MessageResponse>()
    override val failLiveData = MutableLiveData<String>()

    override fun signUp(registerRequest: RegisterRequest) {
        Log.d("TTT", "sign up click")
        useCase.register(registerRequest).onEach { result ->

            result.onSuccess {
                Log.d("TTT", "${it.message}")

                resultLiveData.value = it
            }
            result.onFailure {
                Log.d("TTT", "${it.message}")
                failLiveData.value = it.message
            }
        }.launchIn(viewModelScope)
    }
}