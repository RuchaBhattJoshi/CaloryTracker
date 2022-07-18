package com.ruchabhattjoshi.tracker_domain.use_case

import com.ruchabhattjoshi.tracker_domain.repository.TrackerRepository
import com.ruchabhattjoshi.tracker_domain.model.TrackableFood

/**
 * Created by ruchajoshi on 18/07/2022
 */

class SearchFood(
    private val repository: TrackerRepository
) {
    suspend operator fun invoke(
        query: String,
        page: Int = 1,
        pageSize: Int = 40
    ): Result<List<TrackableFood>> {
        if(query.isBlank()) {
            return Result.success(emptyList())
        }
        return repository.searchFood(query.trim(), page, pageSize)
    }
}