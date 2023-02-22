package com.example.mvvmcleanarchitecture.data.repository.movies

import com.example.mvvmcleanarchitecture.data.model.Movie

interface MovieLocalDataSource {

  suspend fun getMoviesfromDatabase(): List<Movie>

  suspend fun saveMoviesToDatabase(movies: List<Movie>)

  suspend fun clearAll()
}