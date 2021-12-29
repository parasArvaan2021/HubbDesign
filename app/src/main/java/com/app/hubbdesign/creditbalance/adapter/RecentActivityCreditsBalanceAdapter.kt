package com.app.hubbdesign.creditbalance.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.app.hubbdesign.R

class RecentActivityCreditsBalanceAdapter(val context: Context):RecyclerView.Adapter<RecentActivityCreditsBalanceAdapter.RecentActivityViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecentActivityViewHolder {
       return RecentActivityViewHolder(LayoutInflater.from(context).inflate(R.layout.item_list_recent_activity_credits_balance,parent,false))
    }

    override fun onBindViewHolder(holder: RecentActivityViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 20
    }

    inner class RecentActivityViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){

    }
}