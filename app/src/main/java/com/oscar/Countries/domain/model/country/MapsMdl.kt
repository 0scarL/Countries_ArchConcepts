package com.oscar.Countries.domain.model.country

import com.oscar.Countries.data.model.country.MapsDto

data class MapsMdl(
    val googleMaps: String,
    val openStreetMaps: String
)

fun MapsDto.toDomain() = MapsMdl( googleMaps, openStreetMaps)