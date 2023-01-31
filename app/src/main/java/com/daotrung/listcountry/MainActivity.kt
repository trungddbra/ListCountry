package com.daotrung.listcountry

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.daotrung.listcountry.adapter.CountryAdapter
import com.daotrung.listcountry.databinding.ActivityMainBinding
import com.daotrung.listcountry.util.RxSearchObservable.fromView
import com.daotrung.listcountry.viewmodel.CountryViewModel
import com.daotrung.listcountry.viewmodel.CountryViewModelFactory
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.schedulers.Schedulers
import java.util.concurrent.TimeUnit


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



        fromView(binding.searchViewList).debounce(300L, TimeUnit.MILLISECONDS)
            .distinctUntilChanged()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({ name ->
                Log.d("TAG::", "onCreate:$name ")
                countryViewModel.getCountries(name)
            }, { it.printStackTrace() })
    }


}