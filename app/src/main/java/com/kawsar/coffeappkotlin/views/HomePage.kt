package com.kawsar.coffeappkotlin.views

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kawsar.coffeappkotlin.R
import com.kawsar.coffeappkotlin.data.HomeData.coffeData
import com.kawsar.coffeappkotlin.data.HomeData.coffeeType
import com.kawsar.coffeappkotlin.ui.theme.greyedC
import com.kawsar.coffeappkotlin.ui.theme.orangeC
import com.kawsar.coffeappkotlin.ui.theme.poppins
import com.kawsar.coffeappkotlin.views.subviews.CoffeTile

@Composable
fun HomePage() {
    var text by rememberSaveable { mutableStateOf("") }
    var coffeeTypeIndex by rememberSaveable {
        mutableStateOf(0)
    }
    LazyColumn(
        modifier = Modifier
            .padding(horizontal = 20.dp)
    ) {
        item {
            Spacer(modifier = Modifier.height(40.dp))
            //Headline
            Text(
                text = stringResource(id = R.string.find_the_best_coffe),
                fontSize = 30.sp,
                fontWeight = FontWeight.SemiBold,
                fontFamily = poppins,
                color = Color.White
            )
            Spacer(modifier = Modifier.height(40.dp))
            //Search field
            TextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .requiredHeight(55.dp),
                value = text,
                onValueChange = {
                    text = it
                },
                textStyle = TextStyle(
                    fontSize = 16.sp,
                    fontFamily = poppins
                ),
                leadingIcon = {
                    Icon(
                        modifier = Modifier.size(28.dp),
                        painter = painterResource(id = R.drawable.ic_search),
                        contentDescription = "Search",
                        tint = greyedC
                    )
                },
                placeholder = { Text(text = "Find your coffee..") },
                singleLine = true,
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = Color(0x25383838),
                    cursorColor = orangeC,
                    textColor = orangeC,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                )
            )
            Spacer(modifier = Modifier.height(40.dp))
            //Coffe type row
            Row(modifier = Modifier.wrapContentWidth(), horizontalArrangement = Arrangement.Start) {
                coffeeType.forEachIndexed { index: Int, type: String ->
                    Text(
                        modifier = Modifier
                            .padding(end = 20.dp)
                            .clickable { coffeeTypeIndex = index },
                        text = type,
                        fontSize = 16.sp,
                        fontFamily = poppins,
                        color = if (coffeeTypeIndex == index) orangeC else greyedC)
                }
            }
            Spacer(modifier = Modifier.height(10.dp))
            //Coffe tiles row
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween) {
                coffeData.forEachIndexed { index, coffeItemInfo ->
                    CoffeTile( Modifier
                        .weight(1f)
                        .padding(
                            start = if (index % 2 == 0) 10.dp else 20.dp,
                            end = if (index % 2 == 0) 20.dp else 10.dp),
                        coffeItemInfo)
                }
            }
            Spacer(modifier = Modifier.height(100.dp))
        }
    }
}

