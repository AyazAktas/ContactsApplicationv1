package com.example.contactsapplicationv1.di

import com.example.contactsapplicationv1.data.datasource.KisilerDataSource
import com.example.contactsapplicationv1.data.repo.KisilerRepository
import com.google.firebase.Firebase
import com.google.firebase.firestore.CollectionReference
import com.google.firebase.firestore.firestore
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Provides
    @Singleton
    fun provideKisilerDataSource(collectionReference: CollectionReference) : KisilerDataSource{
        return KisilerDataSource(collectionReference)
    }

    @Provides
    @Singleton
    fun provideKisilerRepository(kds:KisilerDataSource) : KisilerRepository{
        return KisilerRepository(kds)
    }


    @Provides
    @Singleton
    fun provideCollectionReference() : CollectionReference{
        return Firebase.firestore.collection("KisilerYeni")
    }

}