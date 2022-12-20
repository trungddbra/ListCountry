package com.daotrung.listcountry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.daotrung.listcountry.adapter.CountryAdapter
import com.daotrung.listcountry.util.UtilList
import com.daotrung.listcountry.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val listCountry by lazy {
        UtilList.getListCountry()
    }
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    private val countryAdapter by lazy { CountryAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val view = binding.root
        setContentView(view)

        countryAdapter.submitList(listCountry)
        binding.rvListCountry.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = countryAdapter
        }

    }


}