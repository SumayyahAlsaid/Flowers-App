package com.example.flowers_app.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.flowers_app.R
import com.example.flowers_app.model.FlowerMenu


class FlowersAdapter(private val dataset: List<FlowerMenu>, private val context: Context?) : RecyclerView.Adapter<FlowersAdapter.FlowersViewHolder>() {

    class FlowersViewHolder(private val view : View) : RecyclerView.ViewHolder(view){
        val textView : TextView = view.findViewById(R.id.item_title)
        val imageView : ImageView = view.findViewById(R.id.item_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FlowersViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.item_view, parent, false)
        return FlowersViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: FlowersViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context!!.resources.getString(item.flowerStringId)
        holder.imageView.setImageResource(item.flowerImageId)
    }

    override fun getItemCount() = dataset.size
}