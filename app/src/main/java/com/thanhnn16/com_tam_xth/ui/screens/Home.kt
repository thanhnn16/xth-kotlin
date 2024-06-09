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
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.thanhnn16.com_tam_xth.model.entities.Partner
import com.thanhnn16.com_tam_xth.ui.components.HomeCategory
import com.thanhnn16.com_tam_xth.ui.components.HomeHeader
import com.thanhnn16.com_tam_xth.ui.theme.Black
import com.thanhnn16.com_tam_xth.ui.theme.Green
import com.thanhnn16.com_tam_xth.ui.theme.Grey
import com.thanhnn16.com_tam_xth.ui.theme.Nox
import com.thanhnn16.com_tam_xth.ui.theme.Orange
import com.thanhnn16.com_tam_xth.ui.theme.White

@Composable
fun Home() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Nox),
        verticalArrangement = Arrangement.Top
    ) {
        HomeHeader()
        HomeCategoryHeader(
            headerText = "Recommended items",
            onClick = { }
        )
        HomeCategory(partners = Partner.getSamplePartner())
        HomeCategoryHeader(
            headerText = "Featured partner",
            onClick = { }
        )
        HomeCategory(partners = Partner.getSamplePartner())
    }
}



@Composable
fun HomeCategoryHeader(
    headerText: String,
    onClick: () -> Unit?
) {
    Row(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = headerText,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            color = White
        )
        Text(
            text = "See all",
            fontSize = 14.sp,
            color = Green,
            modifier = Modifier
                .clickable { onClick() },
        )
    }
}



@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun HomePreview() {
    Home()
}
