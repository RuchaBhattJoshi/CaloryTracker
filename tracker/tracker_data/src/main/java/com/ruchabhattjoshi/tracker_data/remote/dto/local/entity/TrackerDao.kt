package com.ruchabhattjoshi.tracker_data.remote.dto.local.entity

import androidx.room.*
import com.ruchabhattjoshi.tracker_data.remote.dto.local.entity.TrackedFoodEntity
import kotlinx.coroutines.flow.Flow

/**
 * Created by ruchajoshi on 14/07/2022
 */

@Dao
interface TrackerDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTrackedFood(trackedFoodEntity: TrackedFoodEntity)

    @Delete
    suspend fun deleteTrackedFood(trackedFoodEntity: TrackedFoodEntity)

    @Query(
        """
            SELECT *
            FROM trackedfoodentity
            WHERE dayOfMonth = :day AND month = :month AND year = :year
        """
    )
    fun getFoodsForDate(day: Int, month: Int, year: Int): Flow<List<TrackedFoodEntity>>
}