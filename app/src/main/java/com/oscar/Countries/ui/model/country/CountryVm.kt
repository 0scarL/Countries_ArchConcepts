package com.oscar.Countries.ui.model.country

import com.oscar.Countries.domain.model.country.CountryMdl

data class CountryVm(
    val area: Float,
    val borders: List<String>?,
    val capital: List<String>,
    val fifa: String?,
    val flag: String,
    val flags: FlagsVm,
    val independent: Boolean,
    val maps: MapsVm,
    val name: NameVm,
    val population: Int,
    val region: String,
    val subregion: String,
    val timezones: List<String>
)

fun CountryMdl.toVm() = CountryVm(area, borders, capital, fifa, flag, flags.toVm(), independent, maps.toVm(), name.toVm(), population, region, subregion, timezones)