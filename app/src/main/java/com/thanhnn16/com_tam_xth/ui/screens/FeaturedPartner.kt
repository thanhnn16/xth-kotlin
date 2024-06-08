package com.thanhnn16.com_tam_xth.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.thanhnn16.com_tam_xth.model.entities.Partner
import com.thanhnn16.com_tam_xth.ui.components.FeaturedPartnerCategory
import com.thanhnn16.com_tam_xth.ui.components.ScreenHeader
import com.thanhnn16.com_tam_xth.ui.theme.Grey
import com.thanhnn16.com_tam_xth.ui.theme.Nox
import com.thanhnn16.com_tam_xth.ui.theme.Orange

@Composable
fun FeaturedPartner() {
    Column(
        modifier = Modifier.fillMaxSize().background(Nox),
    ) {
        ScreenHeader(
            title = "Featured Partner",
            onPress = { }
        )
        FeaturedPartnerCategory(partners = Partner.getSamplePartner())
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun FeaturedPartnerPreview() {
    FeaturedPartner()
}
