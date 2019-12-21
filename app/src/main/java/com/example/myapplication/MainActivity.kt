package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var points : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: ImageButton
        button = findViewById(R.id.imageButton)

        val text: TextView = findViewById(R.id.points)

        button.setOnClickListener { view: View? ->
            points = points + 1
            text.text = points.toString()

            if (points==10) {
                button.setImageResource(R.drawable.donut)
            } else if (points==20) {
                button.setImageResource(R.drawable.eclair)
            } else if (points==30) {
                button.setImageResource(R.drawable.froyo)
            } else if (points==40) {
                button.setImageResource(R.drawable.honeycomb)
            } else if (points==50) {
                button.setImageResource(R.drawable.icecream)
            } else if (points==75) {
                button.setImageResource(R.drawable.kitkat)
            } else if (points==100) {
                button.setImageResource(R.drawable.marshmallow)
            }
        }
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}
