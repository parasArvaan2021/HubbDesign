package com.app.hubbdesign.location

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.app.hubbdesign.R
import com.app.hubbdesign.location.adapter.AvailableHubAdapter
import com.app.hubbdesign.location.adapter.LocationFacilityAdapter
import com.app.hubbdesign.location.adapter.LocationImageSliderAdapter
import com.app.hubbdesign.location.model.LocationFacilityDataModel
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class LocationActivity : AppCompatActivity() {

    lateinit var rvLocationFacility:RecyclerView
    lateinit var rvLocationAvailableHub:RecyclerView
    lateinit var vpGallery:ViewPager2
    lateinit var tlGallery:TabLayout
    var listOfFacility= arrayListOf<LocationFacilityDataModel>()
    var listOfImages= arrayListOf<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_location)
        rvLocationFacility=findViewById(R.id.rvLocationFacility)
        rvLocationAvailableHub=findViewById(R.id.rvLocationAvailableHub)
        vpGallery=findViewById(R.id.vpGallery)
        tlGallery=findViewById(R.id.tlGallery)



        listOfFacility.add(LocationFacilityDataModel(1,R.drawable.coffee))
        listOfFacility.add(LocationFacilityDataModel(2,R.drawable.hamburger))
        listOfFacility.add(LocationFacilityDataModel(3,R.drawable.print))
        listOfFacility.add(LocationFacilityDataModel(4,R.drawable.toilet))
        listOfFacility.add(LocationFacilityDataModel(5,R.drawable.moon))

        listOfImages.add("https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885__480.jpg")
        listOfImages.add("https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885__480.jpg")
        listOfImages.add("https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885__480.jpg")
        listOfImages.add("https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885__480.jpg")



        rvLocationFacility.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        rvLocationAvailableHub.layoutManager=LinearLayoutManager(this)
        rvLocationFacility.adapter=LocationFacilityAdapter(this,listOfFacility)
        rvLocationAvailableHub.adapter=AvailableHubAdapter(this)
        vpGallery.adapter=LocationImageSliderAdapter(this,listOfImages)
        TabLayoutMediator(tlGallery, vpGallery) { _, _ -> }.attach()
    }
}