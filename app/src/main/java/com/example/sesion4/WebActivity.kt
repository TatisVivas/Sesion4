package com.example.sesion4

import android.os.Bundle
import android.view.inputmethod.EditorInfo
import android.webkit.WebViewClient
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.sesion4.databinding.ActivityMainBinding
import com.example.sesion4.databinding.ActivityWebBinding

class WebActivity : AppCompatActivity() {

    private lateinit var binding: ActivityWebBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityWebBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //obtener lo que las persona escribió
        val query = binding.query.text.toString()
        //listener sobre el campo de texto
        //cuando la persona presione enter de búsqueda
        //v: vista, actionId: identificador de la acción, event: evento
        binding.query.setOnEditorActionListener { v, actionId, event ->
            if (actionId == EditorInfo.IME_ACTION_SEARCH){
                val query = binding.query.text.toString()
                val url = "https://www.google.com/search?q=$query" //armando url de la búsqueda de google
                binding.webView.webViewClient= WebViewClient()
                binding.webView.loadUrl(url)
            }
            true
        }

    }
}