package com.exercise.feedme.domain.nutrition

import com.exercise.feedme.data.remote.NutritionService
import com.exercise.feedme.data.remote.model.FoodAnalysisResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.*
import javax.inject.Inject

class NutritionRepository @Inject constructor(val nutritionService: NutritionService) {

    fun foodAnalysisFlow(food: String): Flow<FoodAnalysisResponse> {
        return flow {
            val requestFoodAnalysis = nutritionService.requestFoodAnalysis(food)
            emit(requestFoodAnalysis)
        }.flowOn(Dispatchers.IO)
    }

    fun foodAnalysisFlow(foods: List<String>): Flow<FoodAnalysisResponse> {
        return foods.asFlow()
            .map { food ->
                nutritionService.requestFoodAnalysis(food)
            }
            .flowOn(Dispatchers.IO)
    }

}