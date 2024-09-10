package com.oscar.several_petition.ui.model.country

import com.oscar.several_petition.domain.model.country.MapsMdl

data class MapsVm(
    val googleMaps: String,
    val openStreetMaps: String
)

fun MapsMdl.toVm() = MapsVm(googleMaps, openStreetMaps)