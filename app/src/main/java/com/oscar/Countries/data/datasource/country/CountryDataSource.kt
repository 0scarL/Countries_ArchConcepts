package com.oscar.Countries.data.datasource.country

import com.oscar.Countries.data.datasource.client.retrofit.RetrofitConstantes
import com.oscar.Countries.data.model.country.CountryDto
import retrofit2.http.GET
import retrofit2.http.Path

interface CountryDataSource {

    @GET(RetrofitConstantes.REGION)
    suspend fun getRegionCountries(@Path("region") region: String) : List<CountryDto>

}