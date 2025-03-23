package com.example.tugas

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.tugas.databinding.ActivityHomeBinding
import com.example.tugas.databinding.ActivityRegisterBinding

class RegisterActivity : ComponentActivity() {
    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}