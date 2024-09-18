package com.example.sesion4

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.sesion4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.web.setOnClickListener{
            startActivity(Intent(baseContext, WebActivity::class.java)) //pasar de una actividad a otra

        }
        binding.list.setOnClickListener{
            startActivity(Intent(baseContext, ListActivity::class.java))
        }
    }
}