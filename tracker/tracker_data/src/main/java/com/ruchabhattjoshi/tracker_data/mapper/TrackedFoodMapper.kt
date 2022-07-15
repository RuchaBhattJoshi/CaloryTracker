package com.ruchabhattjoshi.tracker_data.mapper

import com.ruchabhattjoshi.tracker_data.remote.dto.local.entity.TrackedFoodEntity
import com.ruchabhattjoshi.tracker_domain.repository.model.MealType
import com.ruchabhattjoshi.tracker_domain.repository.model.TrackedFood
import java.time.LocalDate

/**
 * Created by ruchajoshi on 15/07/2022
 */
fun TrackedFoodEntity.toTrackedFood(): TrackedFood {
    return TrackedFood(
        name = name,
        carbs = carbs,
        protein = protein,
        fat = fat,
        imageUrl = imageUrl,
        mealType = MealType.fromString(type),
        amount = amount,
        date = LocalDate.of(year, month, dayOfMonth),
        calories = calories,
        id = id
    )
}

fun TrackedFood.toTrackedFoodEntity(): TrackedFoodEntity {
    return TrackedFoodEntity(
        name = name,
        carbs = carbs,
        protein = protein,
        fat = fat,
        imageUrl = imageUrl,
        type = mealType.name,
        amount = amount,
        dayOfMonth = date.dayOfMonth,
        month = date.monthValue,
        year = date.year,
        calories = calories,
        id = id
    )
}