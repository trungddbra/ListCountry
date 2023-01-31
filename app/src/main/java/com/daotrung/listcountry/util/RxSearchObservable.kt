package com.daotrung.listcountry.util

import androidx.appcompat.widget.SearchView
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.subjects.PublishSubject

object RxSearchObservable {
    fun fromView(searchView: SearchView): Observable<String> {
        val subject = PublishSubject.create<String>()
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                subject.onComplete()
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                subject.onNext(newText)
                return true
            }

        })
        return subject
    }
}