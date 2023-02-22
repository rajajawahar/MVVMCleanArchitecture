package com.example.mvvmcleanarchitecture.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.mvvmcleanarchitecture.data.model.Artist

@Dao
interface ArtistDao {

  @Insert(onConflict = OnConflictStrategy.REPLACE)
  suspend fun saveArtists(movies: List<Artist>)

  @Query("DELETE FROM popular_artists")
  suspend fun deleteAllArtists()

  @Query("SELECT * FROM popular_artists")
  suspend fun getAllArtists(): List<Artist>
}