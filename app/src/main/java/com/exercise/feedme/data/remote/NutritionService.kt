package com.exercise.feedme.data.remote

import com.exercise.feedme.data.remote.model.FoodAnalysisResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface NutritionService {

    @GET("nutrition-data")
    suspend fun requestFoodAnalysis(@Query("ingr") ingredient: String): FoodAnalysisResponse
}