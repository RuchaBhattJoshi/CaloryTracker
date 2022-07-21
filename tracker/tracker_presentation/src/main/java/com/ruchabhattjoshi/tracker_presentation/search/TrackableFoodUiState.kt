package com.ruchabhattjoshi.tracker_presentation.search

import com.ruchabhattjoshi.tracker_domain.model.TrackableFood

/**
 * Created by ruchajoshi on 20/07/2022
 */

data class TrackableFoodUiState(
    val food: TrackableFood,
    val isExpanded: Boolean = false,
    val amount: String = ""
)