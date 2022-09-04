package com.kawsar.coffeappkotlin.views.subviews

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.kawsar.coffeappkotlin.model.BottomItemInfo
import com.kawsar.coffeappkotlin.ui.theme.backgroundC
import com.kawsar.coffeappkotlin.ui.theme.greyedC
import com.kawsar.coffeappkotlin.ui.theme.orangeC

@Composable
fun BottomBar(
    navs: List<BottomItemInfo>,
    selected: Int,
    onTap: (index: Int) -> Unit,
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(62.dp)
            .background(backgroundC),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically) {
        navs.forEachIndexed { index, bottomItemInfo ->

            IconButton(
                modifier = Modifier.weight(1f),
                onClick = { onTap(index) }) {
                Icon(
                    modifier = Modifier.size(24.dp),
                    painter = painterResource(id = bottomItemInfo.icon),
                    contentDescription = bottomItemInfo.label,
                    tint = if (selected == index) orangeC else greyedC)
            }
        }
    }

}