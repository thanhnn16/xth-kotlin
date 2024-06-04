package com.thanhnn16.com_tam_xth.ui.screens

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ForgotPassword() {
    Text(text = "Hello world!")
}

@Composable
fun ConfirmOwner() {
    Text(text = "Hello world!")
}

@Composable
fun Congrats() {
    Text(text = "Hello world!")
}

@Preview(
    group = "forgot_password",
    name = "forgot_password",
    showBackground = true
)
@Composable
fun ForgotPasswordPreview() {
    ForgotPassword()
}

@Preview(
    group = "forgot_password",
    name = "confirm_owner",
    showBackground = true
)

@Composable
fun ConfirmOwnerPreview() {
    ConfirmOwner()
}

@Preview(
    group = "forgot_password",
    name = "congrats",
    showBackground = true
)
@Composable
fun CongratsPreview() {
    Congrats()
}