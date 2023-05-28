package uz.gita.medica.presentation.screen.fillprofile.viewmodel

import android.net.Uri
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import uz.gita.medica.data.common.GenderEnum
import uz.gita.medica.data.common.ProfileData
import uz.gita.medica.domain.usecase.ProfileUseCase
import javax.inject.Inject

@HiltViewModel
class ProfileViewModelImpl @Inject constructor(private val useCase: ProfileUseCase) : ViewModel(),
    ProfileViewModel {
    override val errorLiveData = MutableLiveData<String>()
    override val openNextScreenLiveData = MutableLiveData<Unit>()

    override fun addProfile(
        fullName: String,
        nickName: String,
        date: String,
        email: String,
        phone:String,
        gender: String,
        imgUri: Uri?,
        password:String
    ) {
        useCase.addProfile(ProfileData(fullName, nickName, date, email,phone, gender, imgUri, password))
            .onEach {
                it.onSuccess {
                    openNextScreenLiveData.value = Unit
                }
                it.onFailure {
                    errorLiveData.value = it.message
                }
            }.launchIn(viewModelScope)
    }
}