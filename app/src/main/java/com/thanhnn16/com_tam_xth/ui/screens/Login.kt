package com.thanhnn16.com_tam_xth.ui.screens

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Login() {
    Text(text = "Hello world!")
}

@Preview(
    group = "login",
    name = "login",
    showBackground = true
)
@Composable
fun LoginPreview() {
    Login()
}