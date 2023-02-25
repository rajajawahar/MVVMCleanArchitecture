package com.example.mvvmcleanarchitecture.presentation.di

import com.example.mvvmcleanarchitecture.data.repository.movies.datasource.MovieCacheDataSource
import com.example.mvvmcleanarchitecture.data.repository.movies.datasourceimpl.MovieCacheDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CacheDataSourceModule {

  @Singleton
  @Provides
  fun provideCacheMovieDataSource(): MovieCacheDataSource {
    return MovieCacheDataSourceImpl()
  }
}