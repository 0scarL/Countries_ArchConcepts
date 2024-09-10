package com.oscar.several_petition.ui.viewmodel.country

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.oscar.several_petition.domain.model.country.CountryMdl
import com.oscar.several_petition.domain.usecase.GetRegionCountriesUseCase
import kotlinx.coroutines.launch


class CountryViewModel: ViewModel() {

    private val getRegionCountriesUseCase = GetRegionCountriesUseCase()
    private val _country = MutableLiveData<List<CountryMdl>>()
    val country : LiveData<List<CountryMdl>> = _country

    fun getCountry(region : String){
        viewModelScope.launch{
            getRegionCountriesUseCase?.invoke(region)?.collect({ paises ->
                _country.postValue(paises)
                Log.d("paises", paises.toString())
            })
        }
    }
}