package com.exercise.feedme.data.remote.model

data class TotalNutrients(
    val CHOCDF: CHOCDF = CHOCDF(),
    val ENERC_KCAL: ENERCKCAL = ENERCKCAL(),
    val FAMS: FAMS = FAMS(),
    val FAPU: FAPU = FAPU(),
    val FASAT: FASAT = FASAT(),
    val FAT: FAT = FAT(),
    val FIBTG: FIBTG = FIBTG(),
    val SUGAR: SUGAR = SUGAR()
)