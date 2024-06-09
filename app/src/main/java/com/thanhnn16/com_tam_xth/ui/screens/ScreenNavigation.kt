package com.thanhnn16.com_tam_xth.ui.screens

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.height
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material3.Icon

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController


@Composable
fun CustomBottomNavigation(navController: NavController, items: List<Screen>) {
    BottomNavigation(
        modifier = Modifier
            .height(75.dp)
            .background(Color.White)
            .shadow(8.dp, shape = RoundedCornerShape(0.dp))
            .padding(0.dp),
        elevation = 8.dp,
        backgroundColor = Color(0xFFFFFFFF),
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentDestination = navBackStackEntry?.destination

        items.forEach { screen ->
            BottomNavigationItem(
                icon = {
                    Icon(
                        painterResource(
                            if (currentDestination?.route == screen.route) screen.iconSelected else screen.iconUnselected
                        ),
                        contentDescription = null,
                        modifier = Modifier
                            .size(24.dp)
                            .padding(4.dp)

                    )
                },
                selected = currentDestination?.route == screen.route,
                onClick = {
                    navController.navigate(screen.route) {
                        popUpTo(navController.graph.startDestinationId) {
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                },
                alwaysShowLabel = false,
                unselectedContentColor = Color.Gray,
                modifier = Modifier.align(Alignment.CenterVertically)
            )
        }
    }
}

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun ScreenNavigation() {
    val navController = rememberNavController()
    val items = listOf(Screen.Splash, Screen.Onboarding, Screen.CreateAccount, Screen.UpdateInformation, Screen.Login)
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    Scaffold(
        bottomBar = {
            if (currentRoute !in listOf(
                    Screen.Splash.route,
                    Screen.Onboarding.route,
                    Screen.CreateAccount.route,
                    Screen.UpdateInformation.route,
                    Screen.Login.route
                )
            ) {
                CustomBottomNavigation(navController, items)
            }
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = Screen.Splash.route,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(Screen.Splash.route) {
                Splash(navController)
            }
            composable(Screen.Onboarding.route) {
                Onboarding(navController)
            }
            composable(Screen.CreateAccount.route) {
                CreateAccount()
            }
            composable(Screen.UpdateInformation.route) {
                UpdateInformation()
            }
            composable(Screen.Login.route) {
                Login()
            }
        }
    }
}
@Preview
@Composable
fun PreviewScreenNavigation() {
    CustomBottomNavigation(
        rememberNavController(),
        listOf(Screen.Splash, Screen.Onboarding, Screen.CreateAccount, Screen.UpdateInformation)
    )
}