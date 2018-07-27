package com.tobibur.daggersample

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.tobibur.daggersample.di.component
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var context: Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        component.inject(this)

        textView.text = "$context"
    }
}
