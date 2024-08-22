package com.example.contactsapplicationv1.room

import androidx.room.Dao
import androidx.room.Query
import com.example.contactsapplicationv1.data.entity.Kisiler

@Dao
interface KisilerDao {
    @Query("SELECT * FROM kisiler")
    suspend fun kisileriYukle():List<Kisiler>
}