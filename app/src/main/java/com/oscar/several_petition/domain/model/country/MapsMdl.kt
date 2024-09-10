package com.oscar.several_petition.domain.model.country

import com.oscar.several_petition.data.model.country.MapsDto

data class MapsMdl(
    val googleMaps: String,
    val openStreetMaps: String
)

fun MapsDto.toDomain() = MapsMdl( googleMaps, openStreetMaps)