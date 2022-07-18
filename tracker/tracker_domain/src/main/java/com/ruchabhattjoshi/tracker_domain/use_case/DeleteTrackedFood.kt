package com.ruchabhattjoshi.tracker_domain.use_case

import com.ruchabhattjoshi.tracker_domain.repository.TrackerRepository
import com.ruchabhattjoshi.tracker_domain.model.TrackedFood

/**
 * Created by ruchajoshi on 18/07/2022
 */

class DeleteTrackedFood(
    private val repository: TrackerRepository
) {

    suspend operator fun invoke(trackedFood: TrackedFood) {
        repository.deleteTrackedFood(trackedFood)
    }
}