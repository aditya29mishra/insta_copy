package com.example.insta_copy

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_chats.*


class chats : Fragment() ,View.OnClickListener{

    private var NavController: NavController? = null


    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<ChatAdapter.ChatViewHolder>? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_chats, container, false)
    }
    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(itemView, savedInstanceState)


        NavController= view?.let { Navigation.findNavController(it) }
        view?.findViewById<ImageView>(R.id.back_button)?.setOnClickListener(this)


        chatRecycle.apply {

            layoutManager = LinearLayoutManager(activity)
            adapter= ChatAdapter()
        }
    }

    override fun onClick(p: View?) {
        when(p!!.id){

            R.id.chatButton -> NavController!!.navigate(R.id.action_chats_to_insta_feed)

        }
    }
}



