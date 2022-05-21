package com.ruchabhattjoshi.core.utils

import com.ruchabhattjoshi.core.navigation.UiText

/**
 * Created by ruchajoshi on 29/04/2022
 */
sealed class UiEvent{
    object Success: UiEvent()
    object NavigateUp: UiEvent()
    data class ShowSnackbar(val message: UiText): UiEvent()
    data class Navigate(val route: String): UiEvent()
}
