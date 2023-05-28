package uz.gita.medica.presentation.screen.home.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import uz.gita.medica.data.common.ProfileData
import uz.gita.medica.data.response.UserData
import uz.gita.medica.data.source.local.room.local.entity.DoctorEntity

interface HomeViewModel {
    val userLiveData:LiveData<ProfileData>
    val doctorsLiveData:LiveData<List<DoctorEntity>>
    val searchListLiveData: LiveData<List<DoctorEntity>>
    val errorLiveData: LiveData<String>

    fun getDoctors()
    fun changeFavoutite(id:Long)
    fun getUserInformations(phone:String)
    fun searchFun(text: String)
    val loadingLiveData: MutableLiveData<Boolean>
}