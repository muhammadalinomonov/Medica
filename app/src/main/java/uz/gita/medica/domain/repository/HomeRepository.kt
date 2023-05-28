package uz.gita.medica.domain.repository

import kotlinx.coroutines.flow.Flow
import uz.gita.medica.data.common.ProfileData
import uz.gita.medica.data.models.NotifyData
import uz.gita.medica.data.source.local.room.local.entity.DoctorEntity

interface HomeRepository {
    fun getUserInfo(phone:String):Flow<Result<ProfileData>>

    suspend fun getDoctors(): Result<List<DoctorEntity>>

    fun getFavouriteDoctors():List<DoctorEntity>

    fun clickedFavourite(id:Long)

    suspend fun getNews(): Result<List<NotifyData>>
    fun getLikeBooks(like: String): List<DoctorEntity>
}