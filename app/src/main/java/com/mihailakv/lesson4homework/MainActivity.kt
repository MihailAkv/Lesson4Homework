package com.mihailakv.lesson4homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val weHaveAnAlphabetHereTextView: TextView = findViewById(R.id.we_have_an_alphabet_here)
        val alphabetTextView: TextView = findViewById(R.id.alphabet_text_view)
        val showEvenOnlyButton: Button = findViewById(R.id.show_even_only_button)

        showEvenOnlyButton.setOnClickListener () {
            val alphabetList = listOf('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z')
                .forEachIndexed { index, value ->
                    when {
                        (index % 2 != 0) ->
                    /*weHaveAnAlphabetHereTextView.text =
                        ("...And these are even letters of the alphabet")**/
                    alphabetTextView.text = value.toString()
                }
            }
        }
    }
}




