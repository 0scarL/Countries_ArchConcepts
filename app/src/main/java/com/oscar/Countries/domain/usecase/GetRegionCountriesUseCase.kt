package com.oscar.Countries.domain.usecase

import com.oscar.Countries.data.Repository.CountryRepository
import com.oscar.Countries.domain.model.country.CountryMdl
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