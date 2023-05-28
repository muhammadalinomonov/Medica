package uz.gita.medica.app

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import uz.gita.medica.data.source.local.room.local.DoctorDatabase

@HiltAndroidApp
class App : Application(){
    override fun onCreate() {
        DoctorDatabase.init(this)
        super.onCreate()
    }
}