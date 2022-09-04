package com.kawsar.coffeappkotlin.model

import androidx.annotation.DrawableRes

data class CoffeItemInfo(
    @DrawableRes val image:Int,
    val name:String,
    val description:String,
    val price:String
)
