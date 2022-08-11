package com.timzowen.myapplication.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.timzowen.myapplication.R
import com.timzowen.myapplication.data.Chef

class ChefAdapter(private val  chefList : ArrayList<Chef>) : RecyclerView.Adapter<ChefAdapter.ChefViewHolder>() {

    class ChefViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        // locate your views
        val chefName : TextView = itemView.findViewById(R.id.tv_chefName)
        val chefImage : ImageView = itemView.findViewById(R.id.iv_chefProfile)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChefViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.chef_profile,parent,false)
        return ChefViewHolder(layout)
    }
    override fun onBindViewHolder(holder: ChefViewHolder, position: Int) {
        val currentChef = chefList[position]
        holder.chefName.text = currentChef.chefName
        holder.chefImage.setImageResource(currentChef.chefImage)
    }
    override fun getItemCount()=chefList.size
}