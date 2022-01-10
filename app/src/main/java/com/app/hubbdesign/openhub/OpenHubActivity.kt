package com.app.hubbdesign.openhub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.app.hubbdesign.R
import com.app.hubbdesign.profile.ProfileActivity

class OpenHubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_open_hub)

        findViewById<ImageView>(R.id.ivOpenHubSetHubSettingForwardArrow).setOnClickListener {
            startActivity(Intent(this,ProfileActivity::class.java))
        }
    }
}