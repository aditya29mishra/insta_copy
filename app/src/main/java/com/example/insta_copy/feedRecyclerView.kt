package com.example.insta_copy

import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.insta_copy.feed_package.feed_package

class feedRecyclerView : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var items: List<feed_package> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class feedViewHolder constructor(

        itemView: View
    ) : RecyclerView.ViewHolder(itemView) {

        val userphoto: =itemView.post_photo


        fun bind(feedPackage: feed_package){

            val requestOptions = RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)

            Glide.with(itemView.context)
                .applyDefaultRequestOptions(requestOptions)
                .load(feed_package.)
                .into()

        }

    }

}