package com.example.foodproject

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.foodproject.databinding.MealsPlanFragmentBinding
import com.example.foodproject.databinding.MycartfragmentBinding

class MealsPlanFragment:Fragment() {
    lateinit var binding: MealsPlanFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= MealsPlanFragmentBinding.inflate(inflater,container,false)


        return binding.root
    }
}