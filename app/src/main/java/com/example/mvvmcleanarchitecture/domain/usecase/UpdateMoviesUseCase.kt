package com.example.mvvmcleanarchitecture.domain.usecase

import com.example.mvvmcleanarchitecture.domain.repository.MoviesRepository
import com.example.mvvmcleanarchitecture.data.model.Movie

class UpdateMoviesUseCase(private val moviesRepository: MoviesRepository) {

  suspend fun execute(): List<Movie> = moviesRepository.updateMovies()
}