package com.example.mvvmcleanarchitecture.data.repository.movies

import com.example.mvvmcleanarchitecture.data.model.Movie

class MovieCacheDataSourceImpl : MovieCacheDataSource {

  private var movieList = ArrayList<Movie>()

  override suspend fun getMoviesfromCache(): List<Movie> {
    return movieList
  }

  override suspend fun saveMoviesToCache(movie: List<Movie>) {
    movieList.clear()
    movieList = ArrayList(movie)
  }
}