package com.daotrung.listcountry.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.daotrung.listcountry.model.Country
import com.daotrung.listcountry.repository.CountryRepository

class CountryViewModel : ViewModel() {
    var localCountries = MutableLiveData<MutableList<Country>>()
    var countryRepository = CountryRepository()

    init {
        localCountries.value = countryRepository.getListCountry()
    }
}