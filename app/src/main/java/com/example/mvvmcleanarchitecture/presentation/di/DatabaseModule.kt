package com.example.mvvmcleanarchitecture.presentation.di

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.mvvmcleanarchitecture.data.db.ArtistDao
import com.example.mvvmcleanarchitecture.data.db.MovieDao
import com.example.mvvmcleanarchitecture.data.db.TMDBDatabase
import com.example.mvvmcleanarchitecture.data.db.TvShowDao
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModule {

  @Singleton
  @Provides
  fun provideDatabase(context: Context): RoomDatabase {
    return Room.databaseBuilder(context, TMDBDatabase::class.java, "tmdbclient").build()
  }

  @Singleton
  @Provides
  fun provideMovieDao(database: TMDBDatabase): MovieDao {
    return database.movieDao()
  }

  @Singleton
  @Provides
  fun provideArtistDao(database: TMDBDatabase): ArtistDao {
    return database.artitsDao()
  }

  @Singleton
  @Provides
  fun provideTvShowsDao(database: TMDBDatabase): TvShowDao {
    return database.tvShowsDao()
  }
}