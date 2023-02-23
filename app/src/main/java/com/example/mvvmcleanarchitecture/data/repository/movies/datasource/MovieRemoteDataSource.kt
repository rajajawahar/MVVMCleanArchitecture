package com.example.mvvmcleanarchitecture.data.repository.movies.datasource

import com.example.mvvmcleanarchitecture.data.model.MovieList
import retrofit2.Response

interface MovieRemoteDataSource {
  suspend fun getMoviesFromApi(): Response<MovieList>
}