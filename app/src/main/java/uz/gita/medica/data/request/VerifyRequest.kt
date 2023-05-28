package uz.gita.medica.data.request

data class VerifyRequest(
    val phone: String,
    val code: String,
)
