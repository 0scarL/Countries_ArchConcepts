package com.oscar.Countries.ui.view.country.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView

import com.oscar.Countries.ui.model.country.CountryVm
import com.oscar.countries.databinding.ItemCountryBinding

class CountryAdapter(private var countries: List<CountryVm>) : RecyclerView.Adapter<CountryVH>() {

    lateinit var binding: ItemCountryBinding

    fun updateCoutriesList(newList: List<CountryVm>){
        val countryDiffUtil = DiffUtilCountry(oldList = countries, newList = newList)
        val diffResult = DiffUtil.calculateDiff(countryDiffUtil)
        countries = newList
        diffResult.dispatchUpdatesTo(this)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryVH {
        binding = ItemCountryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CountryVH(binding)
    }

    override fun onBindViewHolder(holder: CountryVH, position: Int) {
        holder.bind(countries[position])
    }

    override fun getItemCount() = countries.size

}

