package com.app.hubbdesign.location.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.app.hubbdesign.R

class AvailableHubAdapter(val context: Context):RecyclerView.Adapter<AvailableHubAdapter.AvailableHubViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AvailableHubViewHolder {
      return AvailableHubViewHolder(LayoutInflater.from(context).inflate(R.layout.item_list_available_hub,parent,false))
    }

    override fun onBindViewHolder(holder: AvailableHubViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
       return 5
    }

    inner class AvailableHubViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){

    }
}