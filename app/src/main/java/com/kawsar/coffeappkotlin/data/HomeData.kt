package com.kawsar.coffeappkotlin.data

import com.kawsar.coffeappkotlin.R
import com.kawsar.coffeappkotlin.model.BottomItemInfo
import com.kawsar.coffeappkotlin.model.CoffeItemInfo

object HomeData {
    val coffeeType: List<String> = listOf(
        "Cappucino",
        "Latter",
        "Tea",
        "Milk"
    )
    val coffeData:List<CoffeItemInfo> = listOf(
        CoffeItemInfo(R.drawable.coffe,"Cappacino","with milk","5.01"),
        CoffeItemInfo(R.drawable.latte,"Latte","with sugar","4.30"),
    )
    val navItems:List<BottomItemInfo> = listOf(
        BottomItemInfo(R.drawable.ic_home,"Home"),
        BottomItemInfo(R.drawable.ic_cart,"Cart"),
        BottomItemInfo(R.drawable.ic_heart,"Favourite"),
        BottomItemInfo(R.drawable.ic_bell,"Notification"),
    )
}