package com.example.mvvmcleanarchitecture.domain.usecase

import com.example.mvvmcleanarchitecture.domain.repository.TvShowsRepository

class GetTvShowsUseCase(private val tvShowsRepository: TvShowsRepository) {

  suspend fun execute() = tvShowsRepository.getTvShowsList()
}