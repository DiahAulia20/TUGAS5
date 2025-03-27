package com.example.tugas

import android.os.Bundle
import android.content.Intent
import androidx.activity.ComponentActivity
import com.example.tugas.databinding.ActivityHomeBinding

class HomeActivity : ComponentActivity() {
    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnTugas3.setOnClickListener {
            val intent = Intent(this, Tugas3Activity::class.java)
            startActivity(intent)
        }

        //btnTugas4.setOnClickListener {
        //    val intent = Intent(this, Tugas4Activity::class.java)
        //    startActivity(intent)
        //}
    }

}