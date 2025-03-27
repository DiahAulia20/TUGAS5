package com.example.tugas

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.tugas.databinding.ActivityForgotpwBinding
import com.example.tugas.databinding.ActivityForgotpwBinding.*

class ForgotpassActivity : ComponentActivity() {
    private lateinit var binding: ActivityForgotpwBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = inflate(layoutInflater)
        setContentView(binding.root)
    }
}
