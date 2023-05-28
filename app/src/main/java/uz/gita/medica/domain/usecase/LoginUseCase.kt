package uz.gita.medica.domain.usecase

import kotlinx.coroutines.flow.Flow
import uz.gita.medica.data.request.LoginRequest
import uz.gita.medica.data.response.UserData


interface LoginUseCase {

    fun getUser(string: LoginRequest): Flow<Result<List<UserData>>>

}