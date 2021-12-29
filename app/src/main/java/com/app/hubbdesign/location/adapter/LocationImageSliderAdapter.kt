package com.app.hubbdesign.location.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.app.hubbdesign.R
import com.bumptech.glide.Glide

class LocationImageSliderAdapter(val context: Context, val listOfImages: ArrayList<String>):RecyclerView.Adapter<LocationImageSliderAdapter.SliderViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SliderViewHolder {
return SliderViewHolder(LayoutInflater.from(context).inflate(R.layout.item_list_location_slider,parent,false))
    }

    override fun onBindViewHolder(holder: SliderViewHolder, position: Int) {

        val currentIndexData=listOfImages[position]

        Glide.with(context)
            .load(currentIndexData)
            .into(holder.ivGallery)

    }

    override fun getItemCount(): Int {
       return listOfImages.size
    }

    inner class SliderViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
            val ivGallery:ImageView=itemView.findViewById(R.id.ivLocationSlider)
    }
}