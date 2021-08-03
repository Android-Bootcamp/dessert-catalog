package com.example.dessertcatalog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    private val desserts: ArrayList<DessertModel> = ArrayList()
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: RecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recycler_view)
        //recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        adapter = RecyclerAdapter(desserts)
        recyclerView.adapter = adapter

        initData()
    }

    private fun initData() {
        desserts.add(
            DessertModel(
                name = "Kouign Amann",
                description = "Kouign-amann is a Breton cake, described in the New York Times as \"the fattiest pastry in all of Europe.\" The name comes from the Breton language words for cake (kouign) and butter (amann).",
                drawableRes = R.drawable.kouign_amann
            )
        )
        desserts.add(
            DessertModel(
                name = "Cannoli",
                description = "Cannoli are Italian pastries consisting of tube-shaped shells of fried pastry dough, filled with a sweet, creamy filling usually containing ricotta—a staple of Sicilian cuisine.",
                drawableRes = R.drawable.cannoli
            )
        )
        desserts.add(
            DessertModel(
                name = "Mooncake",
                description = "A mooncake is a Chinese bakery product traditionally eaten during the Mid-Autumn Festival. The festival is about lunar appreciation and Moon watching, and mooncakes are regarded as an indispensable delicacy.",
                drawableRes = R.drawable.mooncake
            )
        )
        desserts.add(
            DessertModel(
                name = "Alfajores",
                description = "Alfajores are sandwich cookies filled with dulce de leche, a creamy caramel confection made from milk and sugar. Alfajores have their origins in the Middle East.",
                drawableRes = R.drawable.alfajores
            )
        )
        desserts.add(
            DessertModel(
                name = "Mochi",
                description = "Mochi is a Japanese rice cake made of mochigome, a short-grain japonica glutinous rice, and sometimes other ingredients such as water, sugar, and cornstarch.",
                drawableRes = R.drawable.mochi
            )
        )
        desserts.add(
            DessertModel(
                name = "Tiramisu",
                description = "Tiramisu is a coffee-flavoured Italian dessert. It is made of ladyfingers dipped in coffee, layered with a whipped mixture of eggs, sugar, and mascarpone cheese, flavoured with cocoa.",
                drawableRes = R.drawable.tiramisu
            )
        )
        desserts.add(
            DessertModel(
                name = "Napoleon Cake",
                description = "Napoleon Cake is one of my favorite classic Russian cakes. It has a multitude of very thin cake layers that are made from puff pastry dough and are so flaky, puffy and delicate.",
                drawableRes = R.drawable.napoleon_cake
            )
        )
        desserts.add(
            DessertModel(
                name = "Flan",
                description = "Flan is a European and Latin dessert made up of a caramel topping and custard base that’s made with milk, eggs and sweetener",
                drawableRes = R.drawable.flan
            )
        )
        desserts.add(
            DessertModel(
                name = "Pavlova",
                description = "Pavlova is a meringue-based dessert named after the Russian ballerina Anna Pavlova. It has a crisp crust and soft, light inside, usually topped with fruit and whipped cream.",
                drawableRes = R.drawable.pavlova
            )
        )
        desserts.add(
            DessertModel(
                name = "Mango Sticky Rice",
                description = "Mango sticky rice is a traditional Southeast Asian and South Asian dessert made with glutinous rice, fresh mango and coconut milk, and eaten with a spoon or the hands.",
                drawableRes = R.drawable.mango_sticky_rice
            )
        )
        adapter.notifyDataSetChanged()
    }
}