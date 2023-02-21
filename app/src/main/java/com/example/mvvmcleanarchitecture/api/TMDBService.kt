package com.example.mvvmcleanarchitecture.api

import com.example.mvvmcleanarchitecture.model.ArtistList
import com.example.mvvmcleanarchitecture.model.MovieList
import com.example.mvvmcleanarchitecture.model.TvShow
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface TMDBService {
  @GET("movie/popular")
  suspend fun getPopularMovies(@Query("api_key") apiKey: String): Response<MovieList>

  @GET("tv/popular")
  suspend fun getPopularTvShows(@Query("api_key") apiKey: String): Response<TvShow>

  @GET("person/popular")
  suspend fun getPopularArtists(@Query("api_key") apiKey: String): Response<ArtistList>
}