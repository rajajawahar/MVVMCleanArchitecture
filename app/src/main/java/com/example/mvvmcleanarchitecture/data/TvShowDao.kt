package com.example.mvvmcleanarchitecture.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.mvvmcleanarchitecture.model.Movie
import com.example.mvvmcleanarchitecture.model.TvShow

@Dao
interface TvShowDao {

  @Insert(onConflict = OnConflictStrategy.REPLACE)
  suspend fun saveTvShows(movies: List<TvShow>)

  @Query("DELETE FROM popular_tvshows")
  suspend fun deleteAllTvShows()

  @Query("SELECT * FROM popular_tvshows")
  suspend fun getAllTvShows(): List<TvShow>
}