package com.example.mvvmcleanarchitecture.presentation.di

import com.example.mvvmcleanarchitecture.data.repository.movies.MovieRepositoryImpl
import com.example.mvvmcleanarchitecture.data.repository.movies.datasource.MovieCacheDataSource
import com.example.mvvmcleanarchitecture.data.repository.movies.datasource.MovieLocalDataSource
import com.example.mvvmcleanarchitecture.data.repository.movies.datasource.MovieRemoteDataSource
import com.example.mvvmcleanarchitecture.domain.repository.MoviesRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {

  @Singleton
  @Provides
  fun provideMovieRepository(
    remoteDataSource: MovieRemoteDataSource,
    localDataSource: MovieLocalDataSource,
    cacheDataSource: MovieCacheDataSource
  ): MoviesRepository {
    return MovieRepositoryImpl(remoteDataSource, localDataSource, cacheDataSource)
  }
}