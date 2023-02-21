package com.example.mvvmcleanarchitecture


import com.google.gson.annotations.SerializedName

data class TvShow(
    @SerializedName("page")
    val page: Int,
    @SerializedName("results")
    val tvShowLists: List<TvShowList>,
    @SerializedName("total_pages")
    val totalPages: Int,
    @SerializedName("total_results")
    val totalResults: Int
)