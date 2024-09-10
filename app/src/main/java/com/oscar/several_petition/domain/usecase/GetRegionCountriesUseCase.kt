package com.oscar.several_petition.domain.usecase

import com.oscar.several_petition.data.Repository.CountryRepository
import com.oscar.several_petition.domain.model.country.CountryMdl
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class GetRegionCountriesUseCase () {

    private val repository= CountryRepository()

    operator suspend fun invoke(region : String): Flow<List<CountryMdl>> = flow {
        repository.getRegionCountries(region)?.collect{
            countriesMdl ->  emit(countriesMdl)
        }
    }
}