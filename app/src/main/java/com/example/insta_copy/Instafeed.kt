package com.example.insta_copy

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.*
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_insta_feed.*


class Instafeed : Fragment(), View.OnClickListener {

    private var NavController: NavController? = null


    private var layoutManager: LayoutManager? = null
    private var feedAdapter: RecyclerView.Adapter<FeedAdapter.FeedViewHolder>? = null
//    private var adapter2: RecyclerView.Adapter<StoryAdapter.StoryViewholder>? = null

    private  var storyadapter : RecyclerView.Adapter<StoryAdapter.StoryViewholder>? =null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_insta_feed, container, false)
    }

    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(itemView, savedInstanceState)

        NavController = view?.let { Navigation.findNavController(it) }

        feedRecycle.apply {
            layoutManager = LinearLayoutManager(context)
            feedAdapter = FeedAdapter()
            adapter = feedAdapter
        }
        storyRecycle.apply {

            layoutManager = LinearLayoutManager(context, HORIZONTAL,false)
            storyadapter = StoryAdapter()
            adapter = storyadapter
        }
        view?.findViewById<ImageView>(R.id.chatButton)?.setOnClickListener(this)
    }

    override fun onClick(v: View?) {

        when (v!!.id) {

            R.id.chatButton -> NavController!!.navigate(R.id.action_insta_feed_to_chats)

        }

    }
}