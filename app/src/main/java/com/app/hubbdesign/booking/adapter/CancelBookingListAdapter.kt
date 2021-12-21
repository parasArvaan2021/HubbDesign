package com.app.hubbdesign.booking.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.app.hubbdesign.R

class CancelBookingListAdapter(val context: Context): RecyclerView.Adapter<CancelBookingListAdapter.CancelBookingViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CancelBookingViewHolder {
        return CancelBookingViewHolder(LayoutInflater.from(context).inflate(R.layout.item_list_booking_cancel,parent,false))
    }

    override fun onBindViewHolder(holder: CancelBookingViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 7
    }

    inner class CancelBookingViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

    }
}