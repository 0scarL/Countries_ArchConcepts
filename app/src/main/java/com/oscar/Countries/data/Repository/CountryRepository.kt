package com.oscar.Countries.data.Repository

import com.oscar.Countries.data.datasource.country.CountryRetrofit
import com.oscar.Countries.domain.model.country.CountryMdl
import com.oscar.Countries.domain.model.country.toDomain
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

