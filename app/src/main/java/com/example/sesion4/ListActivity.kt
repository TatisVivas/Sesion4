package com.example.sesion4

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.sesion4.databinding.ActivityListBinding
import com.example.sesion4.databinding.ActivityWebBinding
import com.example.sesion4.model.Country

class ListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityListBinding

    val array = Array<String>(30){i -> if(i%2==0) "hola" else "mundo"}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        binding=ActivityListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //adaptador

        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,array)
        binding.list.adapter=adapter
    }

}