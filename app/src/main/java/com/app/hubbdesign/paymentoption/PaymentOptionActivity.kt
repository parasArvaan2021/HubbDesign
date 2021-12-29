package com.app.hubbdesign.paymentoption

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.app.hubbdesign.R
import com.app.hubbdesign.paymentoption.adapter.PaymentOptionCardDetailsAdapter


class PaymentOptionActivity : AppCompatActivity() {

   lateinit var rvPaymentOptionDisplay:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment_option)

        rvPaymentOptionDisplay=findViewById(R.id.rvPaymentOptionDisplay)
        rvPaymentOptionDisplay.layoutManager=LinearLayoutManager(this)
        rvPaymentOptionDisplay.adapter= PaymentOptionCardDetailsAdapter(this)
    }
}