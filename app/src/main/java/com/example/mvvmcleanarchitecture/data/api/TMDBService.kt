package com.example.mvvmcleanarchitecture.data.api

import com.example.mvvmcleanarchitecture.data.model.ArtistList
import com.example.mvvmcleanarchitecture.data.model.MovieList
import com.example.mvvmcleanarchitecture.data.model.TvShow
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