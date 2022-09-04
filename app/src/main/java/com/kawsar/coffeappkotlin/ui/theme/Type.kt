package com.kawsar.coffeappkotlin.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.kawsar.coffeappkotlin.R

// Set of Material typography styles to start with
val Typography = Typography(
    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )
    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)
val poppins = FontFamily(
    Font(
        R.font.poppins_regular,
        style = FontStyle.Normal
    ),
    Font(
        R.font.poppins_bold,
        weight = FontWeight.Bold,
        style = FontStyle.Normal
    ),
    Font(
        R.font.poppins_semibold,
        weight = FontWeight.SemiBold,
        style = FontStyle.Normal
    ),
    Font(R.font.popins_light,
        weight = FontWeight.Light,
        style = FontStyle.Normal),
    Font(
        R.font.poppins_italic,
        style = FontStyle.Italic
    )
)