package com.daotrung.listcountry.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.daotrung.listcountry.model.Country
import com.daotrung.listcountry.databinding.CardTitleCountryBinding

class ListCountryAdapter : ListAdapter<Country, ListCountryAdapter.ListCountryVH>(diffCallback) {

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

    class ListCountryVH(
        private val binding: CardTitleCountryBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        private lateinit var country: Country
        fun bind(country: Country) {
            this.country = country
            binding.txtId.text = country.id.toString()
            binding.txtName.text = country.nameCountry
            binding.txtPopulation.text = country.populationCountry
            binding.txtDensity.text = country.densityCountry
            binding.txtLand.text = country.landArea
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListCountryVH {
        val binding =
            CardTitleCountryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ListCountryVH(binding)
    }

    override fun onBindViewHolder(holder: ListCountryVH, position: Int) {
        holder.bind(getItem(position))
    }
}