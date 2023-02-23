package com.example.mvvmcleanarchitecture.data.repository.movies.datasourceimpl

import com.example.mvvmcleanarchitecture.data.model.Movie
import com.example.mvvmcleanarchitecture.data.repository.movies.datasource.MovieCacheDataSource

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