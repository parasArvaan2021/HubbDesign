package com.app.hubbdesign.search.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.app.hubbdesign.R

class PreviousSearchAdapter(val context: Context): RecyclerView.Adapter<PreviousSearchAdapter.PreviousSearchViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PreviousSearchViewHolder {
        return PreviousSearchViewHolder(LayoutInflater.from(context).inflate(R.layout.item_list_previous_search,parent,false))
    }

    override fun onBindViewHolder(holder: PreviousSearchViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 10
    }

    inner class PreviousSearchViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

    }
}