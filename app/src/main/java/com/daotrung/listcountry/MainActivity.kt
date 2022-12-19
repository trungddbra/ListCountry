package com.daotrung.listcountry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.daotrung.listcountry.Adapter.ListAdapter
import com.daotrung.listcountry.AppUtil.utilList
import com.daotrung.listcountry.Model.Country

private lateinit var recyclerView: RecyclerView
private lateinit var listCountry: MutableList<Country>
private lateinit var listAdapter: ListAdapter
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listCountry = utilList.getListCountry()
        recyclerView = findViewById(R.id.rvListCountry)
        listAdapter = ListAdapter(listCountry)
             recyclerView.layoutManager = LinearLayoutManager(this)
             recyclerView.adapter = listAdapter

    }
}