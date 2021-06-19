package com.example.gameideagenerator

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


val genre = arrayOf("FPS", "Action", "Adventure", "Horror", "RPG", "MMORPG", "Stealth", "Puzzle", "Side-Scroller", "Platformer")
val main_character = arrayOf("Dragon", "Dog", "Bird", "Snail", "Cube", "Sphere", "Loner", "Swordsmen", "Chef", "Knight")
val objective = arrayOf("Capture the flag", "Search and Destroy", "Search and Rescue", "Survive", "Save Everyone",
"Race the Clock", "Solve a Puzzle", "Escape", "Explore")


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Buttons and Text Variables
        val objectiveButton = findViewById<Button>(R.id.Objective)
        val genreButton = findViewById<Button>(R.id.Genre)
        val characterButton = findViewById<Button>(R.id.Character)

        val genreTextView = findViewById<TextView>(R.id.genreText)
        val characterTextView = findViewById<TextView>(R.id.characterText)
        val objectiveTextView = findViewById<TextView>(R.id.objectiveText)

        // Button Functionality
        genreButton.setOnClickListener {
            val rand = genre.random()
            genreTextView.text = rand
        }

        characterButton.setOnClickListener {
            val rand1 = main_character.random()
            characterTextView.text = rand1
        }

        objectiveButton.setOnClickListener {
            val rand2 = objective.random()
            objectiveTextView.text = rand2
        }

    }
}