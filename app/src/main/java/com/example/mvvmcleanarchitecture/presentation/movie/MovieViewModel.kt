package com.example.mvvmcleanarchitecture.presentation.movie

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.mvvmcleanarchitecture.domain.usecase.GetMoviesUseCase
import com.example.mvvmcleanarchitecture.domain.usecase.UpdateMoviesUseCase

class MovieViewModel(
  val getMoviesUseCase: GetMoviesUseCase,
  val updateMoviesUseCase: UpdateMoviesUseCase
) : ViewModel() {

  fun getMovies() = liveData {
    val movieList = getMoviesUseCase.execute()
    emit(movieList)
  }

  fun updateMovies() = liveData {
    val movieList = updateMoviesUseCase.execute()
    emit(movieList)
  }

}