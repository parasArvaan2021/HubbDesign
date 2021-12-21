package com.app.hubbdesign.search

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.app.hubbdesign.R
import com.app.hubbdesign.booking.BookingCalenderActivity
import com.app.hubbdesign.search.adapter.PreviousSearchAdapter

class SearchLocationActivity : AppCompatActivity() {

    lateinit var rvSearchLocationPreviousSearch:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search_location)
        rvSearchLocationPreviousSearch=findViewById(R.id.rvSearchLocationPreviousSearch)
        rvSearchLocationPreviousSearch.layoutManager=LinearLayoutManager(this)
        rvSearchLocationPreviousSearch.adapter=PreviousSearchAdapter(this)
        rvSearchLocationPreviousSearch.setHasFixedSize(true)

        findViewById<ImageView>(R.id.ivSearchLocationBackButton).setOnClickListener {
            onBackPressed()
        }
        findViewById<TextView>(R.id.tvSearchLocationNext).setOnClickListener {
            startActivity(Intent(this,BookingCalenderActivity::class.java))
        }
    }
}