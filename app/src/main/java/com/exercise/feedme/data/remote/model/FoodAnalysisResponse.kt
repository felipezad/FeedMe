package com.exercise.feedme.data.remote.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class FoodAnalysisResponse(
    @Json(name = "calories")
    val calories: Int = 0,
    @Json(name = "cautions")
    val cautions: List<Any> = listOf(),
    @Json(name = "dietLabels")
    val dietLabels: List<String> = listOf(),
    @Json(name = "healthLabels")
    val healthLabels: List<String> = listOf(),
    @Json(name = "ingredients")
    val ingredients: List<Ingredient> = listOf(),
    @Json(name = "totalDaily")
    val totalDaily: TotalDaily = TotalDaily(),
    @Json(name = "totalNutrients")
    val totalNutrients: TotalNutrients = TotalNutrients(),
    @Json(name = "totalWeight")
    val totalWeight: Int = 0,
    @Json(name = "uri")
    val uri: String = ""
)