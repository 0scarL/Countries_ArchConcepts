package com.oscar.Countries.domain.model.country

import com.oscar.Countries.data.model.country.LanguagesDto

data class LanguagesMdl(
    val nno: String,
    val nob: String,
    val smi: String
)

fun LanguagesDto.toDomain() = LanguagesMdl(nno = nno, nob = nob, smi = smi)