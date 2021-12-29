package com.app.hubbdesign.verify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.app.hubbdesign.R
import com.app.hubbdesign.signupsecond.SignUpSecondActivity

class VerifyNumberActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verify_number)

        findViewById<ImageView>(R.id.ivVerifyBackButton).setOnClickListener {
            onBackPressed()
        }

        findViewById<TextView>(R.id.tvVerifyVerifyAccountButton).setOnClickListener {
            startActivity(Intent(this,SignUpSecondActivity::class.java))
        }
    }
}