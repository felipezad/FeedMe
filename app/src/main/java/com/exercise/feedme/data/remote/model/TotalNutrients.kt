package com.exercise.feedme.data.remote.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TotalNutrients(
    @Json(name = "CHOCDF")
    val cHOCDF: CHOCDF = CHOCDF(),
    @Json(name = "ENERC_KCAL")
    val eNERCKCAL: ENERCKCAL = ENERCKCAL(),
    @Json(name = "FAMS")
    val fAMS: FAMS = FAMS(),
    @Json(name = "FAPU")
    val fAPU: FAPU = FAPU(),
    @Json(name = "FASAT")
    val fASAT: FASAT = FASAT(),
    @Json(name = "FAT")
    val fAT: FAT = FAT(),
    @Json(name = "FIBTG")
    val fIBTG: FIBTG = FIBTG(),
    @Json(name = "SUGAR")
    val sUGAR: SUGAR = SUGAR()
)