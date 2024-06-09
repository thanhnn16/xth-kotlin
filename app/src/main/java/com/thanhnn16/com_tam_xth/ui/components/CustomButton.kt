package com.thanhnn16.com_tam_xth.ui.components

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.foundation.background
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.height
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp


@Composable
fun CustomButton(
    text: String,
    onClick: () -> Unit,
    backgroundColor: Color = Color(0xFFFF9933), // Màu cam
    contentColor: Color = Color.White,
    width: Dp = 312.dp, // Chiều dài
    height: Dp = 48.dp // Chiều cao
) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
//            backgroundColor = backgroundColor,
            contentColor = contentColor),
        modifier = Modifier
            .width(width) // Thiết lập chiều dài
            .height(height) // Thiết lập chiều cao
            .background(Color.Transparent)
    ) {
        Text(text = text)
    }
}

@Preview (
    showBackground = true
)
@Composable
fun CustomButtonPreview(){
    CustomButton(text = "", onClick = {})
}