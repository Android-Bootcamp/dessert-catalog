package com.example.dessertcatalog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    private val desserts: ArrayList<DessertModel> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addData()

        // TODO: find the RecyclerView by ID and save to a variable

        // TODO: set the RecyclerView's layoutManager

        // TODO: initialize a RecyclerAdapter and attach it to the RecyclerView

        // TODO: add DividerItemDecoration to the RecyclerView


        findViewById<View>(R.id.clear_button).setOnClickListener {
            desserts.clear()
            // TODO: fix the functionality for clearing items
        }

        findViewById<View>(R.id.add_button).setOnClickListener {
            addData()
            // TODO: fix the functionality for clearing items
        }
    }

    private fun addData() {
        desserts.add(
            DessertModel(
                name = resources.getString(R.string.kouign_amann_name),
                description = resources.getString(R.string.kouign_amann_description),
                drawableRes = R.drawable.kouign_amann
            )
        )
        desserts.add(
            DessertModel(
                name = resources.getString(R.string.cannoli_name),
                description = resources.getString(R.string.cannoli_description),
                drawableRes = R.drawable.cannoli
            )
        )
        desserts.add(
            DessertModel(
                name = resources.getString(R.string.mooncake_name),
                description = resources.getString(R.string.mooncake_description),
                drawableRes = R.drawable.mooncake
            )
        )
        desserts.add(
            DessertModel(
                name = resources.getString(R.string.alfajores_name),
                description = resources.getString(R.string.alfajores_description),
                drawableRes = R.drawable.alfajores
            )
        )
        desserts.add(
            DessertModel(
                name = resources.getString(R.string.mochi_name),
                description = resources.getString(R.string.mochi_description),
                drawableRes = R.drawable.mochi
            )
        )
        desserts.add(
            DessertModel(
                name = resources.getString(R.string.tiramisu_name),
                description = resources.getString(R.string.tiramisu_description),
                drawableRes = R.drawable.tiramisu
            )
        )
        desserts.add(
            DessertModel(
                name = resources.getString(R.string.napoleon_cake_name),
                description = resources.getString(R.string.napoleon_cake_description),
                drawableRes = R.drawable.napoleon_cake
            )
        )
        desserts.add(
            DessertModel(
                name = resources.getString(R.string.flan_name),
                description = resources.getString(R.string.flan_description),
                drawableRes = R.drawable.flan
            )
        )
        desserts.add(
            DessertModel(
                name = resources.getString(R.string.pavlova_name),
                description = resources.getString(R.string.pavlova_description),
                drawableRes = R.drawable.pavlova
            )
        )
        desserts.add(
            DessertModel(
                name = resources.getString(R.string.mango_sticky_rice_name),
                description = resources.getString(R.string.mango_sticky_rice_description),
                drawableRes = R.drawable.mango_sticky_rice
            )
        )
    }
}