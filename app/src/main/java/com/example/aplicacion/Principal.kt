package com.example.aplicacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class Principal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)
    }
    override fun onStart() {
        super.onStart()
        val toast =
            Toast.makeText(applicationContext, "Conectado", Toast.LENGTH_LONG)
        toast.show()
    }

    fun Usuario(view: View) {
        val usuario = Intent(this@Principal, Usuario()::class.java)
        startActivity(usuario)
}
    fun Instituto(view: View) {
        val instituto = Intent(this@Principal, Instituto()::class.java)
        startActivity(instituto)
    }
    fun Asignaturas(view: View) {
        val asignaturas = Intent(this@Principal, Asignaturas()::class.java)
        startActivity(asignaturas)
    }
    fun Avisos(view: View) {
        val avisos = Intent(this@Principal, Avisos()::class.java)
        startActivity(avisos)
    }
    fun Acerca(view: View) {
        val acerca = Intent(this@Principal, Acerca()::class.java)
        startActivity(acerca)
    }
}