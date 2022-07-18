package com.ruchabhattjoshi.tracker_domain.use_case

import com.ruchabhattjoshi.tracker_domain.repository.TrackerRepository
import com.ruchabhattjoshi.tracker_domain.model.TrackedFood
import kotlinx.coroutines.flow.Flow
import java.time.LocalDate

/**
 * Created by ruchajoshi on 18/07/2022
 */
class GetFoodsForDate(
    private val repository: TrackerRepository
) {

    operator fun invoke(date: LocalDate): Flow<List<TrackedFood>> {
        return repository.getFoodsForDate(date)
    }
}