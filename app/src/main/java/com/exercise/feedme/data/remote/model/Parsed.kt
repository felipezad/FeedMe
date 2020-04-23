package com.exercise.feedme.data.remote.model

data class Parsed(
    val food: String = "",
    val foodId: String = "",
    val foodMatch: String = "",
    val measure: String = "",
    val nutrients: Nutrients = Nutrients(),
    val quantity: Int = 0,
    val retainedWeight: Int = 0,
    val weight: Int = 0
)