package com.example.tugas

import android.os.Bundle
import android.content.Intent
import androidx.activity.ComponentActivity
import com.example.tugas.databinding.ActivityLoginBinding

class LoginActivity : ComponentActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

       binding.btnsignin.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)

        }

        binding.tVfpLP.setOnClickListener {
            val intent = Intent(this, ForgotpassActivity::class.java)
            startActivity(intent)
        }

        binding.tVhaLP.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}