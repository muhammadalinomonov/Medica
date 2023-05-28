package uz.gita.medica.domain.usecase

import kotlinx.coroutines.flow.Flow
import uz.gita.medica.data.common.ProfileData

interface ProfileUseCase {
    fun addProfile(profileData: ProfileData): Flow<Result<Unit>>
}