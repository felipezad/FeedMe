package com.exercise.feedme.data.remote

import com.exercise.feedme.data.remote.model.FoodAnalysisResponse
import kotlinx.coroutines.flow.Flow
import retrofit2.http.GET

interface NutritionService {

    @GET("nutrition-data")
    fun requestFoodAnalysis(food: String): Flow<FoodAnalysisResponse>
}