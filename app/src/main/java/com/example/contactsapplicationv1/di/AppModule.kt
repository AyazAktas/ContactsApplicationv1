package com.example.contactsapplicationv1.di

import android.content.Context
import androidx.room.Room
import com.example.contactsapplicationv1.data.datasource.KisilerDataSource
import com.example.contactsapplicationv1.data.entity.Kisiler
import com.example.contactsapplicationv1.data.repo.KisilerRepository
import com.example.contactsapplicationv1.room.KisilerDao
import com.example.contactsapplicationv1.room.Veritabani
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Provides
    @Singleton
    fun provideKisilerDataSource(kdao:KisilerDao) : KisilerDataSource{
        return KisilerDataSource(kdao)
    }

    @Provides
    @Singleton
    fun provideKisilerRepository(kds:KisilerDataSource) : KisilerRepository{
        return KisilerRepository(kds)
    }


    @Provides
    @Singleton
    fun provideKisilerDao(@ApplicationContext context: Context) : KisilerDao{
        val vt= Room.databaseBuilder(context,Veritabani::class.java,"rehber.sqlite")
            .createFromAsset("rehber.sqlite").build()

        return vt.getKisilerDao()

    }
}