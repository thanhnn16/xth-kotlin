package com.thanhnn16.com_tam_xth.ui.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp
import com.thanhnn16.com_tam_xth.R

val gelasioBold = Font(R.font.gelasio_bold)
val gelasioRegular = Font(R.font.gelasio_regular)
val merriweather_bold = Font(R.font.merriweather_bold)

@Composable
fun HeaderText(text: String) {
    Text(
        text = text,
        style = TextStyle(
            fontFamily = FontFamily.Serif,
            fontSize = 18.sp,
            color = Color.DarkGray

        ),
        fontFamily = FontFamily(gelasioRegular)
    )
}

@Composable
fun HeaderTextRegular(text: String) {
    Text(
        text = text,
        style = TextStyle(
            fontFamily = FontFamily.Serif,
            fontSize = 16.sp,
            color = Color.DarkGray

        ),
        fontFamily = FontFamily(merriweather_bold)
    )
}

@Composable
fun HeaderTextBold(text: String) {
    Text(
        text = text,
        style = TextStyle(
            fontFamily = FontFamily.Serif,
            fontSize = 18.sp,
            color = Color.Black
        ),
        fontFamily = FontFamily(gelasioBold)
    )
}