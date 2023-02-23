package com.example.mvvmcleanarchitecture.data.repository.movies.datasource

import com.example.mvvmcleanarchitecture.data.model.Movie

interface MovieCacheDataSource {

  suspend fun getMoviesfromCache(): List<Movie>

  suspend fun saveMoviesToCache(movie: List<Movie>)
}