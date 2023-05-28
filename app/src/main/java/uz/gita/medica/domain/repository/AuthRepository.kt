package uz.gita.medica.domain.repository

import kotlinx.coroutines.flow.Flow
import uz.gita.medica.data.request.RegisterRequest
import uz.gita.medica.data.request.VerifyRequest
import uz.gita.medica.data.response.MessageResponse
import uz.gita.medica.data.response.UserData
import uz.gita.medica.data.response.VerifyResponse

interface AuthRepository {
    fun signUp(registerRequest: RegisterRequest): Flow<Result<MessageResponse>>

    fun loginEmail(request: String): Flow<Result<List<UserData>>>

    fun loginPhone(request: String): Flow<Result<List<UserData>>>

    fun verify(request: VerifyRequest): Flow<Result<VerifyResponse>>

    fun addUser(user: UserData): Flow<Result<String>>
}