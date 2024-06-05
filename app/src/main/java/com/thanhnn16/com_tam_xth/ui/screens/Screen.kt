package com.thanhnn16.com_tam_xth.ui.screens

import com.thanhnn16.com_tam_xth.R

enum class Screen(val route: String, val iconSelected: Int, val iconUnselected: Int) {
        Splash("splash", R.drawable.splash, R.drawable.splash2),
        Onboarding("onboarding", R.drawable.city, R.drawable.city),
        CreateAccount("createAccount", R.drawable.city, R.drawable.city),
        UpdateInformation("updateInformation", R.drawable.city, R.drawable.city),
}