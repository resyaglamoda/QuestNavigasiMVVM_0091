package com.example.myapplication6

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.myapplication6.ui.theme.MyApplication6Theme
import com.example.myapplication6.view.DataApp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplication6Theme {
                // Memanggil DataApp yang berisi NavHost dari Navigasi.kt
                Surface(modifier = Modifier.fillMaxSize()) {
                    DataApp()
                }
            }
        }
    }
}