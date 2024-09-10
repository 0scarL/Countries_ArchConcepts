package com.oscar.Countries.domain.model.country

import com.oscar.Countries.data.model.country.NameDto

data class NameMdl(
    val common: String,
    val official: String
)

fun NameDto.toDomain() = NameMdl(common, official)