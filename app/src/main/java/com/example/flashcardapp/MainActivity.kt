//MainActivity.kt
package com.example.flashcardapp

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.GridView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val flashcardSets = mutableListOf<FlashcardSet>()

    // SharedPreferences for persistent storage
    private lateinit var sharedPreferences: SharedPreferences
    private val sharedPreferencesKey = "FlashcardSets"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize SharedPreferences
        sharedPreferences = getSharedPreferences(sharedPreferencesKey, Context.MODE_PRIVATE)

        // Load the stored flashcard sets from SharedPreferences
        loadFlashcardSets()

        // Reference GridView and Button
        val gridView = findViewById<GridView>(R.id.flashcardGridView) // Changed to GridView
        val newSetButton = findViewById<Button>(R.id.newSetButton)

        // Set Adapter for GridView
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, flashcardSets.map { it.name })
        gridView.adapter = adapter

        // Handle Create New Flashcard Set Button
        newSetButton.setOnClickListener {
            val intent = Intent(this, CreateSetActivity::class.java)
            startActivityForResult(intent, 1)
        }
    }

    override fun onResume() {
        super.onResume()
        // Reload the list of flashcard sets after returning from CreateSetActivity
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, flashcardSets.map { it.name })
        findViewById<GridView>(R.id.flashcardGridView).adapter = adapter
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == 1 && resultCode == RESULT_OK) {
            val newSetName = data?.getStringExtra("newSetName")
            if (newSetName != null) {
                // Create a new FlashcardSet and add it to the list
                val newSet = FlashcardSet(name = newSetName)
                flashcardSets.add(newSet)

                // Save the updated list of flashcard sets to SharedPreferences
                saveFlashcardSets()

                // Update the GridView with the new set
                val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, flashcardSets.map { it.name })
                findViewById<GridView>(R.id.flashcardGridView).adapter = adapter
            }
        }
    }

    // Save the list of flashcard sets to SharedPreferences
    private fun saveFlashcardSets() {
        val editor = sharedPreferences.edit()
        val setNames = flashcardSets.map { it.name }.joinToString(",") // Save as comma-separated string
        editor.putString("setNames", setNames)
        editor.apply()
    }

    // Load the list of flashcard sets from SharedPreferences
    private fun loadFlashcardSets() {
        val savedSetNames = sharedPreferences.getString("setNames", "")
        if (!savedSetNames.isNullOrEmpty()) {
            val setNames = savedSetNames.split(",")
            for (setName in setNames) {
                flashcardSets.add(FlashcardSet(name = setName))
            }
        }
    }
}
