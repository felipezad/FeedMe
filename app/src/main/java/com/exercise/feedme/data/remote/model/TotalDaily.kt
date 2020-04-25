package com.exercise.feedme.data.remote.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TotalDaily(
    @Json(name = "CHOCDF")
    val cHOCDF: CHOCDF = CHOCDF(),
    @Json(name = "ENERC_KCAL")
    val eNERCKCAL: ENERCKCAL = ENERCKCAL(),
    @Json(name = "FASAT")
    val fASAT: FASAT = FASAT(),
    @Json(name = "FAT")
    val fAT: FAT = FAT(),
    @Json(name = "FIBTG")
    val fIBTG: FIBTG = FIBTG()
)