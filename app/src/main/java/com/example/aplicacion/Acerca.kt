package com.example.aplicacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Acerca : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_acerca)
    }
    fun Desarrollador(view: View) {
        val desarrollador = Intent(this@Acerca, Desarrollador()::class.java)
        startActivity(desarrollador)
    }
}