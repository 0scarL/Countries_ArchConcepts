package com.oscar.Countries.data.datasource.country

import com.oscar.Countries.data.datasource.client.retrofit.RetrofitConstantes
import com.oscar.Countries.data.datasource.client.retrofit.RetrofitHelper
import com.oscar.Countries.data.model.country.CountryDto
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class CountryRetrofit : CountryDataSource {

    private val retrofit = RetrofitHelper.getRetrofit(RetrofitConstantes.COUNTRY_URL)
    private val clazz: Class<CountryDataSource> = CountryDataSource::class.java

    override suspend fun getRegionCountries(region: String): List<CountryDto> {

        return withContext(Dispatchers.IO) {
            retrofit.create(clazz).getRegionCountries(region)
        }
    }
    }



