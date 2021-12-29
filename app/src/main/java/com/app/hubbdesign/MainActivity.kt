package com.app.hubbdesign

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.app.hubbdesign.homeadapter.*
import com.app.hubbdesign.offer.OfferActivity
import com.app.hubbdesign.paymentoption.PaymentOptionActivity
import com.app.hubbdesign.reservation.ReservationReviewActivity
import com.app.hubbdesign.reservationConfirmation.ReservationConfirmActivity
import com.app.hubbdesign.search.SearchLocationActivity

class MainActivity : AppCompatActivity() {


    lateinit var rcNearBy:RecyclerView
    lateinit var rvExplore:RecyclerView
    lateinit var rvOffers:RecyclerView
    lateinit var rvFeaturedLocation:RecyclerView
    lateinit var rvToday:RecyclerView
    lateinit var textview:TextView
    lateinit var textviewLine:View
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rcNearBy=findViewById(R.id.rvNearBy)
        rvExplore=findViewById(R.id.rvExploreOyHub)
        rvOffers=findViewById(R.id.rvOffers)
        rvFeaturedLocation=findViewById(R.id.rvFeaturedLocation)
        rvToday=findViewById(R.id.rvTodayBooking)
        textview=findViewById(R.id.tvFrgHomeTodayBookingHeading)
        textviewLine=findViewById(R.id.frgHomeLineTodayBooking)

        rvExplore.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        rvOffers.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        rcNearBy.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        rvFeaturedLocation.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        rvToday.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)

        rcNearBy.adapter= NearByFrgHomeAdapter(this)
        rvExplore.adapter= ExploreOurHubbAdapter(this)
        rvOffers.adapter= OffersAdapter(this)
        rvFeaturedLocation.adapter= FeaturedLocationAdapter(this)
        rvToday.adapter= TodayBookingAdapter(this)


        findViewById<Button>(R.id.btnNext).setOnClickListener {
//            startActivity(Intent(this,BookingListActivity::class.java))
//            startActivity(Intent(this,FavoriteListActivity::class.java))
            startActivity(Intent(this,ReservationConfirmActivity::class.java))
        }

        findViewById<TextView>(R.id.etFrgHomeSearchHubbWorkSpace).setOnClickListener{
            startActivity(Intent(this,SearchLocationActivity::class.java))
        }
        findViewById<ImageView>(R.id.ivFrgHomeHubbIc).setOnClickListener{
            startActivity(Intent(this,ReservationReviewActivity::class.java))
        }

    }
}