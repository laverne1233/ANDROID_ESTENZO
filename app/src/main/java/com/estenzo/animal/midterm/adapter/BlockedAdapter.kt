package com.estenzo.animal.midterm.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.estenzo.animal.midterm.databinding.ItemAnimalBinding
import com.estenzo.animal.midterm.databinding.ItemBlockedAnimalBinding

class BlockedAdapter(private val context: Context, private val blockedAnimals: List<String>) : BaseAdapter() {

    override fun getCount(): Int {
        return blockedAnimals.size
    }

    override fun getItem(position: Int): Any {
        return blockedAnimals[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val animalName = blockedAnimals[position]

        val binding: ItemBlockedAnimalBinding
        val view: View

        if (convertView == null) {
            binding = ItemBlockedAnimalBinding.inflate(LayoutInflater.from(context), parent, false)
            view = binding.root
            view.tag = binding
        } else {
            binding = convertView.tag as ItemBlockedAnimalBinding
            view = convertView
        }

        binding.blockedAnimalNameTextView.text = animalName

        return view
    }

}
