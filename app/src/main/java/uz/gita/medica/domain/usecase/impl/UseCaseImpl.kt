package uz.gita.medica.domain.usecase.impl

import kotlinx.coroutines.flow.Flow
import uz.gita.medica.data.common.ProfileData
import uz.gita.medica.data.models.NotifyData
import uz.gita.medica.data.source.local.room.local.entity.DoctorEntity
import uz.gita.medica.domain.repository.HomeRepository
import uz.gita.medica.domain.usecase.UseCase
import javax.inject.Inject

class UseCaseImpl @Inject constructor(
    private val repository: HomeRepository
) : UseCase {
    override fun getUserInfo(phone: String): Flow<Result<ProfileData>> =
        repository.getUserInfo(phone)

    override suspend fun getDoctors(): Result<List<DoctorEntity>> = repository.getDoctors()

    override fun getFavouriteDoctors(): List<DoctorEntity> = repository.getFavouriteDoctors()

    override fun clickedFavourite(id: Long) = repository.clickedFavourite(id)
    override suspend fun getNews(): Result<List<NotifyData>> = repository.getNews()
    override fun search(like: String): List<DoctorEntity> = repository.getLikeBooks(like)
}