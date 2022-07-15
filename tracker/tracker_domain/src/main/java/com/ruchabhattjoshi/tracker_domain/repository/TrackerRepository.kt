package com.ruchabhattjoshi.tracker_domain.repository

import com.ruchabhattjoshi.tracker_domain.repository.model.TrackableFood
import com.ruchabhattjoshi.tracker_domain.repository.model.TrackedFood
import kotlinx.coroutines.flow.Flow
import java.time.LocalDate

/**
 * Created by ruchajoshi on 15/07/2022
 */
interface TrackerRepository {

    suspend fun searchFood(
        query: String,
        page: Int,
        pageSize: Int
    ): Result<List<TrackableFood>>

    suspend fun insertTrackedFood(food: TrackedFood)

    suspend fun deleteTrackedFood(food: TrackedFood)

    fun getFoodsForDate(localDate: LocalDate): Flow<List<TrackedFood>>
}