package com.example.tugas
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapterActivity(private val namaList: ArrayList<ItemDataActivity>) :
    RecyclerView.Adapter<MyAdapterActivity.MyViewHolder>() {

    var onItemClick: ((ItemDataActivity) -> Unit)? = null

    class MyViewHolder(itemData: View) : RecyclerView.ViewHolder(itemData) {
        val image: ImageView = itemData.findViewById(R.id.imageview2)
        val name: TextView = itemData.findViewById(R.id.idnamaplanet)
        val desc: TextView = itemData.findViewById(R.id.iddescplanet)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemData = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_item_data, parent, false)
        return MyViewHolder(itemData)
    }

    override fun getItemCount(): Int = namaList.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = namaList[position]
        holder.image.setImageResource(currentItem.image)
        holder.name.text = currentItem.name
        holder.desc.text = currentItem.desc

        // Pasang click listener pada setiap item
        holder.itemView.setOnClickListener {
            onItemClick?.invoke(currentItem)
        }
    }
}