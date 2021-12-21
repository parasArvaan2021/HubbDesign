package com.app.hubbdesign.booking

import android.app.TimePickerDialog
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.app.hubbdesign.R
import com.app.hubbdesign.choosehubsize.ChooseHubSizeActivity
import java.text.ParseException
import java.text.SimpleDateFormat
import java.time.LocalTime
import java.time.format.DateTimeFormatter
import java.util.*
import kotlin.collections.ArrayList


class BookingCalenderActivity : AppCompatActivity() {

    var courses = arrayOf(
        "min", "hr"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_booking_calander)

        val mTimePicker: TimePickerDialog
        val mcurrentTime = Calendar.getInstance()
        val hour = mcurrentTime.get(Calendar.HOUR_OF_DAY)
        val minute = mcurrentTime.get(Calendar.MINUTE)

        mTimePicker = TimePickerDialog(this,
            { view, hourOfDay, minute ->


                val time = "$hourOfDay:$minute"

                try {
                    val sdf = SimpleDateFormat("H:mm")
                    val dateObj: Date = sdf.parse(time)
                    System.out.println(dateObj)
                    System.out.println(SimpleDateFormat("K:mm").format(dateObj))
                    findViewById<TextView>(R.id.tvBookingCalendarTimePicker).text = SimpleDateFormat("hh:mm a").format(dateObj)

                } catch (e: ParseException) {
                    e.printStackTrace()
                }


            }, hour, minute, false
        )


        findViewById<CardView>(R.id.cvBookingCalenderSpinnerHoursOrMin).setOnClickListener {
            getMember()
        }

        findViewById<TextView>(R.id.tvBookingCalenderNext).setOnClickListener {
            startActivity(Intent(this,ChooseHubSizeActivity::class.java))
        }

        findViewById<ImageView>(R.id.ivBookingCalenderBackButton).setOnClickListener {
            onBackPressed()
        }

        findViewById<CardView>(R.id.cvBookingCalenderTimePicker).setOnClickListener {
            mTimePicker.show()
        }

    }

    fun getMember() {
        val memberList: ArrayList<String> = ArrayList()
        memberList.add("min")
        memberList.add("hr")

        val builder: android.app.AlertDialog.Builder = android.app.AlertDialog.Builder(this)
        builder.setTitle("Select")
        builder.setItems(
            memberList.toArray(arrayOfNulls<String>(0))
        ) { dialogInterface, i ->
            dialogInterface.dismiss()
            findViewById<TextView>(R.id.tvCvBookingCalenderSpinner).text = memberList[i]
        }
        builder.show()
    }
}