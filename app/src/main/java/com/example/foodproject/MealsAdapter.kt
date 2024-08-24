package com.example.foodproject

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.foodproject.databinding.MealItemBinding

class MealsAdapter (val data: List<Meal>, val mealClickListener: MealClickListener)
    : ListAdapter<Meal, MealsAdapter.MyViewHolder>(UserItemDiffCallback()) {

    class MyViewHolder(val binding: MealItemBinding) : RecyclerView.ViewHolder(binding.root) {
        companion object {
            fun from(parent: ViewGroup): MyViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = MealItemBinding.inflate(layoutInflater, parent, false)
                return MyViewHolder(binding)
            }
        }
    }

    interface MealClickListener {
        fun onMealClicked(meal: Meal)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder.from(parent)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.meal = data.get(position)
        holder.binding.image.setImageResource(data.get(position).imageId)


        holder.binding.root.setOnClickListener {
            mealClickListener.onMealClicked(data.get(position))
        }
    }
    }

 class UserItemDiffCallback: DiffUtil.ItemCallback<Meal>() {
     override fun areItemsTheSame(oldItem: Meal, newItem: Meal): Boolean {
         return oldItem == newItem
                }

     override fun areContentsTheSame(oldItem: Meal, newItem: Meal): Boolean {
                    return oldItem == newItem
                }
            }
