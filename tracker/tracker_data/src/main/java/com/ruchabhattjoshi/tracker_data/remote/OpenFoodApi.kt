package com.ruchabhattjoshi.tracker_data.remote

import com.ruchabhattjoshi.tracker_data.remote.dto.SearchDto
import retrofit2.http.Query
import retrofit2.http.GET

/**
 * Created by ruchajoshi on 11/07/2022
 */
interface OpenFoodApi {

    @GET("cgi/search.pl?search_simple=1&json=1&action=process&fields=product_name,nutriments,image_front_thumb_url")
    suspend fun searchFood(
        @Query("search_terms") query: String,
        @Query("page") page: Int,
        @Query("page_size") pageSize: Int
    ): SearchDto

    companion object {
        const val BASE_URL = "https://uk.openfoodfacts.org/"
    }
}