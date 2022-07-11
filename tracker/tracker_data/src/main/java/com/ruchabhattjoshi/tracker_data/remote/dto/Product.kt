package com.ruchabhattjoshi.tracker_data.remote.dto

import com.squareup.moshi.Json

/**
 * Created by ruchajoshi on 11/07/2022
 */
data class Product(
    @field:Json(name = "image_front_thumb_url")
    val imageFrontThumbUrl: String?,
    val nutriments: Nutriments,
    @field:Json(name = "product_name")
    val productName: String?
)
