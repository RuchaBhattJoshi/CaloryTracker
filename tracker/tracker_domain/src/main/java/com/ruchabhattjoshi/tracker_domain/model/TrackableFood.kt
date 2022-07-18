package com.ruchabhattjoshi.tracker_domain.model

/**
 * Created by ruchajoshi on 15/07/2022
 */

data class TrackableFood(
    val name: String,
    val imageUrl: String?,
    val caloriesPer100g: Int,
    val carbsPer100g: Int,
    val proteinPer100g: Int,
    val fatPer100g: Int
)