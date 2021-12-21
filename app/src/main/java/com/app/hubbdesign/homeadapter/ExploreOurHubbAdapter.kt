package com.app.hubbdesign.homeadapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.app.hubbdesign.R
import com.app.hubbdesign.explorehub.ExploreHubActivity

class ExploreOurHubbAdapter(val context: Context) :
    RecyclerView.Adapter<ExploreOurHubbAdapter.ExploreOurHubbViewHolder>() {


    inner class ExploreOurHubbViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val layout=itemView.findViewById<ConstraintLayout>(R.id.main_layout)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExploreOurHubbViewHolder {
        return ExploreOurHubbViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_list_explore_our_hubb, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ExploreOurHubbViewHolder, position: Int) {
            holder.layout.setOnClickListener {
                context.startActivity(Intent(context,ExploreHubActivity::class.java))
            }
    }

    override fun getItemCount(): Int {
        return 5
    }
}