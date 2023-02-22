package com.example.mvvmcleanarchitecture.data.repository.movies

import android.util.Log
import com.example.mvvmcleanarchitecture.data.model.Movie
import com.example.mvvmcleanarchitecture.domain.repository.MoviesRepository

class MovieRepositoryImpl(
  private val remoteDataSource: MovieRemoteDataSource,
  private val localDataSource: MovieLocalDataSource,
  private val cacheDataSource: MovieCacheDataSource
) : MoviesRepository {

  override suspend fun getMoviesList(): List<Movie> {
    return getMoviesFromCache()
  }

  override suspend fun updateMovies(): List<Movie> {
    val newListOfMovies = getMoviesFromApi()
    localDataSource.clearAll()
    localDataSource.saveMoviesToDatabase(newListOfMovies)
    cacheDataSource.saveMoviesToCache(newListOfMovies)
    return newListOfMovies
  }

  override suspend fun getMoviesFromApi(): List<Movie> {
    lateinit var movieList: List<Movie>
    try {
      val response = remoteDataSource.getMoviesFromApi()
      val body = response.body()
      if (body != null) {
        movieList = body.movies
      }
    } catch (exception: java.lang.Exception) {
      Log.i("MyTag", exception.message.toString())
    }
    return movieList
  }

  override suspend fun getMoviesFromDatabase(): List<Movie> {
    lateinit var movieList: List<Movie>
    try {
      movieList = localDataSource.getMoviesfromDatabase()
    } catch (exception: java.lang.Exception) {
      Log.i("MyTag", exception.message.toString())
    }
    if (!movieList.isEmpty()) {
      return movieList
    } else {
      movieList = getMoviesFromApi()
      localDataSource.saveMoviesToDatabase(movieList)
    }
    return movieList
  }

  override suspend fun getMoviesFromCache(): List<Movie> {
    lateinit var movieList: List<Movie>
    try {
      movieList = cacheDataSource.getMoviesfromCache()
    } catch (exception: java.lang.Exception) {
      Log.i("MyTag", exception.message.toString())
    }
    if (!movieList.isEmpty()) {
      return movieList
    } else {
      movieList = getMoviesFromDatabase()
      cacheDataSource.saveMoviesToCache(movieList)
    }
    return movieList
  }
}