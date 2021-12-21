package com.app.hubbdesign.explorehub

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.app.hubbdesign.R
import com.app.hubbdesign.explorehub.adapter.CardViewListExploreHubAdapter
import com.app.hubbdesign.explorehub.model.CardViewListModel

class ExploreHubActivity : AppCompatActivity() {

    lateinit var rvExploreHubCardViewList: RecyclerView
    val listOfCardView = arrayListOf<CardViewListModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explore_hub)
        rvExploreHubCardViewList = findViewById(R.id.rvExploreHubCardViewList)

        listOfCardView.add(CardViewListModel(R.drawable.ic_baseline_wifi_24, "Wifi\nConnected", 1))
        listOfCardView.add(CardViewListModel(R.drawable.bulb, "Adjustable\nLighting", 2))
        listOfCardView.add(CardViewListModel(R.drawable.thermometer, "Temp\nControl", 3))
        listOfCardView.add(CardViewListModel(R.drawable.electricity, "Electric\nSocket", 4))
        listOfCardView.add(CardViewListModel(R.drawable.screen, "15\"\nScreen", 5))
        listOfCardView.add(CardViewListModel(R.drawable.usb_pendrive, "USB-A\nPort", 6))


        rvExploreHubCardViewList.layoutManager =
            GridLayoutManager(this, 3, GridLayoutManager.VERTICAL, false)
        rvExploreHubCardViewList.adapter = CardViewListExploreHubAdapter(this, listOfCardView)
    }
}