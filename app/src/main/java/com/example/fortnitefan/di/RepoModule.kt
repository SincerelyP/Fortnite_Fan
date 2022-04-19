package com.example.fortnitefan.di

import com.example.fortnitefan.data.FortniteApi
import com.example.fortnitefan.repository.ForniteRepoImp
import com.example.fortnitefan.repository.FortniteRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

class RepoModule {

    @Module
    @InstallIn(SingletonComponent::class)
    class RepositoryModule {

        @Provides
        @Singleton
        fun providersNewsRepository(provider: FortniteApi): FortniteRepo =
            ForniteRepoImp(provider)
    }
}