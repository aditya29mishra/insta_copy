package com.example.insta_copy

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class StoryAdapter: RecyclerView.Adapter<StoryAdapter.StoryViewholder>() {

    private val id = arrayOf(
        "My story",
        "_anvansh_",
        "_utkarsh_",
        "prabhath_",
        "_naveen_",
        "_shashwat_",
        "_parthav_",
        "_kanishk_"
    )
    private val profile = arrayOf(
        R.drawable.my_profile,
        R.drawable.anvansh_modified,
        R.drawable.utkarsh_modified,
        R.drawable.prabhat_modified,
        R.drawable.naveen_modified,
        R.drawable.shaswat_modified,
        R.drawable.parthav_modified,
        R.drawable.kanish_modified
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoryViewholder {
        return StoryViewholder(
            LayoutInflater.from(parent.context).inflate(R.layout.stories, parent, false))
    }
    override fun onBindViewHolder(viewHolder: StoryViewholder, position: Int) {
        viewHolder.item_id.text = id[position]
        viewHolder.item_profile.setImageResource(profile[position])
    }

    override fun getItemCount(): Int {
        return id.size
    }


   inner class StoryViewholder(
    itemView: View
    ) : RecyclerView.ViewHolder(itemView) {
        var item_id: TextView
        var item_profile: ImageView

        init {
            item_id = itemView.findViewById(R.id.userid)
            item_profile = itemView.findViewById(R.id.idprofile)
        }
    }

}