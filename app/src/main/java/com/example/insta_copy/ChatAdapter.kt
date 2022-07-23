package com.example.insta_copy

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ChatAdapter : RecyclerView.Adapter<ChatAdapter.ChatViewHolder>() {


    private val name = arrayOf(
        "Aditya mishra",
        "Anvash Anurag",
        "Utkarsh Shukla",
        "Prabhat Keshari",
        "Naveen mishra",
        "Shashwat Sharama",
        "Parthav Shingal",
        "Kanisk Agrawal",
        "Addi",
        "manas Tripathi",
        "Yash Gupta",
        "Aditya Kumar",
        "Abhishek Verma",
        "Shobhit parvan"
    )

    private val profile = arrayOf(
        R.drawable.my_profile,
        R.drawable.anvansh_modified,
        R.drawable.utkarsh_modified,
        R.drawable.prabhat_modified,
        R.drawable.naveen_modified,
        R.drawable.shaswat_modified,
        R.drawable.parthav_modified,
        R.drawable.kanish_modified,
        R.drawable.addi_modified,
        R.drawable.manas_modified,
        R.drawable.yash_modified,
        R.drawable.aditya_kumar_modified,
        R.drawable.abhishek_verma_modified,
        R.drawable.shibhit_modified
        )


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatViewHolder {
        return ChatAdapter.ChatViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.chats, parent, false)
        )
    }

    override fun onBindViewHolder(viewHolder: ChatViewHolder, position: Int) {
        viewHolder.item_name.text = name[position]
        viewHolder.item_profile.setImageResource(profile[position])


    }

    class ChatViewHolder(
        itemView: View
    ) : RecyclerView.ViewHolder(itemView) {
        var item_name: TextView
        var item_profile: ImageView

        init {
            item_name = itemView.findViewById(R.id.user_name)
            item_profile = itemView.findViewById(R.id.user_profile)
        }
    }

    override fun getItemCount(): Int {
        return name.size;
    }
}

