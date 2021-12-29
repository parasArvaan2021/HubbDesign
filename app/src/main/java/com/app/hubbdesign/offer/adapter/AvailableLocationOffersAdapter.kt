package com.app.hubbdesign.offer.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.app.hubbdesign.R

class AvailableLocationOffersAdapter(val context: Context):RecyclerView.Adapter<AvailableLocationOffersAdapter.AvailableLocationViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AvailableLocationViewHolder {
        return AvailableLocationViewHolder(LayoutInflater.from(context).inflate(R.layout.item_list_offers_available_location,parent,false))
    }

    override fun onBindViewHolder(holder: AvailableLocationViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
       return 10
    }

    inner class AvailableLocationViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){

    }
}