package com.app.hubbdesign.favorite

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.app.hubbdesign.R
import com.app.hubbdesign.favorite.adapter.FavoriteListAdapter

class FavoriteListActivity : AppCompatActivity() {

    lateinit var rvFavoriteList:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favorite_list)
        rvFavoriteList=findViewById(R.id.rvFavoriteList)
        rvFavoriteList.layoutManager=LinearLayoutManager(this)
        rvFavoriteList.adapter=FavoriteListAdapter(this)
    }

}