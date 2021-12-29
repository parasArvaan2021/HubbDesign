package com.app.hubbdesign.addcard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.app.hubbdesign.R

class AddCardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_card)

        findViewById<ImageView>(R.id.ivAddCardBackButton).setOnClickListener {
            onBackPressed()
        }
    }
}