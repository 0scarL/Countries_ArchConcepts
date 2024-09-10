package com.oscar.several_petition.ui.model.country

import com.oscar.several_petition.domain.model.country.NameMdl

data class NameVm(
    val common: String,
    val official: String
)

fun NameMdl.toVm() = NameVm(common, official)