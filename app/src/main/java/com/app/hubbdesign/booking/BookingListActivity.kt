package com.app.hubbdesign.booking

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.app.hubbdesign.R
import com.app.hubbdesign.booking.adapter.CancelBookingListAdapter
import com.app.hubbdesign.booking.adapter.PreviousBookingListAdapter
import com.app.hubbdesign.booking.adapter.UpcomingBookingListAdapter

class BookingListActivity : AppCompatActivity() {

    lateinit var rvFrgUpcomingBooking: RecyclerView
    lateinit var rvFrgBookingCanceledBooking: RecyclerView
    lateinit var rvFrgBookingPrevious: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_booking_list)

        rvFrgUpcomingBooking=findViewById(R.id.rvFrgUpcomingBooking)
        rvFrgBookingCanceledBooking=findViewById(R.id.rvFrgBookingCanceledBooking)
        rvFrgBookingPrevious=findViewById(R.id.rvFrgBookingPrevious)

        rvFrgUpcomingBooking.layoutManager= LinearLayoutManager(this)
        rvFrgBookingCanceledBooking.layoutManager= LinearLayoutManager(this)
        rvFrgBookingPrevious.layoutManager= LinearLayoutManager(this)

        rvFrgUpcomingBooking.adapter= UpcomingBookingListAdapter(this)
        rvFrgBookingCanceledBooking.adapter= CancelBookingListAdapter(this)
        rvFrgBookingPrevious.adapter= PreviousBookingListAdapter(this)
    }
}