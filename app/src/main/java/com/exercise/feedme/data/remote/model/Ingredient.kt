package com.exercise.feedme.data.remote.model

data class Ingredient(
    val parsed: List<Parsed> = listOf(),
    val text: String = ""
)