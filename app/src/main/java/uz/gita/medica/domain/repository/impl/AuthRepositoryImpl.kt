package uz.gita.medica.domain.repository.impl

import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import uz.gita.medica.data.request.RegisterRequest
import uz.gita.medica.data.request.VerifyRequest
import uz.gita.medica.data.response.MessageResponse
import uz.gita.medica.data.response.UserData
import uz.gita.medica.data.response.VerifyResponse
import uz.gita.medica.data.source.remote.api.AuthApi
import uz.gita.medica.domain.repository.AuthRepository
import javax.inject.Inject

class AuthRepositoryImpl @Inject constructor(
    private val authApi: AuthApi,
) : AuthRepository {
    private val firestore = Firebase.firestore


    override fun signUp(registerRequest: RegisterRequest): Flow<Result<MessageResponse>> =
        flow {
            val response = authApi.register(registerRequest)

            when (response.code()) {
                in 200..299 -> {
                    emit(Result.success(response.body() ?: MessageResponse("test")))
                }

                else -> {
                    emit(Result.failure(Exception("fail")))
                }
            }
        }.catch {

        }.flowOn(Dispatchers.IO)

    override fun verify(request: VerifyRequest): Flow<Result<VerifyResponse>> = flow {

        val response = authApi.verify(request)
        when (response.code()) {
            in 200..299 -> {
                emit(Result.success(response.body() ?: VerifyResponse("null", "null")))
            }

            else -> {
                emit(Result.failure(Exception("Failed")))
            }
        }

    }.catch { }
        .flowOn(Dispatchers.IO)

    override fun addUser(user: UserData): Flow<Result<String>> = flow {
        val collection = firestore.collection("users")
        var result = ""
        collection
            .document(user.phone)
            .set(user)
            .addOnSuccessListener {
                result = "add"
            }.addOnFailureListener {
                result = "fail"
            }
        if (result == "fail") {
            emit(Result.failure(Exception(result)))
        } else {
            emit(Result.success(result))
        }
    }

    override fun loginEmail(request: String): Flow<Result<List<UserData>>> = callbackFlow {

        val collection = firestore.collection("users")
        collection
            .whereEqualTo("email", request)
            .get()
            .addOnSuccessListener { querySnapshot ->
                val users = ArrayList<UserData>()
                querySnapshot.forEach { data ->
                    val user = UserData(
                        name = data.get("name") as String,
                        nickname = data.get("nickname") as String,
                        dateOfBirth = data.get("dateOfBirth") as String,
                        email = data.get("email") as String,
                        phone = data.get("phone") as String,
                        password = data.get("password") as String,
                        gender = data.get("gender") as String,
                        imgUri = data.get("imgUri") as String
                    )
                    users.add(user)
                }
                trySend(Result.success(users))
            }
            .addOnFailureListener {
                trySend(Result.failure(it))
            }
        awaitClose()
    }

    override fun loginPhone(request: String): Flow<Result<List<UserData>>> =
        callbackFlow {
            val collection = firestore.collection("users")
            collection
                .whereEqualTo("phone", request)
                .get()
                .addOnSuccessListener { querySnapshot ->
                    val users = ArrayList<UserData>()
                    querySnapshot.forEach { data ->
                        val user = UserData(
                            name = data.get("name") as String,
                            nickname = data.get("nickname") as String,
                            dateOfBirth = data.get("dateOfBirth") as String,
                            email = data.get("email") as String,
                            phone = data.get("phone") as String,
                            password = data.get("password") as String,
                            gender = data.get("gender") as String,
                            imgUri = data.get("imgUri") as String
                        )
                        users.add(user)
                    }
                    trySend(Result.success(users))
                }
                .addOnFailureListener {
                    trySend(Result.failure(it))
                }
            awaitClose()
        }


}