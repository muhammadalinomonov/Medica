package uz.gita.medica.presentation.screen.favourite.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import uz.gita.medica.data.source.local.room.local.entity.DoctorEntity

interface FavouriteViewModel {
    val doctorsLiveData: LiveData<List<DoctorEntity>>
    val errorLiveData: MutableLiveData<String>
    val loadingLiveData: MutableLiveData<Boolean>


    fun getFavouriteDocs()
    fun changeFavoutite(id:Long)
}