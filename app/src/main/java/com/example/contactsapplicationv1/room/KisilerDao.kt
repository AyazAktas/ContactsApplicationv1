package com.example.contactsapplicationv1.room

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.contactsapplicationv1.data.entity.Kisiler

@Dao
interface KisilerDao {
    @Query("SELECT * FROM kisiler")
    suspend fun kisileriYukle():List<Kisiler>

    @Insert
    suspend fun kaydet(kisi: Kisiler)

    @Update
    suspend fun guncelle(kisi: Kisiler)

    @Delete
    suspend fun sil(kisi: Kisiler)
}