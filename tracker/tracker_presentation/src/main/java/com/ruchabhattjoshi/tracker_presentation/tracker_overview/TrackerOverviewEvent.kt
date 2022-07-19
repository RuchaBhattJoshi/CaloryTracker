package com.ruchabhattjoshi.tracker_presentation.tracker_overview

import com.ruchabhattjoshi.tracker_domain.model.TrackedFood

/**
 * Created by ruchajoshi on 18/07/2022
 */

sealed class TrackerOverviewEvent {
    object OnNextDayClick : TrackerOverviewEvent()
    object OnPreviousDayClick : TrackerOverviewEvent()
    data class OnToggleMealClick(val meal: Meal) : TrackerOverviewEvent()
    data class OnDeleteTrackedFoodClick(val trackedFood: TrackedFood) : TrackerOverviewEvent()
    data class OnAddFoodClick(val meal: Meal) : TrackerOverviewEvent()
}