package com.example.mvvmcleanarchitecture.domain.repository

import com.example.mvvmcleanarchitecture.data.model.Movie
import com.example.mvvmcleanarchitecture.data.model.TvShow

interface TvShowsRepository {

  suspend fun getTvShowsList(): List<TvShow>
  suspend fun updateTvShows(): List<TvShow>
}