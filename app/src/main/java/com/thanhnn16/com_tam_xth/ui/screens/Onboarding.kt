package com.thanhnn16.com_tam_xth.ui.screens

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Onboarding(modifier: Modifier) {
    Text(text = "Hello world!")
}

@Preview(
    group = "onboarding",
    name = "onboarding",
    showBackground = true
)
@Composable
fun OnboardingPreview() {
    Onboarding(Modifier.Companion.padding(innerPadding))
}