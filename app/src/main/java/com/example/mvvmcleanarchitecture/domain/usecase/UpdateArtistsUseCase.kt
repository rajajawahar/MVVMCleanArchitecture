package com.example.mvvmcleanarchitecture.domain.usecase

import com.example.mvvmcleanarchitecture.domain.repository.ArtistsRepository
import com.example.mvvmcleanarchitecture.data.model.Artist

class UpdateArtistsUseCase(private val artistsRepository: ArtistsRepository) {

  suspend fun execute(): List<Artist> = artistsRepository.updateArtists()
}