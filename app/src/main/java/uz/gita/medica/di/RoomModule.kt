package uz.gita.medica.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import uz.gita.medica.data.source.local.room.local.DoctorDatabase
import uz.gita.medica.data.source.local.room.local.dao.DoctorDao
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RoomModule {

    @Provides
    @Singleton
    fun provideBookDatabase(): DoctorDatabase = DoctorDatabase.getInstance()

    @Provides
    @Singleton
    fun provideDao(db:DoctorDatabase): DoctorDao = db.getDoctorDao()
}