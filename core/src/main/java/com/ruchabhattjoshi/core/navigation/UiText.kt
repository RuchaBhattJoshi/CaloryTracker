package com.ruchabhattjoshi.core.navigation

import android.content.Context

/**
 * Created by ruchajoshi on 29/04/2022
 */
sealed class UiText{
    data class DynamicString(val text: String): UiText()
    data class StringResource(val resId: Int): UiText()

    fun asString(context: Context): String {
        return when(this) {
            is DynamicString -> text
            is StringResource -> context.getString(resId)
        }
    }
}
