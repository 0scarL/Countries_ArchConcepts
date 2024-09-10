package com.oscar.several_petition.ui.view.country

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.oscar.several_petition.databinding.FragmentCountryBinding
import com.oscar.several_petition.ui.model.country.CountryVm
import com.oscar.several_petition.ui.model.country.toVm
import com.oscar.several_petition.ui.view.country.adapter.CountryAdapter
import com.oscar.several_petition.ui.viewmodel.country.CountryViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CountryFragment : Fragment() {

    companion object {
        private val countryFragment = CountryFragment()

        fun getCountryFragment() = countryFragment
    }
    private lateinit var binding: FragmentCountryBinding
    private val countryViewModel : CountryViewModel by viewModels()
    private val countryAdapter = CountryAdapter(emptyList())


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCountryBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setAdapter()
        getCountry()
        setCountryObserver()

    }

    private fun setAdapter() {
        binding.recyclerCountry.adapter = countryAdapter
    }

    private fun getCountry() {
        countryViewModel.getCountry("europe")

    }

    private fun setCountryObserver() {
        countryViewModel.country.observe(viewLifecycleOwner, Observer {countries ->
            countries?.let{ listaCountries ->
                updateAdapter(listaCountries.map{it.toVm()})
            }
        })
    }

    private fun updateAdapter(countries: List<CountryVm>) {
        val newlist = countries
        this.countryAdapter.updateCoutriesList(newlist)
    }
}