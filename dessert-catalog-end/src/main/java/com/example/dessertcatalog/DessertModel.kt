package com.example.dessertcatalog

import androidx.annotation.DrawableRes

data class DessertModel(
    val name: String,
    val description: String,
    @DrawableRes val drawableRes: Int
)