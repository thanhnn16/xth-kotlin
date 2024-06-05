package com.thanhnn16.com_tam_xth

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.thanhnn16.com_tam_xth.ui.screens.Onboarding
import com.thanhnn16.com_tam_xth.ui.screens.ScreenNavigation
import com.thanhnn16.com_tam_xth.ui.theme.Com_Tam_XTHTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        /*
        TODO: Create navHostController for App,
        Nhân làm cái này nha. Cho app với bottom nav trong home luôn.
        Link doc: https://developer.android.com/develop/ui/compose/navigation
         */
        setContent {
            Com_Tam_XTHTheme {
                   ScreenNavigation()

            }
        }
    }
}
