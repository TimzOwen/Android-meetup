package com.timzowen.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import com.timzowen.aboutme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnDone.setOnClickListener {
            addNickName(it)
        }
    }
    //
    private fun addNickName(view : View){
        binding.tvNickName.text = binding.etNickName.text
        binding.etNickName.visibility = View.GONE
        // hide button visibility
        view.visibility = View.GONE
        // un-hide text to display the given name
        binding.tvNickName.visibility = View.VISIBLE

        // hide the keyboard input type
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken,0)
    }
}