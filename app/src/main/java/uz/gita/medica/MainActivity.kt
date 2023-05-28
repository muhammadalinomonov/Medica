package uz.gita.medica

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import uz.gita.a5.medica.R
import uz.gita.medica.data.UrlData
import uz.gita.medica.di.NetworkModule

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private val db = Firebase.firestore

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getUrl().onEach {
            it.onSuccess {
                NetworkModule.setUrl(it.baseUrl)
            }
            it.onFailure {
                Toast.makeText(this, it.message, Toast.LENGTH_SHORT).show()
            }
        }.launchIn(lifecycleScope)
    }

    private fun getUrl(): Flow<Result<UrlData>> = callbackFlow<Result<UrlData>> {
        var url: String = ""
        db.collection("baseUrls")
            .get()
            .addOnSuccessListener { querySnapshot ->
                querySnapshot.forEach {
                    url = it.get("baseUrl") as String
                }
                trySend(Result.success(UrlData(url)))
            }
            .addOnFailureListener {
                trySend(Result.failure(Exception("Base url eskirdi.")))
            }

        awaitClose()
    }.flowOn(Dispatchers.IO)
}