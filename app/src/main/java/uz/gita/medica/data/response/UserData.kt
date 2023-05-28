package uz.gita.medica.data.response

data class UserData(
    val name: String = "",
    val nickname: String = "",
    val dateOfBirth: String = "",
    val email: String = "",
    val phone: String,
    val password: String,
    val gender: String = "",
    val imgUri: String = "",
)
