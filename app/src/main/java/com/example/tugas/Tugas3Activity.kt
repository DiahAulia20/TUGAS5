package com.example.tugas

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import android.widget.EditText
import android.widget.Button
import android.widget.Toast
import com.example.tugas.databinding.ActivityTugas3Binding


class Tugas3Activity : ComponentActivity() {
    private lateinit var binding: ActivityTugas3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTugas3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val editTextRecipient = findViewById<EditText>(R.id.eTpenerima)
        val editTextSubject = findViewById<EditText>(R.id.eTsubjek)
        val editTextMessage = findViewById<EditText>(R.id.eTpesan)
        val btnSend = findViewById<Button>(R.id.btnkirim)

        btnSend.setOnClickListener {
            val recipient = editTextRecipient.text.toString().trim()
            val subject = editTextSubject.text.toString().trim()
            val message = editTextMessage.text.toString().trim()

            if (recipient.isEmpty() || subject.isEmpty() || message.isEmpty()) {
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show()
            } else {
                val textIntent = Intent(Intent.ACTION_SEND).apply {
                    type = "message/rfc822"
                    putExtra(Intent.EXTRA_EMAIL, arrayOf(recipient))
                    putExtra(Intent.EXTRA_SUBJECT, subject)
                    putExtra(Intent.EXTRA_TEXT, message)
                }
                startActivity(Intent.createChooser(textIntent, "Send text using:"))
                finish()
            }
        }
    }
}

