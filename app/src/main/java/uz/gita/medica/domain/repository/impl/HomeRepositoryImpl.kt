package uz.gita.medica.domain.repository.impl

import android.util.Log
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.storage.StorageReference
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import kotlinx.coroutines.tasks.await
import uz.gita.medica.data.common.ProfileData
import uz.gita.medica.data.models.NotifyData
import uz.gita.medica.data.source.local.room.local.dao.DoctorDao
import uz.gita.medica.data.source.local.room.local.entity.DoctorEntity
import uz.gita.medica.domain.repository.HomeRepository
import javax.inject.Inject

class HomeRepositoryImpl @Inject constructor(
    private val firestore: FirebaseFirestore,
    private val storageReference: StorageReference,
    private val dao: DoctorDao
) : HomeRepository {
    override fun getUserInfo(phone: String): Flow<Result<ProfileData>> =
        callbackFlow<Result<ProfileData>> {
            firestore.collection("users").document(phone).get()
                .addOnSuccessListener {
                    val profile = ProfileData(
                        name = it.get("name") as String,
                        email = it.get("email") as String,
                        gender = it.get("gender") as String,
                        imageUrl = it.get("imgUri") as String,
                        dateOfBirth = it.get("dateOfBirth") as String,
                        nickname = it.get("nickname") as String,
                        password = it.get("password") as String,
                        phone = phone
                    )
                    trySend(Result.success(profile))
                }.addOnFailureListener {
                    trySend(Result.failure(it))
                }
            awaitClose()
        }

    override suspend fun getDoctors(): Result<List<DoctorEntity>> {
        try {
            val querySnapshot = firestore.collection("doctors").get().await()
            if (querySnapshot.isEmpty) return Result.failure(Exception("Empty documents"))
            Log.d("TTT", querySnapshot.documents.size.toString())

            querySnapshot.documents.forEach { doctor ->

                Log.d("TTT", "111 -> ${doctor.get("id")}")
                val newDoctor = DoctorEntity(
                    degree = doctor.get("degree") as String,
                    id = doctor.get("id") as Long,
                    name = doctor.get("name") as String,
                    picture = doctor.get("picture") as String,
                    rate = doctor.get("rate") as String
                )
                Log.d("TTT", newDoctor.name)

                if (dao.getDoctor(newDoctor.id) == null) {
                    dao.addDoctor(newDoctor)
                } else {
                    if (dao.getDoctor(newDoctor.id).isFavourite == 1) {
                        newDoctor.isFavourite = 1
                    }
                    dao.updateDoctor(newDoctor)
                }
            }
            return Result.success(dao.getAllDoctors())
        } catch (e: Exception) {
            return Result.failure(e)
        }

    }

    override suspend fun getNews(): Result<List<NotifyData>> {
        try {
            val list = arrayListOf<NotifyData>()
            val querySnapshot = firestore.collection("notification").get().await()
            if (querySnapshot.isEmpty) return Result.failure(Exception("Empty documents"))

            querySnapshot.documents.forEach { item_news ->

                val news_item = NotifyData(
                    data = item_news.get("date") as String,
                    description = item_news.get("description") as String,
                    icon = item_news.get("icon") as Long,
                    isNew = item_news.get("isnew") as Boolean,
                    name = item_news.get("name") as String
                )
                list.add(news_item)
            }
            list.sortBy {
                it.icon
            }
            return Result.success(list)
        } catch (e: Exception) {
            return Result.failure(e)
        }

    }

    override fun getFavouriteDoctors(): List<DoctorEntity> {
        return dao.getFavouriteDoctors()
    }

    override fun clickedFavourite(id: Long) {
        val doc = dao.getDoctor(id)
        when (doc.isFavourite) {
            0 -> {
                doc.isFavourite = 1
            }

            else -> {
                doc.isFavourite = 0
            }
        }
        dao.updateDoctor(doc)
    }

    override fun getLikeBooks(like: String): List<DoctorEntity> {
        return dao.getLikeBooks(like)
    }
}