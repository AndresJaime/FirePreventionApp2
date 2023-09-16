package com.example.firepreventionapp2

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnHabitaciones).setOnClickListener {
            val intent = Intent(this, HabitacionesActivity::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.btnExtintores).setOnClickListener {
            val intent = Intent(this, ExtintoresActivity::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.btnSalir).setOnClickListener {
            finish() // Cierra la aplicación
        }

        findViewById<Button>(R.id.btnSimular).setOnClickListener {
            val sharedPreferences = getSharedPreferences("SimulationPrefs", Context.MODE_PRIVATE)
            val simulationActive = sharedPreferences.getBoolean("SimulationActive", false)

            with(sharedPreferences.edit()) {
                putBoolean("SimulationActive", !simulationActive) // Invierte el estado actual
                apply()
            }
        }

        // Este es el código que estaba mal ubicado.
        findViewById<Button>(R.id.btnInterfaz).setOnClickListener {
            val intent = Intent(this, Interfaz::class.java)
            startActivity(intent)
        }
    }
}
