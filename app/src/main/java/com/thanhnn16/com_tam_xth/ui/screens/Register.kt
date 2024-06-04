package com.thanhnn16.com_tam_xth.ui.screens

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun CreateAccount() {
    Text(text = "Hello world!")
}

@Composable
fun UpdateInformation() {
    Text(text = "Hello world!")
}

@Preview(
    group = "create_account",
    name = "create_account",
    showBackground = true
)
@Composable
fun CreateAccountPreview() {
    CreateAccount()
}

@Preview(
    group = "create_account",
    name = "update_information",
    showBackground = true
)
@Composable
fun UpdateInformationPreview() {
    UpdateInformation()
}