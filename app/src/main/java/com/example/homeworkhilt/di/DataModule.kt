package com.example.homeworkhilt.di

import com.example.homeworkhilt.data.ImageRepositoryImpl
import com.example.homeworkhilt.domain.ImageRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class DataModule {

    @Binds
    abstract fun getRepository(impl: ImageRepositoryImpl) :ImageRepository
}