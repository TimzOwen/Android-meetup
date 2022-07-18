package com.timzowen.roomauthentication.fragments.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.timzowen.roomauthentication.R


class ListFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater,container : ViewGroup?, savedInstanceState: Bundle?) : View? {

        val view = inflater.inflate(R.layout.fragment_add,container,false)

        return view
    }

}