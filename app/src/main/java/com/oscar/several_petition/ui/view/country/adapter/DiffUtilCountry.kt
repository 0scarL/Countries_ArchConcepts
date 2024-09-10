package com.oscar.several_petition.ui.view.country.adapter

import androidx.recyclerview.widget.DiffUtil
import com.oscar.several_petition.ui.model.country.CountryVm

class DiffUtilCountry(private val oldList: List<CountryVm>,
                      private val newList: List<CountryVm>) : DiffUtil.Callback() {



    override fun getOldListSize() = oldList.size

    override fun getNewListSize() = newList.size

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition] == newList[newItemPosition]
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return when{
            (oldList[oldItemPosition].name.common != newList[newItemPosition].name.common) -> false
            (oldList[oldItemPosition].capital != newList[newItemPosition].capital) -> false
            else -> true
        }
    }
}