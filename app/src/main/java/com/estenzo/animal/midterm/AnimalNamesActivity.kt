package com.estenzo.animal.midterm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.estenzo.animal.midterm.adapter.AnimalAdapter
import com.estenzo.animal.midterm.databinding.ActivityAnimalNamesBinding
import com.estenzo.animal.midterm.model.Animal

class AnimalNamesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAnimalNamesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAnimalNamesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val animals: MutableList<Animal> = ArrayList()
        animals.add(Animal("Antelope", "The antelope is a graceful herbivore known for its agility and speed in the animal kingdom."))

        animals.add(Animal("Bear", "Bears are powerful omnivorous mammals known for their strength and hibernation during the winter."))

        animals.add(Animal("Cheetah", "The cheetah is the fastest land animal, capable of incredible speed during a chase."))

        animals.add(Animal("Dolphin", "Dolphins are highly intelligent marine mammals known for their playful behavior and communication abilities."))

        animals.add(Animal("Elephant", "Elephants are the largest land animals, characterized by their long trunks and impressive size."))

        animals.add(Animal("Fox", "Foxes are small carnivorous mammals with cunning and adaptable behaviors."))

        animals.add(Animal("Giraffe", "Giraffes are the world's tallest land animals, recognized by their long necks and distinctive spots."))

        animals.add(Animal("Hippopotamus", "Hippos are large, herbivorous mammals found in African rivers and known for their powerful jaws."))

        animals.add(Animal("Iguana", "Iguanas are reptiles known for their unique appearance and ability to change color."))

        animals.add(Animal("Jaguar", "Jaguars are powerful and elusive big cats found in the Americas."))

        animals.add(Animal("Kangaroo", "Kangaroos are marsupials known for their powerful hind legs and distinctive hopping movement."))

        animals.add(Animal("Lion", "Lions are iconic big cats known for their social structure and dominance in the savanna."))

        animals.add(Animal("Monkey", "Monkeys are intelligent and agile primates found in various habitats around the world."))

        animals.add(Animal("Narwhal", "Narwhals are Arctic whales known for their long spiral tusks that resemble a unicorn horn."))

        animals.add(Animal("Ostrich", "Ostriches are flightless birds known for their fast running abilities and large size."))

        animals.add(Animal("Penguin", "Penguins are flightless birds well-adapted to life in the cold regions of the world."))

        animals.add(Animal("Quokka", "Quokkas are small marsupials known for their friendly and smiling appearance."))

        animals.add(Animal("Rhinoceros", "Rhinos are massive herbivorous mammals with distinctive horn(s) on their snouts."))

        animals.add(Animal("Sloth", "Sloths are slow-moving arboreal mammals found in the rainforests of Central and South America."))

        animals.add(Animal("Tiger", "Tigers are majestic big cats known for their striking orange coats with black stripes."))

        animals.add(Animal("Uakari", "Uakaris are unique primates with bright red faces found in the Amazon rainforest."))

        animals.add(Animal("Vulture", "Vultures are scavenging birds of prey known for their role in cleaning up carcasses."))

        animals.add(Animal("Walrus", "Walruses are large marine mammals known for their tusks and blubbery appearance."))

        animals.add(Animal("X-ray Tetra", "X-ray tetras are small, translucent fish with remarkable transparency."))

        animals.add(Animal("Yak", "Yaks are long-haired bovine mammals adapted to high-altitude environments."))

        animals.add(Animal("Zebra", "Zebras are striped herbivores that roam the grasslands of Africa."))

        val context = this
        val adapter = AnimalAdapter(animals, context)

        binding.animalList.layoutManager = LinearLayoutManager(this)
        binding.animalList.adapter = adapter

        // Use ViewBinding to access the "Manage Blocked Animals" button
        binding.manageAnimalButton.setOnClickListener {
            // Handle the button click, navigate to the activity to manage blocked animals
            val intent = Intent(context, ManageBlockActivity::class.java)
            startActivity(intent)
        }
    }
}
