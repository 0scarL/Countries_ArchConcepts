package com.oscar.several_petition.data.datasource.country

import android.util.Log
import com.oscar.several_petition.data.datasource.client.retrofit.RetrofitConstantes
import com.oscar.several_petition.data.datasource.client.retrofit.RetrofitHelper
import com.oscar.several_petition.data.model.country.CountryDto
import com.oscar.several_petition.data.model.country.RespuestaDto
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.withContext
import retrofit2.Response

class CountryRetrofit : CountryDataSource {

    private val retrofit = RetrofitHelper.getRetrofit(RetrofitConstantes.COUNTRY_URL)
    private val clazz: Class<CountryDataSource> = CountryDataSource::class.java

    override suspend fun getRegionCountries(region: String): List<CountryDto> {

        return withContext(Dispatchers.IO) {
            retrofit.create(clazz).getRegionCountries(region)
        }
    }
    }



