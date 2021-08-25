package com.example.dessertcatalog

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class DessertsRecyclerAdapter(private val desserts: ArrayList<DessertModel>): RecyclerView.Adapter<DessertViewHolder>() {

    override fun getItemCount(): Int {
        return desserts.size
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): DessertViewHolder {
        val inflatedView = LayoutInflater.from(parent.context).inflate(R.layout.dessert_item, parent, false)
        return DessertViewHolder(inflatedView)
    }

    override fun onBindViewHolder(holder: DessertViewHolder, position: Int) {
        val dessert = desserts[position]
        holder.bind(dessert)
    }

}