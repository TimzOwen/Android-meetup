package com.timzowen.myapplication.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.timzowen.myapplication.R
import com.timzowen.myapplication.data.Food

class ChefAdapter(private  var chefList : ArrayList<Food>) : RecyclerView.Adapter<ChefAdapter.ChefViewHolder>() {

    class ChefViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        var chefImage: ImageView = itemView.findViewById(R.id.iv_pizza)
        var chefName : TextView = itemView.findViewById(R.id.tv_pizza_text)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChefViewHolder {
        val viewLayout = LayoutInflater.from(parent.context).inflate(R.layout.each_item,parent,false)
        return ChefViewHolder(viewLayout)
    }
    override fun onBindViewHolder(holder: ChefViewHolder, position: Int) {
        val currentChef = chefList[position]
        holder.chefImage.setImageResource(currentChef.foodImage)
        holder.chefName.text = currentChef.foodName
    }
    override fun getItemCount() = chefList.size
}