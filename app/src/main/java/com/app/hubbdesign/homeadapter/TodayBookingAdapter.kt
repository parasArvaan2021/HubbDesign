package com.app.hubbdesign.homeadapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.app.hubbdesign.R

class TodayBookingAdapter(val context:Context):RecyclerView.Adapter<TodayBookingAdapter.FeaturedLocationViewHolder>() {

    inner class FeaturedLocationViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FeaturedLocationViewHolder {
        return FeaturedLocationViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_list_today_booking, parent, false))
    }

    override fun onBindViewHolder(holder: FeaturedLocationViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 5
    }
}