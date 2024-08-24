package com.example.foodproject

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.foodproject.databinding.MealsFragmentBinding
import com.example.foodproject.MealsAdapter as MealsAdapter


class MealsFragment:Fragment(), MealsAdapter.MealClickListener {
    lateinit var binding: MealsFragmentBinding
    var meals: MutableList<Meal> = mutableListOf()
    lateinit var mealsadapter: MealsAdapter


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= MealsFragmentBinding.inflate(inflater,container,false)

        meals= mutableListOf(Meal("Burger",R.drawable.burger),
            Meal("Steak",R.drawable.filletsteak),
            Meal("Pancakes",R.drawable.pancakes),
            Meal("Pizza",R.drawable.pizza),
            Meal("Shawerma",R.drawable.shawerma),
            Meal("Waffles",R.drawable.waffles)
            )


        mealsadapter= MealsAdapter(meals,this)

        binding.rvMeals.adapter= mealsadapter

        return binding.root
    }

    override fun onMealClicked(meal: Meal) {
        val action = MealsFragmentDirections.actionMealsFragmentToMealDetailsFragment(meal)
        findNavController().navigate(action)

    }
}