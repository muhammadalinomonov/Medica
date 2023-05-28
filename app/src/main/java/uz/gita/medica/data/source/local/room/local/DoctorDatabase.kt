package uz.gita.medica.data.source.local.room.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import uz.gita.medica.data.source.local.room.local.dao.DoctorDao
import uz.gita.medica.data.source.local.room.local.entity.DoctorEntity

@Database(entities = [DoctorEntity::class], version = 1, exportSchema = false)
abstract class DoctorDatabase:RoomDatabase() {
    abstract fun getDoctorDao(): DoctorDao

    companion object {
        private lateinit var database: DoctorDatabase
        private const val NAME_DATABASE = "doc_list.db"

        fun init(context: Context){
            if(!(Companion::database.isInitialized)){
                database = Room.databaseBuilder(context, DoctorDatabase::class.java, NAME_DATABASE)
                    .allowMainThreadQueries()
                    .build()
            }
        }
        fun getInstance() = database
    }
}