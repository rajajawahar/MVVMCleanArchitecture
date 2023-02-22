package com.example.mvvmcleanarchitecture.domain.usecase

import com.example.mvvmcleanarchitecture.domain.repository.MoviesRepository

class GetMoviesUseCase(private val moviesRepository: MoviesRepository) {

  suspend fun execute() = moviesRepository.updateMovies()
}