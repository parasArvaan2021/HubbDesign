package com.app.hubbdesign.explorehub.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.app.hubbdesign.R
import com.app.hubbdesign.explorehub.model.CardViewListModel

class CardViewListExploreHubAdapter(
    val context: Context,
    private val listOfCardView: ArrayList<CardViewListModel>
):RecyclerView.Adapter<CardViewListExploreHubAdapter.CardViewListViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewListViewHolder {
       return CardViewListViewHolder(LayoutInflater.from(context).inflate(R.layout.item_list_explore_hub_cardview_list,parent,false))
    }

    override fun onBindViewHolder(holder: CardViewListViewHolder, position: Int) {
        val currentIndex=listOfCardView[position]

        holder.ivExploreHubCardViewFacilities.setImageResource(currentIndex.icon)
        holder.tvShowFacilities.text=currentIndex.message

    }

    override fun getItemCount(): Int {
       return listOfCardView.size
    }

    inner class CardViewListViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){

        val tvShowFacilities:TextView=itemView.findViewById(R.id.tvExploreHubForDescription)
        val ivExploreHubCardViewFacilities:ImageView=itemView.findViewById(R.id.ivExploreHubCardViewWifi)

    }
}