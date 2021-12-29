package com.app.hubbdesign.creditbalance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.app.hubbdesign.R
import com.app.hubbdesign.creditbalance.adapter.RecentActivityCreditsBalanceAdapter

class CreditBalanceActivity : AppCompatActivity() {

    lateinit var rvCreditsBalanceRecentActivity:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_credit_balance)

        rvCreditsBalanceRecentActivity=findViewById(R.id.rvCreditsBalanceRecentActivity)
        rvCreditsBalanceRecentActivity.layoutManager=LinearLayoutManager(this)
        rvCreditsBalanceRecentActivity.adapter= RecentActivityCreditsBalanceAdapter(this)

        findViewById<ImageView>(R.id.ivCreditsBalanceBackButton).setOnClickListener {
            onBackPressed()
        }
    }
}