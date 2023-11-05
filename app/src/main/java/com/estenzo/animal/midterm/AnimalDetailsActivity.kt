package com.estenzo.animal.midterm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.estenzo.animal.midterm.databinding.ActivityAnimalDetailsBinding

class AnimalDetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAnimalDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAnimalDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("name")
        val content = intent.getStringExtra("content")

        binding.nameTextView.text = name
        binding.contentTextView.text = content

        // Get a reference to the "Block Animal" button
        val blockAnimalButton = binding.blockAnimalButton

        // Set a click listener for the button
        blockAnimalButton.setOnClickListener {
            // Implement the functionality to block the animal here
            // You can add the animal to a list of blocked animals or perform any other action.
        }
    }
}
