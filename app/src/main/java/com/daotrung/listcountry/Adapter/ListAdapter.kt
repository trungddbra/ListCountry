package com.daotrung.listcountry.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.daotrung.listcountry.Model.Country
import com.daotrung.listcountry.R

class ListAdapter(private var data: MutableList<Country>):RecyclerView.Adapter<ListAdapter.MyViewCountryHolder>() {
    inner class MyViewCountryHolder(val view : View):RecyclerView.ViewHolder(view){
          fun bind(country: Country){
              val id = view.findViewById<TextView>(R.id.txtId)
              id.text = country.id.toString()
              val name = view.findViewById<TextView>(R.id.txtName)
              name.text = country.txtNameCountry
              val population = view.findViewById<TextView>(R.id.txtPopulation)
              population.text = country.txtPopulation
              val land  = view.findViewById<TextView>(R.id.txtLand)
              land.text = country.txtLandArea
              val density = view.findViewById<TextView>(R.id.txtDensity)
              density.text = country.txtDensity

          }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewCountryHolder {
        val context: Context = parent.context
        val inflater = LayoutInflater.from(context)
        var view : View? = null
        view = inflater.inflate(R.layout.card_title_country,parent,false)
        return MyViewCountryHolder(view!!)
    }

    override fun onBindViewHolder(holder: MyViewCountryHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }
}