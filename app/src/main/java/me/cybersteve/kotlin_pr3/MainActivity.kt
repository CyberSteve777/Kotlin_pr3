package me.cybersteve.kotlin_pr3

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import me.cybersteve.kotlin_pr3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val FragmentManager = supportFragmentManager

        binding.button2.setOnClickListener {
            val transaction = FragmentManager.beginTransaction()
            transaction.replace(binding.Fragments.id, Fragmentov()).addToBackStack(null).commit()
        }
    }
}