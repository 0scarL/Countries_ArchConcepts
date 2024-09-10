package com.oscar.Countries.ui.view.country.adapter

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

import com.oscar.Countries.ui.model.country.CountryVm
import com.oscar.Countries.utils.formatNumber
import com.oscar.countries.databinding.ItemCountryBinding

class CountryVH (private val binding : ItemCountryBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(countryVm: CountryVm) {
        binding.countryNameTextView.text = countryVm.name.official
        binding.countryPopulationTextView.text = "Population: ${formatNumber( countryVm.population).toString()}"
        binding.countryRegionTextView.text = "Region: ${countryVm.region}"
        binding.countryCapitalTextView.text = "Capital: ${countryVm.capital.first()}"
        cargarBandera(countryVm)
        // TODO: pendiente implementar la visualizacion del mapa con webview o abrir maps.

    }

    private fun cargarBandera(countryVm: CountryVm) {
        val countryFlagIv = binding.countryFlagImageView
        Glide.with(countryFlagIv.context).load(countryVm.flags.png)
            .into(countryFlagIv)

    }
}