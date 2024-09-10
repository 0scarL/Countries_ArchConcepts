package com.oscar.Countries.ui.model.country

import com.oscar.Countries.domain.model.country.FlagsMdl

data class FlagsVm(
    val alt: String?,
    val png: String?,
    val svg: String?
)

fun FlagsMdl.toVm() = FlagsVm(alt, png, svg)