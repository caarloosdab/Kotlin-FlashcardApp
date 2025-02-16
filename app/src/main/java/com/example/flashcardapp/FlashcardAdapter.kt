// FlashcardAdapter
package com.example.flashcardapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.google.android.material.card.MaterialCardView

class FlashcardAdapter(private val context: Context, private val flashcards: List<Flashcard>) : BaseAdapter() {

    override fun getCount(): Int = flashcards.size

    override fun getItem(position: Int): Any = flashcards[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = convertView ?: LayoutInflater.from(context).inflate(R.layout.flashcard_item, parent, false)

        val flashcard = getItem(position) as Flashcard
        val cardView = view.findViewById<MaterialCardView>(R.id.cardView)
        val questionText = view.findViewById<TextView>(R.id.questionText)
        val answerText = view.findViewById<TextView>(R.id.answerText)

        questionText.text = flashcard.question
        answerText.text = flashcard.answer

        // Handle card flip
        cardView.setOnClickListener {
            val isFlipped = cardView.cardElevation == 0f
            if (isFlipped) {
                cardView.cardElevation = 10f
                answerText.visibility = View.VISIBLE
            } else {
                cardView.cardElevation = 0f
                answerText.visibility = View.GONE
            }
        }

        return view
    }
}
