package com.app.hubbdesign.choosehubsize

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.app.hubbdesign.R
import com.app.hubbdesign.search.SearchResultActivity

class ChooseHubSizeActivity : AppCompatActivity() {

    lateinit var ivCvChooseHubSizePlush: ImageView
    lateinit var ivCvChooseHubSizeMinus: ImageView
    lateinit var tvCvChooseHubSize: TextView
    var count = 1


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose_hub_size)


        ivCvChooseHubSizeMinus = findViewById(R.id.ivCvChooseHubSizeMinus)
        ivCvChooseHubSizePlush = findViewById(R.id.ivCvChooseHubSizePlush)
        tvCvChooseHubSize = findViewById(R.id.tvCvChooseHubSize)

        ivCvChooseHubSizePlush.setOnClickListener {
            val size = tvCvChooseHubSize.text.toString().toInt()
            if (size > 0 && size < 20) {
                count++
                tvCvChooseHubSize.text = count.toString()
            } else
                Toast.makeText(this, "greaterThen 20 not allow", Toast.LENGTH_SHORT).show()
        }

        ivCvChooseHubSizeMinus.setOnClickListener {
            val size = tvCvChooseHubSize.text.toString().toInt()
            if (size in 2..20) {
                count--
                tvCvChooseHubSize.text = count.toString()
            } else
                Toast.makeText(this, "lessThen 0 not allow", Toast.LENGTH_SHORT).show()
        }


        findViewById<ImageView>(R.id.ivChooseHubSizeBackButton).setOnClickListener {
            onBackPressed()
        }

        findViewById<TextView>(R.id.tvChooseHubSizeFinish).setOnClickListener {
            startActivity(
                Intent(
                    this,SearchResultActivity::class.java
                )
            )
        }

    }
}