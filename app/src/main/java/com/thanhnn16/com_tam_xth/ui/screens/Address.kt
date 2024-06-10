package com.thanhnn16.com_tam_xth.ui.screens

import androidx.compose.foundation.background
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AddressScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xff263238))
            .padding(vertical = 16.dp, horizontal = 24.dp)
    ) {
        Column(Modifier.fillMaxSize()) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Your Map",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.ExtraBold,
                    lineHeight = 20.sp,
                    color = Color(0xffFF7400),
                    modifier = Modifier
                        .padding(vertical = 15.dp),
                )
            }
            Spacer(modifier = Modifier.height(20.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Box(
                    modifier = Modifier
                        .height(2.dp)
                        .width(20.dp)
                        .background(
                            color = Color(0xff4285F4)
                        )
                )
                Text(
                    text = "Your Main Address",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.ExtraBold,
                    lineHeight = 16.sp,
                    color = Color(0xffFF7400),
                    modifier = Modifier
                        .padding(horizontal = 10.dp),
                )
                Box(
                    modifier = Modifier
                        .height(2.dp)
                        .fillMaxWidth()
                        .background(
                            color = Color(0xff4285F4)
                        )
                )
            }
            Spacer(modifier = Modifier.height(15.dp))
            AddressItem()
            Spacer(modifier = Modifier.height(15.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Box(
                    modifier = Modifier
                        .height(2.dp)
                        .width(20.dp)
                        .background(
                            color = Color(0xffC0C0C0)
                        )
                )
                Text(
                    text = "Your Others Address",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.ExtraBold,
                    lineHeight = 16.sp,
                    color = Color(0xff395998),
                    modifier = Modifier
                        .padding(horizontal = 10.dp),
                )
                Box(
                    modifier = Modifier
                        .height(2.dp)
                        .fillMaxWidth()
                        .background(
                            color = Color(0xffC0C0C0)
                        )
                )
            }
            Spacer(modifier = Modifier.height(15.dp))
            for (i in 0..2) {
                AddressItem()
            }
        }
        Button(
            onClick = { /*TODO*/ },
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xffFF7400),
                contentColor = Color.White
            ),
            modifier = Modifier
                .fillMaxWidth()
                .height(48.dp)
                .align(alignment = Alignment.BottomCenter)
        ) {
            Text(
                text = "Add New Kitchen!",
                fontSize = 16.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color.White
            )
        }
    }
}

@Composable
fun AddressItem(
    city: String = "Ho Chi Minh City",
    state: String = "State Thu Duc",
    street: String = "113, Linh Trung"
) {
    Row(
        modifier = Modifier
            .padding(vertical = 5.dp)
            .fillMaxWidth()
            .padding(top = 5.dp, start = 15.dp, bottom = 5.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column(
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = city,
                color = Color.White,
                fontSize = 14.sp,
                fontWeight = FontWeight.ExtraBold
            )
            Spacer(modifier = Modifier.height(16.dp))
            Row(
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = state, color = Color.White, fontSize = 10.sp)
                Spacer(modifier = Modifier.width(16.dp))
                Text(text = street, color = Color.White, fontSize = 10.sp)
            }
        }
        Icon(
            imageVector = Icons.Default.Edit,
            contentDescription = null,
            tint = Color.White,
            modifier = Modifier.size(24.dp)
        )
    }
}

//@Preview(showBackground = true)
//@Composable
//fun AddressScreenPreview() {
//    AddressScreen()
//}