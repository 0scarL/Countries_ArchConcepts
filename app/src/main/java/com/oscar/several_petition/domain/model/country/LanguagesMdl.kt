package com.oscar.several_petition.domain.model.country

import com.oscar.several_petition.data.model.country.LanguagesDto

data class LanguagesMdl(
    val nno: String,
    val nob: String,
    val smi: String
)

fun LanguagesDto.toDomain() = LanguagesMdl(nno = nno, nob = nob, smi = smi)