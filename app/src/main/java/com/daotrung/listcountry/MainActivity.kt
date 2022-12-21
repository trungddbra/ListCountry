package com.daotrung.listcountry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.daotrung.listcountry.adapter.CountryAdapter
import com.daotrung.listcountry.databinding.ActivityMainBinding
import com.daotrung.listcountry.viewmodel.CountryViewModel
import com.daotrung.listcountry.viewmodel.CountryViewModelFactory

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    private lateinit var countryViewModel: CountryViewModel
    private lateinit var countryViewModelFactory: CountryViewModelFactory

    private val countryAdapter by lazy { CountryAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val view = binding.root
        setContentView(view)

        countryViewModelFactory = CountryViewModelFactory()
        countryViewModel =
            ViewModelProvider(this, countryViewModelFactory)[CountryViewModel::class.java]
        countryViewModel.localCountries.observe(this) {
            countryAdapter.submitList(it)
        }
        binding.rvListCountry.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = countryAdapter
        }

    }


}