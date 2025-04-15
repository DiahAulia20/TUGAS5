package com.example.tugas
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val imageD: ImageView = findViewById(R.id.detailImage)
        val nameD: TextView = findViewById(R.id.detailTitle)
        val detailD: TextView = findViewById(R.id.detailDesc)

        // Ambil data yang dikirim lewat Intent
        val itemData = intent.getParcelableExtra<ItemDataActivity>("itemDetail")
        if (itemData != null) {
            imageD.setImageResource(itemData.image)
            nameD.text = itemData.name
            detailD.text = itemData.detail
        }
    }
}