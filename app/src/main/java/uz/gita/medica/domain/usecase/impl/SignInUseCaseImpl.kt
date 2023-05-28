package uz.gita.medica.domain.usecase.impl

import kotlinx.coroutines.flow.Flow
import uz.gita.medica.data.request.RegisterRequest
import uz.gita.medica.data.response.MessageResponse
import uz.gita.medica.domain.repository.AuthRepository
import uz.gita.medica.domain.usecase.SignInUseCase
import javax.inject.Inject

class SignInUseCaseImpl @Inject constructor(
    private val repository: AuthRepository,
) : SignInUseCase {

    override fun register(request: RegisterRequest): Flow<Result<MessageResponse>> =
        repository.signUp(request)
}