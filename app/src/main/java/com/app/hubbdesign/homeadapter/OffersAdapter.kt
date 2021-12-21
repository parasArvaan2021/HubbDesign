package com.app.hubbdesign.homeadapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.app.hubbdesign.R

class OffersAdapter(val context: Context):RecyclerView.Adapter<OffersAdapter.OffersViewHolder>() {

    inner class OffersViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OffersViewHolder {
        return OffersViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_list_offers, parent, false))
    }

    override fun onBindViewHolder(holder: OffersViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
   return 5
    }
}