package com.thanhnn16.com_tam_xth.ui.screens

import com.thanhnn16.com_tam_xth.R

enum class Screen(val route: String, val iconSelected: Int, val iconUnselected: Int) {
        Splash("splash", R.drawable.splash, R.drawable.splash2),
        Onboarding("onboarding", R.drawable.walk1, R.drawable.walk2),
        CreateAccount("createAccount", R.drawable.sms, R.drawable.sms),
        UpdateInformation("updateInformation", R.drawable.key, R.drawable.key),
        Login("login", R.drawable.user_square, R.drawable.user_square),
}