package com.exercise.feedme.domain.nutrition

import com.exercise.feedme.data.remote.NutritionService
import com.exercise.feedme.data.remote.model.FoodAnalysisResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class NutritionRepository @Inject constructor(val nutritionService: NutritionService) {

    fun foodAnalysisFlow(food: String): Flow<FoodAnalysisResponse> {
        return nutritionService.requestFoodAnalysis(food)
    }
}