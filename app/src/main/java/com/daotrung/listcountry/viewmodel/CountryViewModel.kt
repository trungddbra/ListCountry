package com.daotrung.listcountry.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.daotrung.listcountry.model.Country
import com.daotrung.listcountry.repository.CountryRepository
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.schedulers.Schedulers

class CountryViewModel : ViewModel() {
    var localCountries = MutableLiveData<MutableList<Country>>()
    var countryRepository = CountryRepository()

    init {
        localCountries.value = countryRepository.getListCountry()
    }

    fun getCountries(name: String) {
        Observable.just(countryRepository.getListCountry())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe({
                Log.d("TAG::", "getCountries: ${it}")
                localCountries.value =
                    it.filter { it.name.lowercase().contains(name) }.toMutableList()
            }, { it.printStackTrace() })
    }
}