package uz.gita.medica.data.request

data class RegisterRequest(
    val firstName: String = "Muhammadali",
    val lastName: String = "Jahongir",
    val phone: String,
    val password: String,
)
