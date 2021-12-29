package com.app.hubbdesign.location.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.app.hubbdesign.R
import com.app.hubbdesign.location.model.LocationFacilityDataModel

class LocationFacilityAdapter(
    val context: Context,
    val listOfFacility: ArrayList<LocationFacilityDataModel>
):RecyclerView.Adapter<LocationFacilityAdapter.FacilityViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FacilityViewHolder {
        return FacilityViewHolder(LayoutInflater.from(context).inflate(R.layout.item_list_location_facility,parent,false))
    }

    override fun onBindViewHolder(holder: FacilityViewHolder, position: Int) {
        val currentIndexData=listOfFacility[position]
        holder.ivRvLocationFacility.setImageResource(currentIndexData.icon)
    }

    override fun getItemCount(): Int {
       return listOfFacility.size
    }

    inner class FacilityViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
            val ivRvLocationFacility:ImageView=itemView.findViewById(R.id.ivRvLocationFacility)
    }
}