package com.ruchabhattjoshi.onboarding_presentation.welcome.nutrient_goal

/**
 * Created by ruchajoshi on 11/07/2022
 */
sealed class NutrientGoalEvent {
    data class OnCarbRatioEnter(val ratio: String): NutrientGoalEvent()
    data class OnProteinRatioEnter(val ratio: String): NutrientGoalEvent()
    data class OnFatRatioEnter(val ratio: String): NutrientGoalEvent()
    object OnNextClick : NutrientGoalEvent()
}