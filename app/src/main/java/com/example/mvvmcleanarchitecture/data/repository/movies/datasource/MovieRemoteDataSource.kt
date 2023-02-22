package com.example.mvvmcleanarchitecture.data.repository.movies

import com.example.mvvmcleanarchitecture.data.model.Movie
import com.example.mvvmcleanarchitecture.data.model.MovieList
import retrofit2.Response

interface MovieRemoteDataSource {
  suspend fun getMoviesFromApi(): Response<MovieList>
}