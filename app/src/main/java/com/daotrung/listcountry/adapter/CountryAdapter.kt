package com.daotrung.listcountry.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.daotrung.listcountry.model.Country
import com.daotrung.listcountry.databinding.CardTitleCountryBinding

class CountryAdapter : ListAdapter<Country, CountryAdapter.MyViewCountryHolder>(diffCallback) {

    companion object {
        val diffCallback = object : DiffUtil.ItemCallback<Country>() {
            override fun areItemsTheSame(oldItem: Country, newItem: Country): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(
                oldItem: Country,
                newItem: Country
            ): Boolean {
                return oldItem == newItem
            }
        }
    }

    class MyViewCountryHolder(private val binding: CardTitleCountryBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(country: Country) {
            binding.txtId.text = country.id.toString()
            binding.txtName.text = country.name
            binding.txtPopulation.text = country.population
            binding.txtLand.text = country.landArea
            binding.txtDensity.text = country.density.toString()

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewCountryHolder {
        val binding =
            CardTitleCountryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewCountryHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewCountryHolder, position: Int) {
        holder.bind(getItem(position))
    }
}