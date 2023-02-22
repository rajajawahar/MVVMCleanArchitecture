package com.example.mvvmcleanarchitecture.domain.usecase

import com.example.mvvmcleanarchitecture.domain.repository.ArtistsRepository

class GetArtistsUseCase(private val artistsRepository: ArtistsRepository) {

  suspend fun execute() = artistsRepository.getArtistsList()
}