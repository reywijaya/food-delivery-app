package com.example.fooddelivery.data

import androidx.annotation.DrawableRes
import com.example.fooddelivery.R

data class ProductFlavorState(
    val name: String,
    val price: String,
    @DrawableRes val imgRes: Int
)

val ProductFlavorsData = listOf(
    ProductFlavorState(
        name = "Cheddar",
        price = "$0.79",
        imgRes = R.drawable.img_cheese
    ),
    ProductFlavorState(
        name = "Bacon",
        price = "$0.52",
        imgRes = R.drawable.img_bacon
    ),
    ProductFlavorState(
        name = "Onion",
        price = "$0.28",
        imgRes = R.drawable.img_onion
    )
)