package com.oscar.Countries.domain.model.country

import com.oscar.Countries.data.model.country.CountryDto

data class CountryMdl(
    val area: Float,
    val borders: List<String>?,
    val capital: List<String>,
    val fifa: String?,
    val flag: String,
    val flags: FlagsMdl,
    val independent: Boolean,
    val maps: MapsMdl,
    val name: NameMdl,
    val population: Int,
    val region: String,
    val subregion: String,
    val timezones: List<String>
)

fun CountryDto.toDomain() = CountryMdl(area, borders, capital, fifa, flag, flags.toDomain(), independent, maps.toDomain(), name.toDomain(), population, region, subregion, timezones)