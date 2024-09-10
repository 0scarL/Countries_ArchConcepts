package com.oscar.Countries.domain.model.country

import com.oscar.Countries.data.model.country.FlagsDto

data class FlagsMdl(
    val alt: String?,
    val png: String?,
    val svg: String?
)

fun FlagsDto.toDomain() = FlagsMdl(alt, png, svg)