package uz.gita.medica.domain.repository

import kotlinx.coroutines.flow.Flow
import uz.gita.medica.data.common.ProfileData

interface

ProfileRepository {
    fun addProfile(profileData: ProfileData): Flow<Result<Unit>>
}