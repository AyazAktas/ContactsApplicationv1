package com.example.contactsapplicationv1.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.contactsapplicationv1.data.entity.Kisiler

@Database(entities = [Kisiler::class] , version = 1)
abstract class Veritabani :RoomDatabase() {
    abstract fun getKisilerDao():KisilerDao
}