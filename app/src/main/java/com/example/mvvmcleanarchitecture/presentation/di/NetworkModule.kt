package com.example.mvvmcleanarchitecture.presentation.di

import com.example.mvvmcleanarchitecture.data.api.TMDBService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class NetworkModule(private val baseUrl: String) {

  @Singleton
  @Provides
  fun provideRetorift(): Retrofit {
    return Retrofit.Builder()
      .addConverterFactory(GsonConverterFactory.create())
      .baseUrl(baseUrl).build()
  }

  @Singleton
  @Provides
  fun provideTMDSService(retrofit: Retrofit): TMDBService {
    return retrofit.create(TMDBService::class.java)
  }
}