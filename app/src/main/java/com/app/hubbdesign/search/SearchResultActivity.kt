package com.app.hubbdesign.search

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.app.hubbdesign.R
import com.app.hubbdesign.search.adapter.SearchResultAdapter

class SearchResultActivity : AppCompatActivity() {

    lateinit var rvSearchResultData:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search_result)

        rvSearchResultData=findViewById(R.id.rvSearchResultData)

        rvSearchResultData.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        rvSearchResultData.adapter=SearchResultAdapter(this)
    }
}