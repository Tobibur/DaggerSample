package com.tobibur.daggersample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*
import org.jetbrains.anko.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        backButton.setOnClickListener {
//            startActivity<MainActivity>()
//            finish()
            val countries = listOf("Russia", "USA", "Japan", "Australia")
            selector("Where are you from?", countries) { _, i ->
                alert("So you're living in ${countries[i]}, cool! " +
                        "Do you want to go back to the MainActivity?") {
                    yesButton {
                        startActivity<MainActivity>()
                        finish()
                    }
                    noButton { toast("Lets pick another country!") }
                }.show()
            }
        }
    }
}
