package com.oscar.several_petition.domain.model.country

import com.oscar.several_petition.data.model.country.FlagsDto

data class FlagsMdl(
    val alt: String?,
    val png: String?,
    val svg: String?
)

fun FlagsDto.toDomain() = FlagsMdl(alt, png, svg)