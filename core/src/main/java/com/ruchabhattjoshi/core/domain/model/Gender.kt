package com.ruchabhattjoshi.core.domain.model

/**
 * Created by ruchajoshi on 13/05/2022
 */
sealed class Gender(val name: String) {
    object Male : Gender("male")
    object Female : Gender("female")

    companion object {
        fun fromString(name: String): Gender {
            return when (name) {
                "male" -> Male
                "female" -> Female
                else -> Female
            }
        }
    }
}
