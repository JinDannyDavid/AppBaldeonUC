package com.example.appbaldeon

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.graphics.Color
import android.content.Intent
import android.net.Uri
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.appbaldeon.ui.theme.AppBaldeonTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtMensaje = findViewById<TextView>(R.id.txtMensaje)
        val btnCambiarTexto = findViewById<Button>(R.id.btnCambiarTexto)
        val btnCambiarNombre = findViewById<Button>(R.id.btnColocarNombre)




        btnCambiarTexto.setOnClickListener{


            txtMensaje.text = "Bienvenido"
            txtMensaje.setTextColor(Color.BLUE)
            btnCambiarTexto.text = "se cambio aqui tambien"
            val intent = Intent(this,SegundaActivity::class.java)
            intent.putExtra("nombre","Danny")
            startActivity(intent)
        }

        btnCambiarNombre.setOnClickListener{

            txtMensaje.text = "Gracias por Ingresar Danny"
            val url = "https://www.google.com"
            val intenti = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            intent.setPackage("com.android.chrome")
            startActivity(intenti)

        }



    }
}