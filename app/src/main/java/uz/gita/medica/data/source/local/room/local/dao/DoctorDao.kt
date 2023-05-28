package uz.gita.medica.data.source.local.room.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import uz.gita.medica.data.source.local.room.local.entity.DoctorEntity

@Dao
interface DoctorDao {
    @Insert
    fun addDoctor(doctor: DoctorEntity)

    @Update
    fun updateDoctor(doctorEntity: DoctorEntity)

    @Query("SELECT * FROM doctors WHERE isFavourite = 1")
    fun getFavouriteDoctors(): List<DoctorEntity>

    @Query("SELECT * FROM doctors WHERE id =:id")
    fun getDoctor(id: Long): DoctorEntity


    @Query("SELECT * FROM doctors ORDER by id")
    fun getAllDoctors(): List<DoctorEntity>


    @Query("SELECT * FROM doctors WHERE  name LIKE '%' || :like || '%'  OR degree LIKE :like OR rate LIKE :like")
    fun getLikeBooks(like: String): List<DoctorEntity>

}