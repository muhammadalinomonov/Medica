package uz.gita.medica.domain.usecase

import kotlinx.coroutines.flow.Flow
import uz.gita.medica.data.request.RegisterRequest
import uz.gita.medica.data.response.MessageResponse

interface SignInUseCase {
    fun register(request: RegisterRequest): Flow<Result<MessageResponse>>
}