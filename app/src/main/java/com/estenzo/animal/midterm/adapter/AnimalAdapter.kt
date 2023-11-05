package com.estenzo.animal.midterm.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.estenzo.animal.midterm.AnimalDetailsActivity
import com.estenzo.animal.midterm.databinding.ItemAnimalBinding
import com.estenzo.animal.midterm.model.Animal

class AnimalAdapter(
    private val animals: MutableList<Animal>,
    private val context: Context
) : RecyclerView.Adapter<AnimalAdapter.AnimalViewHolder>() {

    class AnimalViewHolder(private val binding: ItemAnimalBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(animal: Animal) {
            binding.name.text = animal.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemAnimalBinding.inflate(inflater, parent, false)
        return AnimalViewHolder(binding)
    }

    override fun getItemCount() = animals.size

    override fun onBindViewHolder(holder: AnimalViewHolder, position: Int) {
        val animal = animals[position]

        holder.itemView.setOnClickListener {
            val intent = Intent(context, AnimalDetailsActivity::class.java)

            intent.putExtra("name", animal.name)
            intent.putExtra("content", animal.content)

            context.startActivity(intent)
        }

        holder.bind(animal)
    }

}
