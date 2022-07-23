package com.example.insta_copy

import android.provider.ContactsContract
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView




class FeedAdapter : RecyclerView.Adapter<FeedAdapter.FeedViewHolder>() {



    private val id = arrayOf(
        "it.s.aditya._",
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

    private val post = arrayOf(
        R.drawable.my_self,
        R.drawable.anvansh,
        R.drawable.utkarsh,
        R.drawable.prabhat,
        R.drawable.naveen,
        R.drawable.shaswat,
        R.drawable.parthav,
        R.drawable.kanish
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FeedViewHolder {
        return FeedViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.feed_layout, parent, false))
    }

    override fun onBindViewHolder(viewHolder: FeedViewHolder, position: Int) {
        viewHolder.item_id.text = id[position]
        viewHolder.item_profile.imageAlpha = profile[position]
        viewHolder.item_post.imageAlpha = post[position]


    }

    override fun getItemCount(): Int {
        return id.size;
    }

    class FeedViewHolder(
        itemView: View
    ) : RecyclerView.ViewHolder(itemView) {
        var item_id: TextView
        var item_profile: ImageView
        var item_post: ImageView

        init {
            item_id = itemView.findViewById(R.id.user_name)
            item_post = itemView.findViewById(R.id.post)
            item_profile = itemView.findViewById(R.id.profile)
        }
    }

}

