package com.example.dessertcatalog

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DessertViewHolder(view: View): RecyclerView.ViewHolder(view) {

    private val image: ImageView = view.findViewById(R.id.image)

    fun bind(data: DessertModel) {
        image.setImageResource(data.drawableRes)
        // TODO: set the view's name and description texts to data.name and data.description
    }

}



