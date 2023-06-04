package com.example.menubottomnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.menubottomnavigation.databinding.Fragment1Binding


class Fragment1 : Fragment() {
    lateinit var _binding: Fragment1Binding
    val binding
        get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = Fragment1Binding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

}