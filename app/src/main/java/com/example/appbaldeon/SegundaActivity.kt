package com.example.appbaldeon

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.graphics.Color
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



class SegundaActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main02)

        val txtNombre = findViewById<TextView>(R.id.txtNombre)
        val nombre = intent.getStringExtra("nombre")

        txtNombre.text = "Hi, $nombre"
    }
}