package com.example.menubottomnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.menubottomnavigation.databinding.Fragment2Binding

class Fragment2 : Fragment() {
    lateinit var _binding: Fragment2Binding
    val binding
        get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = Fragment2Binding.inflate(inflater, container, false)
        return binding.root
    }

}