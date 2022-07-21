package com.ruchabhattjoshi.tracker_presentation.search

/**
 * Created by ruchajoshi on 19/07/2022
 */

data class SearchState(
    val query: String = "",
    val isHintVisible: Boolean = false,
    val isSearching: Boolean = false,
    val trackableFood: List<TrackableFoodUiState> = emptyList()
)