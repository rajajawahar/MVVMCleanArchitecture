package com.example.mvvmcleanarchitecture.data.repository.movies.datasourceimpl

import com.example.mvvmcleanarchitecture.data.api.TMDBService
import com.example.mvvmcleanarchitecture.data.model.MovieList
import com.example.mvvmcleanarchitecture.data.repository.movies.datasource.MovieRemoteDataSource
import retrofit2.Response

class MovieRemoteDataSourceImpl(val service: TMDBService, val apiKey: String) :
  MovieRemoteDataSource {
  override suspend fun getMoviesFromApi(): Response<MovieList> {
    return service.getPopularMovies(apiKey)
  }
}