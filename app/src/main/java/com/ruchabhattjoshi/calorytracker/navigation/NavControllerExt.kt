package com.ruchabhattjoshi.calorytracker.navigation

import androidx.navigation.NavController
import com.ruchabhattjoshi.core.utils.UiEvent

/**
 * Created by ruchajoshi on 29/04/2022
 */

fun NavController.navigate(event: UiEvent.Navigate){
    this.navigate(event.route)
}