package com.example.mvvmcleanarchitecture.presentation.di

import com.example.mvvmcleanarchitecture.data.db.MovieDao
import com.example.mvvmcleanarchitecture.data.repository.movies.datasource.MovieLocalDataSource
import com.example.mvvmcleanarchitecture.data.repository.movies.datasourceimpl.MovieLocalDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class LocalDataSourceModule {

  @Singleton
  @Provides
  fun provideLocalMovieDataSource(movieDao: MovieDao): MovieLocalDataSource {
    return MovieLocalDataSourceImpl(movieDao)
  }
}