package com.example.firepreventionapp2

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Habitacion2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_habitacion2)
    }

    override fun onResume() {
        super.onResume()

        val sharedPreferences = getSharedPreferences("SimulationPrefs", Context.MODE_PRIVATE)
        val simulationActive = sharedPreferences.getBoolean("SimulationActive", false)

        if (simulationActive) {
            findViewById<TextView>(R.id.txtTemperature).visibility = View.VISIBLE
            findViewById<TextView>(R.id.txtFireAlert).visibility = View.VISIBLE
        } else {
            findViewById<TextView>(R.id.txtTemperature).visibility = View.GONE
            findViewById<TextView>(R.id.txtFireAlert).visibility = View.GONE
        }
    }
}
