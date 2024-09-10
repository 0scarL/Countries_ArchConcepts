package com.oscar.several_petition.data.datasource.country

import com.oscar.several_petition.data.datasource.client.retrofit.RetrofitConstantes
import com.oscar.several_petition.data.model.country.CountryDto
import com.oscar.several_petition.data.model.country.RespuestaDto
import kotlinx.coroutines.flow.Flow
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface CountryDataSource {

    @GET(RetrofitConstantes.REGION)
    suspend fun getRegionCountries(@Path("region") region: String) : List<CountryDto>

}