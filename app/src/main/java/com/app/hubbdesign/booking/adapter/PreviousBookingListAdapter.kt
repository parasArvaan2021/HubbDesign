package com.app.hubbdesign.booking.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.app.hubbdesign.R

class PreviousBookingListAdapter (val context: Context): RecyclerView.Adapter<PreviousBookingListAdapter.PreviousBookingViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PreviousBookingViewHolder {
        return PreviousBookingViewHolder(LayoutInflater.from(context).inflate(R.layout.item_list_booking_previous,parent,false))
    }

    override fun onBindViewHolder(holder: PreviousBookingViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 3
    }

    inner class PreviousBookingViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

    }


}