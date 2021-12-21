package com.app.hubbdesign.search.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.app.hubbdesign.R

class SearchResultAdapter(val context: Context) :
    RecyclerView.Adapter<SearchResultAdapter.SearchResultViewHolder>() {

    inner class SearchResultViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchResultViewHolder {
        return SearchResultViewHolder(LayoutInflater.from(context).inflate(R.layout.item_list_search_result,parent,false))

    }

    override fun onBindViewHolder(holder: SearchResultViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 5
    }
}