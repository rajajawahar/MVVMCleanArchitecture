package com.example.mvvmcleanarchitecture.presentation.movie

import androidx.lifecycle.ViewModel
import com.example.mvvmcleanarchitecture.domain.usecase.GetMoviesUseCase
import com.example.mvvmcleanarchitecture.domain.usecase.UpdateMoviesUseCase

class MovieViewModel(
  val getMoviesUseCase: GetMoviesUseCase,
  val updateMoviesUseCase: UpdateMoviesUseCase
) : ViewModel() {

}