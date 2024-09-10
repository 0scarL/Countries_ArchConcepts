package com.oscar.several_petition.ui.model.country

import com.oscar.several_petition.domain.model.country.FlagsMdl

data class FlagsVm(
    val alt: String?,
    val png: String?,
    val svg: String?
)

fun FlagsMdl.toVm() = FlagsVm(alt, png, svg)