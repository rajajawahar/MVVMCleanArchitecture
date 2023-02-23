package com.example.mvvmcleanarchitecture.data.repository.movies.datasource

import com.example.mvvmcleanarchitecture.data.model.Movie

interface MovieLocalDataSource {

  suspend fun getMoviesfromDatabase(): List<Movie>

  suspend fun saveMoviesToDatabase(movies: List<Movie>)

  suspend fun clearAll()
}