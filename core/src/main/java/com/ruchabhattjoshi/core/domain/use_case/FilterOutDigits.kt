package com.ruchabhattjoshi.core.domain.use_case

/**
 * Created by ruchajoshi on 11/07/2022
 */
class FilterOutDigits {
    operator fun invoke(text: String): String {
        return text.filter { it.isDigit() }
    }
}