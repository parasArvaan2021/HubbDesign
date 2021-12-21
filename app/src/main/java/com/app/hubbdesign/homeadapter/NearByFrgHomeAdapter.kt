package com.app.hubbdesign.homeadapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.app.hubbdesign.R

class NearByFrgHomeAdapter(val context:Context): RecyclerView.Adapter<NearByFrgHomeAdapter.NearByLocationViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NearByLocationViewHolder {
       return NearByLocationViewHolder(LayoutInflater.from(context).inflate(R.layout.item_list_nearby,parent,false))
    }

    override fun onBindViewHolder(holder: NearByLocationViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 5
    }



    inner class NearByLocationViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){

    }
}