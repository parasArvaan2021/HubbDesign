package com.app.hubbdesign.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.app.hubbdesign.MainActivity
import com.app.hubbdesign.R
import com.app.hubbdesign.signupfirst.SignUpFirstActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        findViewById<TextView>(R.id.tvLoginLoginButton).setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }

        findViewById<TextView>(R.id.tvLoginDontHaveAnAccount).setOnClickListener {
            startActivity(Intent(this,SignUpFirstActivity::class.java))
        }
    }
}