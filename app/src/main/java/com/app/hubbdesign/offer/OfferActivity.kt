package com.app.hubbdesign.offer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.app.hubbdesign.R
import com.app.hubbdesign.offer.adapter.AvailableLocationOffersAdapter
import com.app.hubbdesign.redeemoffer.RedeemOfferActivity

class OfferActivity : AppCompatActivity() {

    lateinit var rvOffersAvailableLocation:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_offer)

        rvOffersAvailableLocation=findViewById(R.id.rvOffersAvailableLocation)
        rvOffersAvailableLocation.layoutManager=LinearLayoutManager(this)
        rvOffersAvailableLocation.adapter=AvailableLocationOffersAdapter(this)

        findViewById<ImageView>(R.id.ivOffersBackButton).setOnClickListener {
            onBackPressed()
        }
        findViewById<TextView>(R.id.tvOffersRedeemOffers).setOnClickListener {
           startActivity(Intent(this,RedeemOfferActivity::class.java))
        }
    }
}