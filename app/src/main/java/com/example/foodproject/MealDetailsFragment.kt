package com.example.foodproject

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.foodproject.databinding.MealDetailsFragmentBinding

class MealDetailsFragment:Fragment() {
    lateinit var binding: MealDetailsFragmentBinding
    private val args : MealDetailsFragmentArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,

        savedInstanceState: Bundle?
    ): View? {
        binding= MealDetailsFragmentBinding.inflate(inflater,container,false)

        val meal = args.Meal

        binding.image2.setImageResource(meal.imageId)
        binding.tvName.text= meal.title

        return binding.root
    }


    }
