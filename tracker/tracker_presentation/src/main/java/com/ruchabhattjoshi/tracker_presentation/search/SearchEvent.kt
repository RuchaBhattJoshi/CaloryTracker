package com.ruchabhattjoshi.tracker_presentation.search

import com.ruchabhattjoshi.tracker_domain.model.MealType
import com.ruchabhattjoshi.tracker_domain.model.TrackableFood
import java.time.LocalDate

/**
 * Created by ruchajoshi on 19/07/2022
 */

sealed class SearchEvent {
    data class OnQueryChange(val query: String) : SearchEvent()
    object OnSearch : SearchEvent()
    data class OnToggleTrackableFood(val food: TrackableFood) : SearchEvent()
    data class OnAmountForFoodChange(
        val food: TrackableFood,
        val amount: String
    ) : SearchEvent()
    data class OnTrackFoodClick(
        val food: TrackableFood,
        val mealType: MealType,
        val date: LocalDate
    ): SearchEvent()
    data class OnSearchFocusChange(val isFocused: Boolean): SearchEvent()
}