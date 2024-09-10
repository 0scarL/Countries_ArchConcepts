package com.oscar.Countries.data.model.country

data class CountryDto(
    val area: Float,
    val borders: List<String>?,
    val capital: List<String>,
    val fifa: String?,
    val flag: String,
    val flags: FlagsDto,
    val independent: Boolean,
    val maps: MapsDto,
    val name: NameDto,
    val population: Int,
    val region: String,
    val subregion: String,
    val timezones: List<String>
)