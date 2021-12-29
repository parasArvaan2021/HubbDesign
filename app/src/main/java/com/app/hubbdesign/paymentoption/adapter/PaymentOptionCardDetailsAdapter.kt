package com.app.hubbdesign.paymentoption.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.app.hubbdesign.R

class PaymentOptionCardDetailsAdapter(val context: Context):RecyclerView.Adapter<PaymentOptionCardDetailsAdapter.CardDetailsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardDetailsViewHolder {
       return CardDetailsViewHolder(LayoutInflater.from(context).inflate(R.layout.item_list_payment_option_card_details,parent,false))
    }

    override fun onBindViewHolder(holder: CardDetailsViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
       return 5
    }

    inner class CardDetailsViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){

    }
}