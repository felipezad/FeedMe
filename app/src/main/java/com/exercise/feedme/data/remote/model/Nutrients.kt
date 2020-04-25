package com.exercise.feedme.data.remote.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Nutrients(
    @Json(name = "CHOCDF")
    val cHOCDF: CHOCDF = CHOCDF(),
    @Json(name = "ENERC_KCAL")
    val eNERCKCAL: ENERCKCAL = ENERCKCAL(),
    @Json(name = "FAT")
    val fAT: FAT = FAT(),
    @Json(name = "PROCNT")
    val pROCNT: PROCNT = PROCNT(),
    @Json(name = "SUGAR")
    val sUGAR: SUGAR = SUGAR()
)