package com.example.mvvmcleanarchitecture.domain.usecase

import com.example.mvvmcleanarchitecture.domain.repository.TvShowsRepository
import com.example.mvvmcleanarchitecture.data.model.TvShow

class UpdateTvShowsUseCase(private val tvShowsRepository: TvShowsRepository) {

  suspend fun execute(): List<TvShow> = tvShowsRepository.updateTvShows()
}