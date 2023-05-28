package uz.gita.medica.domain.repository.impl

import android.net.Uri
import androidx.core.net.toUri
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.storage.StorageReference
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import kotlinx.coroutines.tasks.await
import uz.gita.medica.data.common.ProfileData
import uz.gita.medica.domain.repository.ProfileRepository
import javax.inject.Inject

class ProfileRepositoryImpl @Inject constructor(
    private val fireStore: FirebaseFirestore,
    private val storageReference: StorageReference
) : ProfileRepository {

    override fun addProfile(profileData: ProfileData): Flow<Result<Unit>> = callbackFlow {
        var url =
            "https://firebasestorage.googleapis.com/v0/b/imtihon-3-oy.appspot.com/o/avatar.png?alt=media&token=e9ec9df7-4f5e-4e75-9217-099b44d673bb"

        if (profileData.imgUri == null) {
            val userData =
                ProfileData(
                    profileData.name,
                    profileData.nickname,
                    profileData.dateOfBirth,
                    profileData.email,
                    profileData.phone,
                    profileData.gender,
                    url.toUri(),
                    profileData.password
                )


            val collection = fireStore.collection("users")

            collection
                .document(profileData.phone)
                .set(userData)
                .addOnSuccessListener {
                    trySend(Result.success(Unit))
                }
                .addOnFailureListener {
                    trySend(Result.failure(it))
                }
        } else {
            val urlAvatar = profileData.imgUri.let {
                loadImage(it!!, "profile_image").onSuccess {
                    val userData =
                        ProfileData(
                            profileData.name,
                            profileData.nickname,
                            profileData.dateOfBirth,
                            profileData.email,
                            profileData.phone,
                            profileData.gender,
                            it,
                            profileData.password
                        )

                    val collection = fireStore.collection("users")

                    collection
                        .document(profileData.phone)
                        .set(userData)
                        .addOnSuccessListener {
                            trySend(Result.success(Unit))
                        }
                        .addOnFailureListener {
                            trySend(Result.failure(it))
                        }
                }
                    .onFailure {
                        trySend(Result.failure(it))
                    }
            }
        }
        awaitClose()
    }

    private suspend fun loadImage(uriForImage: Uri, reference: String): Result<Uri> {
        try {
            val uploadTaskImage = storageReference.child(reference)
                .putFile(uriForImage)
                .await()

            return Result.success(uploadTaskImage.storage.downloadUrl.await())
        } catch (e: Exception) {
            return Result.failure(e)
        }
    }
}