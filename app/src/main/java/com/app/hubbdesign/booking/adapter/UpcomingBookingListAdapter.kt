package com.app.hubbdesign.booking.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.app.hubbdesign.R

class UpcomingBookingListAdapter
    (val context:Context):RecyclerView.Adapter<UpcomingBookingListAdapter.UpcomingBookingViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UpcomingBookingViewHolder {
       return UpcomingBookingViewHolder(LayoutInflater.from(context).inflate(R.layout.item_list_booking_upcoming,parent,false))
    }

    override fun onBindViewHolder(holder: UpcomingBookingViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 5
    }

    inner class UpcomingBookingViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView)
}