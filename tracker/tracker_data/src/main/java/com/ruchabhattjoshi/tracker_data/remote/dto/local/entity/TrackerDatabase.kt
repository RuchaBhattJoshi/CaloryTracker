package com.ruchabhattjoshi.tracker_data.remote.dto.local.entity

import androidx.room.Database
import androidx.room.RoomDatabase

/**
 * Created by ruchajoshi on 14/07/2022
 */

@Database(
    entities = [TrackedFoodEntity::class],
    version = 1
)
abstract class TrackerDatabase: RoomDatabase() {

    abstract val dao: TrackerDao
}