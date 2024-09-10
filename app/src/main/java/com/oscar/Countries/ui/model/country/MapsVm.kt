package com.oscar.Countries.ui.model.country

import com.oscar.Countries.domain.model.country.MapsMdl

data class MapsVm(
    val googleMaps: String,
    val openStreetMaps: String
)

fun MapsMdl.toVm() = MapsVm(googleMaps, openStreetMaps)