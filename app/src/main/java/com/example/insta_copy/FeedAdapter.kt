package com.example.insta_copy

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
        "_kanishk_",
        "_addi_",
        "_manas_",
        "_yash_",
        "_aditya_",
        "_abhishek_",
        "_shobhit_"
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

    private val post = arrayOf(
        R.drawable.my_self,
        R.drawable.anvansh,
        R.drawable.utkarsh,
        R.drawable.prabhat,
        R.drawable.naveen,
        R.drawable.shaswat,
        R.drawable.parthav,
        R.drawable.kanish,
        R.drawable.addi,
        R.drawable.manas,
        R.drawable.yash,
        R.drawable.aditya_kumar,
        R.drawable.abhishek_verma,
        R.drawable.shobhit
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FeedViewHolder {
        return FeedAdapter.FeedViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.feed_layout, parent, false))
    }

    override fun onBindViewHolder(viewHolder: FeedViewHolder, position: Int) {
        viewHolder.item_id1.text = id[position]
        viewHolder.item_id2.text = id[position]
        viewHolder.item_profile.setImageResource(profile[position])
        viewHolder.item_post.setImageResource(post[position])


    }

    override fun getItemCount(): Int {
        return id.size;
    }

    class FeedViewHolder(
        itemView: View
    ) : RecyclerView.ViewHolder(itemView) {
        var item_id1: TextView
        var item_id2: TextView
        var item_profile: ImageView
        var item_post: ImageView

        init {
            item_id1 = itemView.findViewById(R.id.id)
            item_id2 = itemView.findViewById(R.id.id_2)
            item_post = itemView.findViewById(R.id.post)
            item_profile = itemView.findViewById(R.id.profile)
        }
    }

}

