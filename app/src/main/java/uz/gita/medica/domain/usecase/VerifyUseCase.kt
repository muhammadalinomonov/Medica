package uz.gita.medica.domain.usecase

import kotlinx.coroutines.flow.Flow
import uz.gita.medica.data.request.VerifyRequest
import uz.gita.medica.data.response.UserData
import uz.gita.medica.data.response.VerifyResponse

interface VerifyUseCase {

    fun verify(request: VerifyRequest): Flow<Result<VerifyResponse>>

    fun addUser(user: UserData): Flow<Result<String>>

}