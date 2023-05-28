package uz.gita.medica.presentation.screen.verifiy.viewmodel.impl

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import uz.gita.medica.data.request.VerifyRequest
import uz.gita.medica.data.response.UserData
import uz.gita.medica.data.response.VerifyResponse
import uz.gita.medica.domain.usecase.VerifyUseCase
import uz.gita.medica.presentation.screen.verifiy.viewmodel.VerifyViewModel
import javax.inject.Inject

@HiltViewModel
class VerifyViewModelImpl @Inject constructor(
    private val verifyUseCase: VerifyUseCase,
) : ViewModel(), VerifyViewModel {
    override val successLiveData = MutableLiveData<VerifyResponse>()
    override val addLiveData = MutableLiveData<String>()

    override val failLiveData = MutableLiveData<String>()

    override fun verify(request: VerifyRequest) {
        verifyUseCase.verify(request).onEach { result ->
            result.onSuccess {
                successLiveData.value = it
            }
            result.onFailure {
                failLiveData.value = it.message
            }
        }.launchIn(viewModelScope)
    }

    override fun addUser(user: UserData) {
        verifyUseCase.addUser(user).onEach { result ->
            result.onSuccess {
                addLiveData.value = it
            }
            result.onFailure {

            }
        }.launchIn(viewModelScope)
    }

}