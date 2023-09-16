package com.example.firepreventionapp2

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HabitacionesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_habitaciones)

        findViewById<Button>(R.id.btnHabitacion1).setOnClickListener {
            val intent = Intent(this, Habitacion1Activity::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.btnHabitacion2).setOnClickListener {
            val intent = Intent(this, Habitacion2Activity::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.btnHabitacion3).setOnClickListener {
            val intent = Intent(this, Habitacion3Activity::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.btnHabitacion4).setOnClickListener {
            val intent = Intent(this, Habitacion4Activity::class.java)
            startActivity(intent)
        }
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
