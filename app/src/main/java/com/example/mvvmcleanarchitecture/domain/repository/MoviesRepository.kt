package com.example.mvvmcleanarchitecture.domain.repository

import com.example.mvvmcleanarchitecture.data.model.Movie

interface MoviesRepository {

  suspend fun getMoviesList(): List<Movie>
  suspend fun updateMovies(): List<Movie>
  suspend fun getMoviesFromApi(): List<Movie>
  suspend fun getMoviesFromDatabase(): List<Movie>
  suspend fun getMoviesFromCache(): List<Movie>

}