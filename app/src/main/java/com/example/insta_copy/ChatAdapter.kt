package com.example.insta_copy

import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ChatAdapter: RecyclerView.Adapter<ChatAdapter.ChatViewHolder>() {


    private val id = arrayOf(
        "Aditya mishra",
        "Anvash Anurag",
        "Utkarsh Shukla",
        "Prabhat Keshari",
        "Naveen mishra",
        "Shashwat Sharama",
        "Parthav Shingal",
        "Kanisk Agrawal"
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




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(viewHolder: ChatViewHolder, position: Int) {
        viewHolder.item_id.text = id[position]
        viewHolder.item_profile.imageAlpha = profile[position]



    }
    class ChatViewHolder(
        itemView: View
    ) : RecyclerView.ViewHolder(itemView) {
        var item_id: TextView
        var item_profile: ImageView

        init {
            item_id = itemView.findViewById(R.id.user_name)
            item_profile = itemView.findViewById(R.id.profile)
        }
    }

    override fun getItemCount(): Int {
        return id.size;
    }
}

