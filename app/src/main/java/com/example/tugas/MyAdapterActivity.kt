package com.example.tugas

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapterActivity (private val namaList : ArrayList<ItemdataActivity>): RecyclerView.Adapter<MyAdapterActivity.MyViewHolder>() {

    class MyViewHolder(itemData: View) : RecyclerView.ViewHolder(itemData) {
        val gambar: ImageView = itemData.findViewById(R.id.imageview2)
        val nama: TextView = itemData.findViewById(R.id.idnamaplanet)
        val desc: TextView = itemData.findViewById(R.id.iddesc)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemData =
            LayoutInflater.from(parent.context).inflate(R.layout.activity_item_data, parent, false)
        return MyViewHolder(itemData)
    }

    override fun getItemCount(): Int = namaList.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = namaList[position]
        holder.gambar.setImageResource(currentItem.gambar)
        holder.nama.text = currentItem.nama
        holder.desc.text = currentItem.desc
    }
}