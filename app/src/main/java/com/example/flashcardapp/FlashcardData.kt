// FlashcardData.kt
package com.example.flashcardapp

import java.io.Serializable

data class Flashcard(
    val question: String,
    val answer: String
) : Serializable

data class FlashcardSet(
    val name: String,
    val flashcards: MutableList<Flashcard> = mutableListOf()
) : Serializable