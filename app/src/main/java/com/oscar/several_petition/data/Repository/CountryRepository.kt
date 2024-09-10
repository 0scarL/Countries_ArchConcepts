package com.oscar.several_petition.data.Repository

import com.oscar.several_petition.data.datasource.country.CountryRetrofit
import com.oscar.several_petition.domain.model.country.CountryMdl
import com.oscar.several_petition.domain.model.country.toDomain
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class CountryRepository {

    private val countryRetrofit = CountryRetrofit()

    suspend fun getRegionCountries(region: String) : Flow<List<CountryMdl>> =
        flow{
            val response = countryRetrofit.getRegionCountries(region)
            response.let{
                lista -> emit(lista.map { it.toDomain() })
            }

        }

}

