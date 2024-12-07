package com.example.androidlifecycle

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

    }
    override fun onStart() {
        Log.i("HARRY", "onStart")
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show()
        super.onStart()


    }

    override fun onResume() {
        Log.i("HARRY", "onResume")
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show()
        super.onResume()
    }

    override fun onPause() {
        Log.i("HARRY", "onPause")
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show()
        super.onPause()
    }

    override fun onStop() {
        Log.i("HARRY", "onStop")
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show()
        super.onStop()
    }

    override fun onDestroy() {
        Log.i("HARRY", "onDestroy")
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show()
        super.onDestroy()
    }
}