package com.timzowen.apptester

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.timzowen.apptester.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        
        binding.btnRoll.setOnClickListener{
            rollDice()
        }

    }

    // Create a function to generate random numbers
    private fun rollDice() {
        val diceImage = when(Random.nextInt(6) + 1){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        binding.diceImage.setImageResource(diceImage)
    }
}