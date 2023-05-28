package uz.gita.medica.domain.usecase.impl

import kotlinx.coroutines.flow.Flow
import uz.gita.medica.data.request.VerifyRequest
import uz.gita.medica.data.response.UserData
import uz.gita.medica.data.response.VerifyResponse
import uz.gita.medica.domain.repository.AuthRepository
import uz.gita.medica.domain.usecase.VerifyUseCase
import javax.inject.Inject

class VerifyUseCaseImpl @Inject constructor(
    private val repository: AuthRepository,
) : VerifyUseCase {
    override fun verify(request: VerifyRequest): Flow<Result<VerifyResponse>> =
        repository.verify(request)

    override fun addUser(user: UserData): Flow<Result<String>> =
        repository.addUser(user)

}