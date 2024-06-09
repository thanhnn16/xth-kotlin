package com.thanhnn16.com_tam_xth.ui.components

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.draw.clip
import androidx.compose.foundation.border




@Composable
fun CustomInput(
    value: String,
    onValueChange: (String) -> Unit,
    width: Dp = 312.dp, // Chiều dài
    height: Dp = 44.dp, // Chiều cao
    trailingIcon: @Composable (() -> Unit)? = null // Icon ở góc phải

) {
    TextField(
        value = value,
        onValueChange = onValueChange,
        modifier = Modifier
            .width(width) // Thiết lập chiều dài
            .height(height) // Thiết lập chiều cao
            .clip(RoundedCornerShape(8.dp)), // Bo tròn góc
        trailingIcon = trailingIcon
    )
}
@Preview(
    showBackground = true
)
@Composable
fun CustomInputPreview(){
    CustomInput(value = "", onValueChange = {})
}