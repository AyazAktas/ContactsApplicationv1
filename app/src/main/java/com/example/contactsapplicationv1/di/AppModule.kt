package com.example.contactsapplicationv1.di

import com.example.contactsapplicationv1.data.datasource.KisilerDataSource
import com.example.contactsapplicationv1.data.repo.KisilerRepository
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
    fun provideKisilerDataSource() : KisilerDataSource{
        return KisilerDataSource()
    }

    @Provides
    @Singleton
    fun provideKisilerRepository(kds:KisilerDataSource) : KisilerRepository{
        return KisilerRepository(kds)
    }

}