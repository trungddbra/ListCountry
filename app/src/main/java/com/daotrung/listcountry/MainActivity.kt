package com.daotrung.listcountry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.daotrung.listcountry.Adapter.ListAdapter
import com.daotrung.listcountry.AppUtil.utilList
import com.daotrung.listcountry.Model.Country
import com.daotrung.listcountry.databinding.ActivityMainBinding


private lateinit var recyclerView: RecyclerView
private lateinit var listCountry: MutableList<Country>
private lateinit var listAdapter: ListAdapter
private lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        listCountry = utilList.getListCountry()
        recyclerView = binding.rvListCountry
        listAdapter = ListAdapter(listCountry)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = listAdapter

    }


}