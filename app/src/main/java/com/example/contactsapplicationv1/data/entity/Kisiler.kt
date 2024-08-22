package com.example.contactsapplicationv1.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import org.jetbrains.annotations.NotNull
import java.io.Serializable


@Entity(tableName = "kisiler")
data class Kisiler(@PrimaryKey(autoGenerate = true)
                   @ColumnInfo(name = "kisi_id") @NotNull var kisi_id:Int,
                   @ColumnInfo(name = "kisi_Ad") @NotNull var kisi_Ad:String,
                   @ColumnInfo(name = "kisi_Tel") @NotNull var kisi_Tel:String ):Serializable {
}