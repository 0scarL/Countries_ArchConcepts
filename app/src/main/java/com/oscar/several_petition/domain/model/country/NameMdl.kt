package com.oscar.several_petition.domain.model.country

import com.oscar.several_petition.data.model.country.NameDto

data class NameMdl(
    val common: String,
    val official: String
)

fun NameDto.toDomain() = NameMdl(common, official)