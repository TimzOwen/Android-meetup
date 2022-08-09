package com.timzowen.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.timzowen.myapplication.adapters.FoodAdapter
import com.timzowen.myapplication.adapters.PizzaRecapAdapter
import com.timzowen.myapplication.data.Food
import com.timzowen.myapplication.data.PizzaRecap
import com.timzowen.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var foodList : ArrayList<Food>
    private lateinit var foodAdapter : FoodAdapter
    private lateinit var binding : ActivityMainBinding
    private lateinit var pizzaList : ArrayList<PizzaRecap>
    private lateinit var pizzaListAdapter : PizzaRecapAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        foodList = ArrayList()
        pizzaList = ArrayList()
        foodAdapter = FoodAdapter(foodList)
        pizzaListAdapter = PizzaRecapAdapter(pizzaList)
        foodListItems()
        pizzaListItems()
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.setHasFixedSize(true)
        binding.recyclerView.adapter = foodAdapter

    }
    private fun foodListItems(){
        foodList.add(Food(R.drawable.pizza1,"chicken Pizza"))
        foodList.add(Food(R.drawable.pizza2,"Beef Chicken"))
        foodList.add(Food(R.drawable.noodles1,"normal Pizza"))
        foodList.add(Food(R.drawable.noodles2,"sweet Chicken"))
        foodList.add(Food(R.drawable.paneer,"Mini Pizza"))
        foodList.add(Food(R.drawable.pasta,"Extra Chicken"))
        foodList.add(Food(R.drawable.piza_spagethi,"meat Pizza"))
        foodList.add(Food(R.drawable.pizza12,"vegez Chicken"))
        foodList.add(Food(R.drawable.pizza1,"chicken Pizza"))
        foodList.add(Food(R.drawable.pizza2,"Beef Chicken"))
        foodList.add(Food(R.drawable.noodles1,"normal Pizza"))
        foodList.add(Food(R.drawable.noodles2,"sweet Chicken"))
        foodList.add(Food(R.drawable.paneer,"Mini Pizza"))
        foodList.add(Food(R.drawable.pasta,"Extra Chicken"))
        foodList.add(Food(R.drawable.piza_spagethi,"meat Pizza"))
        foodList.add(Food(R.drawable.pizza12,"vegez Chicken"))
    }
    private fun pizzaListItems(){
        pizzaList.add(PizzaRecap(R.drawable.pizza1,"chicken Pizza"))
        pizzaList.add(PizzaRecap(R.drawable.pizza2,"Beef Chicken"))
        pizzaList.add(PizzaRecap(R.drawable.noodles1,"normal Pizza"))
        pizzaList.add(PizzaRecap(R.drawable.noodles2,"sweet Chicken"))
        pizzaList.add(PizzaRecap(R.drawable.paneer,"Mini Pizza"))
        pizzaList.add(PizzaRecap(R.drawable.pasta,"Extra Chicken"))
        pizzaList.add(PizzaRecap(R.drawable.piza_spagethi,"meat Pizza"))
        pizzaList.add(PizzaRecap(R.drawable.pizza12,"vegez Chicken"))
        pizzaList.add(PizzaRecap(R.drawable.pizza1,"chicken Pizza"))
        pizzaList.add(PizzaRecap(R.drawable.pizza2,"Beef Chicken"))
        pizzaList.add(PizzaRecap(R.drawable.noodles1,"normal Pizza"))
        pizzaList.add(PizzaRecap(R.drawable.noodles2,"sweet Chicken"))
        pizzaList.add(PizzaRecap(R.drawable.paneer,"Mini Pizza"))
        pizzaList.add(PizzaRecap(R.drawable.pasta,"Extra Chicken"))
        pizzaList.add(PizzaRecap(R.drawable.piza_spagethi,"meat Pizza"))
        pizzaList.add(PizzaRecap(R.drawable.pizza12,"vegez Chicken"))
    }
}