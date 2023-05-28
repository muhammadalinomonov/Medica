package uz.gita.medica.domain.usecase.impl

import kotlinx.coroutines.flow.Flow
import uz.gita.medica.data.request.LoginRequest
import uz.gita.medica.data.response.UserData
import uz.gita.medica.domain.repository.AuthRepository
import uz.gita.medica.domain.usecase.LoginUseCase
import javax.inject.Inject

class LoginUseCaseImpl @Inject constructor(
    private val repository: AuthRepository,
) : LoginUseCase {

    override fun getUser(request: LoginRequest): Flow<Result<List<UserData>>> {
        var bool = true
        request.phone.forEach { ch ->
            if (ch.isLetter()) bool = false
        }
        return if (bool) {
            repository.loginPhone(request.phone)
        } else {
            repository.loginEmail(request.phone)
        }
    }

}