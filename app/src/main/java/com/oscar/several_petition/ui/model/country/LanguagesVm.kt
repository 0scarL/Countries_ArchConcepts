package com.oscar.several_petition.ui.model.country

import com.oscar.several_petition.domain.model.country.LanguagesMdl

data class LanguagesVm(
    val nno: String,
    val nob: String,
    val smi: String
)

fun LanguagesMdl.toVm() = LanguagesVm(nno, nob, smi)