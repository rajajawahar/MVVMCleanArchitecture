package com.example.mvvmcleanarchitecture.domain.repository

import com.example.mvvmcleanarchitecture.data.model.Artist
import com.example.mvvmcleanarchitecture.data.model.Movie

interface ArtistsRepository {

  suspend fun getArtistsList(): List<Artist>
  suspend fun updateArtists(): List<Artist>
}