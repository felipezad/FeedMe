package com.exercise.feedme.data.remote.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ENERCKCAL(
    @Json(name = "label")
    val label: String = "",
    @Json(name = "quantity")
    val quantity: Double = 0.0,
    @Json(name = "unit")
    val unit: String = ""
)