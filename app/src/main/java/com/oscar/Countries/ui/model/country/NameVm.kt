package com.oscar.Countries.ui.model.country

import com.oscar.Countries.domain.model.country.NameMdl

data class NameVm(
    val common: String,
    val official: String
)

fun NameMdl.toVm() = NameVm(common, official)