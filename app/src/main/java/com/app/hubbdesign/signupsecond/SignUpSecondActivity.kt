package com.app.hubbdesign.signupsecond

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.app.hubbdesign.R

class SignUpSecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up_second)

        findViewById<ImageView>(R.id.ivSignUpSecondBackButton).setOnClickListener {
            onBackPressed()
        }
    }
}