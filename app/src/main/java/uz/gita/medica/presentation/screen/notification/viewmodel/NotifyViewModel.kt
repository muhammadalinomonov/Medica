package uz.gita.medica.presentation.screen.notification.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import uz.gita.medica.data.models.NotifyData

interface NotifyViewModel {
    val notifyLiveData: LiveData<List<NotifyData>>
    val errorLiveData: MutableLiveData<String>
    val loadingLiveData: MutableLiveData<Boolean>


    fun getNews()
}