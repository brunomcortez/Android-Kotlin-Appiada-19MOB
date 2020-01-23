package com.brunocortez.appiada

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvJoker.text = getString(R.string.joker_seven)
        btTellJoke.setOnClickListener { tvJoker.text = showJoke() }
    }


    private fun showJoke(): String {
        val jokers = resources.getStringArray(R.array.jokers)
        return jokers[java.util.Random().nextInt(jokers.size)]
    }
}
