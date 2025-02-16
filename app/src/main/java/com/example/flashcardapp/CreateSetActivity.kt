//CreateSetActivity.kt
package com.example.flashcardapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class CreateSetActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_set)

        val setNameInput = findViewById<EditText>(R.id.setNameInput)
        val setAnswerInput = findViewById<EditText>(R.id.setAnswerInput)
        val saveSetButton = findViewById<Button>(R.id.saveSetButton)

        saveSetButton.setOnClickListener {
            val setName = setNameInput.text.toString()
            val setAnswer = setAnswerInput.text.toString()
            if (setName.isNotEmpty() and setAnswer.isNotEmpty()) {
                // Pass the new set name back to MainActivity
                val resultIntent = intent
                resultIntent.putExtra("newSetName", "\nQuestion: $setName \n \n ----------- \n \nAnswer: $setAnswer")



                setResult(RESULT_OK, resultIntent)
                finish() // Close CreateSetActivity and return to MainActivity
            } else {
                Toast.makeText(this, "Set name cannot be empty", Toast.LENGTH_SHORT).show()
            }
        }
    }
}