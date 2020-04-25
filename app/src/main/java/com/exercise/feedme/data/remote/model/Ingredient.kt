package com.exercise.feedme.data.remote.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Ingredient(
    @Json(name = "parsed")
    val parsed: List<Parsed> = listOf(),
    @Json(name = "text")
    val text: String = ""
)