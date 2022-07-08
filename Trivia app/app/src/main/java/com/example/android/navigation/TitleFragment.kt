package com.example.android.navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.android.navigation.databinding.FragmentTitleBinding

class TitleFragment : Fragment() {
    // Instantiate a binding util class .
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentTitleBinding>(inflater,R.layout.fragment_title,container,false)

        binding.playButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.gameFragment)
        )

        return binding.root
    }

}