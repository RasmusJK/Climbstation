package com.example.climbstation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.stats_list_item.view.*

class StatisticsAdapter(var postListItems: List<ClimbItem>):RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    class ItemViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        fun bind(climbItem: ClimbItem){
            itemView.tv_item_email.text = climbItem.email
            itemView.tv_item_difficulty.text = climbItem.difficulty
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
    val view = LayoutInflater.from(parent.context).inflate(R.layout.stats_list_item,parent,false)
    return ItemViewHolder(view)
    }

    override fun getItemCount(): Int {
        return postListItems.size
    }
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as ItemViewHolder).bind(postListItems[position])
    }



}