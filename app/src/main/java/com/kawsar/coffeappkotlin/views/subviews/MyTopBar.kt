package com.kawsar.coffeappkotlin.views.subviews

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kawsar.coffeappkotlin.R
import com.kawsar.coffeappkotlin.ui.theme.greyedC

@Composable
fun MyTopBar() {
    Row(modifier = Modifier
        .fillMaxWidth()
        .height(62.dp)
        .padding(horizontal = 5.dp)
        .padding(end = 20.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween) {
        IconButton(onClick = {}) {
            Icon(modifier = Modifier
                .size(35.dp),
                painter = painterResource(id = R.drawable.ic_menu),
                contentDescription = "Menu",
                tint = greyedC)
        }
        Image(
            modifier = Modifier
                .size(32.dp)
                .clip(CircleShape),
            painter = painterResource(id = R.drawable.kawsar),
            contentDescription = "author",
            contentScale = ContentScale.Crop,
        )
    }
}