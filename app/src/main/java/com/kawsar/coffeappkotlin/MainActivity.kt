package com.kawsar.coffeappkotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.kawsar.coffeappkotlin.data.HomeData
import com.kawsar.coffeappkotlin.ui.theme.CoffeappkotlinTheme
import com.kawsar.coffeappkotlin.views.HomePage
import com.kawsar.coffeappkotlin.views.subviews.BottomBar
import com.kawsar.coffeappkotlin.views.subviews.MyTopBar

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CoffeappkotlinTheme {
                HomeScreen()
            }
        }
    }

    @Composable
    private fun HomeScreen() {

        var navItemIndex by rememberSaveable {
            mutableStateOf(0)
        }

        return Scaffold(
            modifier = Modifier.fillMaxSize(),
            backgroundColor = MaterialTheme.colors.background,
            topBar = { MyTopBar() },
            bottomBar = {
                BottomBar(navs = HomeData.navItems,
                    selected = navItemIndex,
                    onTap = { index ->
                        navItemIndex = index
                    })
            }
        ) {
            HomePage(it)
        }
    }
}
