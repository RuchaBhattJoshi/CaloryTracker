package com.ruchabhattjoshi.core.domain.preferences

import com.ruchabhattjoshi.core.domain.model.ActivityLevel
import com.ruchabhattjoshi.core.domain.model.Gender
import com.ruchabhattjoshi.core.domain.model.GoalType
import com.ruchabhattjoshi.core.domain.model.UserInfo


/**
 * Created by ruchajoshi on 05/05/2022
 */
interface Preferences {
    fun saveGender(gender: Gender)
    fun saveAge(age: Int)
    fun saveWeight(weight: Float)
    fun saveHeight(height: Int)
    fun saveActivityLevel(level: ActivityLevel)
    fun saveGoalType(goalType: GoalType)
    fun saveCarbRatio(carbRatio: Float)
    fun saveProteinRatio(proteinRatio: Float)
    fun saveFatRatio(fatRatio: Float)

    fun loadUserInfo(): UserInfo

    companion object {
        const val KEY_GENDER = "gender"
        const val KEY_AGE = "age"
        const val KEY_WEIGHT = "weight"
        const val KEY_HEIGHT = "height"
        const val KEY_ACTIVITY_LEVEL = "activity_level"
        const val KEY_GOAL_TYPE = "goal_type"
        const val KEY_CARB_RATIO = "carb_ratio"
        const val KEY_PROTEIN_RATIO = "protein_ratio"
        const val KEY_FAT_RATIO = "fat_ratio"
    }
}