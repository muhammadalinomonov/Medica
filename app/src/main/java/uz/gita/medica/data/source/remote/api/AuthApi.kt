package uz.gita.medica.data.source.remote.api

import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST
import uz.gita.medica.data.request.RegisterRequest
import uz.gita.medica.data.request.VerifyRequest
import uz.gita.medica.data.response.MessageResponse
import uz.gita.medica.data.response.VerifyResponse

interface AuthApi {

    @POST("api/v1/register")
    suspend fun register(@Body registerRequest: RegisterRequest): Response<MessageResponse>

    @POST("/api/v1/register/verify")
    suspend fun verify(@Body request: VerifyRequest): Response<VerifyResponse>
}