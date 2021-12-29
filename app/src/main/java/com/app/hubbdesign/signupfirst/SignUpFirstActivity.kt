package com.app.hubbdesign.signupfirst

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.app.hubbdesign.R
import com.app.hubbdesign.login.LoginActivity
import com.app.hubbdesign.verify.VerifyNumberActivity

class SignUpFirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up_first)

        findViewById<TextView>(R.id.tvSignUpFirstAlreadyHaveAnAccount).setOnClickListener {
            startActivity(Intent(this,LoginActivity::class.java))
        }
        findViewById<TextView>(R.id.tvSignUpFirstContinueButton).setOnClickListener {
            startActivity(Intent(this,VerifyNumberActivity::class.java))
        }
        findViewById<ImageView>(R.id.ivSignUpFirstBackButton).setOnClickListener {
            onBackPressed()
        }
    }
}