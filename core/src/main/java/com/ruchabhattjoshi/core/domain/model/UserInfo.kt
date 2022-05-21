package com.ruchabhattjoshi.core.domain.model


/**
 * Created by ruchajoshi on 21/05/2022
 */
data class UserInfo(
    val gender: Gender,
    val age: Int,
    val weight: Float,
    val height: Int,
    val activityLevel: ActivityLevel,
    val goalType: GoalType,
    val carbRatio: Float,
    val proteinRatio: Float,
    val fatRatio: Float
)