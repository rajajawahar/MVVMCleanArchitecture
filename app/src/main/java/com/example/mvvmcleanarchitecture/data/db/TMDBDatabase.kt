package com.example.mvvmcleanarchitecture.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.mvvmcleanarchitecture.data.db.MovieDao
import com.example.mvvmcleanarchitecture.data.model.Artist
import com.example.mvvmcleanarchitecture.data.model.Movie
import com.example.mvvmcleanarchitecture.data.model.TvShow

@Database(
  entities = [Movie::class, Artist::class, TvShow::class],
  version = 1,
  exportSchema = false
)
abstract class TMDBDatabase : RoomDatabase() {

  abstract fun movieDao(): MovieDao
  abstract fun tvShowsDao(): MovieDao
  abstract fun artitsDao(): MovieDao
}
