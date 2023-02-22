package com.example.mvvmcleanarchitecture.data.repository.movies

import com.example.mvvmcleanarchitecture.data.db.MovieDao
import com.example.mvvmcleanarchitecture.data.model.Movie

class MovieLocalDataSourceImpl(val movieDao: MovieDao) : MovieLocalDataSource {
  override suspend fun getMoviesfromDatabase(): List<Movie> {
    return movieDao.getAllMovies()
  }

  override suspend fun saveMoviesToDatabase(movies: List<Movie>) {
    movieDao.saveMovies(movies)
  }

  override suspend fun clearAll() {
    movieDao.deleteAllMovies()
  }
}