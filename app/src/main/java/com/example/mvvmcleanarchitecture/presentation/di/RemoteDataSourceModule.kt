package com.example.mvvmcleanarchitecture.presentation.di

import com.example.mvvmcleanarchitecture.data.api.TMDBService
import com.example.mvvmcleanarchitecture.data.repository.movies.datasource.MovieRemoteDataSource
import com.example.mvvmcleanarchitecture.data.repository.movies.datasourceimpl.MovieRemoteDataSourceImpl
import dagger.Module

@Module
class RemoteDataSourceModule {

  fun provideMovieDataSource(service: TMDBService, apiKey: String): MovieRemoteDataSource {
    return MovieRemoteDataSourceImpl(service, apiKey)
  }
}