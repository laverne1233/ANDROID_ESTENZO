package com.estenzo.animal.midterm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.estenzo.animal.midterm.adapter.BlockedAdapter
import com.estenzo.animal.midterm.databinding.ActivityManageBlockBinding

class ManageBlockActivity : AppCompatActivity() {

    private lateinit var binding: ActivityManageBlockBinding
    private lateinit var listView: ListView
    private val blockedAnimals = ArrayList<String>() // Replace with your data source for blocked animals

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityManageBlockBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Initialize the ListView
        listView = binding.listViewBlockedAnimals

        // Populate the blocked animals list (replace with your data source)
        blockedAnimals.add("Cat")
        blockedAnimals.add("Dog")
        blockedAnimals.add("Dolphin")

        // Create the BlockedAdapter to display the blocked animals
        val adapter = BlockedAdapter(this, blockedAnimals)
        listView.adapter = adapter
    }
}
