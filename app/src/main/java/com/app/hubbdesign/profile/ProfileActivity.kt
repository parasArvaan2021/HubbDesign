package com.app.hubbdesign.profile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText

import com.app.hubbdesign.R
import com.app.hubbdesign.choosehubsize.ChooseHubSizeActivity
import com.app.hubbdesign.paymentoption.PaymentOptionActivity

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        findViewById<EditText>(R.id.etProfilePersonalInfo).setOnClickListener {
            Log.i("TAG", "onCreate: comoing")
        }
        findViewById<EditText>(R.id.etProfilePaymentOption).setOnClickListener {
           startActivity(Intent(this, PaymentOptionActivity::class.java))
        }

        findViewById<EditText>(R.id.etProfileFaq).setOnClickListener {
            startActivity(Intent(this,ChooseHubSizeActivity::class.java))
        }
    }
}