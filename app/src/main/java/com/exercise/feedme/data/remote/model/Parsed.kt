package com.exercise.feedme.data.remote.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Parsed(
    @Json(name = "food")
    val food: String = "",
    @Json(name = "foodId")
    val foodId: String = "",
    @Json(name = "foodMatch")
    val foodMatch: String = "",
    @Json(name = "measure")
    val measure: String = "",
    @Json(name = "nutrients")
    val nutrients: Nutrients = Nutrients(),
    @Json(name = "quantity")
    val quantity: Int = 0,
    @Json(name = "retainedWeight")
    val retainedWeight: Int = 0,
    @Json(name = "weight")
    val weight: Int = 0
)