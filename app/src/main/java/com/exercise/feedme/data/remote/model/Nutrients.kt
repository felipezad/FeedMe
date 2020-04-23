package com.exercise.feedme.data.remote.model

data class Nutrients(
    val CHOCDF: CHOCDF = CHOCDF(),
    val ENERC_KCAL: ENERCKCAL = ENERCKCAL(),
    val FAT: FAT = FAT(),
    val PROCNT: PROCNT = PROCNT(),
    val SUGAR: SUGAR = SUGAR()
)