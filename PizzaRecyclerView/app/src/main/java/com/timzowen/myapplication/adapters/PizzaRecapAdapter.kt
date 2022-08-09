package com.timzowen.myapplication.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.timzowen.myapplication.R
import com.timzowen.myapplication.data.PizzaRecap

class PizzaRecapAdapter(private val pizzaList : ArrayList<PizzaRecap>) : RecyclerView.Adapter<PizzaRecapAdapter.PizzaViewHolder>() {

    class PizzaViewHolder(itemView : View):RecyclerView.ViewHolder(itemView){
        var image : ImageView = itemView.findViewById(R.id.iv_pizza)!!
        var name : TextView = itemView.findViewById(R.id.tv_recap_pizza)!!
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PizzaViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.recap_layout,parent,false)
        return PizzaViewHolder(layout)
    }
    override fun onBindViewHolder(holder: PizzaViewHolder, position: Int) {
        val currentPosition = pizzaList[position]
        holder.image.setImageResource(currentPosition.pizzaImage)
        holder.name.text = currentPosition.pizzaName
    }
    override fun getItemCount() = pizzaList.size
}