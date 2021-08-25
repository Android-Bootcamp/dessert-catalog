package com.example.dessertcatalog

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DessertViewHolder(view: View): RecyclerView.ViewHolder(view) {

    private val image: ImageView = view.findViewById(R.id.image)
    private val name: TextView = view.findViewById(R.id.name)
    private val description: TextView = view.findViewById(R.id.description)

    fun bind(data: DessertModel) {
        image.setImageResource(data.drawableRes)
        name.text = data.name
        description.text = data.description
    }

}