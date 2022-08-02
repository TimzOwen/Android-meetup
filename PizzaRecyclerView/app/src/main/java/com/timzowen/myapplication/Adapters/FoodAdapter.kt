package com.timzowen.myapplication.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.timzowen.myapplication.R
import com.timzowen.myapplication.data.Food

class FoodAdapter(private val foodList : ArrayList<Food>):RecyclerView.Adapter<FoodAdapter.FoodViewHolder>(){

    class FoodViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val foodImage : ImageView = itemView.findViewById(R.id.iv_pizza)
        val foodName : TextView = itemView.findViewById(R.id.tv_pizza_text)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val viewLayout = LayoutInflater.from(parent.context).inflate(R.layout.each_item,parent,false)
        return FoodViewHolder(viewLayout)
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        val currentFood = foodList[position]
        holder.foodImage.setImageResource(currentFood.foodImage)
        holder.foodName.text = currentFood.foodName
    }

    override fun getItemCount() = foodList.size

}