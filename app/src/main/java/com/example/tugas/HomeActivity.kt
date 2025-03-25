package com.example.tugas

import android.content.Intent
import android.content.Intent.ACTION_VIEW
import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.tugas.databinding.ActivityHomeBinding
import android.net.Uri
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

private fun HomeActivity.sendEmail(message: String) {
    try {
        val emailIntent = Intent(Intent.ACTION_SEND)
        emailIntent.type = "message/rfc822" // MIME type untuk email

        emailIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf(""))

        // Tambahkan subjek email
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "")

        // Tambahkan pesan dari EditText
        emailIntent.putExtra(Intent.EXTRA_TEXT, message)

        // Tampilkan pemilih aplikasi email
        startActivity(Intent.createChooser(emailIntent, ""))
    } catch (e: Exception) {
        // Tangani kesalahan
        Toast.makeText(this, "Terjadi kesalahan: ${e.message}", Toast.LENGTH_SHORT).show()
    }
}

class HomeActivity : ComponentActivity() {
    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val editTextRecipient = findViewById<EditText>(R.id.eTpenerimaHP)
        val editTextSubject = findViewById<EditText>(R.id.eTsubjekHP)
        val editTextMessage = findViewById<EditText>(R.id.eTpesanHP)
        val btnSend = findViewById<Button>(R.id.btnkirimHP)

        btnSend.setOnClickListener {
            val recipient = editTextRecipient.text.toString().trim()
            val subject = editTextSubject.text.toString().trim()
            val message = editTextMessage.text.toString().trim()

            if (recipient.isEmpty() || subject.isEmpty() || message.isEmpty()) {
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show()
            } else {
                val emailIntent = Intent(Intent.ACTION_SEND).apply {
                    type = "message/rfc822"
                    putExtra(Intent.EXTRA_EMAIL, arrayOf(recipient))
                    putExtra(Intent.EXTRA_SUBJECT, subject)
                    putExtra(Intent.EXTRA_TEXT, message)
                }

                try {
                    startActivity(Intent.createChooser(emailIntent, "Chose Email Client..."))
                } catch (e: Exception) {
                    Toast.makeText(
                        this,
                        "dont have any email client installed.",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
        }
    }
}

