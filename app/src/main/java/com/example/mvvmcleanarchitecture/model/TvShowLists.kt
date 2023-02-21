package com.example.mvvmcleanarchitecture.model

import com.google.gson.annotations.SerializedName

data class TvShowLists(
  @SerializedName("page")
  val page: Int,
  @SerializedName("results")
  val tvShows: List<TvShow>,
  @SerializedName("total_pages")
  val totalPages: Int,
  @SerializedName("total_results")
  val totalResults: Int
)