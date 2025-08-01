package com.example.lab2

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PantallaInicial()
        }
    }
}

@Composable
fun PantallaInicial() {
    val context = LocalContext.current

    Column {
        Text("Emily A. Gongora Giron")
        Text("#24308 Sección 40")

        Button(onClick = {
            Toast.makeText(context, "Holaaa", Toast.LENGTH_SHORT).show()
        }) {
            Text("Press me")
        }
    }
}




