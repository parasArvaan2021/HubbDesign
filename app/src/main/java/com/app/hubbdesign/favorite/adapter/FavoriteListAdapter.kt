package com.app.hubbdesign.favorite.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.app.hubbdesign.R

class FavoriteListAdapter(val context: Context):RecyclerView.Adapter<FavoriteListAdapter.FavoriteListViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavoriteListViewHolder {
       return FavoriteListViewHolder(LayoutInflater.from(context).inflate(R.layout.item_list_favorite_list,parent,false))
    }

    override fun onBindViewHolder(holder: FavoriteListViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
       return 10
    }

    inner class FavoriteListViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){

    }
}