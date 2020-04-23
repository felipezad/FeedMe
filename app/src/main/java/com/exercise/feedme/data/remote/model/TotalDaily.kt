package com.exercise.feedme.data.remote.model

data class TotalDaily(
    val CHOCDF: CHOCDF = CHOCDF(),
    val ENERC_KCAL: ENERCKCAL = ENERCKCAL(),
    val FASAT: FASAT = FASAT(),
    val FAT: FAT = FAT(),
    val FIBTG: FIBTG = FIBTG()
)