package com.ruchabhattjoshi.tracker_domain.use_case

/**
 * Created by ruchajoshi on 18/07/2022
 */
data class TrackerUseCases(
    val trackFood: TrackFood,
    val searchFood: SearchFood,
    val getFoodsForDate: GetFoodsForDate,
    val deleteTrackedFood: DeleteTrackedFood,
    val calculateMealNutrients: CalculateMealNutrients
)