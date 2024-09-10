package com.oscar.Countries.ui.model.country

import com.oscar.Countries.domain.model.country.LanguagesMdl

data class LanguagesVm(
    val nno: String,
    val nob: String,
    val smi: String
)

fun LanguagesMdl.toVm() = LanguagesVm(nno, nob, smi)