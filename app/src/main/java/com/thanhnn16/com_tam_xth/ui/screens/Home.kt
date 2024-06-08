package com.thanhnn16.com_tam_xth.ui.screens

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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.thanhnn16.com_tam_xth.ui.theme.Orange

@Composable
fun Home() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top
    ) {
        HomeHeader()
        HomeCategory(
            headerText = "Recommended items",
            onClick = { }
        )
        HomeCategory(
            headerText = "Featured partner",
            onClick = { }
        )
    }
}

@Composable
fun HomeHeader() {
    Row(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Card(
            modifier = Modifier.size(50.dp),
        ) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.fillMaxSize()
            ) {
                Text(text = "Bút tòn")
            }
        }

        Column(
            modifier = Modifier
                .padding(16.dp)
                .clickable {  },
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Row {
                Text(
                    text = "Deliver to",
                    fontWeight = FontWeight.Bold,
                )
                Spacer(modifier = Modifier.size(4.dp))
                Text(text = "icon")
            }
            Text(
                text = "Choose your city and state",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Orange
            )
        }

        Card(
            modifier = Modifier.size(50.dp),
        ) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.fillMaxSize()
            ) {
                Text(text = "Bút tòn")
            }
        }
    }
}

@Composable
fun HomeCategory(
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
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "See all",
            fontSize = 16.sp,
            modifier = Modifier
                .clickable { onClick() },
        )
    }
}

@Composable
fun HomeCategoryItems() {
    Card {

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
