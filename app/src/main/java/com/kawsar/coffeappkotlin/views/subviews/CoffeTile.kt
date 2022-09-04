package com.kawsar.coffeappkotlin.views.subviews

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kawsar.coffeappkotlin.model.CoffeItemInfo
import com.kawsar.coffeappkotlin.ui.theme.greyedC
import com.kawsar.coffeappkotlin.ui.theme.orangeC
import com.kawsar.coffeappkotlin.ui.theme.poppins

@Composable
fun CoffeTile(modifier: Modifier, coffeItemInfo: CoffeItemInfo) {
    Card(modifier = modifier,
        shape = RoundedCornerShape(10.dp)) {
        Column (modifier = Modifier.padding(5.dp)){
            Image(
                modifier = Modifier
                    .clip(RoundedCornerShape(10.dp))
                    .fillMaxWidth()
                    .aspectRatio(1f),
                painter = painterResource(id = coffeItemInfo.image),
                contentDescription = coffeItemInfo.name,
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(text = coffeItemInfo.name,
                fontSize = 18.sp,
                color = Color.White,
                fontFamily = poppins)
            Text(text = coffeItemInfo.description,
                fontSize = 12.sp,
                color = greyedC,
                fontFamily = poppins)
            Spacer(modifier = Modifier.height(10.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween) {
                Text(text = "\$${coffeItemInfo.price}",
                    fontSize = 18.sp,
                    color = Color.White,
                    fontFamily = poppins,
                    fontWeight = FontWeight.SemiBold)
                Box(
                    modifier = Modifier
                        .size(28.dp)
                        .background(orangeC, RoundedCornerShape(10f)),
                    contentAlignment = Alignment.Center,
                ) {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            Icons.Filled.Add,
                            modifier = Modifier.size(18.dp),
                            contentDescription = "Add"
                        )
                    }
                }
            }
        }
    }
}