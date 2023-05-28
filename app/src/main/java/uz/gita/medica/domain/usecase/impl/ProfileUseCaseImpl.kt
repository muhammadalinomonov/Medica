package uz.gita.medica.domain.usecase.impl

import kotlinx.coroutines.flow.Flow
import uz.gita.medica.data.common.ProfileData
import uz.gita.medica.domain.repository.ProfileRepository
import uz.gita.medica.domain.usecase.ProfileUseCase
import javax.inject.Inject

class ProfileUseCaseImpl @Inject constructor(private val repository: ProfileRepository) :
    ProfileUseCase {
    override fun addProfile(profileData: ProfileData): Flow<Result<Unit>> =
        repository.addProfile(profileData)
}