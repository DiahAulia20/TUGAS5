package com.example.tugas
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ItemDataActivity(
    val image: Int,
    val name: String,
    val desc: String,
    val detail: String   // Field deskripsi ditambahkan
) : Parcelable