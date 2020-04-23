package com.exercise.feedme.data.remote.model

data class FoodAnalysisResponse(
    val calories: Int = 0,
    val cautions: List<String> = listOf(),
    val dietLabels: List<String> = listOf(),
    val healthLabels: List<String> = listOf(),
    val ingredients: List<Ingredient> = listOf(),
    val totalDaily: TotalDaily = TotalDaily(),
    val totalNutrients: TotalNutrients = TotalNutrients(),
    val totalWeight: Int = 0,
    val uri: String = ""
)