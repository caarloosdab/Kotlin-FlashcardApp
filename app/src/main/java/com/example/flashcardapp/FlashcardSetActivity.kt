// FlashcardSetActivity class
package com.example.flashcardapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.GridView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class FlashcardSetActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flashcard_set)

        val flashcardSet = intent.getSerializableExtra("flashcardSet") as FlashcardSet

        val gridView = findViewById<GridView>(R.id.flashcardGridView)
        val addFlashcardButton = findViewById<Button>(R.id.addFlashcardButton)

        // Set Adapter to show flashcards
        val adapter = FlashcardAdapter(this, flashcardSet.flashcards)
        gridView.adapter = adapter

        // Handle Add Flashcard Button
        addFlashcardButton.setOnClickListener {
            // Logic for adding new flashcards will go here
            Toast.makeText(this, "Add Flashcard functionality coming soon", Toast.LENGTH_SHORT).show()
        }
    }
}
